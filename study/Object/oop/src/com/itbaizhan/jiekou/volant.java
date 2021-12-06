package com.itbaizhan.jiekou;

public interface volant {
    int Fly_Hight=100;
    void fly();
}
interface Honest{
    void HelpOther();
}

class GoodMan implements Honest{

    @Override
    public void HelpOther() {
        System.out.println("help others");
    }
}

class Angel implements Honest,volant{

    @Override
    public void fly() {

    }

    @Override
    public void HelpOther() {

    }
}
