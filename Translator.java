
public class Translator {
	String sentence;
	
	public Translator(String s){
		sentence = s;
	}
	
	public void transWord(){
		String oldSent[] = sentence.split("\\s");	//Splitting on spaces
		String newSent[] = new String[oldSent.length];	//Storing new words
		
		String befVowel = "";	//Storing letters before first vowel
		
		for(int i = 0; i < oldSent.length; i++){
			int vPlace = findFirstVowel(oldSent[i]);
			
			if(vPlace == 0 || vPlace == -1){
				newSent[i] = oldSent[i] + "yay";
			}	//End if
			
			else{
				befVowel = oldSent[i].substring(0, vPlace);
				newSent[i] = oldSent[i].substring(vPlace) + befVowel + "ay";
				continue;
			}	//End else
		}	//End for
		
		for(int j = 0; j < newSent.length; j++){
			System.out.print(newSent[j] + " ");
		}
		System.out.println("");
	}	//End method
	
	public int findFirstVowel(String p){
		int fVowel = -1;
		
		for(int i = 0; i < p.length(); i++){
			if(p.substring(i, i + 1).equalsIgnoreCase("A") || p.substring(i, i + 1).equalsIgnoreCase("E") ||
					p.substring(i, i + 1).equalsIgnoreCase("I") || p.substring(i, i + 1).equalsIgnoreCase("O")
					|| p.substring(i, i + 1).equalsIgnoreCase("U")){
				fVowel = i;
				break;
			}
			else{
				continue;
			}
		}	//End for
		return fVowel;
	}	//End method
}
