
/**
 * CompressString
 */
public class CompressString {

    public static String compressString(String s) {
        if (s.isBlank())
            return "";

        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        sb.append(c);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
                continue;
            }

            c = s.charAt(i);
            if (count == 1) {
                sb.append(c);
                continue;
            }

            sb.append(Integer.toString(count));
            count = 1;
            sb.append(c);
        }

        if (count > 1)
            sb.append(Integer.toString(count));

        return sb.toString();
    }

    public static void main(String[] args) {
        if (args.length == 0)
            return;

        for (int i = 0; i < args.length; i++)
            System.out.println(compressString(args[i]));
    }
}