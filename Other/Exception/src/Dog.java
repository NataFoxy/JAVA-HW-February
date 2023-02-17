public class Dog {
    private String name;
    private boolean collar=false;
    private boolean food=false;

    public Dog(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name + " " + collar + " " + food;
    }

    public void addCollar(){
        collar = true;
    }
    public void addFood(){
        food = true;
    }

    public String goForAWalk ()
            throws DogCollarException, DogEatException, DogNotReadyForAWalkException{
        String msg = "Успешная прогулка";
        if (collar==false && food==false){
            throw new DogNotReadyForAWalkException("Покормите собаку и наденьте ей ошейник");
        }
            if(collar==false){
                throw new DogCollarException("Без ошейника собаку выгуливать нельзя");
            }
            if(food==false){
                throw new DogEatException("Покормите собаку перед прогулкой");
            }

            return msg;
        }



}
