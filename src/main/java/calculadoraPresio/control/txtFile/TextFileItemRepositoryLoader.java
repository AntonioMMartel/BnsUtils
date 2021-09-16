/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraPresio.control.txtFile;

import calculadoraPresio.Model.Item;
import calculadoraPresio.control.RepositoryLoader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Antonio Miguel Martel
 * 
 * Extrae los datos del txt y los pone en un mapa
 * 
 */
public class TextFileItemRepositoryLoader implements RepositoryLoader {
    
    private final String dir = "precios.txt";

    @Override
    public Map<String, Item> load() {
        
        List<String> lines = Collections.emptyList();
        
        // Generamos lista con todos los objetos
        try {
            lines = Files.readAllLines(Paths.get(dir), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Error al leer el fichero:");
            System.out.println(e.toString());
        }
        
        // Generamos mapa de datos para el repositorio
        Map<String, Item> datos = new TreeMap<>();
        
        // Extraemos cada valor del txt
        Item item;
        for (String itemString : lines) {
            item = TextToItemParser.parse(itemString);
            datos.put(item.getNombre(),item);
        }
        return datos;
        
    }
    
    
}
