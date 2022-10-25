package j05_Scanner;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {

        /**
         * 문자열 입력
         * next() -> 띄어쓰기 포함 x
         * nextLine() -> 띄어쓰기 포함 o
         */


        String name = "김준일";


        Scanner scanner = new Scanner(System.in);  //scanner는 new scanner만 대입 가능

        String s = scanner.nextLine(); //<- 한 줄에 입력 한 번 space바 로도 나뉘어짐 띄어쓰기를 쓸 떄는 nextline 사용
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();

        System.out.println("입력 받은 값1:"+s);
        System.out.println("입력 받은 값2"+s2);
        System.out.println("입력 받은 값3"+s3);
    }
}
