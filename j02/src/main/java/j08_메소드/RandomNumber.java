package j08_메소드;

import java.util.Random;

public class RandomNumber {

    public static int calcRandom(int m){
        Random random = new Random();

        int result = random.nextInt(10) * 1000 + m;

        return  result;

    }



    public static void main(String[] args) {

        Random random = new Random();

        int money = 5000;           //5000을 calcrandom 친구에게 줌. 이 돈을 int result = random.nextInt(10) * 1000 + m;에 넣음)

       /* int a = random.nextInt(10) * 1000+ money;
        System.out.println(a);
        int b = random.nextInt(10) * 1000+ money;
        int c = random.nextInt(10) * 1000+ money;
        int d = random.nextInt(10) * 1000+ money;*/



        /*for(int i=0; i<10; i++){

        int randNum = random.nextInt(100) +100;
            System.out.println(randNum);
       }     */

        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));

        int r = calcRandom(money);
        System.out.println(r+100);
        System.out.println(r+1000);
        System.out.println(r+10000);
        System.out.println(r+100000);





    }
}
