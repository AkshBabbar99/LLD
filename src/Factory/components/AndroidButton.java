package Factory.components;

public class AndroidButton implements Button{

    @Override
    public void click(){
        System.out.println("Android Button Clicked!");
    }
}
