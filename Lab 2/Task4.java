class Task4{
	public static float average(int[] fl){
		float sum=0f;
		for(int no: fl){
			sum+=no;
		}
		return sum/fl.length;
									}

	public static void main(String[] args)
	 {
		int[] fl={11,22,33,44,55};
		System.out.println("Average of array ");
		System.out.println(average(fl));
	}
}