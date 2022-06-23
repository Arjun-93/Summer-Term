package DSA.Tree;

class Node {
    int item;
    Node left, right;

    public Node(int Key) {
        item = Key;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void postorder(Node node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.item + "->");
    }

    void inoredr(Node node) {
        if (node == null)
            return;
        inoredr(node.left);
        System.out.print(node.item + "->");
        inoredr(node.right);
    }

    void preorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.item + "->");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(15);
        tree.root.right.left = new Node(4);

        System.out.println("Inorder traversal");
        tree.inoredr(tree.root);

        System.out.println("\nPreorder traversal ");
        tree.preorder(tree.root);

        System.out.println("\nPostorder traversal");
        tree.postorder(tree.root);
    }
}

// public List<Integer> list = new ArrayList<>();
// public List<Integer> preorder(Node root) {
//     if (root == null){
//         return list;
//     }
//     list.add(root.val);
//     for(Node node: root.children)
//         preorder(node);
            
//     return list;
// }
