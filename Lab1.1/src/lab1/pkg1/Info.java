
package lab1.pkg1;

public class Info {
    private String countryName;
    private double countrySquare;
    private int countryPopulation;
    private String capitalName;
    private int capitalPopulation;
    
    private final double plotnostCountry=countryPopulation/countrySquare;
    
    public Info(String countryName, double countrySquare, int countryPopulation){
        this.countryName=countryName;
        this.countrySquare=countrySquare;
        this.countryPopulation=countryPopulation;   
    }
    
    public Info(String countryName, double countrySquare, int countryPopulation, String capitalName, int capitalPopulation){
        this(countryName, countrySquare, countryPopulation);
        this.capitalName=capitalName;
        this.capitalPopulation=capitalPopulation;
    }
    
    
    public String getCountryName(){
        return countryName;
    }
    
    public double getCountrySquare(){
        return countrySquare;
    }
    
    public double getCountryPopulation(){
        return countryPopulation;
    }
    
     public String getCapitalName(){
        return capitalName;
    }
     
     public int getCapitalPopulation(){
        return capitalPopulation;
    }
     
     public double getPlotnostCountry(){
         return plotnostCountry;
     }
     
     public void setCountryName(String countryName){
         if (countryName != null) {this.countryName=countryName;} 
         else {throw new IllegalArgumentException();}   
     }
     
     public void setCountrySquare(double countrySquare){
         if (countrySquare >0.0) {this.countrySquare=countrySquare;} 
         else {throw new IllegalArgumentException();}   
     }
     
     public void setCountryPopulation(int countryPopulation){
         if (countryPopulation >0) {this.countryPopulation=countryPopulation;} 
         else {throw new IllegalArgumentException();}   
     }
     
    
    public void setCapitalName(String capitalName){
         if (capitalName != null) {this.capitalName=capitalName;} 
         else {throw new IllegalArgumentException();}   
     }
    
    public void setCapitalPopulation(int capitalPopulation){
         if (capitalPopulation >0) {this.capitalPopulation=capitalPopulation;} 
         else {throw new IllegalArgumentException();}   
     }
    
    public void capital(String capitalName, int capitalPopulation){
        if(capitalName !=null || capitalPopulation !=0){
            this.capitalName=capitalName;
            this.capitalPopulation=capitalPopulation;
            System.out.println("Nazvanie stolici - " +capitalName+ " naselenie - " +capitalPopulation+ " chelovek");}
        else {System.out.println("Vvedite korrectnie znacheniya v sootvetsvyushix polyax");}
    }
    
    public void print(){
        if (capitalName !=null || capitalPopulation !=0) {System.out.println("Strana - " +countryName+ " ,ploshad - " +countrySquare+
          " kv.km, naselenie - " +countryPopulation+ " chel., stolica - " +capitalName+" , naselenie stolici - " +capitalPopulation+ " chel");} 
        else {System.out.println("Strana - " +countryName+ " ,ploshad - " +countrySquare+
          " kv.km, naselenie - " +countryPopulation+ " chel.");}
    }
    
    public static void printAll(Info[] strani){
        for (Info strana : strani) {
            strana.print();
            System.out.println("");
        }
        
    } 
             
}
