import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("E ai mundão, firmeza?!");

        int valor = 10;
        double valorDouble = 30.0;
        float valorFloat = 20.0f;
        String palavra = "Java";

        System.out.println("Imprimindo variáveis: " + valor);
        System.out.printf("Imprimindo variáveis %.2f\n", valorDouble);

        int cast = (int) valorDouble;
        System.out.println("Valor int: " + cast);

        String lorem = """
                Lorem Ipsum is simply dummy text of the printing and typesetting
                industry. Lorem Ipsum has been the industry's standard dummy 
                text ever since the 1500s, when an unknown printer took a 
                galley of type and scrambled it to make a type specimen book. 
                It has survived not only five centuries, but also the leap into
                electronic typesetting, remaining essentially unchanged. It was 
                popularised.
                """;

        System.out.println(lorem);
    }
}