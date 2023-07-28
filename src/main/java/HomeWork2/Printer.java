package HomeWork2;

import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean enter = true;
        while (enter) {
            System.out.print("Введите дробное число: ");
            String num = sc.nextLine();
            try {
                float floatNum = Float.parseFloat(num);
                enter = false;
                System.out.println("Вы ввели: " + floatNum);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода:");
            }
        }
    }
}

