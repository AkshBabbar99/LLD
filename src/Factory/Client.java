package Factory;

import Factory.components.Button;
import java.util.Scanner;

public class Client {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What platform would you like to create?");
        String platform = sc.nextLine();

        Platform platformInstance = PlatformFactory.getPlatformByName(platform);
        UIComponentFactory uiComponentFactory = platformInstance.createUIComponentFactory();
        Button button = uiComponentFactory.createButton();
        button.click();
    }
}
