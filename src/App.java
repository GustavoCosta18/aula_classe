public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double med1 = calculaMedia(12, 23, 34, 45, 56, 67);

        System.out.println("Média das 6 notas: " + med1);

    }

    public static double calculaMedia (int a, int b, int c, int d , int e , int f){
        
        return ((a + b + c + d + e + f) /6 );
    }
}
