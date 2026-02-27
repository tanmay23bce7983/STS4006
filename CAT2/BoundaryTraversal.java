 /*
    Root value is not left or right boundary
    Left boundary is dfs towards left except leaf node
    Leaf nodes at the bottom
    Right boundary is dfs towards right upwards from rightmost leaf
    
    EXAMPLE              A
                   B           C
                D     E     F     G
    
    Root is A
    Left boundary is B
    (If left child is not there but right clild is there go through right child )
    
    Leaf nodes are D,E,F,G
    Right boundary is C
    */

import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    
    public Node(int data){
        this.data = data;
    }
}
class BoundaryTraversal {
    public static void main(String[] args) {
            }
    }
   
    public static void boundaryPrint(Node root){
        if (root == null) return;
        System.out.print(root.data + " ");
        leftBoundary(root.left);
        leafBoundary(root);
        rightBoundary(root.right);
        
    }
    public static void leftBoundary(Node root){
        if (root == null || (root.left == null && root.right == null)) return;
        System.out.print(root.data + " ");
        leftBoundary(root.left != null ? root.left : root.right);
    }
    public static void leafBoundary(Node root){
        if (root == null ) return;
        if(root.left == null && root.right == null){
            System.out.print(root.data + " ");
            return;
        }
        leafBoundary(root.left);
        leafBoundary(root.right);
    }
    public static void rightBoundary(Node root){
        if (root == null || (root.left == null && root.right == null)) return;
        rightBoundary(root.right != null ?  root.right: root.left );
         System.out.print(root.data + " ");
    }
}
