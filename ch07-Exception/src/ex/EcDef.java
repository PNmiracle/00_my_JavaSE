package ex;

public class EcDef extends RuntimeException {
    static final long serialVersionUID = -3387516915129948L;

    public EcDef() {
    }

    public EcDef(String message) {
        super(message);
    }
}
