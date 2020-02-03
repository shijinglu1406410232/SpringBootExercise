package MStates;
/**
 *
 * */
public class Test {
    public static void main(String[] args) {
        show(new Cat());//Animal a
        show(new Dog());
        Animal a=new Cat();// 向上转型
        a.eat();//调用的是 Cat 的 eat
        Cat c=(Cat)a;//向下转型
        c.work();//调用的是 Cat 的 work


    }
    public static void show(Animal a){
        a.eat();
        //类型的判断
        if (a instanceof Cat){
            Cat c=(Cat)a;
            c.work();
        }else if (a instanceof Dog){
            Dog c=(Dog) a;
            c.work();
        }

    }

}
