public class Main {
    public static void main (String[] args){
        double preciosinIva = 10;
        double resultado = precioConinva( preciosinIva);
        System.out.println(" el precio original es de " + preciosinIva + " El precio con IVA es de : " + resultado );


    }
public  static double precioConinva ( double preciosinIva){
double resultado = preciosinIva * 0.12;
return  resultado;


}

}
