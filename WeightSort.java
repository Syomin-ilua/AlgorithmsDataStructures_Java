/* Василий и Петр пошли заниматься в фитнес зал "Бухгалтерия". 
Каждый месяц фитнес-зал вывешивает список всех посетителей с их весом отсортированный по возрастанию. 
Петр каждый раз очень расстраивается из-за того что он всегда внизу списка с наибольшим весом. 
У Василия все хорошо и поскольку он лучший друг Петра решил, что немного подправит функцию сортировки и т
аблица будет сортироваться не по весу, а по сумме чисел данного веса (189 -> 18). 
Помогите Василию решить эту задачу. Пр. "56 65 74 100 99 68 86 180 90" отсортированный спико должен начать 
выглядеть вот так: "100 180 90 56 65 74 68 86 99". */

import java.util.*;

public class WeightSort {
    private static int digitSum(String number) {
        int sum = 0;
        for (char c : number.toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }

    public static String orderWeight(String str) {
        String[] numbers = str.trim().split("\\s+");

        Arrays.sort(numbers, (a, b) -> {
            int sumA = digitSum(a);
            int sumB = digitSum(b);

            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            }

            return a.compareTo(b);
        });

        return String.join(" ", numbers);
    }

    public static void main(String[] args) {
        String input = "56 65 74 100 99 68 86 180 90";
        System.out.println(orderWeight(input));
    }
}
