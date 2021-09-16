/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraPresio.Model;

/**
 * @author Antonio Miguel Martel
 */
public class Precio {
    
    private int gold;
    private int silver;
    private int bronze;

    public Precio(int gold, int silver, int bronze) {
        if(bronze > 100){
            
            silver += (bronze / 100);
            bronze = bronze % 100;
        }
        
        if(silver > 100){
            
            gold += (silver / 100);
            silver = silver % 100;
            
        }
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }

    @Override
    public String toString() {
        return "Precio: " + gold + "g " + silver + "s " + bronze + "b";
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }
    
}
