

//This algorithm checks if the password entered contains 1 lowercase,
//1 uppercase, and 1 special character, and that the password is at least 6 digits
//and less than 21 digits


public class PasswordCheckerAlgorithm
{
	public static void main(String[] args) {
	    //String password = "a@31Vv";
        char[] array = password.toCharArray();
        char[] array2 = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] array3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] array4 = "!@#$%^&*()_+-=,?./".toCharArray();
        Boolean valid = false;
        Boolean valid2 = false;
        Boolean valid3 = false;
        Boolean valid4 = false;
        int steps = 0;
        int count = 0;
        int number = 1;
        int repeatCounter = 0;
		
		for( ; ; )
		{
			System.out.println("Please enter a password");
			Scanner myObj = new Scanner(System.in);
			String password = myObj.nextLine();
			if(password.length() > 1 && password.length() < 21){
				for(int i = 0; i < array2.length; i++){
					for(int y = 0; y < array.length; y++){
						if(array2[i] == array[y])
						{
						valid2 = true; 
						}}}
				for(int i = 0; i < array3.length; i++){
					for(int e = 0; e < array.length; e++){
						if(array3[i] == array[e]){
						valid3 = true;
						}}}
				for(int i = 0; i < array4.length; i++){
					for(int e = 0; e < array.length; e++){
						if(array4[i] == array[e]){
						valid4 = true;
						}}}
				/**
			   for(int b = 0; b < array.length; b++){
				   if(array.length > 1 && number < array.length){
						if(array[b] == array[number]){
							repeatCounter++;
						}
						if(array[b] != array[number]){
							repeatCounter = 0;
						}
						if(repeatCounter > 1){
							valid = false;
						}}
					number++; }}
				**/
			if(valid2 == true)
			{
				if(valid3 == true)
				{
					if(valid4 == true)
					{
						if(array.length > 5 && array.length < 21)
						{
							valid = true;
						}
					}
				}            
			}
			
			if(valid2 == false)
			{
				valid = false;
			}
			if(valid3 == false)
			{
				valid = false;
			}
			if(valid4 == false)
			{
				valid = false;
			}    
			
			if(password.length() == 0){
				System.out.println("No password has been entered, please enter a password");
			}
			if(password.length() > 20){
				System.out.println("Your password is longer than 20 digits, make a shorter password");
			}
			  }
			if(valid == true)
			{
				System.out.println(valid);
				System.out.println("Your password is valid");
				break;
			}
			if(valid == false)
			{
				System.out.println(valid);
				System.out.println("Your password is not valid");
			}
			
		}
		
		
}
}
