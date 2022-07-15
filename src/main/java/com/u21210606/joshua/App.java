package com.u21210606.joshua;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {

            System.out.println("1. Opcion");
            System.out.println("2. Opcion");
            System.out.println("3. Opcion");
            System.out.println("4. Opcion");
            System.out.println("5. Opcion");
            System.out.println("6. Opcion");
            System.out.println("7. Opcion");
            System.out.println("8. Opcion");
            System.out.println("9. Opcion");
            System.out.println("10. Opcion");
            System.out.println("11. Opcion");
            System.out.println("12. Opcion");
            System.out.println("13. Opcion");
            System.out.println("14. Opcion");
            System.out.println("15. Opcion");
            System.out.println("16. Opcion");
            System.out.println("17. Opcion");
            System.out.println("18. Opcion");
            System.out.println("19. Salir");

            System.out.println("Introduce un numero: ");
            opcion = sn.nextInt();
            switch (opcion){ 
                case 1: 

                    break;
                    
                    case 2: 
                    break;
                    case 3: 
                    break;
                    case 4: 
                    break;
                    case 5: 
                    break;
                    case 6: 
                    break;
                    case 7: 
                    break;
                    case 8: 
                    break;
                    case 9: 
                    break;
                    case 10: 
                    break;
                    case 11: 
                    break;
                    case 12: 
                    break;
                    case 13: 
                    break;
                    case 14: 
                    break;
                    case 15: 
                    break;
                    case 16: 
                    break;
                    case 17: 
                    break;
                    case 18: 
                    break;
                    case 19:
                    salir = true;
                    default:
                    System.out.println("Las opciones son entre 1 y 19");
                    break;
            }
        }

    }
    public static void metodo (){
        System.out.println("opcion");
    }
}
