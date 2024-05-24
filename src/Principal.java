import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConversionDeMoneda conversionDeMoneda = new ConversionDeMoneda();
        Scanner teclado = new Scanner(System.in);
        boolean cerrarCiclo = false;

        while (cerrarCiclo == false){

            System.out.println("""
                    **************************************************************
                    Bienvenido al conversor de monedas 
                    
                    
                    1) Dólar =>> Peso Argentino
                    2) Peso argentino =>> Dólar
                    3) Dólar =>> Real breasileño
                    4) Real breasileño =>> Dólar
                    5) Dólar =>> Peso colombiano
                    6) Peso colombiano = Dólar
                    7)Salir
                    
                    
                    ***************************************************************
                    """);
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    conversionDeMoneda.usdAArs();
                    break;
                case 2:
                    conversionDeMoneda.arsAUsd();
                    break;
                case 3:
                    conversionDeMoneda.usdABrl();
                    break;
                case 4:
                    conversionDeMoneda.brlAUsd();
                    break;
                case 5:
                    conversionDeMoneda.UsdACop();
                    break;
                case 6:
                    conversionDeMoneda.copAUsd();
                    break;
                case 7:
                    System.out.println("Conversor apagado");
                    cerrarCiclo = true;
                    break;
                default:
                    System.out.println("selecione una de la opciones");
            }
        }
    }
}
