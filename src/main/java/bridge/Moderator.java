package bridge;

public class Moderator {
    InputView inputView = new InputView();

    public void speakStart() {
        System.out.println("다리 건너기 게임을 시작합니다.");
    }

    // 사용자에게 size를 입력받아서 전달하자 사회자가
    public int sendSize(){
        System.out.println("다리의 길이를 입력해주세요.");

        return inputView.readBridgeSize();
    }

    // 사용자에게 이동할 방향을 입력받아 전달하는 메서드
    public String sendMoving() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");

        return inputView.readMoving();
    }


}
