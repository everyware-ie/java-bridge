package bridge;

import static camp.nextstep.edu.missionutils.Console.readLine;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        return Integer.parseInt(readLine());
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        String nextMoving = readLine();
        isValidated(nextMoving, "U", "D");
        return nextMoving;
    }

    private void isValidated(String word, String option1, String option2) {
        if (word != option1 && word != option2)
            throw new IllegalArgumentException("[ERROR] 이동할 수 있는 칸은 " + option1+ " 또는 " + option2 + "만 가능합니다.");
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
        String retryOption = readLine();
        isValidated(retryOption, "R", "Q");
        return retryOption;
    }
}
