public abstract class Game {
    private String name;

    public abstract double DurationCalculate();
    public abstract double UploadTime();


    public void Goodluck(){
        System.out.println("GOOD LUCK!!");
    }
    public void Name (String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }


}
