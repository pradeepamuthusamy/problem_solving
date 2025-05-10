//Leetcode problem no:83
//Remove Duplcates from the sorted list
/*
given a sorted list remove the duplicates and return the list size after removing
Input:1->1->2
output:1->2
*/



class ListNode{
	int val;
	ListNode next;
	ListNode(){}
	ListNode(int val){
		this.val=val;
	}
	ListNode(int val,ListNode next){
		this.val=val;
		this.next=next;
	}
}
class rem_dup_list{
	public static ListNode remove_duplicate_list(ListNode head){
		ListNode current=head;
		while(current!=null && current.next!=null){
			if(current.val==current.next.val){
				current.next=current.next.next;
				
			}else{
				current=current.next;
			}
		}
		return head;
	       
	
	}
	public static void print(ListNode node){
		 while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
	}
	public static void main(String []args){
		ListNode head=new ListNode(1,new ListNode(1,new ListNode(2)));
		
		ListNode result=remove_duplicate_list(head);
		print(result);
	}
}






#undefined
