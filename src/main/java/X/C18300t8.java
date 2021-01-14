package X;

import java.nio.FloatBuffer;

/* renamed from: X.0t8  reason: invalid class name and case insensitive filesystem */
public class C18300t8 {
    public static final FloatBuffer A07;
    public static final FloatBuffer A08 = C18340tC.A02(A0E);
    public static final FloatBuffer A09;
    public static final FloatBuffer A0A = C18340tC.A02(A0G);
    public static final FloatBuffer A0B;
    public static final FloatBuffer A0C = C18340tC.A02(A0I);
    public static final float[] A0D;
    public static final float[] A0E = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] A0F;
    public static final float[] A0G = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public static final float[] A0H;
    public static final float[] A0I = {0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    public int A00 = 2;
    public int A01 = 8;
    public int A02 = (A0D.length / 2);
    public int A03 = 8;
    public EnumC18290t7 A04;
    public FloatBuffer A05 = A08;
    public FloatBuffer A06 = A07;

    static {
        float[] fArr = {0.0f, 0.57735026f, -0.5f, -0.28867513f, 0.5f, -0.28867513f};
        A0H = fArr;
        A0B = C18340tC.A02(fArr);
        float[] fArr2 = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
        A0F = fArr2;
        A09 = C18340tC.A02(fArr2);
        float[] fArr3 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A0D = fArr3;
        A07 = C18340tC.A02(fArr3);
    }

    public C18300t8(EnumC18290t7 r4) {
        this.A04 = r4;
    }

    public String toString() {
        EnumC18290t7 r2 = this.A04;
        if (r2 == null) {
            return "[Drawable2d: ...]";
        }
        StringBuilder A0S = AnonymousClass008.A0S("[Drawable2d: ");
        A0S.append(r2);
        A0S.append("]");
        return A0S.toString();
    }
}
