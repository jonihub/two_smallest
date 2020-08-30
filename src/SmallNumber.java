import java.util.Scanner;

/* Java program to find the smallest and 
second smallest elements of an array of user input */

public class SmallNumber { 

	public static void little(int arr[]) { 
        int small1; 
        int small2; 
        int array = arr.length; 

		// If user enters less than 2 elements
		if (array < 2) { 
			System.out.println("Invalid Input! Please enter array of size 2 or more."); 
			return; 
		} 
        // Set small1 and small2
        small1 = Integer.MAX_VALUE; 
        small2 = Integer.MAX_VALUE;

        // If current element is smaller than small1 then update both small1 and small2
		for (int i = 0; i < array ; i ++) { 

			if (arr[i] < small1) { 
				small2 = small1; 
				small1 = arr[i]; 
			} 

			// Check if element is in between small1 and small2
			else if (arr[i] < small2 && arr[i] != small1) 
				small2 = arr[i]; 
        }   
        // Print results
        System.out.println("The two smallest values are: " + small1 + ", " + small2); 
	} 

    public static void main(String[] args) {
        
        // Set scanner for user input
        Scanner scan = new Scanner(System.in);
        System.out.print("How many integers do you wish to enter?: ");
        int nums = scan.nextInt();

        // Store user input into array
        System.out.println("Please enter " + nums + " integers");
        int arr[] = new int[nums];

        for (int i = 0; i < nums; i++) {
            arr[i] = scan.nextInt();
        }

        // Process array
        little(arr);
        scan.close();
    }

}
