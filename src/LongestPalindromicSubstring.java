import java.util.Scanner;

public class LongestPalindromicSubstring {
    static String findPalindromicSubstring(String S){
        String s = "";
        for(int i = 0; i < S.length()-1; i++){
            String sub1 = isPalindrome(S, i, i);
            String sub2 = isPalindrome(S, i, i+1);
            if(sub1.length()> s.length()){
                s = sub1;
            }
            if(sub2.length() > s.length()){
                s=sub2;
            }
        }
        return s;
    }
    static String isPalindrome(String S, int start, int end){
        while(start >= 0 && end < S.length() && S.charAt(start)==S.charAt(end)){
            start--;
            end++;
        }
        return S.substring(start+1, end);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(findPalindromicSubstring(string));
    }
}
