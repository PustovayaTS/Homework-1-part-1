public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int savings = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

    }
}