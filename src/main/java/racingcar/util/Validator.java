package racingcar.util;

import org.assertj.core.api.ThrowableAssert;

public class Validator {

    public void validParseInt(String input) throws IllegalArgumentException {
        try {
            int inputInt = Integer.parseInt(input);
            validRangeNumber(inputInt);
        }catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자 값을 입력해주세요.");
        }
    }

    public void validRangeNumber(int input) throws IllegalArgumentException {
        if (0 >= input) {
            throw new IllegalArgumentException("1~2147483647의 값을 입력해주세요.");
        }
    }

    public void validName(String input) {
        if(input.length() <= 0 || input.length() > 5) {
            throw new IllegalArgumentException("이름은 1~5 크기로 입력해주세요.");
        }
    }

}
