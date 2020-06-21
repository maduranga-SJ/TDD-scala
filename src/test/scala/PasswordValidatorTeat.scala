import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class PasswordValidatorTest extends AnyFlatSpec with Matchers{

  "A valid password" should "have length > 6" in {
    val passwordValidator: PasswordValidator = new PasswordValidator()
    assert(passwordValidator.isPasswordValid("abc123Dsdf"))
    assert(!passwordValidator.isPasswordValid("abc"))
  }

  "A valid password" should "have one or more Uppercase letter " in {
    val passwordValidator: PasswordValidator = new PasswordValidator()
    assert(passwordValidator.isPasswordValid("AJSDKIAJDSLJASDsadscf"))
    assert(!passwordValidator.isPasswordValid("asdad"))
  }

}
