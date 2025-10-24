public class Operaciones {

// Método que llama a otro

    public void mostrarResultado() {

        int resultado = sumar(4, 3); // llama a otro método de la misma clase

        System.out.println("La suma es: " + resultado);

    }

    public int sumar(int a, int b) {

        return a + b;

    }

    public static void main(String[] args) {

        Operaciones op = new Operaciones();

        op.mostrarResultado(); // Ejecuta mostrarResultado, que llama internamente a sumar

    }

}