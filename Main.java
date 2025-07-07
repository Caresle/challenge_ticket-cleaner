public class Main {
    public static void main(String[] args) {
        // Reto para el desarrollador:
        // 1. Implementar la función 'processTicketLines' para analizar las líneas del ticket
        //    y crear una lista de objetos 'TicketItem'.
        // 2. Implementar la función 'filterByCategory' para filtrar la lista de 'TicketItem'
        //    por una categoría específica.
        // 3. Implementar la función 'calculateTotal' para calcular el precio total de los
        //    elementos filtrados.

        String[] ticketLines = {
                "ProductoA,Electrónicos,50.00",
                "ProductoB,Ropa,25.00",
                "ProductoC,Electrónicos,100.00",
                "ProductoD,Alimentos,10.00",
                "ProductoE,Ropa,30.00"
        };

        String categoryToFilter = "Electrónicos";

        // Procesa las líneas del ticket
        List<TicketItem> items = processTicketLines(ticketLines);

        // Filtra por categoría
        List<TicketItem> filteredItems = filterByCategory(items, categoryToFilter);

        // Calcula el total
        double total = calculateTotal(filteredItems);

        System.out.println("Total de " + categoryToFilter + ": " + total);
    }

    // TODO: Implementar esta función
    public static List<TicketItem> processTicketLines(String[] ticketLines) {
        // Analizar las líneas del ticket y crear una lista de objetos TicketItem
        return null; // Devuelve null por ahora, ¡implementa esto!
    }

    // TODO: Implementar esta función
    public static List<TicketItem> filterByCategory(List<TicketItem> items, String category) {
        // Filtrar la lista de TicketItem por la categoría especificada
        return null; // Devuelve null por ahora, ¡implementa esto!
    }

    // TODO: Implementar esta función
    public static double calculateTotal(List<TicketItem> items) {
        // Calcular el precio total de los elementos en la lista
        return 0.0; // Devuelve 0.0 por ahora, ¡implementa esto!
    }
}

// Clase para representar un elemento del ticket
class TicketItem {
    private String producto;
    private String categoria;
    private double precio;

    public TicketItem(String producto, String categoria, double precio) {
        this.producto = producto;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto: " + producto + ", Categoría: " + categoria + ", Precio: " + precio;
    }
}