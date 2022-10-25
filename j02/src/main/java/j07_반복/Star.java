package j07_반복;

public class Star {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < i + 1; j++) { //반복이 증가할 때는 +1씩 순차적으로 올라가기에 i+1
                System.out.print("*");
            }

            System.out.println();
        }

    }
}




















