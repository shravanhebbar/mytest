import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.io.*;
 class hashmap141{
	private int id;
    private int no;
public hashmap141(int id,int no){
	
			this.id=id;
			this.no=no;
			
		
	}
public int getId() {
	return id;
}
public int getNo()
{
	return no;
}

public String toString() {
	//return "id="+id +"no="+ no;
	return ""+no;
}


}
	
public class hashmap14{
	public static void main(String[] args) {
		List<hashmap141> l=new ArrayList<>();
		l.add(new hashmap141(1,2));
		l.add(new hashmap141(2,3));
		l.add(new hashmap141(4,4));
		l.add(new hashmap141(4,5));
		l.add(new hashmap141(4,4));
		
		Map<Integer,Integer> m=l.stream().filter(x->x.getId()>2).collect(Collectors.toMap(x->x.getId(),x->x.getNo(),(oldValue,newValue)->newValue));
		System.out.println(m);
		
		List<Integer> l1=Arrays.asList(1,2,3,4,1,2,4);
		Map<Integer, Long> result =
                l1.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        System.out.println(result);
        Map<Object, List<hashmap141>> groupingbyid
        = ((Collection<hashmap141>) l).stream().collect(Collectors.groupingByConcurrent(x->x.getId()));
        System.out.println(groupingbyid);
	}
	}
	
	
