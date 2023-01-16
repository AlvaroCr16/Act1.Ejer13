package ejercicio13;
public class cilindro extends circulo{
    double altura;
    public cilindro (double radio, double altura){
        super (radio);
        this.altura = altura;
        if (altura < 0){
            altura = 0;
        }
    }
    public double getAltura (){
        return altura;
    }
    public double getVolume (){
        return getArea() * getAltura();
    }
}
