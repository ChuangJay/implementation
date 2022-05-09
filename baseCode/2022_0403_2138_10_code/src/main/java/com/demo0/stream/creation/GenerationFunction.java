package com.demo0.stream.creation;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class GenerationFunction {

    @Test
    /**
     * 使用 Stream API generate 產生 10 個隨機數
     */
    public void demo_generate_011() {
     int x = 5;
     Map map = new HashMap<Integer,Integer>();
     Map map2 = new HashMap<Integer,Integer>();
     boolean isInverse =false;
     map.put(0,x);
     map2.put(x-1,0);
        for(int i = 0 ;i < x-1;i++){
            int value  = (int) map.get(i);
            if(value ==1){
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

    @Test
    /**
     * 使用 Stream API generate 產生 10 個隨機數
     */
    public void demo_generate_01() {
        final int SIZE = 10;
        Stream<Double> randoms = Stream.generate(Math::random);
        List<Double> list = randoms
                .limit(SIZE + 1)
                .collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    /**
     * 使用 Stream API generate 快速產生 10 個相同 String
     */
    public void demo_generate_02() {
        final int SIZE = 10;
        Stream<String> echos = Stream.generate(() -> "Echo");
        List<String> echosLst = echos
                .limit(SIZE + 1)
                .collect(Collectors.toList());
        System.out.println(echosLst);
    }

    @Test
    /**
     * 使用 Stream API of 用幾個字串作為參數值，快速產生字串 List
     */
    public void demo_of(){
        List<String> song = Stream.of("gently", "down", "the", "stream").collect(Collectors.toList());
        System.out.println(song);
    }

    @Test
    /**
     * 使用 Stream API iterate
     */
    public void demo_iterate() {
        final int SIZE = 10;
        var limit = new BigInteger("100");
        Stream<BigInteger> integers
                = Stream.iterate(BigInteger.ZERO /*init part*/,
                n -> n.compareTo(limit) < 0 /* condi part*/,
                n -> n.add(BigInteger.ONE) /* incream part*/);
        List<BigInteger> integersList = integers
                .collect(Collectors.toList());
        System.out.println(integersList);
    }
}
