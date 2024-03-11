package esercizio2.exception1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvalidLiterFuel extends Exception {
    private static final Logger log = LoggerFactory.getLogger(InvalidLiterFuel.class);

    public InvalidLiterFuel(int number) {
        log.error("il numero di litri consumati non è corretto non puo' essere : " + number);
    }
}
