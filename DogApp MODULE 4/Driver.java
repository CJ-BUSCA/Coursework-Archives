
public class Driver {

    public static void main(String[] args) {
        
        // corgi object instantiated using the syntax below
        Corgi corgi = new Corgi ("cattle herding", "Pembroke Welsh Corgi", "Wales", 31, 12);
        
        // top trick for corgi set
        corgi.setToptrick("Fetching ball");
        
        // output prints to console
        System.out.println(corgi.toString());
    }

}