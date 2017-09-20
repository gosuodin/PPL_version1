import org.scalatest.FunSuite

/**
  * Created by nhphung on 4/28/17.
  * Modified by Le Hoang Huy (1511232).
  */
class ParserSuite  extends FunSuite with TestParser {

  test(" 1. Variable declaration "){
    val input = """string mystring = Hello World"""
    val expect = """Error on line 1 col 17: ="""
    assert(checkRec(input,expect,101))
  }
  test("  2. Variable declaration ") {
    val input ="""float arr[5];"""
    val expect ="""sucessful"""
    assert(checkRec(input,expect,102))
  }
  test("  3. Variable declaration "){
    val input = """int x,y,arr[5];"""
    val expect = """sucessful"""
    assert(checkRec(input,expect,103))
  }
  test("  4. Variable declaration "){
    val input = """string str, pointer_arr[10];"""
    val expect = """sucessful"""
    assert(checkRec(input,expect,104))
  }
  test("  5. Variable declaration fail: not primitive tyle"){
    val input = """float[] x;"""
    val expect = """Error on line 1 col 10: ;"""
    assert(checkRec(input,expect,105))
  }
  test("  6. Variable declaration fail: missing identifier"){
    val input = """float ;"""
    val expect = """Error on line 1 col 7: ;"""
    assert(checkRec(input,expect,106))
  }
  test("  7. Variable declaration fali: missing semi-colon"){
    val input = """float x"""
    val expect = """Error on line 1 col 8: <EOF>"""
    assert(checkRec(input,expect,107))
  }
  test("  8. Variable declaration fail: array decalaration without size"){
    val input =  """int intArr[];"""
    val expect = "Error on line 1 col 12: ]"
    assert(checkRec(input,expect,108))
  }
  test("  9. Variable declaration "){
    val input =  """int intArray[5];"""
    val expect = """sucessful"""
    assert(checkRec(input,expect,109))
  }
  test("  10. Variable declaration "){
    val input = """int x;"""
    val expect = """sucessful"""
    assert(checkRec(input,expect,110))
  }
  test("  11. Variable declaration: missing the end SEMI"){
    val input = """int x"""
    val expect = """Error on line 1 col 6: <EOF>"""
    assert(checkRec(input,expect,111))
  }
  test("  12. Variable declaration: missing COMMA in list variable"){
    val input = """int x,y  z;"""
    val expect = """Error on line 1 col 10: z"""
    assert(checkRec(input,expect,112))
  }
  test("  13. Variable declaration "){
    val input = """int x,y = 5;"""
    val expect = """Error on line 1 col 9: ="""
    assert(checkRec(input,expect,113))
  }
  test("  14. Variable declaration "){
    val input =
      """int x,y;
         float a,b;
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,114))
  }
  test(" 15. Function declaration: prototype have no parameter"){
    val input = """void main(){}"""
    val expect = """sucessful"""
    assert(checkRec(input,expect,115))
  }
  test(" 16. Function declaration: prototype have a parameter"){
    val input = """void arreaSquare(int edge){}"""
    val expect = """sucessful"""
    assert(checkRec(input,expect,116))
  }
  test(" 17. Function declaration: prototype have many parameters"){
    val input = """string listMember(string mem1, string mem2, string mem3){}"""
    val expect = """sucessful"""
    assert(checkRec(input,expect,117))
  }
  test(" 18. Function declaration fail: missing TYPE"){
    val input = """main(){}"""
    val expect = """Error on line 1 col 1: main"""
    assert(checkRec(input,expect,118))
  }
  test(" 19. Function declaration fail: missing fucntion name"){
    val input = """int (){}"""
    val expect = """Error on line 1 col 5: ("""
    assert(checkRec(input,expect,119))
  }
  test(" 20. Function declaration fail: missing fucntion name"){
    val input = """int (){}"""
    val expect = """Error on line 1 col 5: ("""
    assert(checkRec(input,expect,120))
  }
  test(" 21. Function declaration fail: missing block statement at the end"){
    val input = """int main()"""
    val expect = """Error on line 1 col 11: <EOF>"""
    assert(checkRec(input,expect,121))
  }
  test(" 22. Ffunction declaration fail: wrong type"){
    val input = """FLoat call(int a,float b[]){}"""
    val expect = """Error on line 1 col 1: FLoat"""
    assert(checkRec(input,expect,122))
  }
  test(" 23. Function declaration fail: wrong function-name"){
    val input = """int 12345(int a){}"""
    val expect = """Error on line 1 col 5: 12345"""
    assert(checkRec(input,expect,123))
  }
  test(" 24. Function declaration fail: missing )"){
    val input = """float call(int a{}"""
    val expect = """Error on line 1 col 17: {"""
    assert(checkRec(input,expect,124))
  }
  test(" 25. Function declaration fail: missing )"){
    val input = """float call)int a{}"""
    val expect = """Error on line 1 col 11: )"""
    assert(checkRec(input,expect,125))
  }
  test(" 26. Function declaration: function return array pointer type"){
    val input = """float[] g(){}"""
    val expect = """sucessful"""
    assert(checkRec(input,expect,126))
  }
  test(" 27. Function declaration: function return array pointer type and input para array pointer type"){
    val input = """float[] g(float a[]){}"""
    val expect = """sucessful"""
    assert(checkRec(input,expect,127))
  }
  test(" 28. Function declaration fail: wrong separator in parameter list"){
    val input = """float call(int a; int b) {}"""
    val expect = """Error on line 1 col 17: ;"""
    assert(checkRec(input,expect,128))
  }
  test(" 29. Function declaration fail: wrong parameter type"){
    val input = """float call(Int a){}"""
    val expect = """Error on line 1 col 12: Int"""
    assert(checkRec(input,expect,129))
  }
  test(" 30. Function declaration fail: wrong parameter-name"){
    val input = """float call(int 123){}"""
    val expect = """Error on line 1 col 16: 123"""
    assert(checkRec(input,expect,130))
  }
  test(" 31. Function declaration fail: does not support nested function"){
    val input = """
                void foo (int i) {
                    int child_of_foo(float f){} ;
                }"""
    val expect = """Error on line 3 col 37: ("""
    assert(checkRec(input,expect,131))
  }
  test(" 32. Function declaration fail: not eccept size of array"){
    val input = """float call(int arr[3]){}"""
    val expect = """Error on line 1 col 20: 3"""
    assert(checkRec(input,expect,132))
  }
  test(" 33. Function declaration fail: not eccept semi-colon after list of parameters"){
    val input = """float call(int a, int b;){}"""
    val expect = """Error on line 1 col 24: ;"""
    assert(checkRec(input,expect,133))
  }
  test(" 34. Function declaration fail: wrong bracket at block statement"){
    val input = """float call()[}"""
    val expect = """Error on line 1 col 13: ["""
    assert(checkRec(input,expect,134))
  }
  test(" 35. Function declaration and global variable"){
    val input =  """
    boolean a;
    int b;
    int main(){}"""
    val expect = "sucessful"
    assert(checkRec(input,expect,135))
  }
  test(" 36. Function declaration and global variable"){
    val input =  """
    boolean a;
    float a[];
    int main(){}"""
    val expect = "Error on line 3 col 13: ]"
    assert(checkRec(input,expect,136))
  }
  test(" 37. Function declaration and global variable"){
    val input =
      """
        float a[3], b;
        void call(){}
        float b;
        string[] goo(string a, string b){}
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,137))
  }
  test(" 38. Mix declarations  within comment"){
    val input =
      """
        // inline comment
        float a[3], b;
        /* block comment
        !@#$%^&*()_45
        */
        void call(){}
        string a;
        string[] goo(string a, string b){}
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,138))
  }
  test(" 39. Expression: one assigment "){
    val input =
      """
        void main() {
          a = .357e-123;
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,139))
  }
  test(" 40. Expression: many assigment"){
    val input =
      """
        void main() {
          foo(2)[3]=arr[7]=true = x;
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,140))
  }
  test(" 41. Expression: OR operator"){
    val input =
      """
        void main() {
          arr[0] || x || foo();
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,141))
  }
  test(" 42. Expression: AND operator"){
    val input =
      """
        void main() {
          arr[0] && a && foo();
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,142))
  }
  test(" 43. Expression: '==' operator"){
    val input =
      """
        void main() {
          x == 1.05E4;
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,143))
  }
  test(" 44. Expression: '!=' operator"){
    val input =
      """
        void main() {
           x != 1.05E4;
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,144))
  }
  test(" 45. Expression: '<' operator"){
    val input =
      """
        void main() {
          x<y;
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,145))
  }
  test(" 46. Expression: '>' operator"){
    val input =
      """
        void main() {
          x>1.2e10;
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,146))
  }
  test(" 47. Expression: '<=' operator"){
    val input =
      """
        void main() {
          1.2E-2 <= 5;
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,147))
  }
  test(" 48. Expression: '>=' operator"){
    val input =
      """
        void main() {
          1.1E2>=100;
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,148))
  }
  test(" 49. Expression: '+' operator"){
    val input =
      """
        void main() {
          100+35E-35;
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,149))
  }
  test(" 50. Expression: '-' and '!' operator\""){
    val input =
      """
        void main() {
          1-5-2-1-3;
          !a;
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,150))
  }
  test(" 51. Expression: '[]' operator"){
    val input =  """int main()
    {
      int intArr[10];
      intArr[0] = 10;
      return 0;
    }"""
    val expect = "sucessful"
    assert(checkRec(input,expect,151))
  }
  test(" 52.  Expression: none-assoc operater"){
    val input =
      """
        void main() {
          x == y == z;
        }
      """
    val expect = """Error on line 3 col 18: =="""
    assert(checkRec(input,expect,152))
  }
  test(" 53.  Expression: none-assoc operater"){
    val input =
      """
        void main() {
          x > y < z;
        }
      """
    val expect = """Error on line 3 col 17: <"""
    assert(checkRec(input,expect,153))
  }
  test(" 54.  Expression: none-assoc operater"){
    val input =
      """
        void main() {
          abc[123][123];
        }
      """
    val expect = """Error on line 3 col 19: ["""
    assert(checkRec(input,expect,154))
  }
  test(" 55.  Expression: none-assoc operater"){
    val input =
      """
        void main() {
          abc[123] = 5 != x ;
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,155))
  }
  test(" 56. Expression: statement within many type operater"){
    val input =
      """
        void main() {
          5.6+3.5-25e6*15/x%12+arr[1];
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,156))
  }
  test(" 57. Expression: many not statement"){
    val input =
      """
        void main() {
          !!!!!!arr[call(2)];
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,157))
  }
  test(" 58. Expression: index statement"){
    val input =
      """
        void foo() {
          int intArr[10];
          int x;
          x = 1;
          intArr[x - 1] = 0;
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,158))
  }
  test("59. Expression fail: array parameter") {
    val input =  """
                int f(int a[]){}
                int main(){}
                 """
    val expect = "sucessful"
    assert(checkRec(input,expect,159))
  }
  test(" 60. Expression fail: missing index in index statement"){
    val input =
      """
        void main() {
          call(2)[];
        }
      """
    val expect = """Error on line 3 col 19: ]"""
    assert(checkRec(input,expect,160))
  }
  test("61. Expression fail: invalid array parameter") {
    val input =  """
                int f(int a[10]){}
                int main(){}
                 """
    val expect = "Error on line 2 col 29: 10"
    assert(checkRec(input,expect,161))
  }
   test("62. if statement") {
    val input =  """void main()
    {
      if (exp) putString("True");
    }"""
    val expect = "sucessful"
    assert(checkRec(input,expect,162))
  }
  test("63. if else statement ") {
    val input =  """void main()
    {
      if (exp) putString("True");
      else putString("False");
    }"""
    val expect = "sucessful"
    assert(checkRec(input,expect,163))
  }
  test("64. Nested if statement") {
    val input =  """int main()
    {
      if (exp == true)
      if (true)
        putString("True");
    }"""
    val expect = "sucessful"
    assert(checkRec(input,expect,164))
  }
  test("65. Nested if else statement") {
    val input =  """int main()
    {
      if (b) putString("True");
      else if (true) putString("False");
      return 0;
    }"""
    val expect = "sucessful"
    assert(checkRec(input,expect,165))
  }
  test("66. do while single statement") {
    val input =  """void main()
    {
      int i;
      do
      i = i + 1;
      while (true);
    }"""
    val expect = "sucessful"
    assert(checkRec(input,expect,166))
  }
  test("67. do while multiple statements") {
    val input =  """void main()
    {
      int i, j, k;
      do
      i = 1;
      j = 2;
      k = 3;
      while (false);
    }"""
    val expect = "sucessful"
    assert(checkRec(input,expect,167))
  }
  test("68. do while statement missing ending semicolon") {
    val input =  """void main()
    {
      int i;
      do
      i = i + 1;
      while (true)
    }"""
    val expect = "Error on line 7 col 5: }"
    assert(checkRec(input,expect,168))
  }
  test("69. for statement block") {
    val input =  """void main()
    {
      int i, j, k;
      for (i = 1; i < 10; i = i + 1)
      {
        putInt(i);
        j=k;
      }
    }"""
    val expect = "sucessful"
    assert(checkRec(input,expect,169))
  }
  test("70. break statement") {
    val input =  """void main()
    {
      int i, j, k;
      for (i = 1; i < 10; i = i + 1)
      {
        putInt(i);
        j=k;
        break;
      }
    }"""
    val expect = "sucessful"
    assert(checkRec(input,expect,170))
  }
  test("71. continue statement") {
    val input =  """void main()
    {
      int i, j, k;
      for (i = 1; i < 10; i = i + 1)
      {
        putInt(i);
        j=k;
        continue;
      }
    }"""
    val expect = "sucessful"
    assert(checkRec(input,expect,171))
  }
  test("72. return statement") {
    val input =  """int main()
    {
      int i, j, k;
      return j;
    }"""
    val expect = "sucessful"
    assert(checkRec(input,expect,172))
  }
  test("73. return statement") {
    val input =  """void main()
    {
      int i, j, k;
      return;
    }"""
    val expect = "sucessful"
    assert(checkRec(input,expect,173))
  }
  test("74. Expression statement") {
    val input =  """int main()
    {
      int i, j;
      foo(i, j);
      return 0;
    }"""
    val expect = "sucessful"
    assert(checkRec(input,expect,174))
  }
  test("75. Block statement") {
    val input =  """int main()
    {
      int a, b, c;
      getInt();
      putInt(10);
      return 0;
    }
    """
    val expect = "sucessful"
    assert(checkRec(input,expect,175))
  }
  test(" 76. Expression statement"){
    val input =
      """
        void foo() {
          foo("")[3]=abcd||goo()=false;
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,176))
  }
  test(" 77. Expression statement"){
    val input =
      """
        void foo() {
          (foo(258,"abcd")+1.5e-36)==arr[foo(true)];
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,177))
  }
  test(" 78. Expression fail: double or operator") {
    val input =
      """
        void foo() {
          a||||b;
        }
      """
    val expect = """Error on line 3 col 14: ||"""
    assert(checkRec(input,expect,178))
  }
  test(" 79. Expression fail: ! is infix operator"){
    val input =
      """
        void foo() {
          123!369;
        }
      """
    val expect = """Error on line 3 col 14: !"""
    assert(checkRec(input,expect,179))
  }
  test(" 80. If statement fail: wrong braket"){
    val input =
      """
        void foo() {
          if [a==b]
          else
            a=b;
        }
      """
    val expect = """Error on line 3 col 14: ["""
    assert(checkRec(input,expect,180))
  }
  test(" 81. If statement fail"){
    val input =
      """
        void foo() {
          if (a==b)
            a;
          else
            b;
          else
            c;
        }
      """
    val expect = """Error on line 7 col 11: else"""
    assert(checkRec(input,expect,181))
  }
  test(" 82. do while statement fail: have no statement in do"){
    val input =
      """
        void foo() {
          do
          while false;
        }
      """
    val expect = """Error on line 4 col 11: while"""
    assert(checkRec(input,expect,182))
  }
  test(" 83. do while statement fail: missing while keyword"){
    val input =
      """
        int foo() {
          do
            a=a+1;
        }
      """
    val expect = """Error on line 5 col 9: }"""
    assert(checkRec(input,expect,183))
  }
  test(" 84. for statement fail: missing statement in condition for"){
    val input =
      """
        void foo() {
          for (int i) do;
        }
      """
    val expect = """Error on line 3 col 16: int"""
    assert(checkRec(input,expect,184))
  }
  test(" 85. for statement fail: wrong bracket"){
    val input =
      """
        void foo() {
          for {i=0; i<100; i=i+1} {
            str=str+"character";
          }
        }
      """
    val expect = """Error on line 3 col 15: {"""
    assert(checkRec(input,expect,185))
  }
  test(" 86. for statement fail: wrong separator"){
    val input =
      """
        void foo() {
          for (i=0; i<100, i=i+1) {
            a;
          }
        }
      """
    val expect = """Error on line 3 col 26: ,"""
    assert(checkRec(input,expect,186))
  }
  test(" 87. for statement fail: missing bracket"){
    val input =
      """
        void foo() {
          for (i=0; i<100; i=i+1
            a;
        }
      """
    val expect = """Error on line 4 col 13: a"""
    assert(checkRec(input,expect,187))
  }
  test(" 88. for statement fail: missing SEMI"){
    val input =
      """
        void foo() {
          for (i=0; i<100; i=i+1) statement;;
        }
      """
    val expect = """Error on line 3 col 45: ;"""
    assert(checkRec(input,expect,188))
  }
  test(" 89. return statement fail: missing semi-colon"){
    val input =
      """
        void foo() {
          return a
        }
      """
    val expect = """Error on line 4 col 9: }"""
    assert(checkRec(input,expect,189))
  }
  test(" 90. return statement fail: double return keyword"){
    val input =
      """
        void foo() {
          return return a;
        }
      """
    val expect = """Error on line 3 col 18: return"""
    assert(checkRec(input,expect,190))
  }
  test(" 90. Combinational test"){
    val input =
      """
        float foo() {
          return 1;
        }
        void main() {
          int i;
          for (i=0; i<10; i=i+1) {
            putFloatLn(foo());
          }
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,190))
  }
  test(" 91. Combinational test"){
    val input =
      """
        float foo() {
          return foo(2)[arr[3]]="string wit\h number 123" + 125235e-369;
        }
      """
    val expect = """Illegal Escape In String: string wit\h"""
    assert(checkRec(input,expect,191))
  }
  test(" 92. Combinational test"){
    val input =  """int checkPrimeNumber(int);

                   int main()
                   {
                     int n;

                     cout << "Enter a positive  integer: ";
                     cin >> n;

                     if(checkPrimeNumber(n) == 0)
                       cout << n << " is a prime number.";
                     else
                       cout << n << " is not a prime number.";
                     return 0;
                   }
                   int checkPrimeNumber(int n)
                   {
                     bool flag = false;

                     for(int i = 2; i <= n/2; ++i)
                     {
                         if(n%i == 0)
                         {
                             flag = true;
                             break;
                         }
                     }
                     return flag;
                   }"""
    val expect = """Error on line 1 col 25: )"""
    assert(checkRec(input,expect,192))
  }
  test(" 93. Combinational test"){
    val input =  """int add(int n);

                   int main()
                   {
                       int n;

                       cout << "Enter a positive integer: ";
                       cin >> n;

                       cout << "Sum =  " << add(n);

                       return 0;
                   }

                   int add(int n)
                   {
                       if(n != 0)
                           return n + add(n - 1);
                       return 0;
                   }"""
    val expect = """Error on line 1 col 15: ;"""
    assert(checkRec(input,expect,193))
  }
  test(" 94. Combinational test"){
    val input =
      """
        void main() {
          int i;
          for (i=0; i<10; i=i+1) {
            putFloatLn(foo());
          }
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,194))
  }
  test(" 95. Combinational test"){
    val input =  """int convertBinaryToDecimal(long long);

                   int main()
                   {
                       long long n;

                       cout << "Enter a binary number: ";
                       cin >> n;

                       cout << n << " in binary = " << convertBinaryToDecimal(n) << "in decimal";
                       return 0;
                   }

                   int convertBinaryToDecimal(long long n)
                   {
                       int decimalNumber = 0, i = 0, remainder;
                       while (n!=0)
                       {
                           remainder = n%10;
                           n /= 10;
                           decimalNumber += remainder*pow(2,i);
                           ++i;
                       }
                       return decimalNumber;
                   }"""
    val expect = """Error on line 1 col 28: long"""
    assert(checkRec(input,expect,195))
  }
  test(" 96. Combinational test"){
    val input =  """void main()
    {
      putFloatLn(10);
      return ;
    }"""
    val expect = "sucessful"
    assert(checkRec(input,expect,196))
  }
  test(" 97. Combinational test"){
    val input =  """/*fucntion calculates factorial*/
    int fact(int n){}
    int main(){}"""
    val expect = """sucessful"""
    assert(checkRec(input,expect,197))
  }
  test(" 98. Combinational test"){
    val input =  """int main()
                   {
                       int n;
                       long factorial = 1;

                       cin >> n;

                       for(int i = 1; i <=n; ++i)
                       {
                           factorial *= i;
                       }

                       cout << "Factorial of " << n << " = " << factorial;
                       return 0;
                   }"""
    val expect = """Error on line 4 col 29: factorial"""
    assert(checkRec(input,expect,198))
  }
  test(" 99. Combinational test"){
    val input =
      """
        float getRich() {
          return 100000000000;
        }
        void main() {
          prinf( "Enter your name:");
          scanf();
          getRich();
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,199))
  }
  test(" 100. Combinational test"){
    val input =
      """
        void main(){
          finish;
        }
      """
    val expect = """sucessful"""
    assert(checkRec(input,expect,200))
  }
}
