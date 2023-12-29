package com.akubuof.iphonecalculator.backend;

public class MathExpressionEvaluator {
    private MathExpressionEvaluator() {}

    public static double eval(double v1, Operator o, double v2) {
        switch (o) {
            case DIVIDE -> {
                return v1 / v2;
            }
            case MULTIPLY -> {
                return v1 * v2;
            }
            case ADD -> {
                return v1 + v2;
            }
        }
        return v1 - v2;
    }

    public static String formatResult(double v) {
        int asInteger = (int) v;
        if (v != asInteger) {
            return Double.toString(v);
        } else {
            return Integer.toString(asInteger);
        }
    }

    public static String formatResult(double v, int decimalPlace) {
        int asInteger = (int) v;
        if (v != asInteger) {
            String format = "%." + decimalPlace + "f";
            return String.format(format, v);
        } else {
            return Integer.toString(asInteger);
        }
    }

    public static void main(String[] args) {
        double result = MathExpressionEvaluator.eval(75, Operator.DIVIDE, 23);
        String formatedResult = MathExpressionEvaluator.formatResult(result, 8);
        System.out.println(formatedResult);
    }
}
