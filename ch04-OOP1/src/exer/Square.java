package exer;

public class Square {
    //private int m;
    //private int n;
    //
    //public int getM() {
    //    return m;
    //}
    //
    //public void setM(int m) {
    //    this.m = m;
    //}
    //
    //public int getN() {
    //    return n;
    //}
    //
    //public void setN(int n) {
    //    this.n = n;
    //}

    public int method(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        return m * n;
    }
}
