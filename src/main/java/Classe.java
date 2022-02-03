import java.util.ArrayList;

public abstract class Classe {

    protected ArrayList listaHabilidades = new ArrayList();
    private Classe classeSuperior;

    public Classe getJogadorSuperior() {
        return classeSuperior;
    }

    public void setClasseSuperior(Classe classeSuperior) {
        this.classeSuperior = classeSuperior;
    }

    public abstract String getDescricaoClasse();

    public String usarHabilidade(Habilidade habilidade) {
        if (listaHabilidades.contains(habilidade.getTipoHabilidade())) {
            return getDescricaoClasse();
        }
        else {
            if (classeSuperior != null) {
                return classeSuperior.usarHabilidade(habilidade);
            }
            else
            {
                return "Sem Classe para usar Golpe";
            }
        }
    }
}