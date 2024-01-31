public class Main {
    public static void main(String[] args) {

        ex7();
    }

    private static void ex7() {
        String texto = "";
        for (int i = 0; i < 7; i++) {
            String espacio="";
            for (int j = 0; j < 7-i; j++) {
                espacio +=" ";
            }
            texto +="*";
            System.out.println(espacio+texto);
        }
    }
}