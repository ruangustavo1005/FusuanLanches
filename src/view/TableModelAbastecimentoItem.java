package view;

import model.AbastecimentoItem;

/**
 *
 * @author Ruan
 */
public class TableModelAbastecimentoItem extends TableModelPadrao<AbastecimentoItem>{
    
    public TableModelAbastecimentoItem(AbastecimentoItem modelo) {
        super(modelo);
    }

    @Override
    protected int getQuantidadeAtributos() {
        return super.getQuantidadeAtributos() - 1;
    }

    @Override
    public String getColumnName(int column) {
        if (super.getNomeAtributo(column).equals("solicitacaoAbastecimento")) {
            return super.getColumnName(column + 1);
        }
        return super.getColumnName(column);
    }
    
}