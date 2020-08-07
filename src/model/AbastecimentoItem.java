package model;

/**
 * Modelo de relacionamento soclitação de abastecimento x item
 * @author Ruan
 */
public class AbastecimentoItem {
    
    private Item                     item;
    private SolicitacaoAbastecimento solicitacaoAbastecimento;
    private int                      quantidade;

    public AbastecimentoItem() {
        
    }

    public AbastecimentoItem(Item item, SolicitacaoAbastecimento solicitacaoAbastecimento, int quantidade) {
        this.item = item;
        this.solicitacaoAbastecimento = solicitacaoAbastecimento;
        this.quantidade = quantidade;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public SolicitacaoAbastecimento getSolicitacaoAbastecimento() {
        return solicitacaoAbastecimento;
    }

    public void setSolicitacaoAbastecimento(SolicitacaoAbastecimento solicitacaoAbastecimento) {
        this.solicitacaoAbastecimento = solicitacaoAbastecimento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Abastecimento x Item: " + "Item: " + item + ", SolicitacaoAbastecimento: " + solicitacaoAbastecimento + ", Quantidade: " + quantidade;
    }

}