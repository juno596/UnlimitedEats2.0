package Eats.Unlimited;

import Eats.Unlimited.Controller.UEController;
import Eats.Unlimited.Model.UnlimitedEatsGen;
import Eats.Unlimited.View.UEView;

public class App {
    public static void main(String[] args) {

        Account acc = new Account("test.gmail.com", "testPassword", "1231231234");
        UnlimitedEatsGen model = new UnlimitedEatsGen(acc);
        UEView view = new UEView();
        UEController controller = new UEController(model, view);
        view.getFrame().setVisible(true);
        //view.setSize(600, 400);
        view.getFrame().setLocationRelativeTo(null);

        //when you hover over icons you can see what they are
        //import a cool font
    }
}