public class TipoHabilidadeFraca implements TipoHabilidade{

    private static TipoHabilidadeFraca tipoHabilidadeFraca = new TipoHabilidadeFraca();

    private TipoHabilidadeFraca() {};

    public static TipoHabilidadeFraca getTipoHabilidadeFraca() {
        return tipoHabilidadeFraca;
    }
}
