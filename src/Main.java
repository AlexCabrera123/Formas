public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Blanco",true,15.7);
        Rectangulo rectangulo = new Rectangulo("Amarillo", false, 6.3,14.8);

        System.out.println(circulo.obtenerArea());
        System.out.println(circulo.obtenerPerimetro());
        System.out.println(rectangulo.obtenerArea());
        System.out.println(rectangulo.obtenerPerimetro());

        circulo.duplicar();
        circulo.rellenar();


        MiInterface metodo = (a,b) -> a+b ;{
            System.out.println("sumando "+a+ " + " +b );
            return a+b;
        }

        int resultado = metodo.operacion(5,6);
        System.out.println(resultado);
        metodo = (a,b) -> a*b;
        resultado=metodo.operacion(5,6);
        System.out.println(resultado);



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
