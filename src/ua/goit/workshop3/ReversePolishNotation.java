package ua.goit.workshop3;

import java.util.*;

/**
 * Created by home on 12.05.2016.
 */
public class ReversePolishNotation {
    public static void main(String[] args) {
        System.out.println(evaluate("1 2 +"));
    }
    public static int evaluate(String expression) {
        Stack result = new Stack();
        Scanner expressionScanner = new Scanner(expression);
        int argumentA = 0;
        int argumentB = 0;
        String nextSymbol = "";
        int temporaryResult = 0;
        while (expressionScanner.hasNext() ){
            nextSymbol = expressionScanner.next();
            switch (nextSymbol.charAt(0)){
                case'+':{
                    argumentA = (Integer) result.pop();
                    argumentB = (Integer) result.pop();
                    temporaryResult = argumentA + argumentB;
                    result.push(Integer.valueOf(temporaryResult));
                    break;

                }
                case '-':{
                    argumentB = (Integer) result.pop();
                    argumentA = (Integer) result.pop();
                    temporaryResult = argumentA - argumentB;
                    result.push(Integer.valueOf(temporaryResult));
                    break;
                }
                case'*':{
                    argumentA = (Integer) result.pop();
                    argumentB = (Integer) result.pop();
                    temporaryResult = argumentA * argumentB;
                    result.push(Integer.valueOf(temporaryResult));
                    break;
                }
                case '/':{
                    argumentB = (Integer) result.pop();
                    argumentA = (Integer) result.pop();
                    temporaryResult = argumentA / argumentB;
                    result.push(Integer.valueOf(temporaryResult));
                    break;

                }
                default:{
                    result.push(Integer.valueOf(nextSymbol));
                    break;
                }
            }


            }

        return (Integer) result.pop();
    }
}

