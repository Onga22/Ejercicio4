package domain;

public class EjercicioCuatro {

    public static void main(String[] args) {

        int numeroIf = 5;
        int numeroWhile = 0;
        String estacion = "Invierno";

        if (numeroIf < 0) {
            System.out.println(" El numero " + numeroIf + " es *Negativo* ");
        } else if (numeroIf > 0) {
            System.out.println(" El numero " + numeroIf + " es *Positivo* ");
        } else if (numeroIf == 0) {
            System.out.println(" El numero " + numeroIf + " es : 0 ");
        }

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        do {
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        switch (estacion) {
            case "Verano":
                System.out.println(" La estacion es Verano ");
                break;
            case "Primavera":
                System.out.println(" La estacion es Primavera ");
                break;
            case "Otoño":
                System.out.println(" La estacion es Otoño ");
                break;
            case "Invierno":
                System.out.println(" La estacion es Invierno ");
                break;
            default:
                System.out.println(" No es ninguna Estacion ");
                break;

        }
    }
}
