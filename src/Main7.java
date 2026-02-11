public class Main7 {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        int count = 0;
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (!seen[index]) {
                    seen[index] = true;
                    count++;
                    if (count == 26) return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Main7 pangram = new Main7();
        String str1 = "the quick brown fox jumps over the lazy dog";
        String str2 = "leet code";
        System.out.println(pangram.checkIfPangram(str1));
        System.out.println(pangram.checkIfPangram(str2));
    }
}

