public class pattern {
    public static void main(String[] args) {
        
        int i, j, k;
        i = 1;
        k = 1;
        int counter = 0;
    
        while (counter != 10)
        {
            for (j = 1; j <= i; j+=2)
            {
                k = i % 4;                
                System.out.println(counter+" "+k); 
                counter++;
                if (counter == 10) {
                    break;
                }                                                     
            }
            i++;
            
        }

    }
}