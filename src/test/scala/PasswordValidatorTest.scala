import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class PasswordValidatorTest extends AnyFlatSpec with Matchers{

  "A valid password" should "have length > 6" in {
    val passwordValidator: PasswordValidator = new PasswordValidator()
    assert(passwordValidator.isPasswordValid("abc123d"))
    assert(!passwordValidator.isPasswordValid("abc"))


  }

}
