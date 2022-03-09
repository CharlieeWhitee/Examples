import java.util.*;
public class Decision extends Structure{
	Scanner input = new Scanner(System.in);
			private String type, response;
			public Decision (String newType) {
				type = newType;
			}
			void run() {
				switch(type) {
				case "if":
					System.out.print("Do you like cats?");
					response = input.next();
					response = response.toLowerCase();
					if(response.contentEquals("yes")) {
						System.out.println("^.^");
					}else {
						System.out.print("Fine. Bye.");
					}
				}
			}
}
