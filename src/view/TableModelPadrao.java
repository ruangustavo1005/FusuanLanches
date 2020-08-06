package view;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * Classe dinâmica 100% funcional 2020 atualizado crackeado pt-br só as melhores pc fraco sem placa [SOLUCIONADO!!] (DEU CERTO?)
 * @author Ruan
 */
public class TableModelPadrao<Type> extends AbstractTableModel {
    
    private ArrayList<Type> modelos;
    private Type            modelo;

    public TableModelPadrao(Type modelo) {
        this.modelo = modelo;
        this.modelos = new ArrayList<>();
    }

    public TableModelPadrao(ArrayList<Type> modelos) {
        this.modelos = modelos;
    }
    
    public ArrayList<Type> getModelos() {
        return this.modelos;
    }

    public void setModelos(ArrayList<Type> modelos) {
        this.modelos = modelos;
    }

    @Override
    public int getRowCount() {
        return this.getModelos().size();
    }

    @Override
    public int getColumnCount() {
        return this.getQuantidadeAtributos();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.getAtributo(this.modelos.get(rowIndex), columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return this.getNomeAtributo(column);
    }
    
    private int getQuantidadeAtributos() {
        if (this.modelo != null) {
            return this.modelo.getClass().getDeclaredFields().length;
        }
        return this.modelos.get(0).getClass().getDeclaredFields().length;
    }

    private String getNomeAtributo(int pos) {
        if (this.modelo != null) {
            return this.modelo.getClass().getDeclaredFields()[pos].getName();
        }
        return this.modelos.get(0).getClass().getDeclaredFields()[pos].getName();
    }
    
    private Object getAtributo(Type model, int pos){
        Object retorno = null;
        String nome   = this.getNomeAtributo(pos);
        String metodo = "get" + nome.substring(0, 1).toUpperCase() + nome.substring(1);
        try {
            retorno = model.getClass().getMethod(metodo).invoke(model);
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {}
        return retorno;
    }
    
}