import javax.swing.*;
import java.awt.event.ActionListener;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleBinaryOperator;

public class Seventeen {


    public static void main(String[] args) {
        // a. Write a lambda expression that receives two double parameters a and b and returns their
        //product. Use the lambda form that explicitly lists the type of each parameter.

        DoubleBinaryOperator doubleBinaryOperator = (double a, double b) -> {return a * b;};

        // b. Rewrite the lambda expression in Part (a) using the lambda form that does not list the
        //type of each parameter.

        DoubleBinaryOperator operator = (a, b) -> {return a * b;};

        // c. Rewrite the lambda expression in Part (b) using the lambda form that implicitly returns
        //the value of the lambda’s body expression.

        DoubleBinaryOperator nextOperator = (a, b) -> a * b;

        // d. Write a no-argument lambda that implicitly returns the string "Welcome to lambdas!" .

        PrivilegedAction<String> action = () -> {
            return "Welcome to lambdas!";
        };

        // e. Write a constructor reference for class ArrayList .

//       ArrayList::new;


// f. reimplement

//        button.addActionListener(
//                new ActionListener()
//                {
//                   event -> JOptionPane.showMessageDialog(ParentFrame.this,"JButton event handler");
//                }
//        );
        

//        button.addActionListener(
//                new ActionListener()
//                {
//                    public void actionPerformed(ActionEvent event)
//                    {
//                        JOptionPane.showMessageDialog(ParentFrame.this,
//                                "JButton event handler");
//                    }
//                }
//        );



    }
}
