package j04_연산자;

public class Operation1 {
    public static void main(String[] args) {
        int num = 10;
        num = num + 1;
        System.out.println(num);
        System.out.println(num--);
        //++num num++ 단독으로 사용가능 선증가는 앞에 +1이 붙음 값이 바로 증가함(++num) 후증가는 다음 차례에 +1이 붙음(num++)
        //마이너스도 같은 개념임
        System.out.println(num);
    }
}
