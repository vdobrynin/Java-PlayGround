public class Main4 {
    public static int firstUniqChar(String s) {
        int result = -1;
        for (int i = 0; i < s.length(); i++) {
            boolean isUnique = true;

            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
