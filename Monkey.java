public class Monkey extends RescueAnimal {

    // Class variables
    
    public String species;  // comparable to breed used for Dog
                            // certain species must meet requirements to be trained
                            
    

    
    public float tailLength;
    public float height;
    public float bodyLength;
    public float torsoSize;
    public float skullSize;
    public float neckSize;    
    
    // Constructor
    
    public Monkey() {
        
    }
    
    // Accessor methods
    
    
    public String getSpecies() {
        return species;
    }
    
    public float getTailLength() {
        return tailLength;
    }
    
    public float getHeight() {
        return height;
    }
    
    public float getBodyLength() {
        return bodyLength;
    }
    
    public float getTorsoSize() {
        return torsoSize;
    }
    
    public float getSkullSize() {
        return skullSize;
    }
    
    public float getNeckSize() {
        return neckSize;
    }
    
    // Mutator methods
    
    
    public void setSpecies(String animalSpecies) {
        species = animalSpecies;
        return;
    }
    
    public void setTailLength(float animalTailLength) {
        tailLength = animalTailLength;
        return;
    }
    
    public void setHeight(float animalHeight) {
        height = animalHeight;
        return;
    }
    
    public void setBodyLength(float animalBodyLength) {
        bodyLength = animalBodyLength;
        return;
    }
    
    public void setTorsoSize(float animalTorsoSize) {
        torsoSize = animalTorsoSize;
        return;
    }
    
    public void setSkullSize(float animalSkullSize) {
        skullSize = animalSkullSize;
        return;
    }
    
    public void setNeckSize(float animalNeckSize) {
        neckSize = animalNeckSize;
        return;
    }
    
}