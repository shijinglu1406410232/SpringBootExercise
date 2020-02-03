package MStates;

public class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("吃鱼");
    }
    void work(){
        System.out.println("抓老鼠");
    }
}
