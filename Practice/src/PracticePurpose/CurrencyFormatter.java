package PracticePurpose;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;


public class CurrencyFormatter {

	public static void main(String[] args) {
		BigDecimal amount = new BigDecimal(19319.333);

		/* Format amount in US format which is the default */
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		System.out.println("US: " + defaultFormat.format(amount));

		/* Format amount in French Currency format*/
		Locale france = new Locale("fr", "FR");
		NumberFormat franceFormat = NumberFormat.getCurrencyInstance(france);
		System.out.println("France: " + franceFormat.format(amount));

		/* Format amount in Great Britain Currency format*/
		Locale britain = new Locale("en", "GB");
		NumberFormat britainFormat = NumberFormat.getCurrencyInstance(britain);
		System.out.println("UK: " + britainFormat.format(amount));

		/* Format amount in German Currency format*/
		Locale german = new Locale("de", "DE");
		NumberFormat germanFormat = NumberFormat.getCurrencyInstance(german);
		System.out.println("German: " + germanFormat.format(amount));

		/* Format amount in Indian Currency format*/
		Locale indian = new Locale("en", "IN");
		NumberFormat indianFormat = NumberFormat.getCurrencyInstance(indian);
		System.out.println("Indian: " + indianFormat.format(amount));
	}
}
