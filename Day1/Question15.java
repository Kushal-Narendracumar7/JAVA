public class Question15 {
    public static void main(String[] args) {
        String str = "Madam";
        if(str.isEmpty()){
            System.out.println("The string is empty.");
        }else{
            boolean isPalindrome = checkPalindrome(str);
            if(isPalindrome) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }
    }
    public static boolean checkPalindrome(String str){
        str = str.toLowerCase();
        if(str.isEmpty()) {
            return true; // An empty string is a palindrome
        }
        StringBuilder reverse = new StringBuilder();
        for(int i = str.length()-1;i>=0;i--){
            reverse.append(str.charAt(i));
        }

    return str.equals(reverse.toString());
    }
}
