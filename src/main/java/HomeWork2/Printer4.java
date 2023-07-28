package HomeWork2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Printer4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любой текст, кроме пустой строки");
        try {
            String result = reader.readLine();
            String res = result.replaceAll("\\s+","");
            if(res.length() == 0) throw new RuntimeException("Пустые строки вводить нельзя");
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}