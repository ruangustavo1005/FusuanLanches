package dao;

import java.util.ArrayList;

/**
 *
 * @author Ruan
 */
public class Dao<Type> {
    
    private ArrayList<Type> lista;

    public Dao() {
        this.lista = new ArrayList<>();
    }

    public ArrayList<Type> getLista() {
        return lista;
    }

    public void add(Type object) {
        this.getLista().add(object);
    }

    public void remove(Type object) {
        this.getLista().remove(object);
    }
    
}