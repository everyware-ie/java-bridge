package bridge;

import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private final Moderator moderator;

    public BridgeGame(Moderator moderator) {
        this.moderator = moderator;
    }

    public void start() {
        moderator.speakStart();

        BridgeMaker bridgeMaker = new BridgeMaker(new BridgeRandomNumberGenerator());

        int size = moderator.sendSize();
        List<String> bridge = bridgeMaker.makeBridge(size);

        int index = 0;
        while (true) {
            if (index == size) break;

            String target = bridge.get(index);

            // TODO: 이동

        }
    }

    public void run(String target) {

        moderator.sendMoving();
        move()
    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean move(String userStr, String target) {
        return userStr == target;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry(int tryRound) {
        tryRound++;

    }
}
