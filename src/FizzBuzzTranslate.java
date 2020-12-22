public class FizzBuzzTranslate {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String translate(int inputNumber) {
        String result;
        boolean isDivisible15 = inputNumber % 15 == 0;
        boolean isDivisible3 = inputNumber % 3 == 0;
        boolean isDivisible5 = inputNumber % 5 == 0;
        boolean numberWith3 = (inputNumber % 10) % 3 == 0;

        if (isDivisible15)
            result = FIZZ_BUZZ;
        else if (isDivisible3 || numberWith3)
            result = FIZZ;
        else if (isDivisible5)
            result = BUZZ;
        else {
            result = readNumber(inputNumber);
        }
        return result;
    }

    public static String readNumber(int number) {
        String read = "";
        String readOne = "";
        String readTen = "";
        int read10to20 = number % 10;
        int findOnes = number % 10;
        int findTens = number / 10;
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    read = "Khong";
                    break;
                case 1:
                    read = "Mot";
                    break;
                case 2:
                    read = "Hai";
                    break;
                case 3:
                    read = "Ba";
                    break;
                case 4:
                    read = "Bon";
                    break;
                case 5:
                    read = "Nam";
                    break;
                case 6:
                    read = "Sau";
                    break;
                case 7:
                    read = "Bay";
                    break;
                case 8:
                    read = "Tam";
                    break;
                case 9:
                    read = "Chin";
            }
        } else if (number >= 10 && number < 20) {
            switch (read10to20) {
                case 0:
                    read = "Muoi";
                    break;
                case 1:
                    read = "Muoi mot";
                    break;
                case 2:
                    read = "Muoi hai";
                    break;
                case 3:
                    read = "Muoi ba";
                    break;
                case 4:
                    read = "Muoi bon";
                    break;
                case 5:
                    read = "Muoi lam";
                    break;
                case 6:
                    read = "Muoi sau";
                    break;
                case 7:
                    read = "Muoi bay";
                    break;
                case 8:
                    read = "Muoi tam";
                    break;
                case 9:
                    read = "Muoi chin";
                    break;
            }
        } else if (number >= 20 && number < 100) {
            switch (findTens) {
                case 2:
                    readTen = "Hai muoi";
                    break;
                case 3:
                    readTen = "Ba muoi";
                    break;
                case 4:
                    readTen = "Bon muoi";
                    break;
                case 5:
                    readTen = "Nam muoi";
                    break;
                case 6:
                    readTen = "Sau muoi";
                    break;
                case 7:
                    readTen = "Bay muoi";
                    break;
                case 8:
                    readTen = "Tam muoi";
                    break;
                case 9:
                    readTen = "Chin muoi";
                    break;
            }
            switch (findOnes) {
                case 0:
                    readOne = "khong";
                    break;
                case 1:
                    readOne = "mot";
                    break;
                case 2:
                    readOne = "hai";
                    break;
                case 3:
                    readOne = "ba";
                    break;
                case 4:
                    readOne = "bon";
                    break;
                case 5:
                    readOne = "nam";
                    break;
                case 6:
                    readOne = "sau";
                    break;
                case 7:
                    readOne = "bay";
                    break;
                case 8:
                    readOne = "tam";
                    break;
                case 9:
                    readOne = "chin";
            }
            read = readTen + " " + readOne;
        }
        return read;
    }
}


