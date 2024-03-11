package exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class InvalidNumber extends Exception {
    private static final Logger log = LoggerFactory.getLogger(InvalidNumber.class);

    public InvalidNumber(int number) {
        log.error("il numero inserito non deve superare il 10: " + number);
    }
}
