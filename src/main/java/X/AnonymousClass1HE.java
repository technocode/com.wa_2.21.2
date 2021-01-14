package X;

/* renamed from: X.1HE  reason: invalid class name */
public class AnonymousClass1HE {
    public final AnonymousClass1HA A00;
    public final Object[] A01;

    public AnonymousClass1HE(AnonymousClass1HA r3, Object[] objArr) {
        if (r3 != null) {
            this.A00 = r3;
            this.A01 = objArr;
            if (objArr != null && objArr.length <= 0) {
                throw new IllegalArgumentException("boundArgs must not be empty; use null");
            }
            return;
        }
        throw null;
    }
}
