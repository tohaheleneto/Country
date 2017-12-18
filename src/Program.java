public class Program
{   public static void main(String[] args)
    {
        Country a = new Country();
        Country b = new Country("Elisaveta","GreatBritan","Monarchy");
        Country c = new Country("Trumph","USA",9834000,1857000000,"Republic");
        a.ShowInfo();
        c.ShowName();
        c.ShowSize();
        c.ShowLeader();
        c.ShowTypeOfAuthority();
        c.ShowCount();
        MilitaristicCountry d = new MilitaristicCountry();
        d.ShowName();
        d.ShowCount();
        MilitaristicCountry e = new MilitaristicCountry(1000000,100500,"NuclearWeapon");
        agrariancountry f = new agrariancountry();
        agrariancountry g = new agrariancountry(100000,12000,"millet");
        f.ShowFullInfo();
        g.SellCereal();
        e.ShowMilitaristicinfo();
        e.DeclearWar(g);
        g.ShowFullInfo();
    }
}
