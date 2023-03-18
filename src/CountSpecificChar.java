public class CountSpecificChar {
    public static void main(String[] args) {
        String str="javaEEdeve";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='e' ||str.charAt(i)=='E')
            {
                count++;
            }
        }
        System.out.println("Number of e/E: "+count);
    }
}
