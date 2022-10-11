package lesson5;

class Test20 {
    int summa(int x, int y, int z) {
        int result = x + y + z;
        return result;
    }

    int sredneeArifm (int a1, int b1, int c1) {
        int result2 = summa(a1,b1,c1)/3;
        return result2;
    }

    static class Test21 {

        public static void main(String[] args) {
            Test20 t = new Test20();
            System.out.println(t.summa(2,3,4));

            System.out.println(t.sredneeArifm(20,40,60));

        }
    }
}