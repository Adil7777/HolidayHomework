public class Sixteen {
    public void printPalindrome(String a) {
        char ch[] = a.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }

        if(a == rev) System.out.println(a + " is palindrome");
        else System.out.print(a + " is not palindrome");
    }
}
