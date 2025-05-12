public class CoinTester
{
    public static void main(String[] args) {

       // Create your program here
       
       Coins piggybank = new Coins(3, 2, 1, 4);
       
       piggybank.bankValue();
       piggybank.bankCount();
      
       piggybank.addQuarter();
       piggybank.bankValue();
       piggybank.bankCount();
       
       piggybank.addQuarter();
       piggybank.bankValue();
       piggybank.bankCount();
       
       piggybank.addDime();
       piggybank.bankValue();
       piggybank.bankCount(); 
       
       piggybank.addPenny();
       piggybank.bankValue();
       piggybank.bankCount(); 
       
       piggybank.addPenny();
       piggybank.bankValue();
       piggybank.bankCount(); 
       
       piggybank.addPenny();
       piggybank.bankValue();
       piggybank.bankCount(); 
       
       piggybank.bankCount(); 
       piggybank.bankValue();
    }
}