public class Espadachim extends Classe {

    public Espadachim(Classe superior) {
        listaHabilidades.add(TipoHabilidadeNormal.getTipoHabilidadeNormal());
        setClasseSuperior(superior);
    }

    public String getDescricaoClasse() {
        return "Golpe de Espadachim Habilidoso";
    }
}
