import java.util.*;
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
	return "id="+id +"no="+ no;
}

}
	
public class hashmap14{
	public static void main(String[] args) {
		List<hashmap141> l=new ArrayList<>();
		l.add(new hashmap141(1,2));
		l.add(new hashmap141(2,3));
		l.add(new hashmap141(4,4));
		l.add(new hashmap141(4,5));
		
		Map<Integer,Integer> m=l.stream().filter(x->x.getId()>2).collect(Collectors.toMap(x->x.getId(),x->x.getNo(),(oldValue,newValue)->newValue));
		System.out.println(m);
	}
	}
	
	
