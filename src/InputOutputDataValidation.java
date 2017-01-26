import java.util.Scanner;

public class InputOutputDataValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		char gender;
		String fullGender;
		
		//Java way to get input. Can read in String, Int, Boolean, Double, Short, Long.
		//Does not read char
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Please enter your name: ");
			name = input.next();
		} while (name.matches("[^A-Za-z\\- ]+"));
	
		do {
			System.out.println("Please enter your age: ");
			age = input.nextInt();
		} while (age <= 0 || age > 100);
		
		do {
			System.out.println("Please enter your gender (M/F): ");
			gender = input.next().charAt(0); //Reads in String and gets first char in char[]
		} while (!(gender=='m'|gender=='M'|gender=='f'|gender=='F'));
		
		if(gender == 'm' || gender == 'M'){
			fullGender = "Male";
		} else {
			fullGender = "Female";
		}
		
		System.out.println("Hello " + name + ". You are a " + age + " year old " + fullGender);
		
		input.close();//Close Scanner
	}

}
