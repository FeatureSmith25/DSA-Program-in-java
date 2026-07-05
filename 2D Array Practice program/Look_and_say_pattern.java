public class Look_and_say_pattern {
    public static String countandsay(int n) {
        if (n == 1) return "1";
        
        String s = countandsay(n - 1) + "#";
        String ans = "";
        int i = 0, j = 0;
        
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } else {
                int freq = j - i;
                ans += freq;
                ans += s.charAt(i);
                i = j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5; 
        for (int i = 1; i <= n; i++) {
            System.out.println(countandsay(i));
        }
    }    
}
