import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PasswordClass {

@Test
public void PasswordLength()
{
    PasswordValidate passwordValidate = new PasswordValidate();
    Assert.assertEquals(true,passwordValidate.validation("Abc123"));
}

}
