package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingStart {
    private final Integer count;

    public RacingStart(int count){
        this.count = count;
    }

    public void racing(Cars cars){
        for(int i = 0; i < count; i++){
            moveCars(cars);
            currentPosition(cars);
            System.out.println();
        }
    }

    public void moveCars(Cars cars){
        for(int i = 0; i < cars.getNames().length; i++){
            int random = Randoms.pickNumberInRange(0,9);
            if(random >= 4) cars.getPositions()[i]++;
        }
    }

    public void currentPosition(Cars cars){
        for(int i = 0; i < cars.getNames().length; i++){
            String carName = cars.getNames()[i];
            int position = cars.getPositions()[i];
            System.out.println(carName + " : " + "-".repeat(position));
        }
    }

    public Integer getCount(){
        return count;
    }
}
