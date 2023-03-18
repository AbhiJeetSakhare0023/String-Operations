public class CountVowels {
    public static void main(String[] args) {
        String str="javadeveou";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                System.out.print(str.charAt(i)+" ");
                count++;
            }

        }
        System.out.println();
        System.out.println("Count of Vowels in str: "+count);
    }
}
