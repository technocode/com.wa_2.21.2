package X;

import java.util.HashMap;

/* renamed from: X.33S  reason: invalid class name */
public class AnonymousClass33S {
    public static final int[][] A01 = {new int[]{128512}, new int[]{128515}, new int[]{128516}, new int[]{128513}, new int[]{128518}, new int[]{128517}, new int[]{128514}, new int[]{129315}, new int[]{128578}, new int[]{128539}, new int[]{128541}, new int[]{128540}, new int[]{129322}, new int[]{129303}, new int[]{128570}, new int[]{128568}, new int[]{128569}, new int[]{9786}};
    public static final int[][] A02 = {new int[]{10084}, new int[]{128525}, new int[]{128536}, new int[]{128149}, new int[]{128571}, new int[]{128145}, new int[]{128105, 8205, 10084, 8205, 128105}, new int[]{128104, 8205, 10084, 8205, 128104}, new int[]{128143}, new int[]{128105, 8205, 10084, 8205, 128139, 8205, 128105}, new int[]{128104, 8205, 10084, 8205, 128139, 8205, 128104}, new int[]{10084}, new int[]{129505}, new int[]{128155}, new int[]{128154}, new int[]{128153}, new int[]{128156}, new int[]{128420}, new int[]{128148}, new int[]{10083}, new int[]{128149}, new int[]{128158}, new int[]{128147}, new int[]{128151}, new int[]{128150}, new int[]{128152}, new int[]{128157}, new int[]{128159}, new int[]{9829}, new int[]{128140}, new int[]{128139}};
    public static final int[][] A03 = {new int[]{9785}, new int[]{128547}, new int[]{128534}, new int[]{128555}, new int[]{128553}, new int[]{128546}, new int[]{128557}, new int[]{128542}, new int[]{128532}, new int[]{128543}, new int[]{128533}, new int[]{128548}, new int[]{128544}, new int[]{128549}, new int[]{128560}, new int[]{128552}, new int[]{128575}, new int[]{128574}, new int[]{128531}, new int[]{128589, 8205, 9794}, new int[]{128589, 8205, 9792}};
    public static final int[][] A04 = {new int[]{128559}, new int[]{128550}, new int[]{128551}, new int[]{128558}, new int[]{128562}, new int[]{128576}, new int[]{128561}, new int[]{129327}, new int[]{128563}, new int[]{128576}, new int[]{10071}, new int[]{10069}, new int[]{129325}};
    public HashMap A00;

    public AnonymousClass33S() {
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            this.A00 = new HashMap();
        } else {
            hashMap.clear();
        }
        A00(A01, 1);
        A00(A04, 8);
        A00(A03, 4);
        A00(A02, 2);
    }

    public final void A00(int[][] iArr, int i) {
        int i2;
        for (int[] iArr2 : iArr) {
            C03960Il r2 = new C03960Il(iArr2);
            if (this.A00.containsKey(r2)) {
                i2 = ((Number) this.A00.get(r2)).intValue();
            } else {
                i2 = 0;
            }
            this.A00.put(r2, Integer.valueOf(i2 | i));
        }
    }
}
