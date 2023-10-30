package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
public class Application {

    public static void main(String[] args) {
        InitData initData = getInitData();

        simulateRace(initData.tryCount(), initData.carNames(), initData.distanceArray());

        // TODO : 결과값 추출



    }

    private static InitData getInitData() {
        System.out.println("경주 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] carNames = Console.readLine().split(",");
        validateCarNames(carNames);

        System.out.println("시도할 회수는 몇회 인가요?");
        int tryCount = getTryCount();
        int[] distanceArray = new int[carNames.length];
        System.out.println();
        InitData initData = new InitData(carNames, tryCount, distanceArray);
        return initData;
    }

    private record InitData(String[] carNames, int tryCount, int[] distanceArray) {

    }

    private static void validateCarNames(String[] carNames) {
        for (int i = 0; i < carNames.length; i++) {
            if (carNames[i].length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자를 넘길수 없습니다.");
            }

            if (!carNames[i].matches("^[0-9a-zA-Z]*$")) {
                throw new IllegalArgumentException("자동차 이름은 영어 숫자만 가능 합니다.");
            }
        }
    }

    private static int getTryCount() {
        String response = Console.readLine();
        int tryCount = validateTryCount(response);
        return tryCount;
    }

    private static int validateTryCount(String response) {
        int tryCount;
        try {
            tryCount = Integer.parseInt(response);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("회수는 숫자만 입력 받을수 있습니다.");
        }
        return tryCount;
    }


    private static void simulateRace(int tryCount, String[] carNames, int[] distanceArray) {
        System.out.println("실행 결과");
        for (int i = 0; i < tryCount; i++) {

            // TODO : print progress

            System.out.println();
        }
    }
}
