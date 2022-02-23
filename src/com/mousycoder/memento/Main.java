package com.mousycoder.memento;

/**
 * @author mousycoder
 * @version 1.0
 * @description: TODO
 * @date 2022/2/23 4:16 PM
 */
public class Main {

    public static void main(String[] args) {
        RoleOriginator roleOriginator = new RoleOriginator();
        roleOriginator.display();
        roleOriginator.fight();
        roleOriginator.display();

        System.out.println("保存上面的快照");

        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(roleOriginator.saveState());


        roleOriginator.fight();
        roleOriginator.fight();
        roleOriginator.fight();
        roleOriginator.fight();
        roleOriginator.display();

        System.out.println("准备恢复快照");
        roleOriginator.recoveryState(caretaker.getMemento());

        roleOriginator.display();


    }
}
