package h.l.demo.mediator;

/**
 * �н��߳�����
 */
abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}

/**
 * ����ͬ����
 */
abstract class Colleague {
    // ÿһλͬ�¶�Ӧ��֪������н�
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}

/**
 * �����н���
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
 * ����ͬ����1
 */
class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void Notify(String message) {
        System.out.println("ͬ��1�õ�����Ϣ��" + message);
    }
}

/**
 * ����ͬ����2
 */
class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void Notify(String message) {
        System.out.println("ͬ��2�õ�����Ϣ��" + message);
    }
}