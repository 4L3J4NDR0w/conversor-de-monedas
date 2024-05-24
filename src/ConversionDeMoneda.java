import java.util.Scanner;

public class ConversionDeMoneda {
    Scanner teclado = new Scanner(System.in);
    ObtenerValores valores = new ObtenerValores();
    double usd = valores.usd;
    double cop = valores.cop;
    double brl = valores.brl;
    double ars = valores.ars;

    public void UsdACop(){
        System.out.println("Cuantos dolares deseas convertir?");
        double cantidadDeDolares = teclado.nextDouble();
        teclado.nextLine();
        System.out.println(cantidadDeDolares + " Dólares" + " Son "
                + cantidadDeDolares*this.cop + " Pesos");
    }
    public void copAUsd(){
        System.out.println("Cuantos pesos deseas convertir?");
        double cantidadDePesos = teclado.nextDouble();
        teclado.nextLine();
        System.out.println(cantidadDePesos + " Pesos" + " Son "
                + cantidadDePesos/this.cop + " Dólares");
    }

    public void usdABrl(){
        System.out.println("Cuantos dolares deseas convertir?");
        double cantidadDeDolares = teclado.nextDouble();
        teclado.nextLine();
        System.out.println(cantidadDeDolares + " Dólares" + " Son "
                + cantidadDeDolares*this.brl + " Reales");
    }

    public void brlAUsd(){
        System.out.println("Cuantos reales deseas convertir?");
        double cantidadDeReales = teclado.nextDouble();
        teclado.nextLine();
        System.out.println(cantidadDeReales+ " Reales" + " Son "
                + cantidadDeReales/this.brl + " Dolares");
    }

    public void usdAArs(){
        System.out.println("Cuantos dolares deseas convertir?");
        double cantidadDeDolares = teclado.nextDouble();
        teclado.nextLine();
        System.out.println(cantidadDeDolares+ " Dolares" + " Son "
                + cantidadDeDolares*this.ars + " Pesos");
    }

    public void arsAUsd(){
        System.out.println("Cuantos pesos deseas convertir?");
        double cantidadDePesos = teclado.nextDouble();
        teclado.nextLine();
        System.out.println(cantidadDePesos + " Pesos" + " Son "
                + cantidadDePesos/this.ars + " Dolares");
    }

}
