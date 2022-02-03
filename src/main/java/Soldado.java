public class Soldado extends Classe {

    public Soldado(Classe superior) {
        listaHabilidades.add(TipoHabilidadeFraca.getTipoHabilidadeFraca());
        setClasseSuperior(superior);
    }

    public String getDescricaoClasse() {
        return "Golpe de Soldado do exército";
    }
}
