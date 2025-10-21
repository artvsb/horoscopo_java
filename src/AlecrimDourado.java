public class AlecrimDourado {
	private String nome;
	private int diaNasc;
	private Meses mesNasc;
	private Signos signo;

	public AlecrimDourado(int diaNasc, Meses mesNasc) {
		this.diaNasc = diaNasc;
		this.mesNasc = mesNasc;
	}

	public Signos verificarSigno() {
			if (((diaNasc >= 22) && (diaNasc <= 30) && (mesNasc == Meses.SETEMBRO)) || ((diaNasc < 23) && (mesNasc == Meses.OUTUBRO))) {
				signo = Signos.LIBRA;
			} else if (((diaNasc >= 23) && (diaNasc <= 31) && (mesNasc == Meses.OUTUBRO)) || ((diaNasc < 22) && (mesNasc == Meses.NOVEMBRO))) {
				signo = Signos.ESCORPIÃO;
			} else if (((diaNasc >= 22) && (diaNasc <= 30) && (mesNasc == Meses.NOVEMBRO)) || ((diaNasc < 21) && (mesNasc == Meses.DEZEMBRO))) {
				signo = Signos.SAGITÁRIO;
			} else if (((diaNasc >= 21) && (diaNasc <= 31) && (mesNasc == Meses.DEZEMBRO)) || ((diaNasc < 20) && (mesNasc == Meses.JANEIRO))) {
				signo = Signos.CAPRICÓRNIO;
			} else if (((diaNasc >= 20) && (diaNasc <= 31) && (mesNasc == Meses.JANEIRO)) || ((diaNasc < 19) && (mesNasc == Meses.FEVEREIRO))) {
				signo = Signos.AQUÁRIO;
			} else if (((diaNasc >= 19) && (diaNasc <= 29) && (mesNasc == Meses.FEVEREIRO)) || ((diaNasc < 21) && (mesNasc == Meses.MARÇO))) {
				signo = Signos.PEIXES;
			} else if (((diaNasc >= 21) && (diaNasc <= 31) && (mesNasc == Meses.MARÇO)) || ((diaNasc < 20) && (mesNasc == Meses.ABRIL))) {
				signo = Signos.ÁRIES;
			} else if (((diaNasc >= 20) && (diaNasc <= 30) && (mesNasc == Meses.ABRIL)) || ((diaNasc < 21) && (mesNasc == Meses.MAIO))) {
				signo = Signos.TOURO;
			} else if (((diaNasc >= 21) && (diaNasc <= 31) && (mesNasc == Meses.MAIO)) || ((diaNasc < 21) && (mesNasc == Meses.JUNHO))) {
				signo = Signos.GÊMEOS;
			} else if (((diaNasc >= 21) && (diaNasc <= 30) && (mesNasc == Meses.JUNHO)) || ((diaNasc < 23) && (mesNasc == Meses.JULHO))) {
				signo = Signos.CÂNCER;
			} else if (((diaNasc >= 23) && (diaNasc <= 31) && (mesNasc == Meses.JULHO)) || ((diaNasc < 23) && (mesNasc == Meses.AGOSTO))) {
				signo = Signos.LEÃO;
			} else if (((diaNasc >= 23) && (diaNasc <= 31) && (mesNasc == Meses.AGOSTO)) || ((diaNasc < 23) && (mesNasc == Meses.SETEMBRO))) {
				signo = Signos.VIRGEM;
			} else {
				return null; // ou lançar IllegalArgumentException
			}
			return signo;
		}
	}
