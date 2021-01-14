package X;

/* renamed from: X.1bG  reason: invalid class name and case insensitive filesystem */
public final class C30381bG implements AbstractC15840on {
    @Override // X.AbstractC15840on
    public boolean AAu(int i, float[] fArr) {
        float f = fArr[2];
        if (f < 0.95f && f > 0.05f) {
            float f2 = fArr[0];
            if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                return true;
            }
        }
        return false;
    }
}
