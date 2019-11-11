class Task5{
	public static int secondLargest(int[] a){
		int index=0;
		int max1=a[0];
		int max2=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
					       }         }
			return max2;
											}

	public static void main(String[] args) {
		int[] arr={1,2,3,7,9,4};
		System.out.println("Second Largest element in array is "+secondLargest(arr));

	}
}