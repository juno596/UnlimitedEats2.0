package Eats.Unlimited.Controller;

import Eats.Unlimited.Model.UnlimitedEatsGen;
import Eats.Unlimited.View.UEView;

public class UEController {

    private UnlimitedEatsGen gen;
    private UEView view;

    public UEController(UnlimitedEatsGen gen, UEView view){

        this.gen = gen;
        this.view = view;
        //URL accountsFileURL = getClass().getResource("accounts.json");

        //File accountsFile = new File(accountsFileURL.getFile());


        //if "generate Button" is pressed open up generate
        view.getGenButton().addActionListener(e -> {
            view.getMainPaneCardLayout().next(view.getC());
        });
        //if "account buttons is pressed"
        view.getAccountsButton().addActionListener(e -> {

            //view.getDefaultLabel().setText(accountsFile.toString());

        });

    }


}
