package day6;
import java.util.TreeSet;
import java.util.Scanner;
public interface UI {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        NumAvg numAvg = new NumAvg();

	        while (true) {
	            System.out.println("1.Add number\n2.Find average\n3.Exit");
	            System.out.println("Enter your choice");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter the number");
	                    int num = scanner.nextInt();
	                    numAvg.addNum(num);
	                    break;
	                case 2:
	                    TreeSet<Integer> numSet = numAvg.getNumSet();
	                    if (numSet.isEmpty()) {
	                        System.out.println("The set is empty");
	                    } else {
	                        double average = numAvg.calAvg();
	                        System.out.println(average);
	                    }
	                    break;
	                case 3:
	                    System.out.println("Thank you for using the application");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
	            }
	        }
	    }
	}
	
