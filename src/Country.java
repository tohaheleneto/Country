public class Country
{   private static int CountOfCountry;
    String Gov;
    String name;
    int SizeKM;
    String typeofauthority;
    int budget;//million usd
    public Country()
    {   CountOfCountry++;
        Gov="Putin";
        name = "Russia";
        SizeKM=17100000;
        typeofauthority="Monarchy";
        budget=145000;
    }
    public Country(String Gov,String name,String typeofauthority)
    {
        CountOfCountry++;
        this.Gov=Gov;
        this.name = name;
        this.typeofauthority=typeofauthority;
    }
    public Country(String Gov,String name,int SizeKM,int budget,String typeofauthority)
    {   CountOfCountry++;
        this.Gov=Gov;
        this.name = name;
        this.SizeKM=SizeKM;
        this.budget=budget;
        this.typeofauthority=typeofauthority;
    }
    public void ShowLeader()
    {
        System.out.println("Leader is "+Gov);
    }
    public void ShowInfo()
    {
        System.out.println("Leader: "+Gov+" name: " +name+" Size(KM) "+SizeKM+" type of authority "
                +typeofauthority +  " budget: "+budget +" CountOfCountry:" + CountOfCountry);
    }
    public void ShowSize()
    {
        System.out.println(" Size(KM) "+SizeKM);
    }
    public void ShowTypeOfAuthority()
    {
        System.out.println("type of authority "+typeofauthority);
    }
    public void ShowName()
    {
        System.out.println("name: " +name);
    }
    public void ShowCount()
    {
        System.out.println("Count of country:" + CountOfCountry);
    }



}

