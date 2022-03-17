import java.util.Scanner;

class Viagem {
  public static void main(String[] args) {
    int horas;
    float consumo;
    float velMedia;
    float kmLitro;

    Scanner ler = new Scanner(System.in);
    System.out.println("Informe o tempo gasto na viagem: ");
    horas = ler.nextInt();
    System.out.println("Informe a velocidade média: ");
    velMedia = ler.nextFloat();
    System.out.println("Informe o Km por litro: ");
    kmLitro = ler.nextFloat();
    
    consumo = velMedia*horas / kmLitro;
    
    System.out.println("O consumo final de combustível gasto é: " + consumo );
  }
}
