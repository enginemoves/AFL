package Afl;

public class Task6 {
    public static void duplicharFreq(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '\0') {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '\0';
                }
            }

            if (count >= 1) {
                System.out.print(ch[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        String wordOne = "Concatenate";
        //String wordTwo = "Hello";
        char[] ch = wordOne.toCharArray();
        duplicharFreq(ch);
    }
}
