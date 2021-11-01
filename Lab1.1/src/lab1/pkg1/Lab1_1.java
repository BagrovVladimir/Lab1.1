
package lab1.pkg1;

public class Lab1_1 {

    public static void main(String[] args) {
        
        Info strana1 = new Info("Russia", 1710000, 146700000 , "Moscow", 12600000);
        Info strana2 = new Info("Finland", 338000, 5500000 , "Helsinki", 655000);
        Info strana3 = new Info("France", 643800, 67800000 , "Paris", 2100000);
        Info strana4 = new Info("Andorra", 467, 85400, "Andorra la Vella", 22600);
        Info strana5 = new Info("Singapore", 725, 5700000);

        Info [] strani={strana1, strana2, strana3, strana4,strana5};
        
        Info.printAll(strani);
        
        System.out.println("");
        
        
    }
    
} 
