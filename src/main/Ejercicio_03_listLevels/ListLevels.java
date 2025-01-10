package main.Ejercicio_03_listLevels;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import main.Materia.Models.Node;

public class ListLevels {
    
    public List<List<Node>> ListLeves(Node root){
        List<List<Node>> levels = new ArrayList<>();
        
        if (root == null) {
            return null; 
        }

        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root); 
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            
            List<Node> currentLevel = new ArrayList<>();
            
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll(); 
                currentLevel.add(currentNode);   
                
                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }
            
            levels.add(currentLevel);
        }
        
        return levels;
    }
}

