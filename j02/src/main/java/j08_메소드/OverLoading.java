package j08_메소드;


/**
 * 메소드 오버로딩
 * 매개변수의 형태가 다르면 동일 한 메소드 명을 가지고 정의할 수 있다.
 */

public class OverLoading {

    public static void add(){            //똑같은 메소드 명 사용 불가 이름이 같으면 호출을 할 수가 없음
        System.out.println("add()");     //이름이 같으면 사용할 수 없지만 매개 변수가 다르면 사용 가능함.
    }

    public static void add(int a){
        System.out.println("add(int a)");
    }

    public static void add(String s){
        System.out.println("add(String s:)");
    }

    public static void add(int a, int b){
        System.out.println("add(int a, int b)");
    }

    public static void add(int a, String b){
        System.out.println("add(int a, String b)");
    }


    public static void main(String[] args) {
        add();
        add(10);    //정수 10 는 int a 함수로 문자열 "10" 은 String s 함수로
        add("10");
        add(10,20);
        add(10,"20");

    }
}
