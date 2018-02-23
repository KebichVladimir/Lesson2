import static java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) {
        double a = 5.0;
        double b = 6.0;
        double r = 4.0;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("r= " + r);
        double c = sqrt(a * a + b * b);
        if (r * 2 >= c) {
            System.out.println("Прямоугольное отверстие размерами a и b полностью закроется круглой картонкой радиусом r");
        } else {
            System.out.println("Прямоугольное отверстие размерами a и b не закроется круглой картонкой радиусом r");
        }
    }
}