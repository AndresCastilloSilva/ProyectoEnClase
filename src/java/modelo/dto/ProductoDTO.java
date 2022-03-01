
package modelo.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ANDRES
 */
public class ProductoDTO implements Serializable{
    
    private int id_prod;
    private String nombre_prod;
    private String descripcion_prod;
    private int und;
    private long valor;

    public ProductoDTO() {
    }

    public ProductoDTO(int id_prod, String nombre_prod, String descripcion_prod, int und, long valor) {
        this.id_prod = id_prod;
        this.nombre_prod = nombre_prod;
        this.descripcion_prod = descripcion_prod;
        this.und = und;
        this.valor = valor;
    }

    public ProductoDTO(String nombre_prod, String descripcion_prod, int und, long valor) {
        this.nombre_prod = nombre_prod;
        this.descripcion_prod = descripcion_prod;
        this.und = und;
        this.valor = valor;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public String getDescripcion_prod() {
        return descripcion_prod;
    }

    public void setDescripcion_prod(String descripcion_prod) {
        this.descripcion_prod = descripcion_prod;
    }

    public int getUnd() {
        return und;
    }

    public void setUnd(int und) {
        this.und = und;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return nombre_prod;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.id_prod;
        hash = 41 * hash + Objects.hashCode(this.nombre_prod);
        hash = 41 * hash + Objects.hashCode(this.descripcion_prod);
        hash = 41 * hash + this.und;
        hash = 41 * hash + (int) (this.valor ^ (this.valor >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductoDTO other = (ProductoDTO) obj;
        if (this.id_prod != other.id_prod) {
            return false;
        }
        if (this.und != other.und) {
            return false;
        }
        if (this.valor != other.valor) {
            return false;
        }
        if (!Objects.equals(this.nombre_prod, other.nombre_prod)) {
            return false;
        }
        if (!Objects.equals(this.descripcion_prod, other.descripcion_prod)) {
            return false;
        }
        return true;
    }
    
    
}
