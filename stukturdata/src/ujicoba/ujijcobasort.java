package ujicoba;




public class ujijcobasort {
	
	void sort ( int arr []) {
		int n = arr.length;
		for (int i= 1 ; i < n ; ++i) {
			int key = arr [i];
			int j = i - 1;
			
			
			while ( j >= 0 && arr [j] > key )
			{
				arr [ j + 1] = arr [j];
				j= j -1;
			}
			arr [j + 1] =key ;
		}
	}
	
	static void printArray (int arr []) 
	{
		int n = arr.length;
		for ( int i = 0; i < n ; ++i)
			System.out.print(arr [i] + " ");
				
				System.out.println();
	}
				 public static void main (String args [] ) 
				 {
					 int arr [] = { 3,10,4,6,8,9,7,2,1,5,11,18,13,14,24,13,1,2313,13,4,14,2,4,2,4,5,24,3,12};
					 
					ujijcobasort ob = new
					ujijcobasort ();
					ob.sort ( arr);
					
					printArray(arr);
					
					 
			}
		}
	

	