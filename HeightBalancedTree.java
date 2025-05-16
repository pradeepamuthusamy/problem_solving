// leet code problem no
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
public class HeightBalancedTree{
    public static boolean isBalanced(TreeNode root) {
        
        return checkHeight(root) != -1;
    }
    public static int checkHeight( TreeNode node){
        if(node == null) return 0;
        int leftHeight=checkHeight(node.left) ;
        if(leftHeight == -1) return -1;
        int rightHeight =checkHeight(node.right);
        if(rightHeight == -1 ) return -1;
        if(Math.abs(leftHeight -rightHeight)>1) return -1;

        return Math.max(leftHeight,rightHeight) +1 ; 
    }
	public static void main(String []args){
		TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20,new TreeNode(15),new TreeNode(7));
		boolean result=isBalanced(root);
		System.out.println(result);
		
		
	}
}