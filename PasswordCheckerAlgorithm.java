class Solution {
    public int strongPasswordChecker(String password) {
        char[] array = password.toCharArray();
        char[] array2 = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] array3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Boolean valid = false;
        Boolean valid2 = false;
        Boolean valid4 = false;
        int steps = 0;
        int count = 0;
        int number = 1;
        int repeatCounter = 0;
        if(password.length() > 1 && password.length() < 21){
            for(int i = 0; i < array2.length; i++){
                for(int y = 0; y < array.length; y++){
                    if(array2[i] == array[y])
                    {
                    valid = true; 
                    }}}
            for(int i = 0; i < array3.length; i++){
                for(int e = 0; e < array.length; e++){
                    if(array3[i] == array[e]){
                    valid2 = true;
                    }}}  
           for(int b = 0; b < array.length; b++){
               if(array.length > 1 && number < array.length){
                    if(array[b] == array[number]){
                        repeatCounter++;
                    }
                    if(array[b] != array[number]){
                        repeatCounter = 0;
                    }
                    if(repeatCounter > 1){
                        repeatCounter = 0;
                        count++;
                    }}
                number++; }}
        if(valid == false)
		{
			steps++;
		}
		if(valid2 == false)
		{
            steps++;
        }
        if(password.length() == 0){
            steps = 6;
        }
        else if(password.length() == 1){
            steps = 5;
        }
        else if(password.length() == 2){
            steps = 4;
        }
        else if(password.length() == 3){
            steps = 3;
            for(int o = 0; o < count; o++){
                   steps++;
            }
        }
        else if(password.length() == 5){
            steps = 1;
            for(int o = 0; o < count; o++){
                   steps++;
            }
        }
        else if(password.length() == 6){
                for(int o = 0; o < count; o++){
                   steps++;
                }
        }
        else{
            for(int v = 0; v < count; v++){
            steps++;
        }}
        if(password.length() > 20)
        {
            int length = password.length() - 20;
            for(int o = 0; o < count; o++){
                   steps++;
            }
        }
          return steps;
}
}