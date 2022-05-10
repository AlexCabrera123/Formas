public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Blanco",true,6);
        Rectangulo rectangulo = new Rectangulo("Amarillo", false, 10,5);

        System.out.println(circulo.obtenerArea());
        System.out.println(circulo.obtenerPerimetro());
        System.out.println(rectangulo.obtenerArea());
        System.out.println(rectangulo.obtenerPerimetro());



        //ToDo Clase padre Figura, va a ser abstracta
        //color string, relleno booleano
        //constructor para los dos parametros
        //getters y setters
        //obtenerArea -> abstracto, que retorne doble
        //obtenerPerimetro -> abstracto, que retorne doble


        //ToDo Circulo
        //radio double
        //constructor hereda super, e incluye el radio
        //getters y setters
        //implememtar obtenerArea
        //implementar obtenerPerimetro


        //ToDo Rectangulo
        //ancho double, alto double
        //constructor hereda super
        //getters y setters
        //implementar obtenerArea
        //implementar obtenerPerimetro


    }
}
