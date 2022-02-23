package com.mousycoder.memento;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/23 4:10 PM
 */
public class RoleStateMemento {

    private int live ;

    /**
     * 攻击力
     */
    private int attack;

    public RoleStateMemento(int live, int attack) {
        this.live = live;
        this.attack = attack;
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
