package Driver;
import Main.Ascending;
import Main.Descending;
import Main.Increase;
import Main.Decrease;
import Main.StockPrice;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Stocker {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of companies: ");
		int count = sc.nextInt();
		float num[] = new float[count];	
		boolean flag[] = new boolean[count]; 
		for (int i = 0; i < count; i++) 
		{
			System.out.println("Enter current stock price of the company" + (i + 1) + " :");
			num[i] = sc.nextFloat();
			System.out.println("Whether company's stock price rose today compare to yesterday ?");
			flag[i] = sc.nextBoolean();
		}
		while(true) {
			System.out.println("\nEnter the operation that you want to perform\n"
					+ "1. Display the companies stock prices in ascending order\n"
					+ "2. Display the companies stock prices in descending order\n"
					+ "3. Display the total no of companies for which stock prices rose today\n"
					+ "4. Display the total no of companies for which stock prices declined today\n"
					+ "5. Search a specific stock price\n"
					+ "6. press 0 to exit\n");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				Ascending asc = new Ascending();
				asc.sort(count, num);
				break;
			case 2:
				Descending desc = new Descending();
				desc.sort(count, num);
				break;
			case 3:
				Increase inc = new Increase();
				inc.getNumberOfCompanies(count, flag);
				break;
			case 4:
				Decrease dec = new Decrease();
				dec.getNumberOfCompanies(count, flag);
				break;
			case 5:
				System.out.println("enter the key value");
				float value = sc.nextFloat();
				StockPrice sp = new StockPrice();
				sp.Search(count, num, value);
				break;
			default:
				System.out.println("Exited successfully");
				System.exit(0);

			}
		}
	}
}