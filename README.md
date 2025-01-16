## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

# Ejercicios de Árboles Binarios

## Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (Insert BST)

La clase `InsertBSTTest` permite construir un Árbol Binario de Búsqueda (BST) en el cual los valores se insertan siguiendo el orden adecuado. El usuario puede ingresar un conjunto de valores que serán insertados uno por uno en el árbol. El método `runEjercicio1()` toma estos valores, los organiza en el árbol y luego muestra tanto el arreglo original (input) como la estructura resultante del árbol (output).

**Ejemplo**:

- **INPUT**: [4, 2, 7, 1, 3, 6, 9]  
- **OUTPUT**:  

      9
    7
      6
  4
      3
    2
      1

## Ejercicio 02: Invertir un Árbol Binario

La clase `InvertBinaryTree` contiene un método recursivo llamado `invertirArbol()` que intercambia las ramas de cada nodo del árbol binario. Esto transforma el árbol en su versión reflejada, moviendo el subárbol izquierdo a la derecha y viceversa. Se utiliza un nodo auxiliar para realizar este intercambio, y luego se aplica el método recursivamente a los subárboles de los hijos.

**Ejemplo**:

- **INPUT**:  
      9
    7
      6
  4
      3
    2
      1

- **OUTPUT**:  
      1
    2
      3
  4
      6
    7
      9

## Ejercicio 04: Calcular la Profundidad Máxima

La clase `Depth` implementa el método `maxDepth()` para calcular la profundidad máxima de un árbol binario. Si el árbol no tiene nodos, la profundidad es 0. En caso contrario, se calcula recursivamente la profundidad de las ramas izquierda y derecha, y se devuelve la mayor de ambas, sumando 1 para incluir el nodo actual.

**Cálculo del Máximo**:
java
return 1 + Math.max(profundidadIzquierda, profundidadDerecha);


**Ejemplo**:

- **INPUT**: [4, 2, 7, 1, 3, 6, 9]  

- **OUTPUT**:  
  Profundidad máxima = 3

