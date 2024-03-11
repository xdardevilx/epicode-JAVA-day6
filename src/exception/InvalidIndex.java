package exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvalidIndex extends Exception {
    private static final Logger log = LoggerFactory.getLogger(InvalidNumber.class);

    public InvalidIndex(int number) {
        log.error("Invalid Index: " + number);
    }
}

