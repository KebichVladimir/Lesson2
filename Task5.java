public class Task5 {
    public static void main(String[] args) {
        String str = "############?##";
        String str1 = str.replace("?", "HELLO");
        String str2 = str1.replace("#", "");
        System.out.println(str2);
    }
}