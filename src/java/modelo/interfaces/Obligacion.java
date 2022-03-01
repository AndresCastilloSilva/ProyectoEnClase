
package modelo.interfaces;

import java.util.List;

/**
 *
 * @author ANDRES
 */
public interface Obligacion <Cualquiercosa>{
    

        
    public boolean create(Cualquiercosa nuevo);
    
    public List<Cualquiercosa> readALL();
    
    public Cualquiercosa read(Cualquiercosa filter);
    
    public boolean update(Cualquiercosa item);
    
    public boolean delete (Cualquiercosa item);
}
