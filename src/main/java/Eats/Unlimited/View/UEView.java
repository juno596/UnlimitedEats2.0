package Eats.Unlimited.View;

import javax.swing.*;

public class UEView extends JFrame{

    public final UEForm form;

    public UEView(){
        this.form = new UEForm();
        //UE gen get method
        JPanel content = form.();
        this.setContentPane(content);
        this.pack();
        this.setTitle("PUZZLE BOX !!!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }





}
