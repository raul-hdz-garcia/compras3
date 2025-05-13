import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double limiteTarjeta;
        String miDescripcionCompra;
        double miValorCompra;
        int salirContinuar = 1;

        ArrayList<Articulo> listaArticulo = new ArrayList<>();

        System.out.println("Escriba el límite de la tarjeta:");
        Scanner teclado = new Scanner(System.in);
        limiteTarjeta = teclado.nextDouble();

        while (salirContinuar == 1) {
            System.out.println("Escriba la descripción de la compra:");
            miDescripcionCompra = teclado.next();

            System.out.println("Escriba el valor de la compra:");
            miValorCompra = teclado.nextDouble();

            if (limiteTarjeta >= miValorCompra) {
                limiteTarjeta -= miValorCompra;
                Articulo miArticulo = new Articulo(miDescripcionCompra, miValorCompra);
                listaArticulo.add(miArticulo);
                System.out.println("Compra realizada!");
            } else {
                System.out.println("Saldo insuficiente!");
                break;
            }

            System.out.println("Escriba 0 para salir o 1 para continuar");
            salirContinuar = teclado.nextInt();
        }

        System.out.println("""
                        ******************************
                        COMPRAS REALIZADAS:
                        """);
        Collections.sort(listaArticulo);
        for (Articulo miArticulo : listaArticulo) {
            System.out.println(miArticulo.descripcionCompra + " - " + miArticulo.valorCompra);
        }
        
        System.out.println("\n******************************\n");
        System.out.println("Saldo de la tarjeta: " + limiteTarjeta);

    }
}

