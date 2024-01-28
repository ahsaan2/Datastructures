package ObjectOrientedProgramming.PrincipleOfOops;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(); // will call the constructor that does not take any arguments
        Box box2 = new Box(12, 12, 12);
        BoxWeight boxWeight = new BoxWeight();
        BoxWeight boxWeight2 = new BoxWeight(12,21,22,24);
        System.out.println(boxWeight2.length+" "+boxWeight2.height+" "+boxWeight2.width+" "+boxWeight2.weight);
      
        System.out.println(boxWeight.length+ " " + boxWeight.weight);  // -1, -1
        System.out.println(box2.length + " " + box2.width + " " + box2.height);

        System.out.println(box.length + " " + box.width + " " + box.height);

    }
}
