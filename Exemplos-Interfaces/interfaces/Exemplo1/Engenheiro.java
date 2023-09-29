public class Engenheiro {
    
    String nome;

    public Engenheiro(String nome) {
        this.nome = nome;
    }

    public void medir_perimetro(FormasInterface terreno) {
        double perimetro = terreno.get_perimetro();
        System.out.println(nome + " mediu o perímetro: " + perimetro);
    }

    public void medir_area(FormasInterface terrono) {
        double area = terrono.get_area();
        System.out.println(nome + " mediu a área: " + area + " m2");
    }
}
