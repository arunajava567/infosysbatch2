public class internExample{
    public static void main(String[] args){
        String str1 = "Hello Java";
        String str2 = new StringBuffer("Hello").append(" Java").toString();
        String str3 = str2.intern();
		System.out.println("str1 == str2 " + (str1 == str2));
        System.out.println("str1 == str3 " + (str1 == str3));
    }
}