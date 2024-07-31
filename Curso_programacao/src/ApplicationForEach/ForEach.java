package ApplicationForEach;

public class ForEach {
	
	public static void main(String[]args) { 
		
		String[]vect = new String[] {"maria", "bob", "Alex"};
		
		for (int i=0;i<vect.length; i++) {
			System.out.println(vect[i]);	
		}
		System.out.println("-----------------"); 
		for(String name : vect) { //loop for Each DA UM "APELIDO"
			System.out.println(name);
		}
	} 
}
