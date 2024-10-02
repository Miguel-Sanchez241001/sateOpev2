package pe.bn.com.sate.ope.transversal.util.constantes;

public class RegexConstants {
	public static final String NUMBERS = "\\d+";
	public static final String NUMBERS_OR_EMPTY = "^$|\\d+";
	public static final String HHMMSS_FORMAT = "^(?:2[0-3]|[01][0-9]):[0-5][0-9]:[0-5][0-9]$";
	public static final String LETTERS = "^[A-Za-z]+$";
	public static final String PASSWORD_SECURITY = "^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{1,}$";

	public static final String ALPHANUMERIC = "^[A-Za-z0-9]+$";
	public static final String ALPHANUMERIC_OR_EMPMTY = "^$|^[A-Za-z0-9]+$";
	public static final String SECURITY = "^(?=(?:.*\\d){1})(?=(?:.*[A-Z]){1})(?=(?:.*[a-z]){1})\\$";

	public static final String ZERO_OR_0NE = "0|1";
	public static final String NOT_EMPTY_SPACE = "^\\S+$";
	public static final String EMPTY_SPACE = "\\s+";
}
