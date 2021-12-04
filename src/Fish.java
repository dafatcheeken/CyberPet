public class Fish extends Pet {

    @Override
    public String play() {
        super.excitation = 1;
        super.tiredness -= 0.1;
        super.hunger -= 0.1;
        return super.name + " swims around.";
    }

    @Override
    public String feed() {
        super.hunger = 1;
        super.excitation -= 0.2;
        super.tiredness -= 0.1;
        return super.name + " enjoys their flakes.";
    }

    @Override
    public String sleep() {
        super.tiredness = 1;
        super.excitation -= 0.2;
        return super.name + " takes a nap.";
    }

    public String iterate(){
        if(excitation <= 0){
            return name + " would leave if it could however it is stuck in a tank.";
        }
        else if(hunger <= 0){
            super.exists = false;
            return  name + " became too hungry... whoops.";
        }
        else if(tiredness <= 0){
            sleep();
            return name + " became so tired it passed out.";
        }
        else{
            return name+ " waits complacently";
        }
    }
}