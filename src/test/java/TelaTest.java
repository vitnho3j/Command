import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelaTest {

    Historico historico;

    Tela tela;

    @BeforeEach
    void setUp(){
        historico = new Historico();
        tela = new Tela();
    }

    @Test
    void deveAdicionarValor(){
        Tarefa adicionarValor = new AdicionarValorHistoricoTarefa(historico);
        tela.executarTarefa(adicionarValor, "Teste");
        assertEquals("Teste", historico.getUltimoValor());
    }

    @Test
    void deveExcluirValor(){
        Tarefa adicionarValor = new AdicionarValorHistoricoTarefa(historico);
        Tarefa excluirValor = new ExcluirValorHistoricoTarefa(historico);
        tela.executarTarefa(adicionarValor, "Teste");
        tela.executarTarefa(excluirValor, null);
        assertEquals("Lista vazia", historico.getUltimoValor());
    }

    @Test
    void deveCancelarAdicaoDeValor(){
        Tarefa adicionarValor = new AdicionarValorHistoricoTarefa(historico);
        tela.executarTarefa(adicionarValor, "Teste");
        tela.cancelarUltimaTarefa();
        assertEquals("Lista vazia", historico.getUltimoValor());
    }
    @Test
    void deveCancelarExclusaoDeValor(){
        Tarefa adicionarValor = new AdicionarValorHistoricoTarefa(historico);
        Tarefa excluirValor = new ExcluirValorHistoricoTarefa(historico);
        tela.executarTarefa(adicionarValor, "Teste");
        tela.executarTarefa(excluirValor, null);
        tela.cancelarUltimaTarefa();
        assertEquals("Teste", historico.getUltimoValor());
    }

}
