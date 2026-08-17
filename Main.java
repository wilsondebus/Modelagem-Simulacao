import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        Passageiro passageiro = new Passageiro(); 

        System.out.println("Preencher informações da passagem: ");
        System.out.println();

        System.out.println("Digite seu nome: ");
        passageiro.setNome(teclado.nextLine());

            System.out.println("Digite seu CPF: ");
        passageiro.setCpf(teclado.nextLine());

        System.out.println("Digite sua idade: ");
        passageiro.setIdade(teclado.nextInt());
        teclado.nextLine(); 

        System.out.println("Local de embarque: ");
        passageiro.setEmbarque(teclado.nextLine());

        System.out.println("Local de destino: ");
        passageiro.setDestino(teclado.nextLine());


        teclado.close(); 
    }
}
