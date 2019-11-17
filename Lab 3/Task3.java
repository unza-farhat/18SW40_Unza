import java.util.Arrays;
public class Task3
{
	public static int binarySearch(String[] c,String x)
	{	
		Arrays.sort(c);
		int midPoint;
		int lowerBound=0;
		int upperBound=c.length-1;
		while(lowerBound<=upperBound)
		{
			midPoint=(lowerBound+upperBound)/2;
			if(c[midPoint].compareTo(x)<0)
			{
				upperBound=midPoint+1;
			}
			else
			if(c[midPoint].compareTo(x)>0)
			{
				upperBound=midPoint-1;
			}
			else
				return midPoint;
			
		}
			return -1;
	}

	public static void main(String[] args) 
	{
		String[] c={"Shahnaz","Jaweria","Aniqa","Sahiba","Abid","Rabia","Maryam","Wajiha"};
		String x="Abid";
		Arrays.sort(c);
		System.out.println("String found at: "+binarySearch(c,x));
	}
	
}