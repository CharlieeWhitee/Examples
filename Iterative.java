import java.util.*;
class Iterative extends Structure {
	Scanner input = new Scanner(System.in);
			String type;
	int dollars; 
	public Iterative(String setType) {
		type = setType;
	}
	public void run() {
		System.out.print("What loop would you like to see?");
		type = input.next();
		System.out.print("How many dollars are in your pocker?");
		dollars = input.nextInt();
		switch(type) {
		case "for":
		for(int i = 0; i < dollars; i++) {
			System.out.print("$");
		}
		System.out.println();
		}
	}
}
