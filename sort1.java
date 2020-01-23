
public class sort1 {
	
	
	
	static void sort(int arr[])
	{
		for(int i=0;i<9;i++)
		{
			
			for(int  j=i+1;j<9;j++)
			{
				
				if(arr[j]<arr[i])
				{
					
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
			
			
		}
		
		
		
	}

	public static void main(String[] args) {
		
		int arr[]= {2,4,1,66,3,8,22,44,11};
		sort(arr);
		for(int i=0;i<9;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
