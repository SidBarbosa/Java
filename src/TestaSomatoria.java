public class TestaSomatoria {


    public static void main(String[] args) {
        int contador = 0;
        int total = 0;
        while (contador <= 5) {

            total += contador;
            System.out.println("Contador " + contador);
            System.out.println("Total " + total);
            contador++;
        }
    }

}
