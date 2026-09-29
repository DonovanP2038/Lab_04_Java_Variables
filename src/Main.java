void main() {
    int intOperandA = 1;
    int intOperandB = 5;
    int intSum = 13;
    int intProduct = 24;
    int intDifference = 32;
    int intQuotient = 46;
    int intModulo = 64;
    double doubleOperandA = 1.0;
    double doubleOperandB = 2.0;
    double doubleSum = 1.0;
    double doubleProduct = 2.0;
    double doubleDifference = 3.0;
    double doubleQuotient = 4.0;
    double doubleModulo = 6.0;

    intSum = intOperandB + intOperandA;

    intProduct = intOperandA * intOperandB;

    intDifference = intOperandA - intOperandB;

    intQuotient = intOperandA / intOperandB;

    intModulo = intOperandA % intOperandB;

    System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
    System.out.println("The product of " + intOperandA + " " + intOperandB + " is " + intProduct);
    System.out.println("The difference of " + intOperandA + " " + intOperandB + " is " + intDifference);
    System.out.println("The quotient of " + intOperandA + " " + intOperandB + " is " + intQuotient);
    ;
    System.out.println("The modulo of " + intOperandA + " " + intOperandB + " is " + intModulo);

    doubleSum = doubleOperandA + doubleOperandB;
    System.out.println("The sum using doubles of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);

    doubleProduct = doubleOperandA * doubleOperandB;
    System.out.println("The product using doubles of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);

    doubleDifference = doubleOperandA - doubleOperandB;
    System.out.println("The difference using doubles of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);

    doubleQuotient = doubleOperandA / doubleOperandB;
    System.out.println("The quotient using doubles of " + doubleOperandA + " / " + doubleOperandB + " is " + doubleQuotient);
}
