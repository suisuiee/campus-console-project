package ex;

public class SampleTest {
    static int thisIsStaticIntVariable;

    static void thisMethodIsNotInstance() {
        System.out.println("SampleTest.thisMethodIsNotInstance");

    }
    private int sampleNumber;

    public SampleTest() {
    }

    public SampleTest(int sampleNumber) {
        System.out.println("sampleNumber = " + sampleNumber);
        this.sampleNumber = sampleNumber;
    }

}

class SampleMain {
    public static void main(String[] args) {
        SampleTest st = new SampleTest(10);

    }
}
