package h.l.demo.chainofresponsibility;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��7��
 * @Description: ְ����ģʽ��������������һ��ִ����һ��ʵ��
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
            System.out.println("indexֵδ�ҵ����ڵ�����");
        }
        if(!handler1.handlerRequest(-1)){
            System.out.println("indexֵδ�ҵ����ڵ�����");
        }
        System.out.println("---------------------------------------------");

        handler1.setHandler(handler3);
        handler1.handlerRequest(1);
        if(!handler1.handlerRequest(13)){
            System.out.println("indexֵδ�ҵ����ڵ�����");
        }
        handler1.handlerRequest(23);
        if(!handler1.handlerRequest(32)){
            System.out.println("indexֵδ�ҵ����ڵ�����");
        }
        if(!handler1.handlerRequest(-1)){
            System.out.println("indexֵδ�ҵ����ڵ�����");
        }

    }
}
/**
 * ���������
 */
abstract class Handler {
    protected Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    /**
     *
     * @param index
     * @return �����Ƿ񱻴���
     */
    abstract public Boolean handlerRequest(int index);
}

/**
 * ���崦����1
 */
class Concretehandler1 extends Handler {

    @Override
    public Boolean handlerRequest(int index) {
        boolean flag = false;
        if(index>=0 && index<=10){
            System.out.println("�����ֵ�ڡ�0-10��֮��");
            flag = true;
        }else if(handler!=null){
            flag = handler.handlerRequest(index);
        }
        return flag;
    }
}
/**
 * ���崦����2
 */
class Concretehandler2 extends Handler {

    @Override
    public Boolean handlerRequest(int index) {
        boolean flag = false;
        if(index>=11 && index<=20){
            System.out.println("�����ֵ�ڡ�11-20��֮��");
            flag = true;
        }else if(handler!=null){
            flag = handler.handlerRequest(index);
        }
        return flag;
    }
}
/**
 * ���崦����3
 */
class Concretehandler3 extends Handler {

    @Override
    public Boolean handlerRequest(int index) {
        boolean flag = false;
        if(index>=21 && index<=30){
            System.out.println("�����ֵ�ڡ�21-30��֮��");
            flag = true;
        }else if(handler!=null){
            flag = handler.handlerRequest(index);
        }
        return flag;
    }
}