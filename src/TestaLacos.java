public class TestaLacos {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int contador = 0; contador <= 10; contador++) {
                System.out.print(i);
                System.out.print(" x ");
                System.out.print(contador);
                System.out.print(" = ");
                System.out.print(i * contador);
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }
}
