Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
    	data=d;
    	left=null;
    	right=null;
    }
}*/

class Solution{
    public static int sumTreeHelper(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            int x = root.data; 
            root.data = 0; 
            return x;
        }
        int leftSum = 0, rightSum = 0; 
        leftSum = sumTreeHelper(root.left); 
        rightSum = sumTreeHelper(root.right); 
        int x = root.data; 
        root.data = leftSum + rightSum; 
        return x + leftSum + rightSum;
    }
    public void toSumTree(Node root){
         //add code here.
         //JAI SHRI RAM 
         int x = sumTreeHelper(root);
    }
}
