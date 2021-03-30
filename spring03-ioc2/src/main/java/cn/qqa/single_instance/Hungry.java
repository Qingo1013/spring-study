package cn.qqa.single_instance;
import java.awt.datatransfer.StringSelection;
/**
 *  饿汉式
 * 很饿，一开始就new出来
 */
public class Hungry {

    //可能会浪费内存空间
    byte [] data1 = new  byte[1024*1024];
    byte [] data2 = new  byte[1024*1024];
    byte [] data3 = new  byte[1024*1024];
    byte [] data4 = new  byte[1024*1024];


    private Hungry(){

    }

    private final static Hungry HUNGRY = new Hungry();

    public static Hungry getInstance(){
        return HUNGRY;
    }

}
