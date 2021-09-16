/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraPresio.control.txtFile;

/**
 * @author Antonio Miguel Martel
 * 
 * Para escribir en el txt de precios
 * 
 * Y si eso en el de precios tambien
 * 
 */
public class TextFileWriter {
    /**
     * Cambia un dato que hay en el txt por uno nuevo
     * Aqui hay potencial para guardar el dato anterior en un historial PENDIENTE
     * @return true -> exito
     *         false -> error
     * 
     * Cambia la linea donde esta id con nueva
     * 
     * Buscara la id del item (primer valor)
     * 
     * Si, va a buscar por esa id linea por linea
     * 
     * Si, es una basura de metodo
     * 
     * Si, deberia de estar usando una base de datos
     * 
     * No, no es tan ineficiente porque habra maximo 5.000 elementos
     * 
     * Y con 1 billon me tarda 25 milisegundos xd
     * 
     * 
     */
    public static boolean update(String id, String nueva){
        
        // Miramos si existe
        
        // Lo cambiamos
        
        return false;
    }
    
    /**
     * Pone un dato en el txt
     * @return true -> exito
     *         false -> error
     * 
     * Si ya existe dicho registro -> error
     */
    public static boolean write(){
        
        // Miramos si esa id ya existe -> Si existe error
        
        
        
        // Ponemos el nuevo dato
        
        
        
        return false;
    }
    
    /**
     * Mira si la posicion de un registro en el txt
     * @return int -> en que linea esta el registro
     *         -1 -> error (no existe)
     * 
     */
    
    public static int pos(int id){
        
        
        
        
        return -1;
    }
    
}
