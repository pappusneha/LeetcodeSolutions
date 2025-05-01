package org.practise;

public class Palindrome {
    public static void main(String[] args){
        boolean result = validPalindrome("A man, a plan, a canal: Panama");
        System.out.println(result);
    }

    private static boolean validPalindrome(String s) {

        String s1 =s.toLowerCase().replace(" ", "");
        String testString = s1.replaceAll("[^a-zA-Z0-9]", "");
        char[] charArr = testString.toCharArray();

        if(charArr.length == 0) return true;
        if(charArr.length ==1){
            return true;
        }
        int left =0;
        int right = charArr.length-1;

        while(left != right && right > 0){
            if(charArr[left] != charArr[right]){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

}
