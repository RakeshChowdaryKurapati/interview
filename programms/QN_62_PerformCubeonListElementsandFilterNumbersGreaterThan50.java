package programms;

import java.util.*;

public class QN_62_PerformCubeonListElementsandFilterNumbersGreaterThan50 {

	public static void main(String[] args) {
		List<Integer> input = new ArrayList();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		
		List<Integer> cubeFilter = cubeOfListEleents(input);
		
		System.out.println(cubeFilter);
		
	}
	public static List<Integer> cubeOfListEleents(List<Integer> input){
		
		List<Integer> cubeList = new ArrayList();
		List<Integer> listGreaterThanFifty = new ArrayList();
		for(int num : input) {
			
			cubeList.add(num*num*num);
			
		}
		
		for(int cube : cubeList) {
			if(cube>50) {
				listGreaterThanFifty.add(cube);
			}
		}
		
		
		return listGreaterThanFifty;
	}
	
}
