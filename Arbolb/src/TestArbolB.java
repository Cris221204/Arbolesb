/**
 * Clase de prueba para el Árbol B
 */
public class TestArbolB {

    public static void main(String[] args) {
        // Grado mínimo del Árbol B es t=3
        // Cada nodo soporta 2t hijos y 2t-1 claves
        int t = 3;
        // Se crea el árbol B según t
        ArbolB arbolB = new ArbolB(t);

        // Valores a ingresar primera ronda
        int[] valoresUno = {20, 10, 50, 30, 40};
        System.out.println("-- INICIO --");
        System.out.println("INSERTANDO VALORES AL ÁRBOL B");
        for (int i = 0; i < valoresUno.length; i++) {
            System.out.println("Insertando... valor " + valoresUno[i]);
            arbolB.insertar(valoresUno[i]);
        }

        // Mostrando árbol B por pantalla en preorder
        System.out.println("ESTADO ÁRBOL B");
        arbolB.showBTree();
        System.out.println("");

        // Valores a ingresar segunda ronda
        System.out.println("Insertando... valor 60");
        arbolB.insertar(60);
        // Mostrando árbol B por pantalla en preorder
        System.out.println("ESTADO ÁRBOL B");
        arbolB.showBTree();
        System.out.println("");

        // Valores a ingresar tercera ronda
        System.out.println("Insertando... valor 80");
        arbolB.insertar(80);
        System.out.println("Insertando... valor 70");
        arbolB.insertar(70);
        System.out.println("Insertando... valor 90");
        arbolB.insertar(90);
        // Mostrando árbol B por pantalla en preorder
        System.out.println("ESTADO ÁRBOL B");
        arbolB.showBTree();
        System.out.println("");

        // Buscar
        System.out.println("\nBuscando el nodo con el valor 80 en el árbol B:");
        arbolB.buscarNodoPorClave(80);

        // Implementar
        System.out.println("\nEl valor máximo del árbol B es : " + arbolB.buscarClaveMayor());

        System.out.print("El nodo mínimo de la raíz del árbol B es : ");
        arbolB.mostrarClavesNodoMinimo();

        System.out.println("");
        System.out.println("-- FIN --");
    }
}
