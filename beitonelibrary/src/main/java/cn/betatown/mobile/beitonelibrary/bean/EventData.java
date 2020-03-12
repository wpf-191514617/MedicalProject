package cn.betatown.mobile.beitonelibrary.bean;

public class EventData<T> {

    public int CODE;

    public T DATA;

    public EventData(int CODE) {
        this.CODE = CODE;
    }

    public EventData(int CODE, T DATA) {
        this.CODE = CODE;
        this.DATA = DATA;
    }
}
