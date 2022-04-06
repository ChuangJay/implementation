package com.demo0.stream.transformation;

import org.junit.jupiter.api.Test;
import org.springframework.boot.logging.Slf4JLoggingSystem;

import java.util.stream.Stream;

public class Filter {

    @Test
    public void demo_lambdaExpression (){

        var expect = new String[]{"韓非子","鬼谷子"} ;
        var source = Stream.of("莊子","老子","韓非子","鬼谷子","孫子");
        var result = source.filter(w -> w.length() > 2).toArray(String[]::new);

        System.out.println(result.length);
    }


}
