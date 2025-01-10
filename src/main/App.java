package main;

import java.util.List;

import main.Ejercicio_03_listLevels.ListLevels;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        //runArbolBinario();
        runEjercicio3();
    }

    public static void runEjercicio3(){
        ArbolBinario arbolBinario = new ArbolBinario();
        ListLevels levels  = new ListLevels();

        int[] valores = {4 , 2 , 7 , 1 , 3 , 6 , 9};

        // Ingresar cada valor al árbol
        for (int i = 0; i < valores.length; i++) {
            arbolBinario.insert(valores[i]);
        }

        arbolBinario.printTree();
        List<List<Node>> listaDeNiveles = levels.ListLeves(arbolBinario.getRoot());
        
    }

    public static void runArbolBinario(){
        ArbolBinario arbolBinario = new ArbolBinario();
        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};

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


