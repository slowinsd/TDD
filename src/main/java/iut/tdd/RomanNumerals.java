package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		switch (arabe) {
		case"1"	: return "I";
		case "5": return "V";
		case "10":return "X";
		case "50" :return "L";
		case "100":return "C";
		case "500":return "D";
		case "1000" : return "M";
		}
		
		int value = Integer.parseInt(arabe);
		StringBuilder romanNumber = new StringBuilder();
		if(value==5) romanNumber=romanNumber.append("V");
		for (int i = 0 ; i < value; i++) {
			romanNumber.append("I");
		}
		return romanNumber.toString();
	}

	public String convertFromRoman(String roman) {
		switch (roman) {
		case "I": return "1";
		case "V":return "5";
		case "X":return "10";
		case "L":return "50";
		case "C":return "100";
		case "D": return "500";
		case "M":return "1000";
		}
		return "err";
	}
	/*String[]romain=new String[]{"I","V","X","L"};
	String[]chiffre=new String[]{"1","5","10","50"};
	for(int i=0;i<roman.length;i++){
		for(int j=0;i<romain.length;j++){
																																																																																																																																																																																																																																																																																																																																																																																																																												
		}
	}*/
}

