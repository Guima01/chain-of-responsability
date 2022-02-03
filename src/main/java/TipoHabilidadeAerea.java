public class TipoHabilidadeAerea implements TipoHabilidade{

    private static TipoHabilidadeAerea tipoHabilidadeAerea= new TipoHabilidadeAerea();

    private TipoHabilidadeAerea() {};

    public static TipoHabilidadeAerea getTipoHabilidadeAerea() {
        return tipoHabilidadeAerea;
    }
}
