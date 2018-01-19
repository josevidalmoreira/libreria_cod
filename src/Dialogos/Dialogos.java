
package Dialogos;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class Dialogos {
    public static String introduceDato(){
  String dato;
        dato=JOptionPane.showInputDialog("introduce el dato");
        return dato;
    }
    /**
     * 
     * @param msg 
     */
    public static void respuesta(String msg){
       
        System.out.println(msg);
        JOptionPane.showInputDialog(msg, "estas seguro");
    }
    public static int datoINT(){
        int dato;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el numero entero");
        dato=sc.nextInt();
        return dato;
    } 
    
    public static float datoFLOAT(){
        float dato;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el numero ");
        dato=sc.nextFloat();
        return dato;
    }
}
