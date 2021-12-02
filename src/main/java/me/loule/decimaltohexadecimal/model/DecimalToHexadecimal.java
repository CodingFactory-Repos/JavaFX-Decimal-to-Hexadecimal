package me.loule.decimaltohexadecimal.model;

public class DecimalToHexadecimal {
    private int decimal;

    public DecimalToHexadecimal(int decimal) {
        this.decimal = decimal;
    }

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public String result() {
        String result = "";
        char hexchars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (this.decimal > 0) {
            result = hexchars[this.decimal % 16] + result;
            this.decimal = this.decimal / 16;
        }

        return result;
    }
}
