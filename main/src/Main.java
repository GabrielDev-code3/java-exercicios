import java.util.Scanner;

void main () {
    int Contador = 0;
    var scanner = new Scanner(System.in);
    System.out.print("Digite um número para começar: ");
    int n1 = scanner.nextInt();

    System.out.print("\nDigite outro numero maior que o anterior: ");
    int n2 = scanner.nextInt();

    while (n1 >= n2) {
        System.out.printf("\nDigite outro numero que seja maior que %d: ",n1);
        int n3 = scanner.nextInt();
         if (n3 < n1){
            System.out.print("Número MENOR! \n");
         }
        n2 = n3;
    }
    scanner.nextLine();
System.out.printf("Os números escolhidos foram %d e %d \n", n1, n2);
System.out.print("Realizar operação com números PARES(P) ou ÍMPARES(I)? \n");
String Escolha = scanner.nextLine();

    if (Escolha.equalsIgnoreCase("P" )){
    System.out.println("Você escolheu par");
    System.out.printf("Imprimindo os números pares de %d até %d \n",n2,n1);
        for(int i=n2; i>=n1; i-- ){
            if(i%2==0) {
                System.out.printf("\n %d -- %d", Contador,i);
                Contador++;
            }
        }

} else if (Escolha.equalsIgnoreCase("I")){
    System.out.println("Você escolheu impar");
    System.out.printf("Imprimindo os números pares de %d até %d \n",n2,n1);
        for(int i=n2; i>=n1; i-- ){
            if(i%2!=1) {
                System.out.printf("\n %d -- %d", Contador,i);
                Contador++;
            }
        }
    
} else System.out.println("Opção invalida!");


}