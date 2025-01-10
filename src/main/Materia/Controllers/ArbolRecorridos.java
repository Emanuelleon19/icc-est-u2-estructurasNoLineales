package main.Materia.Controllers;

import java.util.Stack;

import main.Materia.Models.Node;

public class ArbolRecorridos {
    
    public void preOrderInterativo(Node root){

        //verificar si no esta vacio
        if (root == null) {
            return;
        }

        //pila para manejar los nodos del arbol durante el recorrido 
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.getValue() + ", ");            

            if (node.getRight() != null) {
                stack.push(node.getRight());
            }
            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }
    }

        public void preOrderRecursivo(Node node){
            if (node != null) {
                System.out.print(node.getValue() + ", "); 
                preOrderRecursivo(node.getLeft());  
                preOrderRecursivo(node.getRight());
            }
        }
        
        public void inOrderRecursivo(Node node){
            if (node != null) {
                inOrderRecursivo(node.getLeft());
                System.out.print(node.getValue() +", ");
                inOrderRecursivo(node.getRight());
            }
        }

        public void posOrderRecursivo(Node node){
            if (node != null) {
                posOrderRecursivo(node.getLeft());
                posOrderRecursivo(node.getRight());
                System.out.print(node.getValue() + ", ");

            }
        }
}
