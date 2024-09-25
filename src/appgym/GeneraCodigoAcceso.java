/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appgym;
import java.util.Random;

/**
 *
 * @author newflare
 */
public class GeneraCodigoAcceso {
    public static String generarCodigo() {
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();
        
        for ( int i = 0; i < 5; i++ ) {
            codigo.append( random.nextInt( 10 ) );
        }
        
        return codigo.toString();
    } 
}
