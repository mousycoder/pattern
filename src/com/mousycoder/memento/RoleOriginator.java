package com.mousycoder.memento;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/23 4:07 PM
 */
public class RoleOriginator {

    private int live = 100;

    /**
     * 攻击力
     */
    private int attack = 50;

    public void display() {
        System.out.println("开始=======");
        System.out.println("生命力 : " + live);
        System.out.println("攻击力 : " + attack);
        System.out.println("结束========");
    }

    public void fight() {
        this.attack = attack + 2;
        this.live = live - 10;
    }

    public RoleStateMemento saveState(){
        return new RoleStateMemento(live,attack);
    }

    public void recoveryState(RoleStateMemento memento){
        this.attack = memento.getAttack();
        this.live = memento.getLive();
    }


    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
