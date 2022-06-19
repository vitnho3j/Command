import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<String> valores = new ArrayList<String>();

    public String getUltimoValor() {
        if(valores.size() == 0){
            return "Lista vazia";
        }
        return this.valores.get(this.valores.size() - 1);
    }

    public List<String> adicionarValor(String valor){
        this.valores.add(valor);
        return valores;

    }

    public void excluirUltimoValor(){
        this.valores.remove(this.valores.size() - 1);
    }

}
