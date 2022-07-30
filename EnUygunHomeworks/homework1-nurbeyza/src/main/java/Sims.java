public class Sims extends Game{
    private double duration;
    private double day;
    private double upload;

    public void Information(double duration, double day, double upload){
        Name("Sims");
        this.duration=duration;
        this.day=day;
        this.upload=day;

    }
    @Override
    public double DurationCalculate(){
        return (day/duration);
    }

    @Override
    public double UploadTime(){
        return (upload);
    }
}
