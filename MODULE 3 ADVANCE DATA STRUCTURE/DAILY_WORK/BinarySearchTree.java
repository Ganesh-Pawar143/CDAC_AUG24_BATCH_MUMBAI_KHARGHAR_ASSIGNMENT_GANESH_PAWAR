package ParishakDemo;

import java.util.Scanner;

class BinarySearchTree {

    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertKey(root, key);
    }

    Node insertKey(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertKey(root.left, key);
        } else {
            root.right = insertKey(root.right, key);
        }
        return root;
    }
    
    String search(int key) {
    	return searchKey(root,key,"Root");
    	
    }
    String searchKey(Node root, int key, String path) {
        if (root == null) {
            return "Not Found";
        }

        if (root.key == key) {
            return path;
        }

        if (key < root.key) {
            return searchKey(root.left, key, path + " L");
        } else {
            return searchKey(root.right, key, path + " R");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree t = new BinarySearchTree();
        while (true) {
            int value = sc.nextInt();
            if (value == -1) break;
            t.insert(value);
        }

        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            int SearchValue = sc.nextInt();
            System.out.println(t.search(SearchValue));
        }
        sc.close();
    }
}

