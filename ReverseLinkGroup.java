public class ReverseLinkGroup {
	
	public static void printList(NodeLink head){
		
		while(head!=null){
			
			System.out.print(head.data+" --> ");
			head=head.next;
		}
		if (head==null){
			System.out.print("null");
		}
		
		
	}
	
	public static NodeLink groupReversing(NodeLink head, int group_size)
	{
		if (head==null)
			{
			
			return null;
			}
		
		int count=0;
		NodeLink current=head;
		NodeLink prev=null;
		NodeLink next=null;
		
		while(count < group_size && current!=null)
			{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			count++;
		
			}
		if(next!=null){
			head.next=groupReversing(next,group_size);
			}

			return prev;
	}

	public static void main(String[] args) {
		NodeLink head=new NodeLink(1);
		NodeLink second=new NodeLink(2);
		NodeLink third=new NodeLink(3);
		NodeLink forth=new NodeLink(4);
		NodeLink six=new NodeLink(6);
		NodeLink seven=new NodeLink(7);
		NodeLink eight=new NodeLink(8);
		
		head.next=second;
		six.next=seven;
		seven.next=eight;
		third.next=forth;
		second.next=third;
		forth.next=six;
	
		NodeLink result=groupReversing(head,3);
		printList(result);
		

	}

}
