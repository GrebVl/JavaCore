package order;

public class TooMuchSaleException extends RuntimeException {
    public TooMuchSaleException(String msg) {
        super(msg);
    }
}
