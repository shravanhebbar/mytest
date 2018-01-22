import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.io.*;

class java8fun2
{
	public static void main(String[] args) {
	List<Integer> ints = IntStream.of(1,2,3,4)
            .boxed()
            .collect(Collectors.toList());
     
System.out.println(ints);

List<Long> longs = LongStream.of(1l,2l,3l,4l,5l)
.boxed()
.collect(Collectors.toList());

System.out.println(longs);
List<Double> doubles = DoubleStream.of(1d,2d,3d,4d,5d)
.boxed()
.collect(Collectors.toList());

System.out.println(doubles);
}
}