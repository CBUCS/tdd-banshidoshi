import PasswordTDD.PasswordValidate;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PasswordClass {

@Test
public void PasswordLength()
{
  //  PasswordTDD.PasswordValidate passwordValidate = new PasswordTDD.PasswordValidate();
    Assert.assertEquals(true, PasswordValidate.validation("Abc123"));
}

}
