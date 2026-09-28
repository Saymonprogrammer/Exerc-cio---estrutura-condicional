import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //exercicio 1:
        System.out.println("Digite o valor de A:");
        int a = teclado.nextInt();
        System.out.println("Digite o valor de B:");
        int b = teclado.nextInt();
        System.out.println("Digite o valor de C:");
        int c = teclado.nextInt();

        String status = (a+b < c) ? "A soma de A+B é menor que C" : "A soma de A+B não é menor que C";
        System.out.println(status);

        //exercicio 2:
        System.out.println("\nDigite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite seu sexo: ");
        String sexo = teclado.nextLine();
        System.out.println("Digite seu estado civil: ");
        String estadoCivil = teclado.nextLine();

        if (sexo.equalsIgnoreCase("F") && estadoCivil.equalsIgnoreCase("CASADA")) {
            System.out.println("Tempo de casada(anos): ");
            int casada = teclado.nextInt();
        }

        //exercicio 3:
        System.out.println("\nDigite um numero qualquer: ");
        int numero = teclado.nextInt();

        String epar = (numero % 2 == 0) ? "É par" : "É impar";
        System.out.println(epar);

        //exercicio 4:
        System.out.println("\nDigite o valor de A:");
        int a1 = teclado.nextInt();
        System.out.println("Digite o valor de B:");
        int b1 = teclado.nextInt();
        int c1 = 0;
        if (a1 == b1){
            c1 = (a1+b1);
        } else {
            c1 = (a1*b1);
        }
        System.out.println("Valor de c: "+c1);

        //exercicio 5:
        System.out.println("\nDigite um numero: ");
        double numero1 = teclado.nextDouble();

        if (numero1 >= 0){
            double dobro = 2*numero1;
            System.out.println("dobro:"+dobro);
        } else {
            double triplo = 3*numero1;
            System.out.println("Triplo:"+triplo);
        }

        //exercicio 6:
        System.out.println("\nDigite um valor:");
        double valor = teclado.nextDouble();
        if (valor % 2 == 0){
            double soma = valor+5;
            System.out.println("Resultado: "+soma);
        } else {
            double soma = valor+8;
            System.out.println("Resultado: "+soma);
        }

        //exercicio 7:
        System.out.println("\nDigite valores DIFERENTES!!!");
        System.out.println("Digite o primeiro valor:");
        int valor1 = teclado.nextInt();
        System.out.println("Digite o segundo valor:");
        int valor2 = teclado.nextInt();
        System.out.println("Digite o terceiro valor:");
        int valor3 = teclado.nextInt();

        if (valor1 == valor2 && valor2 == valor3) {
            System.out.println("Valores iguais, tente novamente.");
        } else {
            if (valor1 > valor2 && valor1 > valor3) {
                if (valor2 >= valor3) {
                    System.out.println(valor1 +" "+valor2+" "+valor3);
                } else  {
                    System.out.println(valor1 +" "+valor3+" "+valor2);
                }
            } else if (valor2 > valor1 && valor2 > valor3) {
                if (valor1 >= valor3) {
                    System.out.println(valor2 +" "+valor1+" "+valor3);
                } else  {
                    System.out.println(valor2 +" "+valor3+" "+valor1);
                }
            } else if (valor3 > valor1 && valor3 > valor2) {
                if (valor1 >= valor2) {
                    System.out.println(valor3 +" "+valor1+" "+valor2);
                } else  {
                    System.out.println(valor3 +" "+valor2+" "+valor1);
                }
            }
        }

        teclado.close();
    }
}