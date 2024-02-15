
package cola;

import java.util.LinkedList;

/**
 *
 * @author johan.angulo
 */
public class Cola  <T extends Base> {
    
    private LinkedList <T> elementos;
    
    public Cola(){
        elementos = new LinkedList<>();
    }
    public void encolar(T elemento){
   
        elementos.addLast(elemento);
    
    }
    public T desencolar(){
        return elementos.removeFirst();
        }
     
    public boolean estaVacia(){
        return elementos.isEmpty();
    
    }
    
}
