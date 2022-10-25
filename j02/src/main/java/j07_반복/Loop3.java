package j07_반복;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;

        System.out.println("몇 번 반복할 지 입력하세요");
        n = scanner.nextInt();

        for(int i = 0; i < n; i++){          //i < n 은 몇 번 반복할지 정하는 구간 n이 100이면 백 번 반복
            System.out.println("i:"+(i+1));
        }

        for(int i = 0; i < n; i++){
            System.out.println("i:"+(n-i));
        }




        }
}
