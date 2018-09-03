package tools;


public class Converter {

    public Integer convertWordsToNumber(String strNumber) {
        Integer tmpResult = 0;
        Integer result = 0;
        if (strNumber != null && strNumber.length() > 0) {
            String[] splittedParts = strNumber.split(" ");

            for (String str : splittedParts) {
                if (str.equals("zero")) {
                    tmpResult += 0;
                } else if (str.equals("one")) {
                    tmpResult += 1;
                } else if (str.equals("two")) {
                    tmpResult += 2;
                } else if (str.equals("three")) {
                    tmpResult += 3;
                } else if (str.equals("four")) {
                    tmpResult += 4;
                } else if (str.equals("five")) {
                    tmpResult += 5;
                } else if (str.equals("six")) {
                    tmpResult += 6;
                } else if (str.equals("seven")) {
                    tmpResult += 7;
                } else if (str.equals("eight")) {
                    tmpResult += 8;
                } else if (str.equals("nine")) {
                    tmpResult += 9;
                } else if (str.equals("ten")) {
                    tmpResult += 10;
                } else if (str.equals("eleven")) {
                    tmpResult += 11;
                } else if (str.equals("twelve")) {
                    tmpResult += 12;
                } else if (str.equals("thirteen")) {
                    tmpResult += 13;
                } else if (str.equals("fourteen")) {
                    tmpResult += 14;
                } else if (str.equals("fifteen")) {
                    tmpResult += 15;
                } else if (str.equals("sixteen")) {
                    tmpResult += 16;
                } else if (str.equals("seventeen")) {
                    tmpResult += 17;
                } else if (str.equals("eighteen")) {
                    tmpResult += 18;
                } else if (str.equals("nineteen")) {
                    tmpResult += 19;
                } else if (str.equals("twenty")) {
                    tmpResult += 20;
                } else if (str.equals("thirty")) {
                    tmpResult += 30;
                } else if (str.equals("forty")) {
                    tmpResult += 40;
                } else if (str.equals("fifty")) {
                    tmpResult += 50;
                } else if (str.equals("sixty")) {
                    tmpResult += 60;
                } else if (str.equals("seventy")) {
                    tmpResult += 70;
                } else if (str.equals("eighty")) {
                    tmpResult += 80;
                } else if (str.equals("ninety")) {
                    tmpResult += 90;
                } else if (str.equals("hundred")) {
                    tmpResult *= 100;
                } else if (str.equals("thousand")) {
                    tmpResult *= 1000;
                    result += tmpResult;
                    tmpResult = 0;
                }
            }
            result += tmpResult;
        }
        return result;
    }
}
