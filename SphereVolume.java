import java.util.Scanner;

public class SphereVolume {
	private static Scanner input;
	public static void main(String[]args)	{
		
		input = new Scanner(System.in);
		double radius=0;
		double volume;
		int number = 2;
		// Print the purpose of this program
		System.out.println("-----Sphere Volume Calculator----");
		
		// Print the prompt asking for the diameter of a sphere
		System.out.print("\n\nEnter a diameter of a sphere: ");
		
		//Read the diameter
		double diam = input.nextDouble();

		while (diam <=0)
		{
			System.out.print("The variable should be positive.");
			System.out.print("\n\nEnter a diameter of a sphere: ");
			diam = input.nextDouble();

		}
		
		// Calculate the radius as diameter devided by 2
		radius = diam/number;
		
		//Calculate volume of the sphere
		volume = (Math.PI)*(Math.pow(radius, 3))*4/3;

		
		
		// Print the volume
		System.out.printf("The volume of the Sphere with diameter = " + diam + " is: %.2f", volume);
		
		input.close();
		
	}
}