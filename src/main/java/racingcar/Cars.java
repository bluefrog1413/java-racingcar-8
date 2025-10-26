package racingcar;

import java.util.Arrays;

public class Cars {
    private final String[] carName;
    private final Integer[] position;

    public Cars(String name) {
        String separator = ",";
        this.carName = name.split(separator);
        this.position = new Integer[carName.length];
        Arrays.fill(position, 0);
    }

    public String[] getNames() {
        return carName;
    }

    public Integer[] getPositions() {
        return position;
    }
}