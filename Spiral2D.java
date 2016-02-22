public class Spiral2D {
	
	
	public static void printSpiral(int[][] A, int m,int n){
		
		
		/*
		 * top--> 	1  2  4
		 * 		  	4  5  6
		 * bottom-> 7  8  9
		 *		  left 	   right
		 * 
		 * 
		 * */
		
		int top=0;
		int bottom=m-1;
		int left=0;
		int right=n-1;
		 int dir=1;
		 
		 while(top<=bottom && left<=right)
		 {
			 
			 if(dir==1){ // go right
				 
				 for(int i=left;i<=right;i++)
				 {
					 System.out.print(A[top][i]+" ");
				 }	
				 top++;
				 dir++;
			}
			 if(dir==2){ //go down
				 
				 for(int j=top;j<=bottom;j++){
					 System.out.print(A[j][right]+" ");
				 }
				 right--;
				 dir++;
			 }
			 if(dir==3){ //go left
				 
				 for(int j=right;j>=left;j--){
					 System.out.print(A[bottom][j]+" ");
				 }
				 bottom--;
				 dir++;
			 }
			 if(dir==4){ //go up
				 
				 for(int j=bottom;j>=top;j--){
					 System.out.print(A[j][left]+" ");
				 }
				 left++;
				 dir++;
			 }
			 dir=dir%4;
		 }
		
		
	}

	public static void main(String[] args) {
		int m=5;
		int n=5;
		
		int[][] A;
		A=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		printSpiral(A,5,5);
	}

}
