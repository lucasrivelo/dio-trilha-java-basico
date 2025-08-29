import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        
        try {
            // Chamando o método que contém a lógica de contagem
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException exception) {
            // Imprime a mensagem da exceção
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } finally {
            // Fecha o scanner para evitar vazamento de recursos
            terminal.close();
        }
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se parametroUm é MAIOR que parametroDois e lança a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        int contagem = parametroDois - parametroUm;
        
        // Realiza o laço 'for' para imprimir os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}