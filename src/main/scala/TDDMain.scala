object TDDMain {
  def main(args: Array[String]): Unit = {
    val pwd : PasswordValidator = new PasswordValidator()
    val a = pwd.isPasswordValid("loljsdfush8989HHH")
    print(a)
  }
}
