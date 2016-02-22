public class Search_rotationArray {
	public static int search(int[] A, int number){
		
	int start=0;
	int end=A.length-1;
		
	while(start<=end)
	{
		int mid=(start+end)/2;
		if(number==A[mid]){
			return mid;
	}
	if(A[mid]<=A[end])
	{ // right is sorted
		if(A[mid]<number && number<=A[end]){
			start=mid+1;
				
	}
		else{
			end=mid-1;
			}
		}
	else{
				
		if(A[start]<=number && number<A[mid]){
			end=mid-1;
					
			}
		else{
				start=mid+1;
			}		
		
		
			}
		}
		return -1;
				
		}
	
	public static void main(String arg[]){
		
		int[] A=new int[] {2,2,3,4,7,8,1};
		System.out.println(search(A,7));
	}
}
	
