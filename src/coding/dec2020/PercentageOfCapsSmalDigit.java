package coding.dec2020;

public class PercentageOfCapsSmalDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		percentageCalculation("Gyanendra89");


	}

	public static void percentageCalculation(String str)
	{
		char [] charArray = str.toCharArray();

		int Upercase =0;
		int Lowercase =0;
		int Digit =0;
		int Special =0;
		int len = charArray.length;
		for(int i=0;i<len;i++)
		{
			Character ch = charArray[i];

			if(Character.isUpperCase(ch))
			{
				Upercase++;
			}
			else if(Character.isLowerCase(ch))
			{
				Lowercase++;
			}
			else if(Character.isDigit(ch))
			{
				Digit++;
			}
			else
			{
				Special++;
			}
		}

		Long UperCasePercentage = (long) ((Upercase*100)/len);
		Long LowerCasePercentage = (long) ((Lowercase*100)/len);
		Long DigitPercentage = (long) ((Digit*100)/len);
		Long SpecialPercentage = (long) ((Special*100)/len);

		System.out.println("Upercase % :---->"+UperCasePercentage);
		System.out.println("Lowercase % :---->"+LowerCasePercentage);
		System.out.println("Digit % :---->"+DigitPercentage);
		System.out.println("Special % :---->"+SpecialPercentage);

		System.out.println(UperCasePercentage+LowerCasePercentage+DigitPercentage+SpecialPercentage);
	}

}
