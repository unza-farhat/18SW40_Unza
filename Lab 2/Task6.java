class Task6
{
	public static void main(String[] args) 
    {
    	int [][] array={{9,7,2,3},{8,6,4,2},{1,9,5,3},{1,0,9,5}};
        int small , row=0 , col=0 , z;
			for(int k=0;k<array.length;k++)
        	{
            	for(int p=0;p<array[k].length;p++)
            	{
                	small = array[k][p];
               		 for(int i=k;i<array.length;i++)
                	{
                        if(i==k)
                            z=p+1;
                        else
                            z=0;
                        for(;z<array[i].length;z++)
                        {
                            if(array[i][z]<=small)
                             {
                                small=array[i][z];
                                row=i;
                                col=z;
                             }
							             }
                    }
                    array[row][col]=array[k][p];
                    array[k][p]=small;
                    System.out.print(array[k][p]+" ");
            }
                    System.out.println();
            }
    }
}