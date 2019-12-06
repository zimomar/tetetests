package code;

public class EvaluateurNiveau {
	public static final int BORNE_INF_COURS = 0;
	public static final int BORNE_SUP_COURS = 25;
	public static final int BORNE_INF_EXAM = 0;
	public static final int BORNE_SUP_EXAM = 75;
	public static final int LIM_D_VERS_C = 30;
	public static final int LIM_C_VERS_B = 50;
	public static final int LIM_B_VERS_A = 70;
	
	private static boolean estEntier( String valeur ) {
		try {
			Integer.valueOf(valeur);
		}
		catch( NumberFormatException e ) {
			return false;
		}
		return true;
	}
	
	private static boolean estDansBorne( int valeur , int min , int max ) {
		return ( valeur >= min && valeur <= max );
	}

	public static String evaluerNiveau(String cours, String examen) throws ExceptionValeurNonEntiere, ExceptionValeurHorsBorne {
		// TODO Auto-generated method stub
		if ( ! estEntier( cours )) {
			throw new ExceptionValeurNonEntiere();
		}
		if ( ! estEntier( examen )) {
			throw new ExceptionValeurNonEntiere();
		}
		// Les valeurs sont entieres 
		int iCours = Integer.valueOf( cours );
		if ( ! estDansBorne(iCours, BORNE_INF_COURS , BORNE_SUP_COURS )) {
			throw new ExceptionValeurHorsBorne();
		}
		int iExamen = Integer.valueOf( examen );
		if ( ! estDansBorne(iExamen, BORNE_INF_EXAM , BORNE_SUP_EXAM )) {
			throw new ExceptionValeurHorsBorne();
		}
		
		int somme = iCours + iExamen;
		
		if ( somme < LIM_D_VERS_C ) {
			return "D";
		} else if ( somme < LIM_C_VERS_B ) {
			return "C";
		} else if ( somme < LIM_B_VERS_A ) {
			return "B";
		}
		else return "A";
			
	}

}
