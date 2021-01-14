package X;

/* renamed from: X.0lH  reason: invalid class name and case insensitive filesystem */
public class C13950lH {
    public int A00;
    public final Object[] A01 = new Object[256];

    public void A00(Object obj) {
        int i = this.A00;
        Object[] objArr = this.A01;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.A00 = i + 1;
        }
    }
}
