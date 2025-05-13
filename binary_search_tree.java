
class node{
	
  int data;
  node left;
  node right;
   node (int data){
	   this.data=data;
	   left=null;
	   right=null;
   }
}

class bst{
	node root;
	int num_of_nodes;
	bst(){
		root=null;
		num_of_nodes=0;
	}
	void add(int value){
		node nn=new node(value);
		if(root==null){
			root=nn;
			num_of_nodes+=1;
		}
		else{
			node tptr;
			node prev;
			for(tptr=root,prev=null;tptr!=null;prev=tptr,tptr=nn.data>tptr.data ? tptr.right : tptr.left);
			if(prev.data >nn.data){
				prev.left=nn;
				num_of_nodes+=1;
			}else{
				prev.right=nn;
				num_of_nodes+=1;
			}
		}
			
	}
	void inorder(){
		inorder_helper(root);
	}
	private void inorder_helper(node safe){
		if(safe==null) return;
	
		inorder_helper(safe.left);
		System.out.printf("%d ",safe.data);
		inorder_helper(safe.right);
	}
	void postorder(){
		postorder_helper(root);
	}
	private void postorder_helper(node safe){
		if(safe==null) return;

		postorder_helper(safe.left);
		postorder_helper(safe.right);
		System.out.printf("%d ",safe.data);
	}
	void preorder(){
		preorder_helper(root);
	}
	private void preorder_helper(node safe){
		if(safe==null) return;
		
		System.out.printf("%d ",safe.data);
		preorder_helper(safe.left);
		preorder_helper(safe.right);

		
	}
	void levelorder(){
		levelorder_helper();
	}
	private void levelorder_helper(){
		
		
		queue que=new queue(num_of_nodes);
		node process=null;
		que.enqueue(root);
		process=que.dequeue();
		while(process!=null){
			System.out.printf("%d ",process.data);
			if(process.left!=null){
				que.enqueue(process.left);
			}
			if(process.right!=null){
				que.enqueue(process.right);
			}
			process=que.dequeue();
		}
	}
	private class queue{
	     node[] arr;
		 int front;
		 int rear;
		 queue(int size){
			 arr=new node[size+1];
			 front = -1;
			 rear = -1;
		 }
		 void enqueue(node data){
			 if(front==-1){
				 front=0;rear=0;
				 arr[rear]=data;
			 }else{
				 rear+=1;
				 arr[rear]=data;
			 }
		 }
		 node dequeue(){
			 node giveback;
			 giveback=arr[front];
			 arr[front]=null;
			 front+=1;
			 return giveback;
		 }
	}
			
}
class binary_search_tree{
	public static void main(String [] args){
		int[] arr={7,5,3,1,4,6,12,9,8,10,15,13,17};
		bst tree =new bst();
		for(int num: arr){
			tree.add(num);
		}
		System.out.print("Inoder:");
		tree.inorder();
		System.out.println();
		System.out.print("Preorder:");
	    tree.preorder();
		System.out.println();
		System.out.print("Postorder:");
		tree.postorder();
		System.out.println();
		System.out.print("Levelorder:");
		tree.levelorder();

		//System.out.println("excuted");
	}
}