package model;

public class Example {
    // 알맞은 필드를 생성해 주세요
    private int num1;
    private String str;

    // 생성자를 만들어 주세요
    // 오버로딩을 사용해서 만들어 주셔도 좋아요
    public Example() {

    }

    // 오버로딩을 사용해서 만들었답니다 !
    public Example(int num1) {
        this.num1 = num1;
    }

    public Example(int num1, String str) {
        this.num1 = num1;
        this.str = str;
    }

    // 여기에 비즈니스 로직을 만들어 주세요 !
    public int square(int number) {
        return number * number;
    }

    // getter, setter 를 만드는 연습을 해 주셔도 좋아요


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
