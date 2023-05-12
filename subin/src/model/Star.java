package model;

public class Star {
    private int line;
    private int style; // 별찍기 스타일

    public Star() {
    }

    public Star(int line, int style) {
        this.line = line;
        this.style = style;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }
}
