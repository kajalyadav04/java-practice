package com.lnctu;
import java.util.*;
public class ExpressionEvaluator {
	    private static final Map<String, Integer> wordToDigit = new HashMap<>();

	    static {
	        wordToDigit.put("zero", 0);
	        wordToDigit.put("one", 1);
	        wordToDigit.put("two", 2);
	        wordToDigit.put("three", 3);
	        wordToDigit.put("four", 4);
	        wordToDigit.put("five", 5);
	        wordToDigit.put("six", 6);
	        wordToDigit.put("seven", 7);
	        wordToDigit.put("eight", 8);
	        wordToDigit.put("nine", 9);
	    }
	    private static final Set<String> validOperations = Set.of("add", "sub", "mul", "div", "rem", "pow");

	    private static Integer parseDigitWord(String word) {
	        String[] parts = word.split("c");
	        StringBuilder number = new StringBuilder();
	        for (String part : parts) {
	            if (!wordToDigit.containsKey(part)) {
	                return null;  
	            }
	            number.append(wordToDigit.get(part));
	        }
	        return Integer.parseInt(number.toString());
	    }
	    public static String evaluateExpression(String input) {
	        String[] tokens = input.split("\\s+");

	        Stack<Integer> operands = new Stack<>();
	        Stack<String> operators = new Stack<>();

	        for (int i = 0; i < tokens.length; i++) {
	            String token = tokens[i];

	            if (validOperations.contains(token)) {
	                operators.push(token);
	            } 
	            else {
	                Integer value = parseDigitWord(token);
	                if (value == null) {
	                    return "expression evaluation stopped invalid words present";
	                }
	                operands.push(value);
	            }

	            if (operands.size() >= 2 && !operators.isEmpty()) {
	                if (evaluateStack(operators.pop(), operands)) {
	                    continue;
	                } else {
	                    return "expression is not complete or invalid";
	                }
	            }
	        }

	        if (operands.size() == 1 && operators.isEmpty()) {
	            return String.valueOf(operands.pop());
	        } else {
	            return "expression is not complete or invalid";
	        }
	    }

	    private static boolean evaluateStack(String operation, Stack<Integer> operands) {
	        if (operands.size() < 2) return false;

	        int b = operands.pop();
	        int a = operands.pop();

	        switch (operation) {
	            case "add":
	                operands.push(a + b);
	                break;
	            case "sub":
	                operands.push(a - b);
	                break;
	            case "mul":
	                operands.push(a * b);
	                break;
	            case "div":
	                if (b == 0) return false;
	                operands.push(a / b);
	                break;
	            case "rem":
	                if (b == 0) return false;
	                operands.push(a % b);
	                break;
	            case "pow":
	                operands.push((int) Math.pow(a, b));
	                break;
	            default:
	                return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String input = sc.nextLine();
	        System.out.print(evaluateExpression(input));
	        sc.close();
	    }
	}


