package svk;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Employee {
	
	public String reverse(String in){
		String result = "";
		for(int i = in.length()-1;i>=0;i--){
			result = result + in.charAt(i); 
		}
		return result;
	}
	
	public int digitsum(int s){
		int sum =0;
		String number = Integer.toString(s);
		
		if(number.length() >= 2){
			for(int i =0;i< number.length();i++){
				int j = Character.digit(number.charAt(i), 10);
				sum = sum + j;
			}
		}
		if(Integer.toString(sum).length() >=2){
			sum = digitsum(sum);
		}
		
		return sum;
	}
	
	public int perimeter(int[][] grid){
		
		int sum=0;
		
		for(int i=0;i<grid.length;i++){
			
			for(int j =0;j<grid.length;j++){
				int count =4;
				try{
				if(grid[i][j] == 1){
						System.out.println("I "+i+" J "+j);
						
							if(grid[i][j-1] == 1)
								count--;
							if(grid[i][j+1] == 1)
								count--;
							if(grid[i+1][j] == 1)
								count--;
							if(grid[i-1][j] == 1)
								count--;
							
							sum = sum + count;
							//System.out.println("SUM "+ sum);
						}
					}
					catch(Exception e){
					
					}
				}
			}
		
		
		
		return sum;
	}
	public static void main(String[] args){
		Employee e = new Employee();
		int[][] grid = {
						{0,1,0,0},
						{1,1,1,0},
						{0,1,0,0},
						{1,1,0,0}
						};
		//System.out.println("Enter an Integer:");
		//Scanner sc = new Scanner(System.in);
		//int input = sc.nextInt();
		System.out.println(e.perimeter(grid));
		List<Integer> lst = new ArrayList<>();
		lst.add(2);
		lst.add(32);
		int sum =0;
		for(int i : lst){
			sum +=i;
		}
		System.out.println("Sum "+sum);
		}
	}
	


