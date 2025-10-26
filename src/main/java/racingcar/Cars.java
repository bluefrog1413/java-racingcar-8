package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    private final String[] carName;
    private final Integer[] position;

    public Cars(String name) {
        name = name.replace(" ","");

        String separator = ",";
        this.carName = name.split(separator);
        this.position = new Integer[carName.length];
        Arrays.fill(position, 0);

        exceptionCarName();
    }

    public void exceptionCarName(){
        for(String name : carName){
            if(name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
            }

            if(!IsDigit(name)) throw new IllegalArgumentException("자동차 이름은 문자만 가능합니다.");
        }
    }

    public boolean IsDigit(String name){
        boolean isChar = true;
        for(int i = 0; i < name.length(); i++){
            if(Character.isDigit(name.charAt(i))) isChar = false;
        }
        return isChar;
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