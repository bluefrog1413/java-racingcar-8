package racingcar;

public class Cars {
    private final String[] carName;

    public Cars(String name) {
        String separator = ",";

        this.carName = name.split(separator);
    }

    public String[] getNames() {
        return carName;
    }

}