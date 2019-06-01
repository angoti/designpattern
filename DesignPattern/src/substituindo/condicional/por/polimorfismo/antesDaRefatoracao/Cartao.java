package substituindo.condicional.por.polimorfismo.antesDaRefatoracao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cartao {
	public static final String CARTAO_OK = "Cartão válido";
	public static final String CARTAO_ERRO = "Cartão inválido";

	private String numero, validade;
	private String bandeira;

	public Cartao(String numero, String validade, String bandeira) {
		super();
		this.numero = numero;
		this.validade = validade;
		this.bandeira = bandeira;
	}

	public String validar() {

		boolean validadeOK = false;
		// ----- VALIDADE -----
		Date dataValidade = null;
		try {
			dataValidade = new SimpleDateFormat("MM/yyyy").parse(validade);
		} catch (ParseException e) {
			return CARTAO_ERRO;
		}
		Calendar calValidade = new GregorianCalendar();
		calValidade.setTime(dataValidade);
		// apenas mês e ano são utilizados na validação
		Calendar calTemp = new GregorianCalendar();
		Calendar calHoje = (GregorianCalendar) calValidade.clone();
		calHoje.set(Calendar.MONTH, calTemp.get(Calendar.MONTH));
		calHoje.set(Calendar.YEAR, calTemp.get(Calendar.YEAR));
		validadeOK = calHoje.before(calValidade);

		if (!validadeOK) {
			return CARTAO_ERRO;
		} else {
			// ---- PREFIXO E TAMANHO -----
			String formatado = "";
			// remove caracteres não-numéricos
			for (int i = 0; i < numero.length(); i++) {
				char c = numero.charAt(i);
				if (Character.isDigit(c)) {
					formatado += c;
				}
			}
			boolean formatoOK = false;
			switch (bandeira) {
			case "mastercard":
				formatoOK = formatado.matches("^5[1-5]\\d{14}$");
				break;
			case "visa":
				formatoOK = formatado.matches("^4(\\\\d{12}|\\\\d{15})$");
				break;
			}

			if (!formatoOK) {
				return CARTAO_ERRO;
			} else {
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
				} // fim for
				int resto = soma % 10;
				if (resto == 0) {
					return CARTAO_OK;
				} else {
					return CARTAO_ERRO;
				}
			} // fim do if/else
		} // fim if/else
	}// fim método validar
}// fim da classe