public class AdicionarValorHistoricoTarefa implements Tarefa{

    private Historico historico;

    public AdicionarValorHistoricoTarefa(Historico historico){
        this.historico = historico;
        ;
    }

    public void executar(String valor){
        this.historico.adicionarValor(valor);
    }

    public void cancelar(){
        this.historico.excluirUltimoValor();
    }

}
