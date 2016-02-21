/* Sort a given string in the order of target string */

public class SortString {
	
	public static String Sort(String unsorted, String target){
		
		char[] unsor=unsorted.toCharArray();
		
		char [] sor=target.toCharArray();
		
		
			int head=0;
			for(char s : sor){
				
				for(int i=head;i<unsor.length;i++){
					
				if(unsor[i]==s)
				{
					char temp=unsor[head];
					unsor[head]=unsor[i];
					unsor[i]=temp;
					head++;
				}
			}
		}
		unsorted=new String(unsor);
		return unsorted;
	}
	
	public static void main(String args[]){
		
		String input="abdhre";
		String target="eadbh";
		System.out.println(Sort(input,target));
		
	}

}
