public class Main {

    //soma
    private static void somaMethod(float x, float y) {
        System.out.println(x + y);
    }

    //subtração
    private static void subtracaoMethod(float x, float y) {
        System.out.println(x - y);
    }

    //multiplicação
    private static void multiplicacaoMethod(float x, float y) {
        System.out.println(x * y);
    }

    //Divisão
    private static void divisaoMethod(float x, float y) {
        System.out.println(x / y);
    }

    public static void main(String[] args) {
        somaMethod(4, 5);
        subtracaoMethod(5, 4);
        multiplicacaoMethod(6, 7);
        divisaoMethod(14, 3);

        //function return values
        double areaQuadrado = Quadrilatero.area(8);
        System.out.println("The square area is : " + areaQuadrado);

        double areaRentangulo = Quadrilatero.area(8, 9);
        System.out.println("The quadrilateral area is: " + areaRentangulo);

        double areaTrapezio = Quadrilatero.area(9, 7, 8);
        System.out.println("The trapeze area is: " + areaTrapezio);


    }


}