package esercizio3.exception1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BancaException extends Exception {
    private static final Logger log = LoggerFactory.getLogger(BancaException.class);

    public BancaException(String mesaseg) {
        log.error(mesaseg);
    }
}
