
public class ArrayTest {

	public static void main(String[] args) {
		
		int arr[]= new int[5]; // When we do not assign any values to the array its default values are zero
		//int x;
		
		for(int x:arr) { // for each loop to execute all values of array
			
			System.out.println(x);
		}
		
		System.out.println(arr[5]); // test for boundries 
	}

}
