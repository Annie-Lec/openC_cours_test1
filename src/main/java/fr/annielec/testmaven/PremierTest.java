package fr.annielec.testmaven;

import org.apache.commons.lang3.StringUtils;

/*Une fois la dépendance integrée penser à faire alt+F5*/
public class PremierTest {

	public static void main(String[] args) {
		String unTexteSuperLong = "Ceci est un texte trop long qui doit être raccourci obligatoirement pour tenir sur une seule ligne";

		System.out.println(unTexteSuperLong);
		String unTextRaccourci = StringUtils.abbreviate(unTexteSuperLong, 31);
		System.out.println(unTextRaccourci);

	}

}
