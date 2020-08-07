package view;

import interfaces.ListagemParcial;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import util.StringUtils;

/**
 * Classe dinâmica 100% funcional 2020 atualizado crackeado pt-br só as melhores pc fraco sem placa [SOLUCIONADO!!] (DEU CERTO?)
 * @author Ruan
 */
public class TableModelPadrao<Type> extends AbstractTableModel {
    
    private ArrayList<Type>   modelos;
    private Type              modelo;
    private ArrayList<String> atributos;

    public TableModelPadrao(Type type) {
        try {
            this.modelo    = (Type) type.getClass().newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
        }
//        System.out.println(modelo.toString());
        this.modelos   = new ArrayList<>();
        this.atributos = new ArrayList<>();
        for (Field field :  modelo.getClass().getDeclaredFields()) {
            this.atributos.add(field.getName());
        }
        if (modelo instanceof ListagemParcial) {
            for (String atributo : ((ListagemParcial) modelo).getCamposIgnorar()) {
                this.atributos.remove(atributo);
            }
        }
    }
    
    public ArrayList<Type> getModelos() {
        return this.modelos;
    }

    public void setModelos(ArrayList<Type> modelos) {
        this.modelos = modelos;
    }

    public void remove(int i) {
        modelos.remove(i);
        fireTableRowsDeleted(i, i);
    }

    public void att(int i) {
        fireTableRowsUpdated(i, i);
    }

    public Type get(int i) {
        return modelos.get(i);
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
        return StringUtils.ucfirst(this.getNomeAtributo(column));
    }
    
    protected int getQuantidadeAtributos() {
        return this.atributos.size();
    }

    protected String getNomeAtributo(int pos) {
        return this.atributos.get(pos);
    }
    
    protected Object getAtributo(Type model, int pos){
        Object retorno = null;
        String nome   = this.getNomeAtributo(pos);
        String metodo = "get" + StringUtils.ucfirst(nome);
        try {
            retorno = model.getClass().getMethod(metodo).invoke(model);
        } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {}
        return retorno;
    }
    
}