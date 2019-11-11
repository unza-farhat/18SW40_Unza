class Task7
{
	public static int duplicate(int[] a)
	{	int newSize=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) newSize++;
			}
		}
			return newSize;
	}
	
	public static void main(String[] args) {
		int[] array={20,20,30,40,50,50,50};
		System.out.println(duplicate(array));
	}
}