package h.l.demo.mediator;

/**
 * 中介者抽象类
 */
abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}

/**
 * 抽象同事类
 */
abstract class Colleague {
    // 每一位同事都应该知道这个中介
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}

/**
 * 具体中介者
 */
class ConcreteMediator extends Mediator {
    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == concreteColleague1) {
            concreteColleague2.Notify(message);
        } else {
            concreteColleague1.Notify(message);
        }
    }
}

/**
 * 具体同事类1
 */
class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void Notify(String message) {
        System.out.println("同事1得到的消息：" + message);
    }
}

/**
 * 具体同事类2
 */
class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void Notify(String message) {
        System.out.println("同事2得到的消息：" + message);
    }
}