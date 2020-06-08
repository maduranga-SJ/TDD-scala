import java.util.regex.Pattern

class PasswordValidator {
  private val block_regex = "^.*[A-Z]+.*$"

  def isPasswordValid(password: String): Boolean = {
    var isValidPassword = false
    val blockPattern = Pattern.compile(block_regex).matcher(password)
    if (password.length > 6 && blockPattern.matches()) {
      isValidPassword = true
    }
    isValidPassword
  }
}
