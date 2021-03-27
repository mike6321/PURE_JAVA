package me.choi.optional.example03;

import java.util.Optional;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 12:42 오후
 */
public class OnlineClass {

    private Integer id;

    private String title;

    private boolean closed;

    private Progress progress;

    public OnlineClass(Integer id, String title, boolean closed) {
        this.id = id;
        this.title = title;
        this.closed = closed;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isClosed() {
        return closed;
    }

    public Optional<Progress> getProgress() {
        return Optional.ofNullable(progress);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }


    public void setProgress2(Optional<Progress> progress) {
//        this.progress = progress;
        
        // TODO: 파라미터로 Optional을 사용하면 적절할까? 2021/03/05 1:00 오후
        /**
         * 아래와 같이 작성할 수 있지만 클라이언트가 null을 세팅할 수 있다.
         * 그렇다면 코드만 길어지고 NPE 발생
         * spring_boot.setProgress(null);
         * */
        progress.ifPresent(opt -> this.progress = opt);
    }
}
