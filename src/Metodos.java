public class Metodos {

    // Método estático
    public static double calcularRaiz(double numero) {
        return Math.sqrt(numero); // usa método estático de la clase Math
    }

    // Método de instancia
    public void saludar(String nombre) {
        System.out.println("KLK, " + nombre + "!");
    }

    public static void main(String[] args) {
        // Llamado a método estático (sin crear objeto)
        double resultado = Metodos.calcularRaiz(16);
        System.out.println("La raíz cuadrada es: " + resultado);

        // Llamado a método de instancia (creando objeto)
        Metodos ejemplo = new Metodos();
        ejemplo.saludar("Holaa :)");
    }
}
