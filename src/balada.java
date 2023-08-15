import java.sql.SQLOutput;
import java.util.Scanner;

public class balada {

    public static void main(String[] args) {

        String nome;
        String acompanhante;
        long cpf;
        long cpf2;
        int idade;
        int idade2 = 0;
        String continuacao;

        while (continuacao){

            Scanner teclado = new Scanner(System.in);

            System.out.println("##########################################");

            System.out.println("Qual o seu nome? ");
            nome = teclado.nextLine();
            System.out.println("Digite sua idade:                obs: NÃO MINTA! ");
            idade = teclado.nextInt();
            System.out.println("Digite seu cpf: ");
            cpf = teclado.nextLong();

            System.out.println("##########################################");


            if (idade >= 18 && idade % 2 == 0) {
                System.out.println("entrada liberada! ");

            } else if (idade >= 18 && idade % 2 == 1) {

                System.out.println("##########################################");
                System.out.println("Bem vindo a nossa balada! ");
                System.out.println("Qual é o nome do acompanhante: ");
                acompanhante = teclado.next();
                System.out.println("Olá " + acompanhante + " Qual é o seu cpf: ");
                cpf2 = teclado.nextLong();
                System.out.println("Qual a idade so acompanhante: ");
                idade2 = teclado.nextInt();
                System.out.println("##########################################");

            } else {
                System.out.println("Vão embora!");
            }

            if (idade >= 18 && idade2 >= 18) {
                System.out.println("Acesso liberado! ");

            } else {
                System.out.println("Você não pode passar!");
            }
            System.out.println("##########################################");

            System.out.println("Quer continuar? S/N");
            continuacao = teclado.next();

            System.out.println("Deseja continuar? (1 = sim / 2 = não)");

            int opcao = teclado.nextInt();

            if (opcao == 2){
                continuar =
            }
        }

    }

}
