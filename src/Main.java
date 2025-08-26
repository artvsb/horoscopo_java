import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Olá, " + nome + "! Seja bem-vindo(a) ao horóscopo virtual! Vou precisar de sua data de nascimento: \n");
        System.out.println("Insira o dia de seu nascimento: ");
        int dia = sc.nextInt();
        System.out.println("Insira o mês de seu nascimento: ");
        String mes = sc.next();

        if (( dia <= 31 && dia >= 21 && mes.equalsIgnoreCase("março")) || (dia <= 19 && mes.equalsIgnoreCase("abril"))) {
            System.out.println("Seu signo é ÁRIES.");
        } else if ((dia >= 20 && dia <= 30 && mes.equalsIgnoreCase("abril") || (dia <= 20 && mes.equalsIgnoreCase("maio")))) {
            System.out.println("Seu signo é TOURO.");
        } else if ((dia >= 21 && dia <= 31 && mes.equalsIgnoreCase("maio") || (dia <= 20 && mes.equalsIgnoreCase("junho")))) {
            System.out.println("Seu signo é GÊMEOS.");
        } else if ((dia >= 21 && dia <= 30 && mes.equalsIgnoreCase("junho") || (dia <= 22 && mes.equalsIgnoreCase("julho")))) {
            System.out.println("Seu signo é CÂNCER.");
        } else if ((dia >= 23 && dia <= 31 && mes.equalsIgnoreCase("julho") || (dia <= 22 && mes.equalsIgnoreCase("agosto")))) {
            System.out.println("Seu signo é LEÃO.");
        } else if ((dia >= 23 && dia <= 31 && mes.equalsIgnoreCase("agosto") || (dia <= 22 && mes.equalsIgnoreCase("setembro")))) {
            System.out.println("Seu signo é VIRGEM.");
        } else if ((dia >= 23 && dia <= 30 && mes.equalsIgnoreCase("setembro") || (dia <= 22 && mes.equalsIgnoreCase("outubro")))) {
            System.out.println("Seu signo é LIBRA.");
        } else if ((dia >= 23 && dia <= 31 && mes.equalsIgnoreCase("outubro") || (dia <= 21 && mes.equalsIgnoreCase("novembro")))) {
            System.out.println("Seu signo é ESCORPIÃO.");
        } else if ((dia >= 22 && dia <= 30 && mes.equalsIgnoreCase("novembro") || (dia <= 21 && mes.equalsIgnoreCase("dezembro")))) {
            System.out.println("Seu signo é SAGITÁRIO.");
        } else if ((dia >= 22 && dia <= 31 && mes.equalsIgnoreCase("dezembro") || (dia <= 19 && mes.equalsIgnoreCase("janeiro")))) {
            System.out.println("Seu signo é CAPRICÓRNIO.");
        } else if ((dia >= 20 && dia <= 31 && mes.equalsIgnoreCase("janeiro") || (dia <= 19 && mes.equalsIgnoreCase("fevereiro")))) {
            System.out.println("Seu signo é AQUÁRIO.");
        } else if ((dia >= 20 && dia <= 29 && mes.equalsIgnoreCase("fevereiro") || (dia <= 20 && mes.equalsIgnoreCase("março")))) {
            System.out.println("Seu signo é PEIXES.");
        } else {
            System.out.println("Resposta inválida");
        }
    }
}