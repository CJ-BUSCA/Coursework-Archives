public class Corgi extends Dog {

    // additional class variables
    // private access modifiers wrap the variables and methods
    private int weight;
    private int age;

    // parameterized constructor
    public Corgi(String type, String breed, String name, int pounds, int years) {

        // Dog (super)class constructor
        super(type, breed, name);
        weight = pounds;
        age = years;
    }

    // mutator methods
    
    // weight is set to the argument given
    public void setWeight(int pounds) {
        weight = pounds;
        return; 
    }
    
    // age is set to the argument given
    public void setAge(int years) {
        age = years;
        return;
    }

    // override toString() method to provide further dog info
    @Override
    public String toString() {
        return (super.toString() + "\nThe Corgi is " + age +
                " years old and weighs " + weight + " pounds.");
    }

}