
public class SwapInPair {
	 public ListNode swapPairs(ListNode head) {
	        ListNode temp=new ListNode(0);
	        ListNode head1=temp;
	        ListNode head2=head;
	        ListNode head3=head.next;
	        while(head3!=null){
	            ListNode t=head3.next;
	            head1.next= head3;
	            head1=head1.next;
	            head1.next=head2;
	            head1=head1.next;
	            head2=t;
	            if(head2==null){
	            head3=null;}
	            else{
	            	head3=t.next;
	            }
	        }
	        if(head2!=null){
	            head1.next=head2;
	            head1=head1.next;
	        }
	        head1.next=null;
	        return temp.next;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l=new ListNode(1);
		ListNode l1=new ListNode(2);
		l.next=l1;
		ListNode l2=new ListNode(3);
		ListNode l3=new ListNode(4);
		l1.next=l2;
		l2.next=l3;
		l3.next=null;
		SwapInPair obj=new SwapInPair();
		ListNode l4=obj.swapPairs(l);
		while(l4!=null){
			System.out.println(l4.val);
			l4=l4.next;
		}
	}

}
