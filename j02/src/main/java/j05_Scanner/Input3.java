package j05_Scanner;

import java.util.Scanner;

public class Input3 {

    /* 이름 :김준일                  name
       나이 : 29                    age
       주소 : 부산 동래구 사직동       address
       연락처 : 010 9988 1916       phone

       사용자의 이름은 김준일이고 나이는 29입니다.
       주소는 부산 동래구 사직동이며 연락처는 010 9988 1916입니다.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = null;      //<- 우선 변수부터 모두 제시 후 입력함
        int age = 0;
        String address = null;
        String phone = null;

        System.out.println("이름");     //next는 스페이스바 엔터를 먹지않지만 nextLine은 모두 먹음.
        name= scanner.next();

        System.out.println("나이");
        age= scanner.nextInt();
        scanner.nextLine();           //nextLine은 윗 코드의 버퍼를 먹기 때문에 중간에 nextLine을 사용하여 공중분해시켜야 함
                                      //버퍼 꼭 신경 쓸 것.
        System.out.println("주소");
        address= scanner.nextLine();

        System.out.println("연락처");
        phone= scanner.nextLine();

        System.out.println("사용자의 이름은"+ name + "이고 나이는" + age + "입니다.");
        System.out.println("주소는" + address + "이며 연락처는" + phone + "입니다.");




    }
}
