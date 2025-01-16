package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
    private Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        }
        return node;
    }

    public void invertirArbol() {
        root = invertirArbolRecursivo(root);
    }

    private Node invertirArbolRecursivo(Node node) {
        if (node == null) {
            return null;
        }

        Node temp = node.getLeft();
        node.setLeft(node.getRight());
        node.setRight(temp);

        invertirArbolRecursivo(node.getLeft());
        invertirArbolRecursivo(node.getRight());

        return node;
    }

    public void printTree() {
        printTree(root, 0);
    }

    private void printTree(Node nodo, int nivel) {
        if (nodo == null) {
            return;
        }
        printTree(nodo.getRight(), nivel + 1);
        System.out.println("  ".repeat(nivel) + nodo.getValue());
        printTree(nodo.getLeft(), nivel + 1);

    }
    public Node getRoot() {
        return root;
    }
}

