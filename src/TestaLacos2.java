public class TestaLacos2 {

    public static void main(String[] args) {

        for (int linha = 0; linha < 10; linha++) {
            for (int caluna = 0; caluna < linha; caluna++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
