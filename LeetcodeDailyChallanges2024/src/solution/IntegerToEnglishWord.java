/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solution;

/**
 *
 * @author Connor Robert Davies
 */
public class IntegerToEnglishWord {
    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        String str = num + "";
        String arr[] = {"", "", "", ""};
        int strLen = str.length();
        int arrLen = (int) Math.ceil(strLen / 3.0);

        if (strLen % 3 == 2) {
            str = "0" + str;
        } else if (strLen % 3 == 1) {
            str = "00" + str;
        }

        int count = 0;
        for (int i = 0; i < arrLen * 3; i += 3) {
            arr[count] = "" + str.charAt(i) + str.charAt(i + 1) + str.charAt(i + 2);
            count++;
        }
        
        String output = "";
        count = arrLen;
        for (int i = 0; i < arrLen; i++) {
            output += threeDigitToWord(arr[i]);
            if (!threeDigitToWord(arr[i]).equals("")) {
                switch (count) {
                    case 4:
                        if (arr[1].equals("000") && arr[2].equals("000") && arr[3].equals("000") && arr[4].equals("000")) {
                            output += " Billion";
                        } else {
                            output += " Billion ";
                        }
                        break;
                    case 3:
                        if (arr[1].equals("000") && arr[2].equals("000") ) {
                            output += " Million";
                        } else {
                            output += " Million ";
                        }
                        break;
                    case 2:
                        if (arr[1].equals("000")) {
                            output += " Thousand";
                        } else {
                            output += " Thousand ";
                        }
                        break;
                    default:
                        break;
                }
            }

            count--;
        }

        return output;
    }

    private static String threeDigitToWord(String str) {
        String output = "";
        boolean isTeen = false;

        if (str.charAt(1) == '0' && str.charAt(2) == '0') {
            switch (str.charAt(0)) {
                case '1':
                    output += "One Hundred";
                    break;
                case '2':
                    output += "Two Hundred";
                    break;
                case '3':
                    output += "Three Hundred";
                    break;
                case '4':
                    output += "Four Hundred";
                    break;
                case '5':
                    output += "Five Hundred";
                    break;
                case '6':
                    output += "Six Hundred";
                    break;
                case '7':
                    output += "Seven Hundred";
                    break;
                case '8':
                    output += "Eight Hundred";
                    break;
                case '9':
                    output += "Nine Hundred";
                    break;
                default:
                    break;
            }
        } else {
            switch (str.charAt(0)) {
                case '1':
                    output += "One Hundred ";
                    break;
                case '2':
                    output += "Two Hundred ";
                    break;
                case '3':
                    output += "Three Hundred ";
                    break;
                case '4':
                    output += "Four Hundred ";
                    break;
                case '5':
                    output += "Five Hundred ";
                    break;
                case '6':
                    output += "Six Hundred ";
                    break;
                case '7':
                    output += "Seven Hundred ";
                    break;
                case '8':
                    output += "Eight Hundred ";
                    break;
                case '9':
                    output += "Nine Hundred ";
                    break;
                default:
                    break;
            }
        }

        if (str.charAt(2) == '0') {
            switch (str.charAt(1)) {
                case '1':
                    isTeen = true;
                    break;
                case '2':
                    output += "Twenty";
                    break;
                case '3':
                    output += "Thirty";
                    break;
                case '4':
                    output += "Forty";
                    break;
                case '5':
                    output += "Fifty";
                    break;
                case '6':
                    output += "Sixty";
                    break;
                case '7':
                    output += "Seventy";
                    break;
                case '8':
                    output += "Eighty";
                    break;
                case '9':
                    output += "Ninety";
                    break;
                default:
                    break;
            }
        } else {
            switch (str.charAt(1)) {
                case '1':
                    isTeen = true;
                    break;
                case '2':
                    output += "Twenty ";
                    break;
                case '3':
                    output += "Thirty ";
                    break;
                case '4':
                    output += "Forty ";
                    break;
                case '5':
                    output += "Fifty ";
                    break;
                case '6':
                    output += "Sixty ";
                    break;
                case '7':
                    output += "Seventy ";
                    break;
                case '8':
                    output += "Eighty ";
                    break;
                case '9':
                    output += "Ninety ";
                    break;
                default:
                    break;
            }
        }

        if (!isTeen) {
            switch (str.charAt(2)) {
                case '1':
                    output += "One";
                    break;
                case '2':
                    output += "Two";
                    break;
                case '3':
                    output += "Three";
                    break;
                case '4':
                    output += "Four";
                    break;
                case '5':
                    output += "Five";
                    break;
                case '6':
                    output += "Six";
                    break;
                case '7':
                    output += "Seven";
                    break;
                case '8':
                    output += "Eight";
                    break;
                case '9':
                    output += "Nine";
                    break;
                default:
                    break;
            }
        } else {
            switch (str.charAt(2)) {
                case '1':
                    output += "Eleven";
                    break;
                case '2':
                    output += "Twelve";
                    break;
                case '3':
                    output += "Thirteen";
                    break;
                case '4':
                    output += "Fourteen";
                    break;
                case '5':
                    output += "Fifteen";
                    break;
                case '6':
                    output += "Sixteen";
                    break;
                case '7':
                    output += "Seventeen";
                    break;
                case '8':
                    output += "Eighteen";
                    break;
                case '9':
                    output += "Nineteen";
                    break;
                default:
                    System.out.println(str.charAt(2));
                    output += "Ten";
                    break;
            }
        }

        return output;
    }
}
