import java.lang.Math;
public class PiSearch {

    public static void main(String[] args){
        Pi pi = new Pi();
        //NOTE: pi isn't normally finite
        String digits = "";
        int i;

        //we start with 2 since we don't care about anything before the decimal
        //-7 here since we can't have a 7 digit prime with fewer than 7 digits
        for(i = 2; i < pi.piRaw.length()-7; i++){
            digits = pi.piRaw.substring(i,i+7);
            if(isPalindrome(digits) && isPrime(Integer.parseInt(digits))){
                break;
            }
        }

        System.out.println("The first prime palindrome in pi is, " + digits + ", located at decimal " + (i-1));

    }

    public static boolean isPalindrome(String digits){
        boolean result = false;
        String reverse = "";

        for(int i = digits.length()-1; i >=0; i--){
            reverse = reverse + digits.charAt(i);
        }

        if(digits.equals(reverse)){
            result = true;
        }

        return result;
    }

    public static boolean isPrime(int digits){
        boolean result = true;
        for(int i=2;i<=Math.sqrt(digits); i++){
            if(digits%i==0){
                result = false;
                return result;
            }
        }
        return result;


    }

}
