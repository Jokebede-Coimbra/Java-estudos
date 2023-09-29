public class Quadrado implements FormasInterface {
  
    int lado;

    public Quadrado(int lado) {
        this.lado = lado;
        
    }
     @Override
    public int get_perimetro() {
        int perimetro = this.lado * 4;
        return perimetro;
    }
     @Override
    public int get_area() {
        int area = (this.lado * this.lado);
        return  area;
    }
}
