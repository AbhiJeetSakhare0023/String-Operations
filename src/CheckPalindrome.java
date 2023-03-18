public class CheckPalindrome {
    public static void main(String[] args) {
        String actual="mom";
        String rev="";
        for(int i=actual.length()-1;i>=0;i--)
        {
            rev=rev+actual.charAt(i);
        }
        if(rev.equals(actual))// == used to based on ref
        {
            System.out.println(actual+" is palindrome..");
        }
        else
        {
            System.out.println(actual+" is not a palindrome..");
        }
    }
}
