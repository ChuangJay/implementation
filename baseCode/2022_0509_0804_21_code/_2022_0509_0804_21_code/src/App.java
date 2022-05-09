
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        int x = Integer.valueOf(args[0]);

        Scanner scanner = new Scanner(System.in);
        int x;
        do{
            System.out.println("Please enter an odd number：");
             x = scanner.nextInt();
        }while(x%2==0 );


        scanner.close();

        Map map = new HashMap<Integer,Integer>();
        Map map2 = new HashMap<Integer,Integer>();
        boolean isInverse =false;
        map.put(0,x);
        map2.put(x-1,0);
        for(int i = 0 ;i < x-1;i++){
            int value  = (int) map.get(i);
            if( value ==1){
                isInverse = true;
            }
            if(isInverse ) {
                map.put(i+1,value + 2);
                map2.put(i,x-i-1);
            }else {
                map.put(i+1, value - 2);
                map2.put(i , i);
            }
        }

        System.out.println(map2);
        for(int i = 0 ;i < x;i++){
            int count = (int)map.get(i);
            int count2 = (int)map2.get(i);
            String star="*";
            String space =" ";
            star = space.repeat(count2) +star.repeat(count);
            System.out.println(star);
        }


    }
}