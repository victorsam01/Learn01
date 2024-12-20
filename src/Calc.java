import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends Frame implements  ActionListener{
    TextField OpScreen;
    Button Btn0,Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8,Btn9,Dot,Sub,Addition,Multiply,Divide,Equal,Clear;
        Calc() {
            Label L = new Label("Vicky");
            L.setBounds(50, 50, 60, 25);

            OpScreen = new TextField("0");
            OpScreen.setBounds(50, 85, 150, 25);

            Btn7 = new Button("7");
            Btn7.setBounds(50, 120, 30, 30);
            Btn7.addActionListener(this);

            Btn8 = new Button("8");
            Btn8.setBounds(90, 120, 30, 30);
            Btn8.addActionListener(this);

            Btn9 = new Button("9");
            Btn9.setBounds(130, 120, 30, 30);
            Btn9.addActionListener(this);

            Divide = new Button("/");
            Divide.setBounds(170, 120, 30, 30);
            Divide.addActionListener(this);

            Btn4 = new Button("4");
            Btn4.setBounds(50, 160, 30, 30);
            Btn4.addActionListener(this);

            Btn5 = new Button("5");
            Btn5.setBounds(90, 160, 30, 30);
            Btn5.addActionListener(this);

            Btn6 = new Button("6");
            Btn6.setBounds(130, 160, 30, 30);
            Btn6.addActionListener(this);

            Multiply = new Button("*");
            Multiply.setBounds(170, 160, 30, 30);
            Multiply.addActionListener(this);

            Btn1 = new Button("1");
            Btn1.setBounds(50, 200, 30, 30);
            Btn1.addActionListener(this);

            Btn2 = new Button("2");
            Btn2.setBounds(90, 200, 30, 30);
            Btn2.addActionListener(this);

            Btn3 = new Button("3");
            Btn3.setBounds(130, 200, 30, 30);
            Btn3.addActionListener(this);

            Sub = new Button("-");
            Sub.setBounds(170, 200, 30, 30);
            Sub.addActionListener(this);

            Btn0 = new Button("0");
            Btn0.setBounds(50, 240, 30, 30);
            Btn0.addActionListener(this);

            Dot = new Button(".");
            Dot.setBounds(90, 240, 30, 30);
            Dot.addActionListener(this);

            Addition = new Button("+");
            Addition.setBounds(130, 240, 30, 30);
            Addition.addActionListener(this);

            Equal = new Button("=");
            Equal.setBounds(170, 240, 30, 30);
            Equal.addActionListener(this);

            Clear = new Button("Clear");
            Clear.setBounds(50, 280, 100, 30);
            Clear.addActionListener(this);

            add(L);
            add(OpScreen);
            add(Btn7);
            add(Btn8);
            add(Btn9);
            add(Divide);
            add(Btn4);
            add(Btn5);
            add(Btn6);
            add(Multiply);
            add(Btn1);
            add(Btn2);
            add(Btn3);
            add(Sub);
            add(Btn0);
            add(Dot);
            add(Addition);
            add(Equal);
            add(Clear);
            setLayout(null);
            setSize(500, 400);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent e) {
            String Input = "",Expression = "",Temp1 = "",Temp2 = "";

            Character Operator='+';
            int a,b,c= 0,i;
            double d = 0;
            if (e.getSource() == Btn0){
                Input = OpScreen.getText();
                if (Input.charAt(0) == '0'){
                    Input = "0";
                }
                else{
                    Input += "0";
                }
                OpScreen.setText(Input);
            }
            if (e.getSource() == Btn1){
                Input = OpScreen.getText();
                Input += "1";
                if (Input.charAt(0) == '0'){
                    Input = Input.replace("0","");
                }
                OpScreen.setText(Input);
            }
            if (e.getSource() == Btn2){
                Input = OpScreen.getText();
                Input += "2";
                if (Input.charAt(0) == '0'){
                    Input = Input.replace("0","");
                }
                OpScreen.setText(Input);
            }
            if (e.getSource() == Btn3){
                Input = OpScreen.getText();
                Input += "3";
                if (Input.charAt(0) == '0'){
                    Input = Input.replace("0","");
                }
                OpScreen.setText(Input);
            }
            if (e.getSource() == Btn4){
                Input = OpScreen.getText();
                Input += "4";
                if (Input.charAt(0) == '0'){
                    Input = Input.replace("0","");
                }
                OpScreen.setText(Input);
            }
            if (e.getSource() == Btn5){
                Input = OpScreen.getText();
                Input += "5";
                if (Input.charAt(0) == '0'){
                    Input = Input.replace("0","");
                }
                OpScreen.setText(Input);
            }
            if (e.getSource() == Btn6){
                Input = OpScreen.getText();
                Input += "6";
                if (Input.charAt(0) == '0'){
                    Input = Input.replace("0","");
                }
                OpScreen.setText(Input);
            }
            if (e.getSource() == Btn7){
                Input = OpScreen.getText();
                Input += "7";
                if (Input.charAt(0) == '0'){
                    Input = Input.replace("0","");
                }
                OpScreen.setText(Input);
            }
            if (e.getSource() == Btn8){
                Input = OpScreen.getText();
                Input += "8";
                if (Input.charAt(0) == '0'){
                    Input = Input.replace("0","");
                }
                OpScreen.setText(Input);
            }
            if (e.getSource() == Btn9){
                Input = OpScreen.getText();
                Input += "9";
                if (Input.charAt(0) == '0'){
                    Input = Input.replace("0","");
                }
                OpScreen.setText(Input);
            }
            if (e.getSource() == Addition){
                Input = OpScreen.getText();
                Input += "+";
                OpScreen.setText(Input);
            }
            if (e.getSource() == Sub){
                Input = OpScreen.getText();
                Input += "-";
                OpScreen.setText(Input);
            }
            if (e.getSource() == Multiply){
                Input = OpScreen.getText();
                Input += "*";
                OpScreen.setText(Input);
            }
            if (e.getSource() == Divide){
                Input = OpScreen.getText();
                Input += "/";
                OpScreen.setText(Input);
            }
            if (e.getSource() == Equal){
                Expression = OpScreen.getText();
                for(i = 0;i < Expression.length();i++){
                    if(Character.isDigit(Expression.charAt(i))){
                            Temp1 += Expression.charAt(i);
                    }
                    else{
                        Operator = Expression.charAt(i);
                    }
                }

                i = Expression.indexOf(Operator);
                Temp1 = Expression.substring(0,i);
                Temp2 = Expression.substring(i+1);

                a = Integer.parseInt(Temp1);
                b = Integer.parseInt(Temp2);

                switch (Operator){
                    case '+':
                        System.out.println("ad");
                        c = (a + b);
                        break;
                    case '-':
                        System.out.println("sub");
                        System.out.println(a + " "+ b);
                        c = (a - b);
                        System.out.println(c);
                        break;
                    case '*':
                        System.out.println("mu");
                        c = (a * b);
                        break;
                    case '/':
                        try{
                            d = a/b;
                            break;
                        }
                        catch(ArithmeticException A){
                            System.out.println("Divisor can't be zero");
                            break;
                        }

                }
                if(Operator == '/'){
                    OpScreen.setText(Double.toString(d));
                }
                else {
                    OpScreen.setText(Integer.toString(c));
                }

            }
            if (e.getSource() == Dot){
                Input = OpScreen.getText();
                Input += ".";
                OpScreen.setText(Input);
            }
            if (e.getSource() == Clear){
                OpScreen.setText("0");
            }
        }

    public static void main(String[] args) {
        new Calc();
    }

}

