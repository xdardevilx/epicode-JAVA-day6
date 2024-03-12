package esercizio3;

import esercizio3.exception1.BancaException;

public class ContoOnLine extends ContoCorrente {
	double maxPrelievo;

	ContoOnLine(String titolare, double saldo, double maxP) {
		super(titolare, saldo);
		this.maxPrelievo = maxP;
	}

	void stampaSaldo() {

		System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
				+ " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
	}

	void preleva(double x) throws BancaException {
		if (x > maxPrelievo) {
			throw new BancaException("Il prelievo non è dispobile");
		}
		super.preleva(x);

	}
}
