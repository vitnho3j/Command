public class ExcluirValorHistoricoTarefa implements Tarefa{

    private Historico historico;
    private String ultimoValorExcluido;

    public ExcluirValorHistoricoTarefa(Historico historico){
        this.historico = historico;
        ;
    }

    public void executar(String valor){
        this.ultimoValorExcluido = this.historico.getUltimoValor();
        this.historico.excluirUltimoValor();
    }

    public void cancelar(){
        this.historico.adicionarValor(ultimoValorExcluido);
    }

}
