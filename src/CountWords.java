public class CountWords {
    public static void main(String[] args) {
        String str=" I am a Java Developer   ";
        String trimmed=str.trim();//I am a Java Developer
        int count=1;
        for(int i=0;i<trimmed.length();i++)//0,1,2,3,4 so on
        {
            if(trimmed.charAt(i)==' '&& trimmed.charAt(i+1)!=' ') // false,true,false,false,true so on
            {
                count++;//2,3 so on
            }
        }
        System.out.println("Number of words: "+count);
    }
}
