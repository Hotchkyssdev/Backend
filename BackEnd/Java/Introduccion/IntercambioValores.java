public class IntercambioValores {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Variables antes del intercambio:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nVariables después del intercambio:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}