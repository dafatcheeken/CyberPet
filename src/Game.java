import java.util.LinkedList;

public class Game {
    private LinkedList<Pet> pets = new LinkedList<Pet>();
    private Interface i = new Interface();

    public static final int DOG = 1;
    public static final int FISH = 2;
    public static final int NINJA = 3;

    public void startGame(){
        while(true){
            Interface.output("Would you like to");
            Interface.output("1. Interact With a pet");
            Interface.output("2. Adopt a new pet");
            int selection = Interface.getSelection();
            if(selection == 1)
                interactWithPet();
            else if(selection == 2)
                adoptPet();

        }

    }

    private void interactWithPet() {
        if(pets.size() == 0){
            Interface.output("There are no pets to interact with");
            return;
        }
        Pet pet = choosePet();
        int selection = 0;
        while(true){
            Interface.output("What do you want to do");
            Interface.output("1. Play With Pet");
            Interface.output("2. Feed Pet");
            Interface.output("3. Let Pet sleep");
            Interface.output("4. Choose a different pet");
            selection = Interface.getSelection();
            if(selection == 1)
                Interface.output(pet.play());
            else if(selection == 2)
                Interface.output(pet.feed());
            else if(selection == 3)
                Interface.output(pet.sleep());
            else
                break;
            Interface.output(pet.iterate());
            if(pet.exists = false){
                pets.remove(pet);
                break;
            }
        }

    }

    private void adoptPet(){
        int selection = 0;
        Pet p;
        while(true){
            Interface.output("Would you like to adopt:");
            Interface.output("1. A Dog");
            Interface.output("2. A Fish");
            Interface.output("3. A Ninja");
            selection = Interface.getSelection();
            if(selection == DOG)
                p = new Dog();
            else if(selection == FISH)
                p = new Fish();
            else if(selection == NINJA)
                p = new Ninja();
            else
                continue;
            pets.add(p);
            Interface.output("Write a name for your pet");
            p.setName(Interface.getText());
            break;
        }
    }
    private Pet choosePet(){
        Pet current = null;
        while(true) {
            Interface.output("Which pet would you like to interact with:");
            for (Pet p : pets) {
                Interface.output(p.getName());
            }
            String name = Interface.getText();

            for (Pet p : pets) {
                if (name.equals(p.getName())) {
                    current = p;
                }
            }
            if (current == null) {
                Interface.output("Pet not found");
            }
            else{
                break;
            }
        }
        return current;
    }

}
