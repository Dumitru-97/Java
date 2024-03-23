import javax.swing.*;
import java.util.Scanner;

public class TemeIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Numarul este par");
        } else {
            System.out.println("Numarul este impar ");
        }
    }
}

