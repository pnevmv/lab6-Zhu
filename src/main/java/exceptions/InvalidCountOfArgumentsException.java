package exceptions;

public class InvalidCountOfArgumentsException extends Exception {

    /**
     * Конструктор
     *
     * @param msg показываемое сообщение
     */
    public InvalidCountOfArgumentsException(String msg) {
        super(msg);
    }

}
