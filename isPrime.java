// Напишите программу проверяющую что число является простым - делится только на себя и 1. Пример простых чисел: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29…

public class isPrime {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 45, 267};

        for (int n : numbers) {
            boolean prime = true;

            if (n < 1) {
                prime = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            System.out.println(n + " -> " + (prime ? "простое" : "не простое"));
        }
    }
}