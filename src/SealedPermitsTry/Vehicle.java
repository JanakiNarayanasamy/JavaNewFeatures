package SealedPermitsTry;

public sealed class Vehicle permits Car{
    public void run(){
        System.out.println("running from run class");
    }
}
sealed class Car extends Vehicle permits Speed{
    public void run(){
        System.out.println("running from car class");

    }
}
non-sealed class Speed extends Car{
    public static void main(String[] args) {
        Speed speed=new Speed();
        speed.run();
    }

}
