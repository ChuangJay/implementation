package com.demo0.stream.transformation;

import com.demo0.stream.creation.model.Employee;
import com.demo0.stream.transformation.model.Manager;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {

    @Test
    public void demo_concat() {
        var source = Stream.of("莊子", "老子");
        var expect = new String[]{"莊子大師", "老子大師"};
        var actual = source.map(s -> s.concat("大師")).toArray(String[]::new);
    }

    @Test
    public void demo_objectCanMapToOtherObject() {
        var data = new Employee[1];
        data[0] = new Employee("Alice", 100, 2021, 1, 1);

        // key point is here
        var origin = Arrays.stream(data).collect(Collectors.toList());
        var expect = origin.stream().map(
                emp -> {
                    var manager = new Manager();
                    manager.setBonus(1000);
                    return manager;
                }
        ).collect(Collectors.toList());
        System.out.println(origin);
        System.out.println(expect);
    }

    @Test
    public void demo_inMapBodyBlockReturnNull() {
        var source = Stream.of("老子", "孔子","釋迦摩尼");
        var expect = source.map(
                e -> {
              if( "釋迦摩尼".equals(e)) {
                  return null;
              }else{
                  return e.concat("是為世間法");
              }
                }
        ).filter(e -> null != e).collect(Collectors.toList());
        System.out.println(expect.toString());
    }
}

