
public class FizzBuzz {

	public static void main(String[] args) {
		
		for(int i = 1; i <=1000000; i++){
		
			if(divider3(i)){
				System.out.print("Fizz");
				if(i % 5 == 0){
					System.out.print("Buzz");}
				
				else{System.out.print(" ");}
				
			}
			else{
				if(i % 5 == 0){
					System.out.print("Buzz");}
					
					else{System.out.print(i+" ");}
			}
		System.out.println(" ");
		}
	}

	
	public static boolean divider3(int i){
		if(i%3==0){
			return true;}
		else{return false;}
		}
		
	public static boolean divider5(int i){
		if(i%5==0){
			return true;}
		else{return false;}
	}
		
	}
	

