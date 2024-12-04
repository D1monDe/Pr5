package org.example;

public class testingTest {

    private int numb;
    private String input;

    public testingTest(String input) {
        this.input = input;
        this.numb = 0;
    }

    private void reset() {
        numb = 0;
    }

    private void processSymbol(char symbol) {
        /*switch (numb) {
            case 0:
                if (symbol == 'T') {
                    numb = 1;
                }
                break;
            case 1:
                if (symbol == 'E') {
                    numb = 2;
                } else if (symbol != 'T') {
                    numb = 0;
                }
                break;
            case 2:
                if (symbol == 'S') {
                    numb = 3;
                } else if (symbol == 'T') {
                    numb = 1;
                } else {
                    numb = 0;
                }
                break;
            case 3:
                if (symbol == 'T') {
                    numb = 4;
                } else {
                    numb = 0;
                }
                break;
            case 4:
                break;
        }*/

        numb = switch (numb) {
            case 0 -> (symbol == 'T') ? 1 : 0;
            case 1 -> (symbol == 'E') ? 2 : (symbol != 'T') ? 0 : 1;
            case 2 -> (symbol == 'S') ? 3 : (symbol == 'T') ? 1 : 0;
            case 3 -> (symbol == 'T') ? 4 : 0;
            case 4 -> 4;
            default -> 0;
        };
    }


    public String analyze() {
        reset();
        for (char symbol : input.toCharArray()) {
            processSymbol(symbol);
            if (numb == 4) {
                return "F";
            }
        }
        return Integer.toString(numb);
    }


}
