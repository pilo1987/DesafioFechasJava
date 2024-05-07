import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Porfavor ingrese la primera fecha como DD/MM/AAAA:");
        String fecha1 = scanner.nextLine();

        System.out.println("Porfavor ingrese la segunda fecha como DD/MM/AAAA:");
        String fecha2 = scanner.nextLine();

        int dia1 = Integer.parseInt(fecha1.substring(0, 2));
        int mes1 = Integer.parseInt(fecha1.substring(3, 5));
        int año1 = Integer.parseInt(fecha1.substring(6));

        int dia2 = Integer.parseInt(fecha2.substring(0,2));
        int mes2 = Integer.parseInt(fecha2.substring(3,5));
        int año2 = Integer.parseInt(fecha2.substring(6));

        if (año1 < año2) {
            System.out.println("La persona 1 es mayor.");
        } else if (año1 > año2) {
            System.out.println("La persona 2 es mayor.");
        } else {
            if (mes1 < mes2) {
                System.out.println("La persona 1 es mayor.");
            } else if (mes1 > mes2) {
                System.out.println("La persona 2 es mayor.");
            } else {
                if (dia1 < dia2) {
                    System.out.println("La persona 1 es mayor.");
                } else if (dia1 > dia2) {
                    System.out.println("La persona 2 es mayor.");
                } else {
                    System.out.println("Las personas tienen la misma edad.");
                }
            }
        }
    }
}
