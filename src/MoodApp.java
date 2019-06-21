
public class MoodApp {

	public static void main(String[] args) {
		
		String[] names;
		names = new String[]{"Stephen", "Chinhle", "Jeremy", "Brad"};
		
		for(int i=0; i<names.length; i++) {
			if(names[i].equals("Stephen")) {
			System.out.println(names[i] + " is happy");
			}
			else if(names[i].equals("Chinhle")) {
				System.out.println(names[i] + " is calm");
			}
			else if(names[i].equals("Jeremy")) {
				System.out.println(names[i] + " is mad");
			}
			else if(names[i].equals("Brad")) {
				System.out.println(names[i] + " is excited");
			}
			
		}
	}

}


