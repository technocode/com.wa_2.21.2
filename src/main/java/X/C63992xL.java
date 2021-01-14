package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.2xL  reason: invalid class name and case insensitive filesystem */
public class C63992xL {
    public static final int[][] A01 = {new int[]{129324}, new int[]{128545}, new int[]{128544}, new int[]{128548}, new int[]{128127}, new int[]{128580}, new int[]{128530}, new int[]{128574}, new int[]{128162}, new int[]{128495}, new int[]{128122}};
    public static final int[][] A02 = {new int[]{127881}, new int[]{127882}, new int[]{127873}, new int[]{127880}, new int[]{128111}, new int[]{128111, 8205, 9794, 65039}, new int[]{128111, 8205, 9792, 65039}, new int[]{128131}, new int[]{128378}, new int[]{128293}, new int[]{11088}, new int[]{10024}, new int[]{128171}, new int[]{127879}, new int[]{127878}, new int[]{127867}, new int[]{129346}, new int[]{127870}, new int[]{127874}, new int[]{127856}};
    public static final int[][] A03 = {new int[]{128075}};
    public static final int[][] A04 = {new int[]{128512}, new int[]{128515}, new int[]{128516}, new int[]{128513}, new int[]{128518}, new int[]{129315}, new int[]{128514}, new int[]{128578}, new int[]{128521}, new int[]{128522}, new int[]{129303}, new int[]{128524}, new int[]{128570}, new int[]{9786}};
    public static final int[][] A05 = {new int[]{128105, 8205, 10084, 65039, 8205, 128139, 8205, 128104}, new int[]{128104, 8205, 10084, 65039, 8205, 128139, 8205, 128104}, new int[]{128105, 8205, 10084, 65039, 8205, 128139, 8205, 128105}, new int[]{128105, 8205, 10084, 65039, 8205, 128104}, new int[]{128104, 8205, 10084, 65039, 8205, 128104}, new int[]{128105, 8205, 10084, 65039, 8205, 128105}, new int[]{128109}, new int[]{128107}, new int[]{128108}, new int[]{128525}, new int[]{129392}, new int[]{128536}, new int[]{128538}, new int[]{128537}, new int[]{10084}, new int[]{128139}, new int[]{10083}, new int[]{128149}, new int[]{128158}, new int[]{128151}, new int[]{128147}, new int[]{128152}, new int[]{128157}, new int[]{128150}, new int[]{128068}, new int[]{127801}, new int[]{128159}, new int[]{128571}, new int[]{128573}};
    public static final int[][] A06 = {new int[]{128148}, new int[]{128546}, new int[]{128557}, new int[]{128542}, new int[]{128533}, new int[]{128577}, new int[]{9785}, new int[]{128532}, new int[]{129301}, new int[]{129402}, new int[]{128575}, new int[]{9748}, new int[]{9928}, new int[]{127783}, new int[]{127785}};
    public final Map A00 = new HashMap();

    public C63992xL() {
        A00(1, A05);
        A00(2, A03);
        A00(3, A04);
        A00(4, A06);
        A00(5, A01);
        A00(6, A02);
    }

    public final void A00(int i, int[][] iArr) {
        HashSet hashSet = new HashSet();
        for (int[] iArr2 : iArr) {
            hashSet.add(new C03960Il(iArr2));
        }
        this.A00.put(Integer.valueOf(i), hashSet);
    }
}
