public class RemoveDuplicate {
    public static void main(String[] args) {
        String str="javajavajavadevdevdev";
        String str1=" ";

        for(int i=0;i<str.length();i++)//0,1,2,3,4,5, .. so on
        {
            char ch=str.charAt(i); // j,a,v,a,j,a .. so on
            if(str1.indexOf(ch)==-1) // true ,true,true,false,false,false ,.. so on
            {
                str1=str1+ch; // jav
            }
        }
        System.out.println(str1);
    }
}
