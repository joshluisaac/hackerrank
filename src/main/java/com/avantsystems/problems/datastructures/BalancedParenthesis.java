package com.avantsystems.problems.datastructures;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class BalancedParenthesis {

    private static final char[][] TOKENS = {{'{', '}'}, {'[', ']'}, {'(', ')'}};

    private static boolean isOpenToken(char c) {
        for (char[] array : TOKENS) {
            if (array[0] == c)  return true;
        }
        return false;
    }


    private static boolean execute(String expression) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : expression.toCharArray()) {
            if (isOpenToken(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || !matches(stack.pop(),c)) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean matches(char openToken, char closedToken){
        return Arrays.stream(TOKENS)
                .filter(c -> c[0] == openToken)
                .anyMatch(c -> c[1] == closedToken);
    }

    public static void main(String[] args) {
        boolean isBalanced = BalancedParenthesis.execute("([(({}))])");
        System.out.println(isBalanced);
    }


}
