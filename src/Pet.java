public abstract class Pet {
    protected String name;
    protected float tiredness = 1;
    protected float hunger = 1;
    protected float excitation = 1;
    protected boolean exists = true;
    public String getName(){
        return name;
    }
    public void setName(String a){
        name = a;
    }
    public abstract String play();
    public abstract String feed();
    public abstract String sleep();

    public String iterate(){
        if(excitation <= 0){
            exists = false;
            return name + " gets bored and leaves.";
        }
        else if(hunger <= 0){
            exists = false;
            return  name + " became too hungry... whoops.";

        }
        else if(tiredness <= 0){
            sleep();
            return name + " became so tired it passed out.";
        }
        else{
            return name+ " waits complacently.";
        }
    }

}
