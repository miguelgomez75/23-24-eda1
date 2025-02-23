package listas.basica;

class Ejemplo {
    public static void main(String[] args) {

        List nephews = new List();

        viewLine(nephews);
        System.out.println("Esta vacia? " + nephews.isEmpty());

        nephews.insertEnd("Juanito");
        nephews.insertEnd("Pepito");
        nephews.insertEnd("Anita");

        System.out.println("Esta vacia? " + nephews.isEmpty());

        viewLine(nephews);

        nephews.insertEnd("Luisito");

        System.out.println("Tamaño: " + nephews.size());

        nephews.delete();
        System.out.println("Tamaño: " + nephews.size());

        viewLine(nephews);

        System.out.println("Añadiendo elementos al final:");
        nephews.insertEnd("Juanito");
        nephews.insertEnd("Pepito");
        nephews.insertEnd("Anita");

        System.out.println("Añadiendo elementos al inicio:");
        nephews.insertFront("Luisito");
        nephews.insertFront("Carlitos");

        System.out.println("Añadiendo elemento en la posición 2:");
        nephews.insertAt(2, "Pedrito");

        System.out.println("Eliminando elemento al final:");
        nephews.delete();

        System.out.println("Eliminando elemento al inicio:");
        nephews.deleteFront();

        System.out.println("Eliminando elemento en la posición 2:");
        nephews.deleteAt(2);

        viewLine(nephews);
    }

    static void viewLine(List filaDeSobrinos) {
        String[] larray = filaDeSobrinos.listAll();
        System.out.println("LA FILA" + "-".repeat(18));
        for (String sobrino : larray){
            System.out.println(sobrino);
        }
        System.out.println("-".repeat(25));
    }
}
 