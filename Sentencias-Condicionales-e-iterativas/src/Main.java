public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            String texto = "";
            for (int j = 0; j < 7-i; j++) {
                texto +="*";
            }
            System.out.println(texto);
        }
    }
}