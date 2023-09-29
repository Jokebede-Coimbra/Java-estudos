public class Retangular implements FormasInterface{
    
    int largura;
    int comprimento;

    public Retangular(int largura, int comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }
     @Override
    public int get_perimetro() {
        int perimetro = (this.comprimento * 2) + (this.largura * 2);
        return perimetro;
    }
     @Override
    public int get_area() {
        int area = (this.largura * this.comprimento);
        return  area;
    }

    
}
