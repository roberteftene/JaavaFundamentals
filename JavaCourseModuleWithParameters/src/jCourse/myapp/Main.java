package jCourse.myapp;
import jCourse.*;

public class Main {

    public static void useMathEquation() {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(100.0d, 50.0d, 'd');
        equations[1] = new MathEquation(25.0d, 92.0d, 'a');
        equations[2] = new MathEquation(225.0d, 17.0d, 's');
        equations[3] = new MathEquation(11.0d, 3.0d, 'm');

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("Result = " + equation.getResult());
//            System.out.print(equation.getResult());
        }
    }

    public static void useCalculatorBase() {
        System.out.println();
        System.out.println("Using overload");
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;
        MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble,rightDouble);
        System.out.println("Result = " + equationOverload.getResult());

        equationOverload.execute(leftInt,rightInt);
        System.out.println(  "Result = " + equationOverload.getResult());

        equationOverload.execute((double)leftInt,rightInt);
        System.out.println("Result = " + equationOverload.getResult());


        System.out.println();
        System.out.println("Using inheritance");

        CalculateBase[] calculators = {
                new Divider(100.0d,50.0d),
                new Adder(25.0d,92.0d),
                new Substracter(225.0d,17.0d),
                new Multiplier(11.0d,3.0d),

        };


        for(CalculateBase calculator : calculators) {
            calculator.calculate();
            System.out.println("Result = " + calculator.getResult());
        }
    }
    public static void main(String[] args) throws InvalidStatementException {
        System.out.println("Hello!");

//        useMathEquation();
//        useCalculatorBase();

        String[] statements = {
                "add 1.0", //Error incorrect number of values
                "add xx 25.0", //Error non numeric data
                "addX 0.0 0.0", //Error invalid command
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "substract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        CalculateHelper helper = new CalculateHelper();
        for(String statement:statements) {
            try {
                helper.process(statement);
                System.out.println(helper.toString());
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if(e.getCause() != null)
                    System.out.println(" Original exception" + e.getCause().getMessage());
            }
        }




    }

}
