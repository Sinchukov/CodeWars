public class Kata {
    public static String add(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int i = 0;
        int n = Math.max(a.length(), b.length());
        while (i < n || x > 0) {
            if (i < a.length()) {
                x += a.charAt(a.length() - 1 - i) - '0';
            }
            if (i < b.length()) {
                x += b.charAt(b.length() - 1 - i) - '0';
            }
            sb.append(x % 10);
            x = x / 10;
            i++;
        }
        String result = sb.reverse().toString();
        return result.charAt(0) == '0' && result.length() > 1 ? result.substring(1, result.length()) : result;
    }
}