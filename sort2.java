
public class sort2 {
	
	
	
	static int sort2(int arr[],int i,int j)
	{
		if(i>=j)
			return 0;
			
		int mid=(i+j)/2;
		sort2(arr,i,mid);
		sort2(arr,mid+1,j);
		merge(arr,i,mid,j);
		
		return 0;
	}
	
	static void merge(int arr[],int l,int m,int r)
	{
		
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
     
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
      
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        int i = 0, j = 0; 
  
       
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
       
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
       
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
		
	}

	public static void main(String[] args) {
		
		int arr[]= {1, 2 ,3, 4, 8 ,11 ,22, 44, 66};
		sort2(arr,0,8);
		for(int i=0;i<9;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
