import org.scalatest.FunSuite

/**
  * Created by nhphung on 4/28/17.
  */
class LexerSuite extends FunSuite with TestLexer {

  test("1. keyword") {
    val input = """boolean break"""
    val expect = """boolean,break,<EOF>"""
    assert(checkLex(input,expect,1))
  }
  test("2. keyword") {
    val input = """continue"""
    val expect = """continue,<EOF>"""
    assert(checkLex(input,expect,2))
  }
  test("3. keyword") {
    val input = """else for float"""
    val expect = """else,for,float,<EOF>"""
    assert(checkLex(input,expect,3))
  }
  test("4. keyword") {
    val input = """if int"""
    val expect = """if,int,<EOF>"""
    assert(checkLex(input,expect,4))
  }
  test("5. keyword") {
    val input = """return void"""
    val expect = """return,void,<EOF>"""
    assert(checkLex(input,expect,5))
  }
  test("6. keyword") {
    val input = """do"""
    val expect = """do,<EOF>"""
    assert(checkLex(input,expect,6))
  }
  test("7. keyword") {
    val input = """while"""
    val expect = """while,<EOF>"""
    assert(checkLex(input,expect,7))
  }
  test("8. keyword") {
    val input = """true"""
    val expect = """true,<EOF>"""
    assert(checkLex(input,expect,8))
  }
  test("9. keyword") {
    val input = """false"""
    val expect = """false,<EOF>"""
    assert(checkLex(input,expect,9))
  }
  test("10. keyword") {
    val input = """string"""
    val expect = """string,<EOF>"""
    assert(checkLex(input,expect,10))
  }
  test("11. identifier") {
    val input = """abc"""
    val expect = """abc,<EOF>"""
    assert(checkLex(input,expect,11))
  }
  test("12. identifier") {
    val input = """_abc"""
    val expect = """_abc,<EOF>"""
    assert(checkLex(input,expect,12))
  }
  test("13. identifier") {
    val input = """string abc"""
    val expect = """string,abc,<EOF>"""
    assert(checkLex(input,expect,13))
  }
  test("14. identifier") {
    val input = """1abc"""
    val expect = """1,abc,<EOF>"""
    assert(checkLex(input,expect,14))
  }
  test("15. identifier") {
    val input = """abc123"""
    val expect = """abc123,<EOF>"""
    assert(checkLex(input,expect,15))
  }
  test("16. operator") {
    val input = """x=y"""
    val expect = """x,=,y,<EOF>"""
    assert(checkLex(input,expect,16))
  }
  test("17. operator") {
    val input = """a+b=3"""
    val expect = """a,+,b,=,3,<EOF>"""
    assert(checkLex(input,expect,17))
  }
  test("18. operator") {
    val input = """y=g*5/2"""
    val expect = """y,=,g,*,5,/,2,<EOF>"""
    assert(checkLex(input,expect,18))
  }
  test("19. operator") {
    val input = """m=n-5"""
    val expect = """m,=,n,-,5,<EOF>"""
    assert(checkLex(input,expect,19))
  }
  test("20. operator") {
    val input = """!t||b"""
    val expect = """!,t,||,b,<EOF>"""
    assert(checkLex(input,expect,20))
  }
  test("21. operator") {
    val input = """% &&"""
    val expect = """%,&&,<EOF>"""
    assert(checkLex(input,expect,21))
  }
  test("22. operator") {
    val input = """x!=y==z"""
    val expect = """x,!=,y,==,z,<EOF>"""
    assert(checkLex(input,expect,22))
  }
  test("23. operator") {
    val input = """x<y z<=t"""
    val expect = """x,<,y,z,<=,t,<EOF>"""
    assert(checkLex(input,expect,23))
  }
  test("24. operator") {
    val input = """x>y"""
    val expect = """x,>,y,<EOF>"""
    assert(checkLex(input,expect,24))
  }
  test("25. operator") {
    val input = """c>=>y"""
    val expect = """c,>=,>,y,<EOF>"""
    assert(checkLex(input,expect,25))
  }
  test("26. separator") {
    val input = """} int main {"""
    val expect = """},int,main,{,<EOF>"""
    assert(checkLex(input,expect,26))
  }
  test("27. separator") {
    val input = """main int {"""
    val expect = """main,int,{,<EOF>"""
    assert(checkLex(input,expect,27))
  }
  test("28. separator") {
    val input = """int b[3]"""
    val expect = """int,b,[,3,],<EOF>"""
    assert(checkLex(input,expect,28))
  }
  test("29. separator") {
    val input = """if (a){}"""
    val expect = """if,(,a,),{,},<EOF>"""
    assert(checkLex(input,expect,29))
  }
  test("30. separator") {
    val input = """)("""
    val expect = """),(,<EOF>"""
    assert(checkLex(input,expect,30))
  }
  test("31. separator") {
    val input = """a,b"""
    val expect = """a,,,b,<EOF>"""
    assert(checkLex(input,expect,31))
  }
  test("32. separator") {
    val input = """a,,b"""
    val expect = """a,,,,,b,<EOF>"""
    assert(checkLex(input,expect,32))
  }
  test("33. separator") {
    val input = """foo();"""
    val expect = """foo,(,),;,<EOF>"""
    assert(checkLex(input,expect,33))
  }
  test("34. separator") {
    val input = """;foo"""
    val expect = """;,foo,<EOF>"""
    assert(checkLex(input,expect,34))
  }
  test("35. integer literal") {
    val input = """123"""
    val expect = """123,<EOF>"""
    assert(checkLex(input,expect,35))
  }
  test("36. integer literal") {
    val input = """0123"""
    val expect = """0123,<EOF>"""
    assert(checkLex(input,expect,36))
  }
  test("37. integer literal") {
    val input = """12 14"""
    val expect = """12,14,<EOF>"""
    assert(checkLex(input,expect,37))
  }
  test("38. float literal"){
    val input = """-1.2 1.3"""
    val expect = """-,1.2,1.3,<EOF>"""
    assert(checkLex(input,expect,38))
  }
  test("39. float literal"){
    val input = """1. .1"""
    val expect = """1.,.1,<EOF>"""
    assert(checkLex(input,expect,39))
  }
  test("40. float literal"){
    val input = """."""
    val expect = """ErrorToken ."""
    assert(checkLex(input,expect,40))
  }
  test("41. float literal"){
    val input = """1e2"""
    val expect = """1e2,<EOF>"""
    assert(checkLex(input,expect,41))
  }
  test("42. float literal"){
    val input = """1.2E2"""
    val expect = """1.2E2,<EOF>"""
    assert(checkLex(input,expect,42))
  }
  test("43. float literal"){
    val input = """1.2E-2 1.2e+2"""
    val expect = """1.2E-2,1.2,e,+,2,<EOF>"""
    assert(checkLex(input,expect,43))
  }
  test("44. float literal"){
    val input = """.1E2"""
    val expect = """.1E2,<EOF>"""
    assert(checkLex(input,expect,44))
  }
  test("45. float literal"){
    val input = """128e-42"""
    val expect = """128e-42,<EOF>"""
    assert(checkLex(input,expect,45))
  }
  test("46. float literal"){
    val input = """1.e2 .e"""
    val expect = """1.e2,ErrorToken ."""
    assert(checkLex(input,expect,46))
  }
  test("47. float literal"){
    val input = """1.1e"""
    val expect = """1.1,e,<EOF>"""
    assert(checkLex(input,expect,47))
  }
  test("48. float literal"){
    val input = """e-3"""
    val expect = """e,-,3,<EOF>"""
    assert(checkLex(input,expect,48))
  }
  test("49. boolean literal"){
    val input = """true"""
    val expect = """true,<EOF>"""
    assert(checkLex(input,expect,49))
  }
  test("50. boolean literal"){
    val input = """false"""
    val expect = """false,<EOF>"""
    assert(checkLex(input,expect,50))
  }
  test("51. string literal"){
    val input = """"Hello""""
    val expect = """Hello,<EOF>"""
    assert(checkLex(input,expect,51))
  }
  test("52. string literal"){
    val input = """"string""""
    val expect = """string,<EOF>"""
    assert(checkLex(input,expect,52))
  }
  test("53. string literal"){
    val input = """"int""""
    val expect = """int,<EOF>"""
    assert(checkLex(input,expect,53))
  }
  test("54. string literal"){
    val input = """ "as" "ab" """
    val expect = """as,ab,<EOF>"""
    assert(checkLex(input,expect,54))
  }
  test("55. string literal"){
    val input = """ "" """
    val expect = """,<EOF>"""
    assert(checkLex(input,expect,55))
  }
  test("56. line comment"){
    val input = """//comment
    das
    sam"""
    val expect = """das,sam,<EOF>"""
    assert(checkLex(input,expect,56))
  }
  test("57. line comment"){
    val input = """//comment 3243 %^&
    das
    sam"""
    val expect = """das,sam,<EOF>"""
    assert(checkLex(input,expect,57))
  }
  test("58. line comment"){
    val input = """//comment"""
    val expect = """<EOF>"""
    assert(checkLex(input,expect,58))
  }
  test("59. line comment"){
    val input = """//comment 3243 %^&"""
    val expect = """<EOF>"""
    assert(checkLex(input,expect,59))
  }
  test("60. line comment"){
    val input = """//comment //3243 %^&
    das
    sam"""
    val expect = """das,sam,<EOF>"""
    assert(checkLex(input,expect,60))
  }
  test("61. block comment"){
    val input = "/* dasd*/"
    val expect = """<EOF>"""
    assert(checkLex(input,expect,61))
  }
  test("62. block comment"){
    val input = "/* dasd*/ */"
    val expect = """*,/,<EOF>"""
    assert(checkLex(input,expect,62))
  }
  test("63. block comment"){
    val input = """/* d//asd\n
    ansdknsadksad
    asndksadnsa */"""
    val expect = """<EOF>"""
    assert(checkLex(input,expect,63))
  }
  test("64. block comment"){
    val input = """/* d//asd\n
    ansdknsadksad
    asndksadnsa */
    /* asbjd*/
    """
    val expect = """<EOF>"""
    assert(checkLex(input,expect,64))
  }
  test("65. block comment"){
    val input = """/* d//asd\n
    ansdknsadksad
    asndksadnsa */    */"""
    val expect = """*,/,<EOF>"""
    assert(checkLex(input,expect,65))
  }
  test("66. illegal escape"){
    val input = """ "dasd \' \ a" """
    val expect = """Illegal escape in string: dasd \' \ """
    assert(checkLex(input,expect,66))
  }
  test("67. illegal escape"){
    val input = """ "dasd \b \a " """
    val expect = """Illegal escape in string: dasd \b \a"""
    assert(checkLex(input,expect,67))
  }
  test("68. illegal escape"){
    val input = """ "dasd \a \b" """
    val expect = """Illegal escape in string: dasd \a"""
    assert(checkLex(input,expect,68))
  }
  test("69. illegal escape"){
    val input = """ "dasd \' \a \m" """
    val expect = """Illegal escape in string: dasd \' \a"""
    assert(checkLex(input,expect,69))
  }
  test("70. illegal escape"){
    val input = """ "dasd \asn";"""
    val expect = """Illegal escape in string: dasd \a"""
    assert(checkLex(input,expect,70))
  }
  test("71. unclosed string"){
    val input = """ "dasd dasd"""
    val expect = """Unclosed string: dasd dasd"""
    assert(checkLex(input,expect,71))
  }
  test("72. unclosed string"){
    val input = """ "dasd dasd\" """
    val expect = """Unclosed string: dasd dasd\" """
    assert(checkLex(input,expect,72))
  }
  test("73. unclosed string"){
    val input = """ "dasd
     dasd" """
    val expect = """Unclosed string: dasd"""
    assert(checkLex(input,expect,73))
  }
  test("74. unclosed string"){
    val input = """ "dasd \"
    dasd" """
    val expect = """Unclosed string: dasd \""""
    assert(checkLex(input,expect,74))
  }
  test("75. unclosed string"){
    val input = """ """"
    val expect = """Unclosed string: """
    assert(checkLex(input,expect,75))
  }
  test("76. error token"){
    val input = """."""
    val expect = """ErrorToken ."""
    assert(checkLex(input,expect,76))
  }
  test("77. error token"){
    val input = """&"""
    val expect = """ErrorToken &"""
    assert(checkLex(input,expect,77))
  }
  test("78. error token"){
    val input = """~"""
    val expect = """ErrorToken ~"""
    assert(checkLex(input,expect,78))
  }
  test("79. error token"){
    val input = """@"""
    val expect = """ErrorToken @"""
    assert(checkLex(input,expect,79))
  }
  test("80. error token"){
    val input = """#"""
    val expect = """ErrorToken #"""
    assert(checkLex(input,expect,80))
  }
  test("81. combination"){
    val input = """int a=3;"""
    val expect = """int,a,=,3,;,<EOF>"""
    assert(checkLex(input,expect,81))
  }
  test("82. combination"){
    val input = """string s="hello" """
    val expect = """string,s,=,hello,<EOF>"""
    assert(checkLex(input,expect,82))
  }
  test("83. combination"){
    val input = """float t = ."""
    val expect = """float,t,=,ErrorToken ."""
    assert(checkLex(input,expect,83))
  }
  test("84. combination"){
    val input = """string s = "hello"""
    val expect = """string,s,=,Unclosed string: hello"""
    assert(checkLex(input,expect,84))
  }
  test("85. combination"){
    val input = """int main () {
      }"""
    val expect = """int,main,(,),{,},<EOF>"""
    assert(checkLex(input,expect,85))
  }
  test("86. combination"){
    val input = """x="this \n" """
    val expect = """x,=,this \n,<EOF>"""
    assert(checkLex(input,expect,86))
  }
  test("87. combination"){
    val input = """x+3 ="string" """
    val expect = """x,+,3,=,string,<EOF>"""
    assert(checkLex(input,expect,87))
  }
  test("88. combination"){
    val input = """c/1.3e4"""
    val expect = """c,/,1.3e4,<EOF>"""
    assert(checkLex(input,expect,88))
  }
  test("89. combination"){
    val input = """1,5E5"""
    val expect = """1,,,5E5,<EOF>"""
    assert(checkLex(input,expect,89))
  }
  test("90. combination"){
    val input = """_cal+1ab"""
    val expect = """_cal,+,1,ab,<EOF>"""
    assert(checkLex(input,expect,90))
  }
  test("91. combination"){
    val input = """.1E-5+5"""
    val expect = """.1E-5,+,5,<EOF>"""
    assert(checkLex(input,expect,91))
  }
  test("92. combination"){
    val input = """1.e+4"""
    val expect = """1.,e,+,4,<EOF>"""
    assert(checkLex(input,expect,92))
  }
  test("93. combination"){
    val input = """ "\n""' """
    val expect = """\n,Unclosed string: ' """
    assert(checkLex(input,expect,93))
  }
  test("94. combination"){
    val input = """ "abcd \""""
    val expect = """Unclosed string: abcd \""""
    assert(checkLex(input,expect,94))
  }
  test("95. combination"){
    val input = """"EOF """
    val expect = """Unclosed string: EOF """
    assert(checkLex(input,expect,95))
  }
  test("96. combination"){
    val input = """<EOF>"""
    val expect = """<,EOF,>,<EOF>"""
    assert(checkLex(input,expect,96))
  }
  test("97. combination"){
    val input = """x+3; //comment"""
    val expect = """x,+,3,;,<EOF>"""
    assert(checkLex(input,expect,97))
  }
  test("98. combination"){
    val input = """x+/*ert// */"""
    val expect = """x,+,<EOF>"""
    assert(checkLex(input,expect,98))
  }
  test("99. combination"){
    val input = """1.4abc"""
    val expect = """1.4,abc,<EOF>"""
    assert(checkLex(input,expect,99))
  }
  test("100. combination"){
    val input = """main int class"""
    val expect = """main,int,class,<EOF>"""
    assert(checkLex(input,expect,100))
  }
}
