package com.pluralsight.myapp;


import com.pluralsight.calcengine.Adder;
import com.pluralsight.calcengine.CalculateBase;
import com.pluralsight.calcengine.CalculateHelper;
import com.pluralsight.calcengine.Divider;
import com.pluralsight.calcengine.DynamicHelper;
import com.pluralsight.calcengine.InvalidStatementException;
import com.pluralsight.calcengine.MathEquation;
import com.pluralsight.calcengine.MathProcessing;
import com.pluralsight.calcengine.Multiplier;
import com.pluralsight.calcengine.PowerOf;
import com.pluralsight.calcengine.Subtractor;

public class Main {

    public static void main(String[] args) {
//    	double [] leftVals = {100,25,225,11};
//    	double [] rightVals = {50,92,17,3};
//    	char [] opCodes = {'d', 'a','s', 'm'};
//    	double [] results = new double [opCodes.length];
//	double val1 = 100.0d;
//	double val2 = 0.0d;
//	double result;
//	char opCode = 'd';

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100, 50);
        equations[1] = new MathEquation('a', 25, 92);
        equations[2] = new MathEquation('s', 225, 17);
        equations[3] = new MathEquation('m', 11, 3);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }

        System.out.println("------------------");

        double leftVal = 9;
        double rightVal = 4;
        int leftInt = 9;
        int rightInt = 4;


        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(leftVal, rightVal);
        System.out.println(equationOverload.getResult());


        equationOverload.execute(leftInt, rightInt);
        System.out.println(equationOverload.getResult());

        equationOverload.execute((double) leftInt, rightInt);
        System.out.println(equationOverload.getResult());

        System.out.println("Using Inheritance");

        CalculateBase[] calculators = {
                new Divider(100, 50),
                new Adder(25, 92),
                new Subtractor(225, 17),
                new Multiplier(11, 3),

        };

        for (CalculateBase calculator : calculators) {
            calculator.calculate();
            System.out.println(calculator.getResult());
        }

        System.out.println("Using Strings");
//		useCalculateHelper();

        String[] statements = {
                "add 25.0 92",
                "power 5.0 2.0"

        };

        DynamicHelper helper = new DynamicHelper(new MathProcessing[]{
                new Adder(),
                new PowerOf()
        });
        for (String statement : statements) {
            String output = helper.process(statement);
            System.out.println(output);

        }
    }

    static void useCalculateHelper() {

        String[] statements = {
                "add 1.0",
                "add xx 2.5",
                "addx 1.0 2.0",
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };


        CalculateHelper helper = new CalculateHelper();
        for (String statement : statements) {
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null) {
                    System.out.println("Original exception: " + e.getCause().getMessage());
                }
            }
        }
    }
}


// Constructor does initial set now
//	public static MathEquation create(double leftVal, double rightVal, char opCode) {
//		MathEquation equation = new MathEquation();
//		equation.setLeftVal(leftVal);
//		equation.setRightVal(rightVal);
//		equation.setOpCode(opCode);
//
//		return equation;
//	}
