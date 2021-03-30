package cn.qqa.demo1;

public class Proxy implements Rent{
    //原则：少用继承，多用组合
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        contract();
        fare();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房！");
    }

    //收房租
    public void fare(){
        System.out.println("中介收房租！");
    }

    //签合同
    public void contract(){
        System.out.println("签租赁合同！");
    }




}
