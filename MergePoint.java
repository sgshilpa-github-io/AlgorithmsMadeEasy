public class MergePoint {
	public static NodeLink MergingNode(NodeLink headA,NodeLink headB){
		
		int a=findLength(headA);
		int b=findLength(headB);
		int difference=b-a;
		if(a>b){
			difference=a-b;
			NodeLink temp=headA;
			headA=headB;
			headB=temp;
		}
		while(difference-->0){
			headB=headB.next;
			
		}
		while(headA!=headB){
			headA=headA.next;
			headB=headB.next;
		}
		
		
		return headA;
	}

	private static int findLength(NodeLink headA) {
		int count=0;
		if(headA==null){
			return 0;
		}
		while(headA!=null){
			count++;
			headA=headA.next;
			
		}
			
		return count;
	}
	
	public static void main(String args[]){
		
		NodeLink headA=new NodeLink(5);
		NodeLink headB=new NodeLink(1);
		NodeLink second=new NodeLink(2);
		NodeLink third=new NodeLink(3);
		NodeLink six=new NodeLink(6);
		NodeLink seven=new NodeLink(7);
		NodeLink eight=new NodeLink(8);
	
		headA.next=six;
		six.next=seven;
		seven.next=eight;
		headB.next=second;
		second.next=third;
//		third.next=eight;
		
		NodeLink result=MergingNode(headA,headB);
		System.out.println(result.data);
		
	}
	
	

}
