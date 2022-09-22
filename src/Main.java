public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        for (int i = 1; i<=10; i++) {
            System.out.println("Итерацция цикла " + i);
        }
        System.out.println("Задание №2");
        for (int k = 10; k>=1; k--) {
            System.out.println("Итерацция цикла " + k);
        }
        System.out.println("Задание №3");
        for (int d = 0; d<=17; d++) {
            if (d % 2 == 0) {
                System.out.println("Итерацция цикла " + d);
            }
        }
        System.out.println("Задание №4");
        for (int v = 10; v>=-10; v--) {
            System.out.println("Итерацция цикла " + v);
        }
    }
}