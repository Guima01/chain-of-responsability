public class TipoHabilidadePoderosa implements TipoHabilidade{

    private static TipoHabilidadePoderosa tipoHabilidadePoderosa= new TipoHabilidadePoderosa();

    private TipoHabilidadePoderosa() {};

    public static TipoHabilidadePoderosa getTipoHabilidadePoderosa() {
        return tipoHabilidadePoderosa;
    }
}
