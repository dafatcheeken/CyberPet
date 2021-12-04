public class Ninja extends Pet {

    @Override
    public String play() {
        super.excitation = 1;
        super.tiredness -= 0.2;
        super.hunger -= 0.2;
        return super.name + " vanishes into the darkness then appears later looking very pleased.";
    }

    @Override
    public String feed() {
        super.hunger = 1;
        super.excitation -= 0.2;
        super.tiredness -= 0.2;
        return "Wow pizza! "+ super.name +"'s favorite";
    }

    @Override
    public String sleep() {
        super.tiredness = 1;
        super.excitation -= 0.2;
        return super.name + " takes a nap.";
    }
}