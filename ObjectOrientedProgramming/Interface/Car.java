package ObjectOrientedProgramming.Interface;

public class Car implements Engine, Brake,Media {  
    // "since these are abstract classes we have to provide the body/ implement them."
    public void brake(){
        System.out.println("This is the brake:");
    }
    @Override
    public void start(){
        System.out.println("start the engine:");
    }
    public void stop(){
        System.out.println("Stop the engine:");
    }
    public void accelerate(){
        System.out.println("Increase the speed:");
    }
    @Override  // called as Annotations, these are internally interfaces.
    public void play(){
        System.out.println("Alexa! Play music");
    }
    
    // we were not able to do this in inheritance
    // car needs suppose two functionalities brake amd engine, here we can have both 
    // previously we were not able to do it.
}
