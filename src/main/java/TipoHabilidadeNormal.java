public class TipoHabilidadeNormal implements TipoHabilidade{

    private static TipoHabilidadeNormal tipoHabilidadeNormal= new TipoHabilidadeNormal();

    private TipoHabilidadeNormal() {};

    public static TipoHabilidadeNormal getTipoHabilidadeNormal() {
        return tipoHabilidadeNormal;
    }
}