package racingcar.domain;

public class Name {
    private String value;

    public Name(String value) {
        validCheck(value);
        this.value = value;
    }

    private void validCheck(String value) {
        if (value.length()>5){
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다");
        }
    }

    public String getValue() {
        return value;
    }
}
