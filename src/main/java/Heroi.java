public class Heroi extends Classe {
    public Heroi(Classe superior) {
        listaHabilidades.add(TipoHabilidadePoderosa.getTipoHabilidadePoderosa());
        setClasseSuperior(superior);
    }

    public String getDescricaoClasse() {
        return "Golpe do Guerreiro mais poderoso da nação";
    }
}
