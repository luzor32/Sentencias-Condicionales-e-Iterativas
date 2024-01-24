public class Main {
    public static void main(String[] args) {

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