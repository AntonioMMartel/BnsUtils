/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraPresio;

import calculadoraPresio.Model.Item;
import calculadoraPresio.control.txtFile.TextFileItemRepositoryLoader;
import java.util.Map;

/**
 * @author Antonio Miguel Martel
 */
public class CalculadoraBnsTxt {
    
    public static void main(String[] args) {
        // Creamos repositorio
        TextFileItemRepositoryLoader repoLoader = new TextFileItemRepositoryLoader();

        // Carga datos al repositorio
        Map<String, Item> data = repoLoader.load();
        
        
    }
    
    
            

}
