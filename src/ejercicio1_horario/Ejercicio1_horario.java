/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_horario;

import java.util.Scanner;

/**
 *
 * @author Rafael Moreno
 */
public class Ejercicio1_horario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear un horario de usted de cualquier día de la semana, ej: 6 Despertar, 7 Clase LP1, 
        8 Clase LP1, 9 Clase Estructuras, 10 …, 21 Dormir, leer un valor de 1  al 24 validar e imprimir 
        la acción que realiza en su horario.*/
        
        Scanner entrada = new Scanner(System.in);
        
        String Day = "lunes";
        int numero_hora;
        
        System.out.println("Ingrese un digito del 1 al 24 para obtener su actividad");
        numero_hora = entrada.nextInt();
        
        switch (numero_hora) {
            case 1:
                System.out.println("Acostarse a dormir");
                break;
            case 6:
                System.out.println("Levantarte y prepararte para clase");
                break;
            case 7:
                System.out.println("Entrar a clase de administración general");
                break;
            case 8:
                System.out.println("Entrar a clase de organización computacional");
                break;
            case 9:
                System.out.println("Ultima Clase de organización computacional");
                break;
            case 10:
                System.out.println("Preparar algo de desayunar y entrar a clase de fisica");
                break;
            case 11:
                System.out.println("Continuar en clase de fisica, es la ultima hora");
                break;    
            case 12:
                System.out.println("Tomar un descanso, ya no hay más clases por hoy");
                break;
            case 13:
                System.out.println("Usar un rato el telefono para jugar");
                break;
            case 14:
                System.out.println("Ir a buscar a mi prima");
                break;
            case 15:
                System.out.println("Almorzar con la familia");
                break;
            case 16:
                System.out.println("Tomar una pequeña siesta");
                break;    
            case 17:
                System.out.println("Bañarme");
                break;
            case 18:
                System.out.println("Hacer mi tarea de programación");
                break;
            case 19:
                System.out.println("Tomar un descanso");
                break;
            case 20:
                System.out.println("Continuar tarea de programación");
                break;
            case 21:
                System.out.println("Entregar la tarea a tiempo");
                break;
            case 22:
                System.out.println("Preparar algo para cenar");
                break;
            case 23:
                System.out.println("Ver televisión");
                break;
            case 24:
                System.out.println("Navegar un rato viendo videos");
                break;
            default:
                System.out.println("Estar dormido");
        }
    }
    
}
