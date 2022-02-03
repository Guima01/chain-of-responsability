public class General extends Classe {
    public General(Classe superior) {
        listaHabilidades.add(TipoHabilidadeForte.getTipoHabilidadeForte());
        setClasseSuperior(superior);
    }

    public String getDescricaoClasse() {
        return "Golpe de um  General do exército";
    }
}
