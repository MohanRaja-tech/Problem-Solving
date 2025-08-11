/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] profit = {60,100,120};
	    int[] weight = {10,20,30};
	    int capacity = 50;
	    int[] value = new int[profit.length];
	    for(int i=0;i<profit.length;i++){
	        value[i] = profit[i]/weight[i];
	    }
	    Map<Integer,Integer> orweight = new HashMap<>();
	    Map<Integer,Integer> orprofit = new HashMap<>();
	    for(int i=0;i<value.length;i++){
	        orweight.put(value[i],weight[i]);
	        orprofit.put(value[i],profit[i]);
	    }
	    Arrays.sort(value);
	    int max = 0;
	    int index = value.length-1;
	    int track = 0;
	    while(index >= 0){
	        if(orweight.get(value[index]) < capacity){
	            capacity -= orweight.get(value[index]);
	            max += orprofit.get(value[index]);
	            
	        }
	        else{
	            int target = orweight.get(value[index])-capacity;
	            
	            max += value[index]*(orweight.get(value[index])-target);
	            //track += orweight.get(value[index]);
	            capacity -= orweight.get(value[index])-target;
	        }
	        index--;
	    }
	    System.out.println(capacity);
	    System.out.println(max);
	}
}
