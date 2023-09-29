public class Main {
  public static void main(String[] args) {
  
    Engenheiro engenheiro = new Engenheiro("Miguel");
    Quadrado quadrado = new Quadrado(4);
    Retangular retangular = new Retangular(2, 3);

    engenheiro.medir_area(quadrado);
    engenheiro.medir_perimetro(retangular);
  }
}