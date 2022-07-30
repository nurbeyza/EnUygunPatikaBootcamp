
// Not:Sözel ödevler "resources" doyası altında bulunabilir.

public class AbstractClassMain {
    public static void main(String[] args){

        GTA gta= new GTA();
        gta.Information(3,24, 0.05);
        System.out.println("Game Name:"+gta.getName());
        System.out.println("Game Duration:"+gta.DurationCalculate());
        System.out.println("Game Upload:"+ gta.UploadTime());
        gta.Goodluck();

        System.out.println("***********");

        Sims Sims= new Sims();
        Sims.Information(4,24,0.10);
        System.out.println("Game Name:"+Sims.getName());
        System.out.println("Game Duration:"+Sims.DurationCalculate());
        System.out.println("Game upload:"+ Sims.UploadTime());
        Sims.Goodluck();

    }
}
