package task1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите набор чисел");
        Scanner scanner = new Scanner(System.in);
        String str  = scanner.nextLine();
        String[] numbs = str.split("\\s+");
        Set<String> uniqueNumbersSet = new HashSet<>();

        for (String number : numbs) {
            uniqueNumbersSet.add(number);
        }
        System.out.printf("Уникальные: ");
        for (String n: uniqueNumbersSet) {
            System.out.printf(n + " ");
        }
    }
}