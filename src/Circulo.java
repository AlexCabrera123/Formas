import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Circulo extends Figura implements AccionesFiguraInterface{

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {

        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double obtenerPerimetro() {

        return 2*Math.PI*radio;
    }

    @Override
    public void rellenar() {
        System.out.println("RELLENANDO FIGURA");

    }

    @Override
    public void duplicar() {
        System.out.println("HAS DUPLICADO LA FIGURA");

    }

    @Override
    public Figura hacerPequenio() {
        Circulo circulopeque = new Circulo(this.color,this.relleno,this.radio);
        return null;
    }
}
