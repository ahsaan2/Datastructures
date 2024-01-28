package ObjectOrientedProgramming.PrincipleOfOops;

public class BoxPrice extends BoxWeight {
    /**
     * One class extends another class . Box -->> BoxWeight
     * Multilevel Inheritance->> Box class is a parent for the BoxWeight class and
     * BoxWeight class itself can be the parent for some other class.
     */
    double cost;

    BoxPrice() {
        super();
        this.cost = -1;
    }

    BoxPrice(double length, double width, double height, double weight, double cost) {
        super(length, width, height, weight);
        this.cost = cost;
    }

    BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }

    public static void main(String[] args) {
        BoxPrice box = new BoxPrice(5, 12, 21);
        System.out.println(box.height);

    }

}
/**
 * Multiple Inheritance-->> When one class is extending more than one classes
 * suppose we have two parent classes
 * class A and class B and we have a child class c
 * class A has variable n = 10 and class B has a varible n = 20
 * And if class c accesses both class A and class B what will it print, It will
 * have an ambugity what value is to be printed. that is why java doesn't
 * support
 * multiple inheritance.
 * In simple words if two or more classes have the same property then the child
 * class will get confused which to pick and which not to pick
 * // To cope this problem , java uses interfaces(it defines what a class does).
 */
/**
 * Hierarchial Inheritance-->> One class is inherited by multiple classes
 * // All the rules that we applied for the single inheritance will be applied
 * here.
 */
/**
 * Hybrid Inheritance-->> It is a combination of single and multiple
 * inheritacne, since java does not support multiple inheritance
 * hybrid inheritance is also not supported.
 */
