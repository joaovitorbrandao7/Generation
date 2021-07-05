package Lista3;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,num=0,x;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=1000; x<=1999; x++) {
			if(x%11==5) {
				num = x; 
				System.out.println("Numero divisivel por 11 com resto 5: " + num);
				
			}
		}

	}

}
