package j05_Scanner;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      //nextInt는 숫자 입력 가능함


        System.out.println("x입력:");
        int x = scanner.nextInt();

        System.out.println("y입력:");
        int y = scanner.nextInt();

        System.out.println("x + y ="+ (x+y));
    }
}
