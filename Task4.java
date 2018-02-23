public class Task4 {
    public static void main(String[] args) {
        int rubl = 12;
        int rubl10 = rubl % 10;
        int rubl100 = rubl % 100;
        if (rubl10 == 1 && rubl100 != 11) {
            System.out.println(rubl + " рубль");
        } else if ((rubl10 == 2 && rubl100 != 12) || (rubl10 == 3 && rubl100 != 13) || (rubl10 == 4 && rubl100 != 14)) {
            System.out.println(rubl + " рубля");
        } else if (rubl10 == 0 || rubl10 >= 5 || rubl10 <= 9 || rubl100 <= 11 || rubl100 >= 19) {
            System.out.println(rubl + " рублей");
        }
    }
}