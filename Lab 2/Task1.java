import java.util.Random;
class Task1{
		
		public static void main(String[] args) {
			
			int[] a= new int[100];
			Random rand=new Random();
			for(int i=0;i<a.length;i++){
				a[i]=rand.nextInt();
										}
			System.out.println("Random elements of Array");
				for(int e: a){
					System.out.println(e);
							}
	}
}