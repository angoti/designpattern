package substituindo.condicional.por.polimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Cartao {
	private String numero;
	private int mes, ano;

	public Cartao(String numero, int mes, int ano) {
		super();
		this.numero = numero;
		this.mes = mes;
		this.ano = ano;
	}

	public boolean isValido() {
		boolean validadeOK = isValidadeOK(getMes(), getAno());
		if (!validadeOK) {
			throw new ValidadeIncorretaException(this);
		} else {
			String numeroCartaoFormatado = getNumero().replaceAll("\\D", "");
			boolean formatoOK = isFormatoOK(numeroCartaoFormatado);
			if (!formatoOK) {
				return false;
			} else {
				return isNumeroOK(numeroCartaoFormatado);
			}
		}
	}

	private boolean isNumeroOK(String formatado) {
		// ----- NÚMERO -----
		// fórmula de LUHN (http://www.merriampark.com/anatomycc.htm)
		int soma = 0;
		int digito = 0;
		int somafim = 0;
		boolean multiplica = false;

		for (int i = formatado.length() - 1; i >= 0; i--) {
			digito = Integer.parseInt(formatado.substring(i, i + 1));
			if (multiplica) {
				somafim = digito * 2;
				if (somafim > 9) {
					somafim -= 9;
				}
			} else {
				somafim = digito;
			}
			soma += somafim;
			multiplica = !multiplica;
		}
		int resto = soma % 10;
		if (resto == 0) {
			return true;
		} else {
			throw new NumeroIncorretoException(this);
		}
	}

	private boolean isFormatoOK(String numeroCartaoFormatado) {
		if (!numeroCartaoFormatado.matches(formato())) {
			throw new FormatoIncorretoException(this);
		} else
			return true;
	}

	protected abstract String formato();

	private boolean isValidadeOK(int mes, int ano) {
		boolean validadeOK = false;
		// ----- VALIDADE -----
		Date dataValidade = null;
		try {
			dataValidade = new SimpleDateFormat("MM/yyyy").parse(mes + "/" + ano);
		} catch (ParseException e) {
			return false;
		}
		Calendar calValidade = new GregorianCalendar();
		calValidade.setTime(dataValidade);
		// apenas mês e ano são utilizados na validação
		Calendar calTemp = new GregorianCalendar();
		Calendar calHoje = (GregorianCalendar) calValidade.clone();
		calHoje.set(Calendar.MONTH, calTemp.get(Calendar.MONTH));
		calHoje.set(Calendar.YEAR, calTemp.get(Calendar.YEAR));
		validadeOK = calHoje.before(calValidade);
		return validadeOK;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public String getNumero() {
		return numero;
	}

	public static void main(String[] args) {
		try {
			Cartao black = new Mastercard("5536360280967415", 10, 2025);
			System.out.println(black.isValido());
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
}






