package main;

import java.util.List;
import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLevels.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Controllers.Graph;
import main.Materia.Models.Node;
import main.Materia.Models.NodeG;

public class App {
    public static void main(String[] args) throws Exception {
        // runArbolBinario();
        // runEjercicio3();
        // runArbolAvl();


        //Ejercicios del deber 
        //----------------
        //runEjercicio1();
        //runEjercicio2();
        //runEjercicio4();
        //-----------------

        runGraph();
    }
    public static void runGraph(){
        Graph graph = new Graph();
        
        NodeG node1 = graph.addNode(5);
        NodeG node2 = graph.addNode(7);
        NodeG node3 = graph.addNode(9);
        NodeG node4 = graph.addNode(11);
        NodeG node5 = graph.addNode(3);

        graph.addEdge(node1, node2);
        graph.addEdge(node1, node3);
        graph.addEdge(node1, node5);
        graph.addEdge(node2, node3);
        graph.addEdge(node3, node5);
        graph.addEdge(node4, node5);




        System.out.println("Grafo (Lista de Adyacencia):");
        graph.printGraph();

    }

    public static void runEjercicio1() {
        InsertBSTTest bst = new InsertBSTTest();

        int[] valores = { 4, 2, 7, 1, 3, 6, 9 };

        for (int valor : valores) {
            bst.insert(valor);
        }

        System.out.println("\n\nINPUT:");
        System.out.println(java.util.Arrays.toString(valores));
        System.out.println("\n\nOUTPUT:");
        bst.imprimirArbol();
    }


    public static void runEjercicio2() {
        InvertBinaryTree arbol = new InvertBinaryTree();
        int[] valores = { 4, 2, 7, 1, 3, 6, 9 };

        for (int valor : valores) {
            arbol.insert(valor);
        }

        System.out.println("Árbol original:");
        arbol.printTree();

        arbol.invertirArbol();

        System.out.println("\nÁrbol invertido:");
        arbol.printTree();
    }

    public static void runEjercicio4() {
    Depth depth = new Depth();

    int[] valores = {4, 2, 7, 1, 3, 6, 9};

    for (int valor : valores) {
        depth.insert(valor);
    }

    System.out.println("\n\nINPUT:");
    depth.imprimirArbol();
    int profundidadMaxima = depth.maxDepth(depth.getRoot());
    System.out.println("\n\nOUTPUT: Profundidad del árbol = " + profundidadMaxima);
}


    private static void runArbolAvl() {
        ArbolAVL arbolAVL = new ArbolAVL();

        int[] values = { 10, 20, 15, 24, 9, 8, 21, 23, 50, 25 };
        for (int i = 0; i < values.length; i++) {
            arbolAVL.insert(values[i]);
            arbolAVL.printTree();
        }
    }

    public static void runEjercicio3() {
        ArbolBinario arbolBinario = new ArbolBinario();
        ListLevels levels = new ListLevels();

        int[] valores = { 4, 2, 7, 1, 3, 6, 9 };

        for (int i = 0; i < valores.length; i++) {
            arbolBinario.insert(valores[i]);
        }

        System.out.println("Input: ");
        arbolBinario.printTree();

        List<List<Node>> lista = levels.listLevels(arbolBinario.getRoot());

        System.out.println("Output: ");
        for (List<Node> nivel : lista) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());
                if (i < nivel.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

    public static void runArbolBinario() {
        ArbolBinario arbolBinario = new ArbolBinario();
        int[] valores = { 40, 20, 60, 10, 30, 50, 70, 5, 15, 55 };

        // Ingresar cada valor al árbol
        for (int i = 0; i < valores.length; i++) {
            arbolBinario.insert(valores[i]);
        }

        arbolBinario.printTree();

        ArbolRecorridos arbolRecorridos = new ArbolRecorridos();

        System.out.println("Recorrido preOrder:");
        arbolRecorridos.preOrderInterativo(arbolBinario.getRoot());

        System.out.println("\nRecorrido Recursivo:");
        arbolRecorridos.preOrderRecursivo(arbolBinario.getRoot());

        System.out.println("\nRecorrido inOrder:");
        arbolRecorridos.inOrderRecursivo(arbolBinario.getRoot());

        System.out.println("\nRecorrido posOrder:");
        arbolRecorridos.posOrderRecursivo(arbolBinario.getRoot());
    }
}
