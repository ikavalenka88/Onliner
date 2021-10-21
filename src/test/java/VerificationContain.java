import java.util.Locale;

public class VerificationContain {
    public static boolean contain(String str, String submitLetter) {
        return str.toLowerCase().contains(submitLetter.toLowerCase());
    }
}
