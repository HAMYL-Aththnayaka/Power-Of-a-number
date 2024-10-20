import java.util.Scanner;
class question10 {
	public static void main(String args[]){
		Scanner reader = new Scanner (System.in);
	
		System.out.print("\nEnter the base number: ");
		int base = reader.nextInt();
		
		System.out.print("Enter the power value: ");
		int power = reader.nextInt();
		
		double answer = Math.pow(base, power); 
		System.out.println("The Answer is: " +answer);
	}
}