import java.io.*;
import java.util.*;

public class Tester {

	public static void main(String[] args) {

		Scanner kbReader = new Scanner(System.in);
		
		boolean done = false;
		
		System.out.println("Please type a sentence to be translated. Type \"done\" to exit");
		
		String sent = kbReader.nextLine();
		
		if(sent.toLowerCase().equalsIgnoreCase("done")){
			done = true;
		}
		
		else{			
			while(done == false){
				if(sent.toLowerCase().equalsIgnoreCase("done")){
					break;
				}
				else{
					Translator test = new Translator(sent);
					test.transWord();
					
					sent = "";
					
					System.out.println("Please type a sentence to be translated. Type \"done\" to exit");
					
					sent = kbReader.nextLine();
					continue;
				}
			}
		}

	}

}
