package strings;

public class LookAndSayProblem {

    public String lookAndSay(int n) {
        String str = "1";
        for (int i = 0; i < n; i++) {
            str = findNextNumber(str);
        }
        return str;
    }

    private String findNextNumber(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            stringBuffer.append(count).append(str.charAt(i));
        }
        return stringBuffer.toString();
    }

}
