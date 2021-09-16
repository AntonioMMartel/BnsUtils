/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraPresio.control.txtFile;

import calculadoraPresio.Model.Item;
import calculadoraPresio.Model.Precio;

/**
 * @author Antonio Miguel Martel
 * 
 * Pasa de String a Item
 */
public class TextToItemParser {

    public static Item parse(String string) {
        String[] item = string.split(";");
        // id:nombre:precio
        for (String i : item) {
            
            System.out.println(i);
            
        }
        return new Item(Integer.parseInt(item[0]), new Precio(Integer.parseInt(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4])), item[1]);
        
    }
    
    
    
}
