/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraPresio.control;

import calculadoraPresio.Model.Item;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public interface RepositoryLoader {
    
    public Map<String, Item> load();
    
    
}
