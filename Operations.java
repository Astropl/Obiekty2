public enum Operations
{
    ADD('+'), MINUS('-'), MNOZENIE('*'), SUBSTRACT('/'), UNKNOWN(' ');


    private char sign;


    Operations ( char sign ) {
        this.sign = sign;
    }

    public static Operations getOperation ( char sign ) {
        for (Operations operations : values()) {
            if (operations.sign == sign) {
                return operations;
            }
        }
        return UNKNOWN;
    }
}