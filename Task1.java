public class Task1 {
    public static void main(String[] args) {
        String str = "Создайте переменную типа String c любым текстом";
        int length = str.length();
        System.out.println("Количество символов в строке - " + "'" + str + "'" + " - " + length);
        String str1 = str.substring(0, str.length() / 2);
        String str2 = str.substring(str.length() / 2, str.length());
        System.out.println("Первая половнина строки - " + str1);
        System.out.println("Вторая половнина строки - " + str2);
    }
}