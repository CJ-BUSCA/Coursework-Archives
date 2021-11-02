//Importting all the necessary classes for our driver

import java.util.Scanner;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Driver {

    public static void main(String[] args) {

        //This object is a scanner that tracks user input

        Scanner scnr = new Scanner(System.in);

        // Class variables

        String optionsMenu =    "Please select an option.\n"
                              + "R - Process request for new service animal\n"
                              + "U - Update existing animal records\n"
                              + "P - Print animals by training phase\n"
                              + "I - Intake new animal\n"
                              + "T - Transfer animal/place in service\n"
                              + "E - Process end of service (retirement/death)\n"
                              + "Q - Quit application\n";

        // The variable is captured from the user's input


        char userSelection;

        /*animalStore is an ArrayList of RescueAnimal
        * RescueAnimal data is stored within this array
        */

        ArrayList<RescueAnimal> animalStore = new ArrayList<RescueAnimal>();

        System.out.println("Welcome to Grazioso Salvare.");

        /* Start of application with options
        * Tracks user inputs
        */

        System.out.println(optionsMenu);


        /* Captures the user input, converts it into upper case format,
         * the first element is grabbed to ensure
         * the method input is uniform for branching decisions.
         */

        userSelection = scnr.nextLine().toUpperCase().charAt(0);

        /* It continues to run until the user decides to quit
         * A while loop is used instead of a for loop because the
         * number of loop iterations is unknown at onset entry
         * into the loop.
         */

        while (userSelection != 'Q') {

            /* This loop ensures a valid selection
             * A while loop is used instead of a for loop because the
             * number of loop iterations is unknown at onset entry
             * into the loop.
             */

            while (userSelection != 'R' && userSelection != 'U' && userSelection != 'P' && userSelection != 'I' &&
                    userSelection != 'T' && userSelection != 'E' && userSelection != 'Q') {
                 System.out.println("Invalid selection");
                 System.out.println(optionsMenu);
                 userSelection = scnr.nextLine().toUpperCase().charAt(0);
             }

            /* This breaks out the main application loop if user quits from
             * validation loop
             */

            if(userSelection == 'Q') {
                break;
            }

            /* This is nested the while loop so as to continue to be
             * available each time the option menu is presented
             * after each function execution until the user quits the application.
             * basically more options!
             */

            if(userSelection == 'R') {
                System.out.println("FIXME: Process request for a rescue animal (Out of Assignment Scope)");
            }

            if(userSelection == 'U') {
                System.out.println("FIXME: Update information on existing animals (Out of Assignment Scope)");
            }

            if(userSelection == 'P') {
                System.out.println("FIXME: Print animals by training phase (Out of Assignment Scope)");
            }

            /* This adds new animals to ArrayList/RescueAnimal.
             * User must enter animal type
             * object type is created and added to animalStore.
             * The intakeAnimal() method is then called and the newly created
             * animal object must be passed as its argument.
             */

            if(userSelection == 'I') {
                String animalTypeMenu = "Please select the animal type for intake.\n"
                                      + "1 - Dog\n"
                                      + "2 - Monkey";

                System.out.println(animalTypeMenu);

                /* The input requires to be
                 * captured as a String and converted to an
                 * int using Integer.parseInt.
                 */

                int intakeSelection = Integer.parseInt(scnr.nextLine());

                // Loop to validate user input

                while(intakeSelection != 1 && intakeSelection != 2) {
                    System.out.println("Invalid selection.");
                    System.out.println(animalTypeMenu);

                    /* The input requires to be
                     * captured as a String and converted to an
                     * int using Integer.parseInt.
                     */

                    intakeSelection = Integer.parseInt(scnr.nextLine());
                    System.out.println("Selection in Invalid Loop: " + intakeSelection);
                }

                if(intakeSelection == 1) {
                    System.out.println("Dog Intake.");
                    Dog newAnimal = new Dog();
                    newAnimal.setType("dog");

                    // add the animal to the data store
                    animalStore.add(newAnimal);

                    // call method to add animal
                    intakeAnimal(newAnimal);
                }
                else {
                    System.out.println("Monkey Intake.");
                    Monkey newAnimal = new Monkey();
                    newAnimal.setType("monkey");

                    // add the animal to the data store
                    animalStore.add(newAnimal);

                    // call method to add animal
                    intakeAnimal(newAnimal);
                }

            }

            if(userSelection == 'T') {
                System.out.println("FIXME: Transfer animal/place in service (Out of Assignment Scope)");
            }

            if(userSelection == 'E') {
                System.out.println("FIXME: Process end of service (retirement/death) (Out of Assignment Scope)");
            }

            System.out.println(optionsMenu);
            userSelection = scnr.nextLine().toUpperCase().charAt(0);
        }

        System.out.println("Goodbye. Grazioso Salvare, Jeff Perkinson \u00A92019");

        scnr.close(); //close the Scanner object to conserve resources

        return; //return even when return type is void to clear the stack frame

    }

    /* Methods to process rescures, updates,
    *and animal matrix are out of scope for this Assignment
    */

    // This method intakes the animal

    public static void intakeAnimal(RescueAnimal animal) {

        //Scanner object to capture user input

        Scanner readInput = new Scanner(System.in);

        /* Calls to class setters allows user to set certain
         * fields on objects. The fields essential to new animal
         * intake will be available to set through this method.
         * Fields such as those regarding to training or placing in
         * service will be exposed through other methods, such as
         * record updates or transferring an animal into
         * service. According to the the spec, when a new animal is taken
         * in, the breed, gender, age, weight, date, and location acquired
         * are recorded.  Additionally, dogs are given a status of 'intake'
         * before training starts.  The assumption is made the same will be done
         * for monkeys, so this function sets trainingStatus to 'intake'.
         */

        String intakeAnimalOptionsMenu =     "Please select an option.\n"
                                        + "B - Add breed/species\n"
                                        + "G - Add gender\n"
                                        + "A - Add age\n"
                                        + "W - Add weight\n"
                                        + "D - Enter acquisition date\n"
                                        + "S - Add acquistion source\n"
                                        + "R - Return to main menu\n";

        // Char variable to hold user's choice to drive branching
        char userSelection;

        /* These arrays represent eligible dog breeds and monkey species
         * per the spec. These arrays force the right
         * breed/species assignment when setting the breed/species
         * value on a particular object.
         */

        String[] dogBreeds = {"American pit bull terrier", "Beagle", "Belgian malinois",
                              "Border collie", "Bloodhound", "Coonhound", "English springer spaniel",
                              "German shepherd", "German shorthaired pointer", "Golden retriever",
                              "Labrador retriever", "Nova Scotia duck tolling retriever",
                              "Rough collie", "Smooth collie"};

        String[] monkeySpecies = {"Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey",
                                  "Tamarin"};

        animal.setTrainingStatus("intake");

        System.out.println("Add new " + animal.getType() + ".");
        System.out.println(intakeAnimalOptionsMenu);

        /* Captures the user input, converts it into upper case format,
         * the first element is grabbed to ensure
         * the method input is uniform for branching decisions.
         */

        userSelection = readInput.nextLine().toUpperCase().charAt(0);

        // continue running until users opts to return to main

        while (userSelection != 'R') {

            /* Loop to ensure the user enters a valid selection.
             * A while loop is used instead of a for loop because the
             * number of loop iterations is unknown at onset entry
             * into the loop.
             */

            while (userSelection != 'B' && userSelection != 'G' && userSelection != 'A' && userSelection != 'W' &&
                    userSelection != 'D' && userSelection != 'S' && userSelection != 'R') {
                 System.out.println("Invalid selection");
                 System.out.println(intakeAnimalOptionsMenu);
                 userSelection = readInput.nextLine().toUpperCase().charAt(0);
             }

            /* Breaks the main loop if user
             * quits from the validation loop.
             */

            if(userSelection == 'R') {
                break;
            }

            /* This is the execute functionality
             * nested in a while loop to continue to present
             * option menu after each function
             * until user returns to the main menu.
             */

            if(userSelection == 'B') {

                // Capture animal object type to drive breed/species validation and input
                String animalType = animal.getType();

                // String variable to capture user's breed input for validation and setter argument
                String breedInput = "";

                // Boolean variable to determine whether input is valid
                boolean isValidBreed = false;

                if(animalType == "dog") {
                    setDogBreed((Dog) animal, dogBreeds, readInput, breedInput, isValidBreed);
                }
                else {
                    setMonkeySpecies((Monkey) animal, monkeySpecies, readInput, breedInput, isValidBreed);
                }
            }

            if(userSelection == 'G') {
                String genderPrompt =     "Please enter animal gender\n"
                                        + "Male\n"
                                        + "Female";
                System.out.println(genderPrompt);
                String animalGender = readInput.nextLine().toLowerCase();

                System.out.println(animalGender);

                while(!animalGender.equals("male") && !animalGender.equals("female")) {
                    System.out.println("Invalid Selection.");
                    System.out.println(genderPrompt);
                }

                animal.setGender(animalGender);
                System.out.println("Animal gender has been set to " + animal.getGender());
            }

            if(userSelection == 'A') {
                System.out.println("Enter animal's age.");
                int animalAge = readInput.nextInt();
                readInput.nextLine();   // called to capture the carriage return not
                                        //captured by nextInt().
                animal.setAge(animalAge);
                System.out.println("Animal age has been set to " + animal.getAge());
            }

            if(userSelection == 'W') {
                System.out.println("Enter animal's weight.");
                float animalWeight = readInput.nextFloat();
                readInput.nextLine();   // called to capture the carriage return not
                                        // captured by nextInt().
                animal.setWeight(animalWeight);
                System.out.println("Animal weight has been set to " + animal.getWeight());
            }

            if(userSelection == 'D') {

                System.out.print("Enter acquisition date (DD/MM/YYYY): ");

                Date animalAcquisitionDate = null;
                try {
                    animalAcquisitionDate = new SimpleDateFormat("ddMMyyyy").parse(readInput.nextLine().replaceAll("/", ""));
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                animal.setAcquisitionDate(animalAcquisitionDate);
                System.out.println("Acquisiiton date has been set to " + animal.getAcquisitionDate());
            }

            if(userSelection == 'S') {
                System.out.println("Enter source of acquisition.");
                String animalAcquisitionSource = readInput.nextLine();
                animal.setAcquisitionSource(animalAcquisitionSource);
                System.out.println("Acquisition source has been set to " + animal.getAcquisitionSource());
            }

            System.out.println(intakeAnimalOptionsMenu);
            userSelection = readInput.nextLine().toUpperCase().charAt(0);
        }

        return; //return even when return type is void to clear the stack frame

        }

    // Method to validate is String input is a valid entry in a String array
    public static boolean isValidString(String[] stringArray, String inputString) {
        boolean isValid = false;
        for(int i = 0; i < stringArray.length; ++i) {
            if(inputString.toLowerCase().equals(stringArray[i].toLowerCase())) {
                isValid = true;
            }
        }
        return isValid;
    }

    // Method to output valid entries from String array
    public static void validEntryChecker(String[] stringArray) {
        System.out.println("Valid entries are:");
        for(int i = 0; i < stringArray.length; ++i) {
            System.out.println(stringArray[i]);
        }
        return;
    }

    // Method to set Dog breed
    public static void setDogBreed(Dog dog, String[] stringArray, Scanner readInput, String breedInput, boolean isValidBreed) {
        System.out.println("Please enter a breed.");
        validEntryChecker(stringArray);
        breedInput = readInput.nextLine();
        isValidBreed = isValidString(stringArray, breedInput);
        while(!isValidBreed) {
            System.out.println("Invalid entry.");
            System.out.println("Please enter a breed.");
            validEntryChecker(stringArray);
            breedInput = readInput.nextLine();
            isValidBreed = isValidString(stringArray, breedInput);
        }
        dog.setBreed(breedInput);
        System.out.println("Breed has been set to " + dog.getBreed());
    }

    // Method to set Monkey Species
    public static void setMonkeySpecies(Monkey monkey, String[] stringArray, Scanner readInput, String breedInput, boolean isValidBreed) {
        System.out.println("Please enter a species.");
        validEntryChecker(stringArray);
        breedInput = readInput.nextLine();
        isValidBreed = isValidString(stringArray, breedInput);
        while(!isValidBreed) {
            System.out.println("Invalid entry.");
            System.out.println("Please enter a species.");
            validEntryChecker(stringArray);
            breedInput = readInput.nextLine();
            isValidBreed = isValidString(stringArray, breedInput);
        }
        monkey.setSpecies(breedInput);
        System.out.println("Species has been set to " + monkey.getSpecies());
    }

    /* Methods to out process animals, display in-service animals
    and reports from in-service agencies out of scope for the Assignment
    */


}
