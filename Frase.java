import java.util.Scanner;

class Frase {
  public static void main(String[] args) {
    char c;
    String frase;
    int cont;
    
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite uma frase: ");
    frase = ler.next();
    frase = frase.toUpperCase();


    for(int i=0; i < frase.length();i++){
      c=frase.charAt(i);
      if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
        cont++;
      }
    }
  }
}