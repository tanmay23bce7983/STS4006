import java.util.*;

class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
	}
}
class RecoverBST {

	public static Node buildTree(String[] vals) {
		if (vals.length == 0 || vals[0].equals("null")) return null;
		Node root = new Node(Integer.parseInt(vals[0]));
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int i =1;
		while(!q.isEmpty()){
		    Node current = q.poll();
		    if(i < vals.length && !vals[i].equals("null")){
		        current.left = new Node(Integer.parseInt(vals[i]));
		        q.add(current.left);
		        
		    }
		    if(i < vals.length && !vals[i].equals("null")){
		        current.right = new Node(Integer.parseInt(vals[i]));
		        q.add(current.right);
		        
		    }
		    i++;
		}
		return root;
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Tree input is given in the form of levels
		 If no node is given in a place, use NULL or N
		First value is root node
		next two values are next level values
		and so on
		    */
		String[] input = sc.nextLine().split(" ");
		Node root = buildTree(input);
	}
}