
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] candidate = {1,2,1,3,2};
		int[] age = {17,21,20,19,18};
		int max = Integer.MIN_VALUE;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<candidate.length;i++){
		    if(age[i] >= 18){
		        map.put(candidate[i],map.getOrDefault(candidate[i],0)+1);
		    }
		}
		for(int num:map.keySet()){
		    max = Math.max(max,map.get(num));
		}
		int csize = map.size();
		int max_count = 0;
		int result = -1;
		for(int num:map.keySet()){
		    if(map.get(num) == max){
		        result = num;
		        max_count++;
		    }
		}
	   if(max_count == csize){
	       System.out.println("-1");
	   }
	   else{
	       System.out.println("Candidate Number : "+result);
	   }
	}
}
