import java.util.Scanner;

/*
 * This class was made to make calculating some experience after a Dungeons and Dragons session easier.
 */
public class ExperienceEarned {
	public static void main(String[] args) {
		System.out.print("Enter experience that has been earned: ");
		Scanner earnedExperience = new Scanner(System.in);
		int earnedExperienceAmount = earnedExperience.nextInt();
		
		System.out.print("Enter current amount of experience: ");
		Scanner currentAmount = new Scanner(System.in);
		int currentAmountUpdate = currentAmount.nextInt();
		
		System.out.println("Experience updated to: " + (earnedExperienceAmount + currentAmountUpdate));
		
		earnedExperience.close();
		currentAmount.close();
	} // main
} // class
