class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BST {
    Node root;

    BST() {
        root = null;
    }

    Node insert(Node node, int data) {
        if (node == null) return new Node(data);
        if (data < node.data) node.left = insert(node.left, data);
        else if (data > node.data) node.right = insert(node.right, data);
        return node;
    }

    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    Node search(Node node, int key) {
        if (node == null || node.data == key) return node;
        if (key < node.data) return search(node.left, key);
        return search(node.right, key);
    }

    Node delete(Node node, int key) {
        if (node == null) return node;
        if (key < node.data) node.left = delete(node.left, key);
        else if (key > node.data) node.right = delete(node.right, key);
        else {
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;
            node.data = minValue(node.right);
            node.right = delete(node.right, node.data);
        }
        return node;
    }

    int minValue(Node node) {
        int minv = node.data;
        while (node.left != null) {
            minv = node.left.data;
            node = node.left;
        }
        return minv;
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.println("\nSearch 40: " + (tree.search(tree.root, 40) != null));
        System.out.println("Search 100: " + (tree.search(tree.root, 100) != null));

        tree.delete(tree.root, 20);
        System.out.print("Inorder after deleting 20: ");
        tree.inorder(tree.root);
    }
}
