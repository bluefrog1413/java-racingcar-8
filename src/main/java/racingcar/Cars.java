package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    private final String[] carName;
    private final Integer[] position;

    public Cars(String name) {
        String separator = ",";
        this.carName = name.split(separator);
        this.position = new Integer[carName.length];
        Arrays.fill(position, 0);
    }

    public void finalWinner(){
        int max = 0;
        int number = 0;
        List<String> winnerCars = new ArrayList<>();

        for (Integer pos : position) {
            if (max < pos) max = pos;
        }

        for(int i = 0; i < position.length; i++){
            if(max == position[i]) winnerCars.add(carName[i]);
        }

        System.out.println("최종 우승자 : " + String.join(", ", winnerCars));
    }

    public String[] getNames() {
        return carName;
    }

    public Integer[] getPositions() {
        return position;
    }
}