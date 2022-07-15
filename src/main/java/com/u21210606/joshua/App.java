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

            System.out.println("1. Calculadora basica");
            System.out.println("2. Area rectangulo");
            System.out.println("3. Repartir monto de dinero a tres personas");
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
                Double number1, number2, result;
                char operator = 0;
                Scanner input = new Scanner(System.in);
                System.out.println("Elige un operador +, -, *, o /");
                operator = input.next().charAt(0);
                System.out.println("Ingresa tu primer numero");
                number1 = input.nextDouble ();
                System.out.println("Ingresa tu segundo numero");
                number2 = input.nextDouble();
                switch (operator) {
                    case '+':
                        result = number1 + number2;
                        System.out.println(number1 + " + " + number2 + " = " + result);
                        break;
                       case '*':
                        result = number1 * number2;
                        System.out.println(number1 + " + " + number2 + " = " + result);
                        break;
                        case '-':
                        result = number1 - number2;
                        System.out.println(number1 + " - " + number2 + " = " + result);
                        break;
                        case '/':
                        result = number1 / number2;
                        System.out.println(number1 + " / " + number2 + " = " + result);
                        break;
                    default:
                    System.out.println("operacion invalida");
                        break;
                }


                    break;

                    case 2: 
                   
                        double base, height; 
                        Scanner obj = new Scanner(System.in);

                        System.out.print ("Ingrese base:");
                        base = obj.nextDouble();

                        
                        System.out.print ("Ingrese altura:");
                        height = obj.nextDouble();

                        result = (base * height);

                        System.out.print("El area del Rectangulo es:" + result);
                    
                    break;
                    case 3: 
                    double montoRepartir, montoP1, montoP2, montoP3;
                    double edadP1, edadP2, edadP3, sumaEdades;
                    Scanner sc = new Scanner(System.in);
            
                    System.out.print("Monto: ");
                    montoRepartir = sc.nextDouble();
                    System.out.print("Edad 1: ");
                    edadP1 = sc.nextDouble();
                    System.out.print("Edad 2: ");
                    edadP2 = sc.nextDouble();
                    System.out.print("Edad 3: ");
                    edadP3 = sc.nextDouble();
            
                    sumaEdades = edadP1 + edadP2 + edadP3;
            
                    montoP1 = (edadP1 * montoRepartir) / sumaEdades;
                    montoP2 = (edadP2 * montoRepartir) / sumaEdades;
                    montoP3 = (edadP3 * montoRepartir) / sumaEdades;
            
                    System.out.println("\nRESULTADO");
                    System.out.println("---------");
                    System.out.println("Monto total    : " + montoRepartir);
                    System.out.println("Suma de edades : " + sumaEdades);
                    System.out.println("Monto persona 1: " + montoP1);
                    System.out.println("Monto persona 2: " + montoP2);
                    System.out.println("Monto persona 3: " + montoP3);
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
