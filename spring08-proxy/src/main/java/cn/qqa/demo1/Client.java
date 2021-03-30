package cn.qqa.demo1;

import java.util.Properties;

public class Client {
    public static void main(String[] args) {
/*
        非代理模式
        Host host = new Host();
        host.rent();
*/
        //房东要出租房子
        Host host = new Host();
        //代理，中介帮房东出租房子，但是，代理一般会有一些附属操作！
        //比如，带看房子、帮收房租、帮签合同
        Proxy proxy = new Proxy(host);
        //客户不用面对房东，直接找中介租房即可！
        proxy.rent();
    }
}
