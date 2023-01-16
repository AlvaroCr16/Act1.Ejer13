package ejercicio13;
public class circulo {
    private double radio;

    public circulo (double radio){
        this.radio = radio;
        if (radio < 0){
            radio = 0;
        }
    }
    public double getRadio() {
        return radio;
    }
    public double getArea() {
        return radio*radio*Math.PI;
    }

    public static void main(String[] args) {
        circulo Cir = new circulo (5);
        cilindro Cil = new cilindro (5,5);
        System.out.println(Cir.getArea());
        System.out.println(Cil.getVolume());
    }
}
