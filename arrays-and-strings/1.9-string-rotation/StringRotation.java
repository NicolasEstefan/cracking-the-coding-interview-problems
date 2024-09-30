/**
 * StringRotation
 */
public class StringRotation {

    public static boolean isStringRotation(String s1, String s2) {
        if (s2.length() != s1.length())
            return false;

        if (s1.equals(s2))
            return true;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s2.length() - 1; i++)
            if (s2.charAt(i) == s1.charAt(s1.length() - 1) && s2.charAt(i + 1) == s1.charAt(0)) {
                sb.append(s2.substring(i + 1));
                sb.append(s2.substring(0, i + 1));
                sb.append('#');
            }

        String s = sb.toString();
        return s.contains(s1);
    }

    public static void main(String[] args) {
        System.out.println(isStringRotation("waterbottle", "erbottlewat"));
        System.out.println(isStringRotation("waterbottle", "erbottleat"));
        System.out.println(isStringRotation("waterbottle", "erbotteleat"));
        System.out.println(isStringRotation("nicolasestefan", "fannicolaseste"));
    }
}