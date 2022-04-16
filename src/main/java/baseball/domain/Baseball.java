package baseball.domain;

import baseball.exception.InvalidParameterError;
import baseball.message.ErrorMessage;

import java.util.HashSet;

public class Baseball {
    public static final int BASEBALL_DIGITS = 3;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;

    public static void validateInput(String inputBaseball) {
        validateDigits(inputBaseball);
        validateType(inputBaseball);
        validateUnique(inputBaseball);
    }

    public static void validateDigits(String inputBaseball) {
        if (inputBaseball.length() != BASEBALL_DIGITS) {
            throw new InvalidParameterError(ErrorMessage.DIGITS_ERROR);
        }
    }

    public static void validateType(String inputBaseball) {
        final String NUMBER_VALID_REGEX = "^[1-9]+$";

        if (!inputBaseball.matches(NUMBER_VALID_REGEX)) {
            throw new InvalidParameterError(ErrorMessage.TYPE_ERROR);
        }
    }

    public static void validateUnique(String inputBaseball) {
        HashSet<String> baseballSet = new HashSet<>();
        for (String input : inputBaseball.split("")) {
            baseballSet.add(input);
        }

        if (baseballSet.size() != BASEBALL_DIGITS) {
            throw new InvalidParameterError(ErrorMessage.DUPLICATE_ERROR);
        }
    }
}
