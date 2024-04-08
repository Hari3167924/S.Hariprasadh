package fun1;

@FunctionalInterface
interface NumberCategory {
    boolean checkNumberCategory(int number1, int number2);
}

class NumberCategoryUtility {
    public static NumberCategory checkAmicable() {
        return (number1, number2) -> {
            int sumDivisors1 = 1;
            int sumDivisors2 = 1;
            for (int i = 2; i <= Math.min(number1, number2); i++) {
                if (number1 % i == 0) {
                    sumDivisors1 += i;
                }
                if (number2 % i == 0) {
                    sumDivisors2 += i;
                }
            }
            return sumDivisors1 == number2 && sumDivisors2 == number1;
        };
    }

    public static NumberCategory checkPalindrome() {
        return (number1, number2) -> {
            int product = number1 * number2;
            String productStr = String.valueOf(product);
            return new StringBuilder(productStr).reverse().toString().equals(productStr);
        };
    }
}                                     
