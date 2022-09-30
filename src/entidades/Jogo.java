package entidades;

/**
 *
 * @author fernando.capeletti
 */
public class Jogo extends Item {
    private int memoria;
    private String tipo;

    public Jogo(Categoria categoria) {
        super(categoria);
    }
    /**
     * @return the memoria
     */
    public int getMemoria() {
        return memoria;
    }

    /**
     * @param memoria the memoria to set
     */
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
