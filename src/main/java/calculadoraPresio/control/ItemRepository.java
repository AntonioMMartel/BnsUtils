/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraPresio.control;

import calculadoraPresio.Model.Item;
import java.util.Map;
import java.util.TreeMap;


/**
 * @author Antonio Miguel Martel
 * 
 * Solo habra un repositorio de items
 * 
 * La busqueda se implementa en la interfaz.
 * 
 * Usamos Singleton. Tambien le aplicaremos iterator.
 * 
 * Igualemente cuando use bases de datos este amigo morira xd
 */
public class ItemRepository {

    private static Map<String,Item> itemRepo;

    public ItemRepository() {
       // Especificamos una mapa default
       itemRepo = new TreeMap<>();
    }
    
    public static void add(Item item){
       ItemRepository.itemRepo.put(item.getNombre(), item);
    }
    
    public static Map<String, Item> get() {
        return itemRepo;
    }

}
