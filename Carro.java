import java.util.Scanner;

class Carro {
  public static void main(String[] args) {
    String placa;
    int ano;    

    Scanner ler = new Scanner(System.in);
    System.out.println("Informe a placa do veículo: ");
    placa = ler.next();
    System.out.println("Informe o ano de fabricação do veículo: ");
    ano = ler.nextInt();

    if(ano < 2010){
      System.out.println("Carro Velho");
    }else if(ano > 2010 && ano < 2022){
      System.out.println("Carro Semi novo");
    }else if(ano == 2022){
      System.out.println("Carro Novo");
    }else{
      System.out.println("Invalido!");
    }

    placa = placa.toUpperCase();

    String novaPlaca = placa
      .replace("A", "*")
      .replace("E", "*")
      .replace("I", "*")
      .replace("O", "*")
      .replace("U", "*");
    System.out.println(novaPlaca);
      }
}