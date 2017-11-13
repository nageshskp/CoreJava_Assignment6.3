
import java.util.Scanner;


public class SearchArrayElements {



	static int indices;



	public int[] sortingArray(int[] array) {



		int swap;



		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - 1 - i; j++) {



				if (array[j] > array[j + 1]) {

					

					swap = array[j];

					array[j] = array[j + 1];

					array[j + 1] = swap;

				}

			}

		}

		return array;// returns array indices value

	}

	

	public boolean binarySearch(int[] array, int number) {

	

		int middleElement = array.length / 2 - 1;

	

		if (number == array[middleElement]) {

			indices = middleElement;// assigning index value to indices

			return true;

		}

	

		else if (number > array[middleElement]) {

			for (int i = middleElement + 1; i < array.length; i++) {

	

				if (number == array[i]) {

					indices = i;

					return true;

				}
			}
		}

		

		else if (number < array[middleElement]) {

			for (int i = middleElement - 1; i >= 0; i--) {

		

				if (number == array[i]) {

					indices = i;

					return true;

				}

			}

		}

		return false;

	}

	public static void main(String[] args) {

		

		SearchArrayElements obj = new SearchArrayElements();

		

		int[] input = new int[10];

		

		Scanner s = new Scanner(System.in);

		System.out.println("Enter ten numbers");
		

		

		for (int i = 0; i < input.length; i++) {

		
			input[i] = s.nextInt();
		

		}

		

		input = obj.sortingArray(input);

		
		System.out.println("Enter number to search");

		
		int number = s.nextInt();
		
		
		s.close();

		

		if (obj.binarySearch(input, number) == true) {

		
			System.out.println("Sorted elements in an array:");

		
			for (int i = 0; i < input.length; i++) {
				
		
				System.out.println(input[i]);
			}

		
		
			System.out.println("Element Found");
			System.out.println("Index position of the Element is " + indices);

		} else {

		
			System.out.println("Element not Found");

		}
	}

}