import java.util.Arrays;
class Task2{
	
	public static boolean toCheck(int[] a,int[] b){
	
		Arrays.sort(a);
		Arrays.sort(b);
		if(a.length!=b.length)
			{return false;}
		if(a.length==b.length){
			for(int i=0;i<a.length;i++){
				if(a[i]!=b[i])
					return false;	}
						}
			return true;
		}

	public static void main(String[] args) {
			int[] a={1,3,5,4,2};
			int[] b={1,5,4,3,2};
			
			if(toCheck(a,b)){
				System.out.println("Arrays are equal");}
			
					else {System.out.println("Arrays are not equal");
			}
	}
	}