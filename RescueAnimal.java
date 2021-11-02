

import java.util.Date;

public class RescueAnimal {

    // Class variables
	
    private String name;
    private String type;
    private String gender;
    private int age;
    private float weight;
    private Date acquisitionDate;
    private Date statusDate;
    private String acquisitionSource;
    private Boolean reserved;

    private String trainingLocation;
    private Date trainingStart;
    private Date trainingEnd;
    private String trainingStatus;

    private String inServiceCountry;
    private String inServiceCity;
    private String inServiceAgency;
    private String inServicePOC;
    private String inServiceEmail;
    private String inServicePhone;
    private String inServicePostalAddress;

    // Default constructor

    public RescueAnimal() {
    
    }

    // Accessor Methods Getters

    public String getName() {
        return name;
    }
    
    public String getType() {
        return type;
    }
    
    public String getGender() {
        return gender;
    }
    
    public int getAge() {
        return age;
    }
    
    public float getWeight() {
        return weight;
    }
    
    public Date getAcquisitionDate() {
        return acquisitionDate;
    }
    
    public Date getStatusDate() {
        return statusDate;
    }
    
    public String getAcquisitionSource() {
        return acquisitionSource;
    }
    
    public boolean getReserved() {
        return reserved;
    }
    
    public String getTrainingLocation() {
        return trainingLocation;
    }
    
    public Date getTrainingStart() {
        return trainingStart;
    }
    
    public Date getTrainingEnd() {
        return trainingEnd;
    }
    
    public String getTrainingStatus() {
        return trainingStatus;
    }
    
    public String getInServiceCountry() {
        return inServiceCountry;
    }
    
    public String getInServiceCity() {
        return inServiceCity;
    }
    
    public String getInServiceAgency() {
        return inServiceAgency;
    }
    
    public String getInServicePOC() {
        return inServicePOC;
    }
    
    public String getInServiceEmail() {
        return inServiceEmail;
    }
    
    public String getInServicePhone() {
        return inServicePhone;
    }
    
    public String getInServicePostalAddress() {
        return inServicePostalAddress;
    }
    
    // Mutator Methods Setters
    
    public void setName(String animalName) {
        name = animalName;
        return;
    }
    
    public void setType(String animalType) {
        type = animalType;
        return;
    }
    
    public void setGender(String animalGender) {
        gender = animalGender;
        return;
    }
    
    public void setAge(int animalAge) {
        age = animalAge;
        return;
    }
    
    public void setWeight(float animalWeight) {
        weight = animalWeight;
        return;
    }
    
    public void setAcquisitionDate(Date animalAcquisitionDate) {
        acquisitionDate = animalAcquisitionDate;
        return;
    }
    
    public void setStatusDate(Date animalStatusDate) {
        statusDate = animalStatusDate;
        return;
    }
    
    public void setAcquisitionSource(String animalAcquisitionSource) {
        acquisitionSource = animalAcquisitionSource;
        return;
    }
    
    public void setReserved(boolean isReserved) {
        reserved = isReserved;
        return;
    }
    
    public void setTrainingLocation(String animalTrainingLocation) {
        trainingLocation = animalTrainingLocation;
        return;
    }
    
    public void setTrainingStart(Date animalTrainingStart) {
        trainingStart = animalTrainingStart;
        return;
    }
    
    public void setTrainingEnd(Date animalTrainingEnd) {
        trainingEnd = animalTrainingEnd;
        return;
    }
    
    public void setTrainingStatus(String animalTrainingStatus) {
        trainingStatus = animalTrainingStatus;
        return;
    }
    
    public void setInServiceCountry(String serviceCountry) {
        inServiceCountry = serviceCountry;
        return;
    }
    
    public void setInServiceCity(String serviceCity) {
        inServiceCity = serviceCity;
        return;
    }
    
    public void setInServiceAgency(String serviceAgency) {
        inServiceAgency = serviceAgency;
        return;
    }
    
    public void setInServicePOC(String servicePOC) {
        inServicePOC = servicePOC;
        return;
    }
    
    public void setInServiceEmail(String serviceEmail) {
        inServiceEmail = serviceEmail;
        return;
    }
    
    public void setInServicePhone(String servicePhone) {
        inServicePhone = servicePhone;
        return;
    }
    
    public void setInServicePostalAddress(String servicePostalAddress) {
        inServicePostalAddress = servicePostalAddress;
        return;
    }
    
}