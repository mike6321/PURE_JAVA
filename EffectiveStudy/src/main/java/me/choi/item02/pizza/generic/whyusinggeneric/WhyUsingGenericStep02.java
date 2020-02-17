package me.choi.item02.pizza.generic.whyusinggeneric;

public class WhyUsingGenericStep02 {

    /* 2가지 방식의 클래스 선언
    *  Object 클래스로 선언 한것은 객체를 호출할떄마다
    * 그게맞는 타입으로 타입 전환이 필요하다.
    * */
    public class Shop{

        public Shop() {}
        private Object obj;

        public Object getObj() {
            return obj;
        }

        public void setObj(Object obj) {
            this.obj = obj;
        }
    }

    /*
    * 제네릭 타입을 사용하면
    * 오브젝트 타입과 달리 타입캐스팅이 일어나지 않고
    * 지연스럽게 호출하는 타입으로 변환한다.
    * */
    public class Shop2<T>{
        private T t;

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }
    }
}


