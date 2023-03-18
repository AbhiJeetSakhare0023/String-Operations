public class Methods
{
    public static void main(String[] args) {

        // Methods :

        // 1. length(); -------------------> int

        String str = "Java Development";
        System.out.println("Length of str: "+str.length());

        System.out.println("-------------------------------------------");

        // 2. charAt(index); -------------------> char

        String str1 ="Java";
        System.out.println("Character at index 0: "+str1.charAt(0));
        // System.out.println(str1.charAt(4)); ---> StringIndexOutOfBoundsException
        System.out.println("-------------------------------------------");
        // 3.object1.equals(object2); -------------------> boolean
        // checks two strings are equal or not based on string data

        String str2="Java";
        String str3="java";
        String str4="Java";

        System.out.println(str2.equals(str3)); // it uses case sensitivity java not equal to Java
        System.out.println(str2.equals(str4)); // true
        System.out.println("-------------------------------------------");
        // 4.object1.equalsIgnoreCase(object2); -------------------> boolean
        // it ignores case sensitivity

        System.out.println(str2.equalsIgnoreCase(str3));// true
        System.out.println("-------------------------------------------");
        // 5.trim(); -------------------> boolean
        // removes space from start & end not middle

        String str5=" Java   Development  ";
        String trimmed = str5.trim();
        System.out.println(trimmed);
        System.out.println("-------------------------------------------");
        // 6.subString(int arg): -------------------> String
        // 6.1 subString(int from,int to) // to excluded

        String str6 = "Java Development";
        String substr=str6.substring(3);
        System.out.println(substr); // a Development

        String substr1 = str.substring(0,4);
        System.out.println(substr1);// Java 4 exclusive
        System.out.println("-------------------------------------------");
        // 7.indexOf(): -------------------> int
        // 7.1 indexOf(char): --------------> int
        // 7.2 indexOf(String): ------------> int
        // 7.3 indexOf(char,int fromindex): ------------> int
        // 7.4 indexOf(string,int fromindex): -------------> int

        String str7="Java Development";

        System.out.println(str7.indexOf('D')); // 5
        System.out.println(str7.indexOf("lop"));// 5
        System.out.println(str7.indexOf('p',5)); // 11
        System.out.println(str7.indexOf("Dev",0)); // 5

        // if character/str is not present then it will return -1
        System.out.println(str7.indexOf('Q'));// -1
        System.out.println("-------------------------------------------");
        // 8.toUpperCase(): ----------> String

        String str8="abhi sakhare";
        String upper=str8.toUpperCase();
        System.out.println(upper);
        System.out.println("-------------------------------------------");
        // 9.toLowerCase(): ----------> String

        String str9="SAKHARE PATIL";
        String lower=str9.toLowerCase();
        System.out.println(lower);

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        // 10.startsWith(string):-------------->boolean

        String str10="Java Full Stack Developer";
        if(str10.startsWith("Jav"))
        {
            System.out.println("String starts with Jav");
        }
        else {
            System.out.println("Not starts with Jav");
        }
        System.out.println("---------------");
        System.out.println("-------------------------------------------");
        //11.endsWith(string): -------------->boolean

        if(str10.endsWith("er"))
        {
            System.out.println("Ends With er");
        }
        else {
            System.out.println("Not ends with er");
        }
        System.out.println("-------------------------------------------");
        //12.contains(string) ----------> boolean

        if(str10.contains("Stack"))
        {
            System.out.println("String contains Stack word");
        }
        else {
            System.out.println("String NOT contains Stack word");
        }
        System.out.println("-------------------------------------------");
        // 13.isEmpty():---------------> boolean

        if(str10.isEmpty())
        {
            System.out.println("str10 is empty");
        }
        else {
            System.out.println("str10 is NOT empty");
        }
        System.out.println("-------------------------------------------");
        //14.object.concat(String)

        String str14="Java Full Stack Developer";
        String str15=str14.concat(" + Electrical Engineer.");
        System.out.println(str15);
        System.out.println("-------------------------------------------");
        //15.replace():
        // 15.1 replace(givenchar,desiredchr) -- replace char
        // 15.2 replaceALL(givenString,desiredString)---replace string
        // 15.3 replaceAll(String regrex,String replacement) -- regrex -[0-9],[a-z],[A-Z]

        String str16="java development";
        String s1=str16.replace('e','a');// java davalopmant
        System.out.println(s1);

        String s2=str16.replaceAll("java","Sql");
        System.out.println(s2);

        String s3 =str16.replaceAll("[aeiouAEIOU]","");
        System.out.println(s3);

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");


    }

}
