package me.loule.decimaltohexadecimal.model;

public class HexadecimalToDecimal {
    private String hexadecimal;

    public HexadecimalToDecimal(String hexadecimal) {
        this.hexadecimal = hexadecimal;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }

    public void setHexadecimal(String hexadecimal) {
        this.hexadecimal = hexadecimal;
    }

    public String result() {
        String Hexa = "0123456789ABCDEF";
        this.hexadecimal = this.hexadecimal.toUpperCase();
        int result = 0;

        for (int i = 0; i < this.hexadecimal.length(); i++) {
            result = (16 * result) + Hexa.indexOf(this.hexadecimal.charAt(i));
        }

        return Integer.toString(result);
    }
}