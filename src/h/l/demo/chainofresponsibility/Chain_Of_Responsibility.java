package h.l.demo.chainofresponsibility;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年3月7日
 * @Description: 职责链模式：可以灵活决定下一步执行哪一个实例
 */
public class Chain_Of_Responsibility {
	public static void main(String[] args) {
        Handler handler3 = new Concretehandler3();
        Handler handler2 = new Concretehandler2();
        handler2.setHandler(handler3);
        Handler handler1 = new Concretehandler1();
        handler1.setHandler(handler2);

        handler1.handlerRequest(1);
        handler1.handlerRequest(13);
        handler1.handlerRequest(23);
        if(!handler1.handlerRequest(32)){
            System.out.println("index值未找到所在的区间");
        }
        if(!handler1.handlerRequest(-1)){
            System.out.println("index值未找到所在的区间");
        }
        System.out.println("---------------------------------------------");

        handler1.setHandler(handler3);
        handler1.handlerRequest(1);
        if(!handler1.handlerRequest(13)){
            System.out.println("index值未找到所在的区间");
        }
        handler1.handlerRequest(23);
        if(!handler1.handlerRequest(32)){
            System.out.println("index值未找到所在的区间");
        }
        if(!handler1.handlerRequest(-1)){
            System.out.println("index值未找到所在的区间");
        }

    }
}
/**
 * 处理抽象类
 */
abstract class Handler {
    protected Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    /**
     *
     * @param index
     * @return 请求是否被处理
     */
    abstract public Boolean handlerRequest(int index);
}

/**
 * 具体处理类1
 */
class Concretehandler1 extends Handler {

    @Override
    public Boolean handlerRequest(int index) {
        boolean flag = false;
        if(index>=0 && index<=10){
            System.out.println("输入的值在【0-10】之间");
            flag = true;
        }else if(handler!=null){
            flag = handler.handlerRequest(index);
        }
        return flag;
    }
}
/**
 * 具体处理类2
 */
class Concretehandler2 extends Handler {

    @Override
    public Boolean handlerRequest(int index) {
        boolean flag = false;
        if(index>=11 && index<=20){
            System.out.println("输入的值在【11-20】之间");
            flag = true;
        }else if(handler!=null){
            flag = handler.handlerRequest(index);
        }
        return flag;
    }
}
/**
 * 具体处理类3
 */
class Concretehandler3 extends Handler {

    @Override
    public Boolean handlerRequest(int index) {
        boolean flag = false;
        if(index>=21 && index<=30){
            System.out.println("输入的值在【21-30】之间");
            flag = true;
        }else if(handler!=null){
            flag = handler.handlerRequest(index);
        }
        return flag;
    }
}