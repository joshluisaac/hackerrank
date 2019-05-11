package com.avantsystems.problems.stackapplication;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.IntStream;

public class BalancedParenthesis {

    private static final char[][] TOKENS = { { '{', '}' }, { '[', ']' }, { '(', ')' } };

    private static boolean isOpenToken(char c) {
        return Arrays.stream(TOKENS).anyMatch(token -> token[0] == c);
    }

    private static boolean matches(char openToken, char closedToken) {
        return Arrays.stream(TOKENS).filter(c -> c[0] == openToken).anyMatch(c -> c[1] == closedToken);
    }

    private static boolean execute(String expression) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : expression.toCharArray()) {
            if (isOpenToken(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || !matches(stack.pop(), c)) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    // Java 8 version
    private static boolean execute2(String expression) {
        char[] a = expression.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        IntStream.range(0, a.length).forEach(i -> {
            if (isOpenToken(a[i])) {
                stack.push(a[i]);
            } else {
                matches(stack.pop(), a[i]);
            }
        });
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean isBalanced = BalancedParenthesis.execute("([(({()}))])");
        System.out.println(isBalanced);

        boolean result = BalancedParenthesis.execute2("([{{}}(({()}))])");
        System.out.println(result);
    }

}
