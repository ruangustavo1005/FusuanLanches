package dao;

import java.util.ArrayList;

/**
 *
 * @author Ruan
 */
public class Dao<Type> {
    
    private Type            model;
    private ArrayList<Type> lista;

    public Dao() {
        
    }

    public Type getModel() {
        return model;
    }

    public void setModel(Type model) {
        this.model = model;
    }

    public ArrayList<Type> getLista() {
        return lista;
    }

}