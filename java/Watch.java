class Watch
{
    String name;
    int price,quantity;
    public void watchName(String n)
    {
        name=n;
    }
    public void watchPrice(int p)
    {
        price=p;
    }
    public void watchQuantity(int q)
    {
        quantity=q;
    }
    public void watchInfo()
    {
        System.out.println("watch name="+name+"\tprice="+price+"\tquantity="+quantity);
    }
}
class watch1{
    public static vaoid main(String[]args)
    {
        Watch w=new Watch();
        w.watchName("Titan");
        w.watchPrice(3000);
        w.watchQuantity(2);
        w.watchInfo();
    }
}