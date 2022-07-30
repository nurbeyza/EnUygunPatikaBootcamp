public class GTA extends Game{
    private double duration;
    private double day;
    private double upload;

    public void Information(double duration, double day, double upload){
        Name("GTA");
        this.duration=duration;
        this.day=day;
        this.upload=upload;

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
