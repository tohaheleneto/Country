public class MilitaristicCountry extends Country
{
    int SoldiersCount;
    int WeaponPower;
    String MainWeapon;
     public  MilitaristicCountry()
    {SoldiersCount=15000;
     WeaponPower=98;
     MainWeapon="Ak-47";
    }
    public  MilitaristicCountry(int SoldiersCount,int WeaponPower,String MainWeapon)
    {   this.SoldiersCount=SoldiersCount;
        this.WeaponPower=WeaponPower;
        this.MainWeapon=MainWeapon;
    }
    public void DeclearWar(agrariancountry a)
    {
        budget+= a.budget * (SoldiersCount*WeaponPower-a.Defence*a.CountofFarmers);
        a.budget -=a.budget * (SoldiersCount*WeaponPower-a.Defence*a.CountofFarmers);
    }
    public void ShowMilitaristicinfo()
    {
        System.out.print("SoldiersCount: "+SoldiersCount);
        System.out.print(" WeaponPower: "+WeaponPower);
        System.out.print(" MainWeapon: "+MainWeapon);
    }
}
