public class App {
    public static void main(String[] args) throws Exception {
        Integer num = 11;
        while(true){
            if(num.toString().equals(reverseString(num.toString())) &&
            Integer.toBinaryString(num).equals(reverseString(Integer.toBinaryString(num))) &&
            Integer.toOctalString(num).equals(reverseString(Integer.toOctalString(num))) ){
                System.out.println(num);
                System.out.println(Integer.toBinaryString(num));
                System.out.println(Integer.toOctalString(num));
                break;
            }
            num += 2;
        }
    
    }
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        String tmp = sb.reverse().toString();
        return tmp;
    }
}
