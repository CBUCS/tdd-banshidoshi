public class PasswordValidate {

    public static boolean validation(String pass)
    {
        if (pass.length()>=5 && pass.length()<=10)
        {
            return true;
        }else
        {
            return false;
        }
    }
}
