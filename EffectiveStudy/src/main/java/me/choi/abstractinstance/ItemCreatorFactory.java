package me.choi.abstractinstance;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:06 오전
 */
abstract public class ItemCreatorFactory {

    public void templateMethod() {
        process();
        requestItemInfo();
        createLogMessage();
    }

    protected abstract void createLogMessage();

    private void process() {
        System.out.println("프로세스를 구동합니다...");
    }

    abstract protected void requestItemInfo();

    //우리가 궁굼한 부분 - 하위 클래스에서 인스턴스 생성
    abstract protected Item createInstance();
}
