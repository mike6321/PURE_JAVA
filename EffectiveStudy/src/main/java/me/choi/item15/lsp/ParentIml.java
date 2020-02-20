package me.choi.item15.lsp;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/02/20
 * Time : 10:06 오후
 */
public interface ParentIml {
    void test();
}
class concreteChild2 implements ParentIml{
    /*부모는 private-package라도 자식은 항상 public으로 선언해야 한다.*/
    @Override
    public void test() {

    }
}
