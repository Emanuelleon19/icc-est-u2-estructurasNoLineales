package main.Materia.Controllers;

import main.Materia.Models.Node;

public class ArbolAVL {
    private Node root;

    public void insert(int value) {
        System.out.println("Nodo a insertar: " + value);
        root = insert(root, value);
    }

    private Node insert(Node nodo, int value) {
        if (nodo == null) {
            Node newNode = new Node(value);
            newNode.setHeight(1);
            System.out.println("Nodo insertado: " + value + " Balance: " + getBalance(root));
            return newNode;
            
        }


        if (value < nodo.getValue()) {
            nodo.setLeft(insert(nodo.getLeft(), value));
        } else if (value > nodo.getValue()) {
            nodo.setRight(insert(nodo.getRight(), value));
        } else {
            return nodo;
        }
        nodo.setHeight(1 + Math.max(height(nodo.getLeft()), height(nodo.getRight())));
        


        // obtener el valance o el factor de equilibrio del nodo ancestro
        int balance = getBalance(nodo);
        // caso izquierda - izquierda
        if (balance > 1 && value < nodo.getLeft().getValue()) {
            return rightRotate(nodo);
        }
        // Caso derecha - derecha
        if (balance < -1 && value > nodo.getRight().getValue()) {
            return LeftRotate(nodo);
        }
        // Caso izquierda - derecha
        if (balance > 1 && value > nodo.getLeft().getValue()) {
            nodo.setLeft(LeftRotate(nodo.getLeft()));
            return rightRotate(nodo);
        }
        // Caso Derecha- izquiera
        if (balance < -1 && value < nodo.getRight().getValue()) {
            nodo.setRight(rightRotate(nodo.getRight()));
            return LeftRotate(nodo);
        }
        // devolvemos e nodo sin cambios
        return nodo;
    }

    // rotacion a la derecha
    private Node rightRotate(Node y) {
        Node x = y.getLeft();
        Node temp = x.getRight();
        System.out.println("Rotamos derecha el nodo: " + y.getValue());
        // realizamos la rotacion
        x.setRight(y);
        y.setLeft(temp);
        // actualizar las alturas
        y.setHeight(Math.max(height(y.getLeft()), height(y.getRight())));
        x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())));

        System.out.println("Nueva raiz despues de rotacion: " + x.getValue() + " Balance: " + getBalance(y));
        return x;
    }

    //Rotacion a la izquierda
    private Node LeftRotate(Node x) {
        if (x.getRight() == null) {
            return x;
        }
        Node y = x.getRight();
        Node temp = y.getLeft();
        System.out.println("Rotamos izquierda el nodo: " + x.getValue() + " Balance: " + getBalance(x));
        // realizamos la rotacion
        y.setLeft(x);
        x.setRight(temp);
        // actualizar las alturas
        y.setHeight(Math.max(height(x.getLeft()), height(x.getRight())));
        x.setHeight(Math.max(height(y.getLeft()), height(y.getRight())));

        System.out.println("Nueva raiz despues de rotacion: " + y.getValue());
        return y;
    }


    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.getLeft()) - height(node.getRight());
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.getHeight();
    }

    public void printTree() {
        printTree(root, " ", true);
    }

    private void printTree(Node node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.getValue());
            if (node.getLeft() != null || node.getRight() != null) {
                if (node.getLeft() != null) {
                    printTree(node.getLeft(), prefix + (isLeft ? "|   " : "   "), true);
                } else {
                    System.out.println(prefix + (isLeft ? "|   " : "   ") + "├── null");
                }
                if (node.getRight() != null) {
                    printTree(node.getRight(), prefix + (isLeft ? "|   " : "   "), false);
                } else {
                    System.out.println(prefix + (isLeft ? "|   " : "   ") + "└── null");
                }

            }
        }
    }
}
