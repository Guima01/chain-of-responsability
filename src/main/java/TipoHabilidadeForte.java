public class TipoHabilidadeForte implements TipoHabilidade{

    private static TipoHabilidadeForte tipoHabilidadeForte= new TipoHabilidadeForte();

    private TipoHabilidadeForte() {};

    public static TipoHabilidadeForte getTipoHabilidadeForte() {
        return tipoHabilidadeForte;
    }
}
