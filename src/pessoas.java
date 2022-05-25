
import java.util.Scanner;

public class pessoas {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    float altura=0, maiorAltura=0, menorAltura = 180, mediaAltura=0;
    int sexo, numeroMulheres =0, numeroHomens=0;

    for(int i=0; i<10; i++){
        System.out.println("Digite 1 para sexo masculino ou 2 para sexo feminino: ");
        sexo = sc.nextInt();
        System.out.println("Digite a altura: ");
        altura = sc.nextFloat();
        if(sexo ==1){
            mediaAltura = mediaAltura +  altura;
            numeroHomens++;
        }
        else if (sexo == 2) {
            System.out.println("Digite a altura: ");
            numeroMulheres++;
        }else{
            System.out.println("Sexo inexistente");
        }

        if(altura> maiorAltura){
            maiorAltura = altura;
        }
        if(altura<menorAltura){
            menorAltura = altura;
        }
    }

        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura dos homens: " + (mediaAltura/numeroHomens));
        System.out.println("Quantidade de mulheres: " + numeroMulheres);




}}
