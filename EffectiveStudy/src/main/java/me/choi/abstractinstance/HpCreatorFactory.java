package me.choi.abstractinstance;

/**
 * Project : EffectiveStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:08 오전
 */
public class HpCreatorFactory extends ItemCreatorFactory{
    @Override
    protected void createLogMessage() {
        System.out.println("Hp 로그 메세지 생성");
    }

    @Override
    protected void requestItemInfo() {
        System.out.println("Hp 아이템 정보");
    }

    //하위 클래스에서 인스턴스 생성
    @Override
    protected Item createInstance() {
        return new HpPotion();
    }
}
