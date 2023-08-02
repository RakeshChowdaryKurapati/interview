package programms;

public class QN_35_ChecksIfTwoArraysContainTheSameElements {

	public static void main(String[] args) {

		checkTwoArraysElements();

	}

	public static boolean checkTwoArraysElements() {

		int [] arr = { 1,2,3,4 };

		int [] arr1 = { 3,2,4,1 };

		boolean flag = false;

		if(arr.length == arr1.length) {
			System.out.println("Length of the arrays is same");
		}

		sortArray(arr);
		sortArray(arr1);

		for(int i =0; i<arr.length; i++) {
			if(arr[i]==arr1[i]) {
				flag = true;
			}
		}


		if(flag) {
			System.out.println("Given two arrays elements are same");
		}
		return flag;

	}
	public static void sortArray(int[] array) {

		int n = array.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {

					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
				
			}
		}
		System.out.println(array);
	}
}