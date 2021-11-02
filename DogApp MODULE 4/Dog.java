
public class Dog {

    // class variables
    // private access modifiers wrap the variables and methods (Encapsulation)
    private String type;
    private String breed;
    private String name;
    private String topTrick; 

    
    // parameterized constructor
	/**calls to 'this' method are instantaneous which thereby eliminates the confusion between attributes and parameters*/
    public Dog (String type, String breed, String name) {
        this.type = type;     
        this.breed = breed; 
        this.name = name;   
        topTrick = "";      
    }

    // methods

    // topTrick setter method
    public void setToptrick(String trick) {
        topTrick = trick;
        
        return; 
    }
    
    // Dog information print method
    public String toString() {
        String temp = "\nDOG DATA\n" + name + " is a " + breed +
                ", a " + type + " dog. \nThe top trick is : " +
                topTrick + ".";
        return temp;
    }

}