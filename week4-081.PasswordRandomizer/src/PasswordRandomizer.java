import java.util.Random;

public class PasswordRandomizer {
    private int pwdLen;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.pwdLen = length;
    }

    public String createPassword() {
        String pwd="";
        for(int i=0; i < this.pwdLen; i++)
            pwd = pwd + (char)(random.nextInt(26) + 'a');
        return pwd;
    }
}
