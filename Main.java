import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        String t = "IP-925.567.680.52";
        Pattern p = Pattern.compile("(([1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]|\\d)\\.){3}([1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]|\\d)");
        Matcher f = p.matcher(t);
        if (f.find()) {
            System.out.println(f.group());
        }
        else {
            System.out.println("Не нашло");
        }
    }
}