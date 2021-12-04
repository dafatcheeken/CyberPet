public class Dog extends Pet {

    @Override
    public String play() {
        super.excitation = 1;
        super.tiredness -= 0.2;
        super.hunger -= 0.2;
        return super.name + " runs around barking.";
    }

    @Override
    public String feed() {
        super.hunger = 1;
        super.excitation -= 0.2;
        super.tiredness -= 0.2;
        return super.name + " enjoys their dog food.";
    }

    @Override
    public String sleep() {
        super.tiredness = 1;
        super.excitation -= 0.2;
        return super.name + " takes a nap.";
    }
}
