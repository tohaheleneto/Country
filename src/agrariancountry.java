public class agrariancountry extends Country
{
    int CountofFarmers;
    int ExportOfCereals;
    int Defence=10000;
    String MainExport;
   public agrariancountry()
    {
        CountofFarmers=15000000;
        ExportOfCereals=10000;
        MainExport="rice";
    }
    public agrariancountry(int CountofFarmers,int ExportOfCereals,String MainExport)
    {
        this.CountofFarmers=CountofFarmers;
        this.ExportOfCereals=ExportOfCereals;
        this.MainExport=MainExport;
    }
    public void SellCereal()
    {
       budget += ExportOfCereals;
    }
    public void HireFarmers()
    {
        CountofFarmers=CountofFarmers+10000;
    }
    public void ShowFullInfo()
    {
        ShowInfo();
        System.out.println("CountofFarmers: "+CountofFarmers);
        System.out.println(" ExportOfCereals: "+ExportOfCereals);
        System.out.println(" MainExport: "+MainExport);
    }

}
