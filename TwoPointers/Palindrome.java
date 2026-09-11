public class Palindrome {
    public boolean isPalindrome(String s){

        int left = 0;
        int right = s.length()-1;
        while(left < right)
        {
            if(!Character.isLetterOrDigit(s.charAt(left)))
                left++;
            else if(!Character.isLetterOrDigit(s.charAt(right)))
                right--;
            else{
                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                    return false;
               
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        StringBuilder reverse = new StringBuilder();
        for(int i=s.length()-1; i>=0 ; i--)
            reverse.append(s.charAt(i));
        Palindrome p = new Palindrome();
        System.out.println("Is string is reverse ? : " + p.isPalindrome(s));
        System.out.println("Reverse String is : " + reverse);
    }
}
