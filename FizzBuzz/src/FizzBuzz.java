
public class FizzBuzz {

	public static void main(String[] args) {
		
		for(int i = 1; i <=1000000; i++){				//Schleife um i von 1-1'000'000 hochzuzählen
		
			if(divider3(i)){							//Methode divider3
				System.out.print(i+":"+" "+"Fizz"); 	//Ist i durch 3 teilbar wird "die Zahl: Fizz" ausgegeben
				if(divider5(i)){						//Methode divider5
					System.out.print("Buzz");}			//Ist i auch durch 5 teilbar wird an das "Fizz" ein "Buzz" angehängt
				
				else{System.out.print("");}				//Ist i nicht durch 5 teilbar wird nichts zusätzlich ausgegeben
				
			}
			else{										
				if(divider5(i)){						//Methode divider5 wird benutzt falls i nicht durch 3 teilbar ist
					System.out.print(i+":"+" "+"Buzz");}//Ist i durch 5 teilbar wird "die Zahl: Buzz" ausgegeben
					
					else{System.out.print(i+":"+" "+i);}//Ist i nicht durch 5 teilbar wird "die Zahl: die Zahl" ausgegeben 
			}
		System.out.println(" ");						//Nach jedem Durchgang wird ein Zeilenumbruch in der Konsole eingefügt
		}
	}

	
	public static boolean divider3(int i){				//Methode um die teilbarkeit von i durch 3 zu überprüfen
		if(i%3==0){										
			return true;}								//Ist i durch 3 teilbar wird wahr weitergegeben
		else{return false;}								//Ist i nicht durch 3 teilbar wird falsch weitergegeben
		}
		
	public static boolean divider5(int i){				//Methode um die teilbarkeit von i durch 5 zu überprüfen
		if(i%5==0){
			return true;}								//Ist i durch 5 teilbar wird wahr weitergegeben
		else{return false;}								//Ist i nicht durch 3 teilbar wird falsch weitergegeben
	}
		
	}
	

