package X;

/* renamed from: X.0x2  reason: invalid class name and case insensitive filesystem */
public class C20630x2 {
    public int A00;
    public int A01;

    public void A00(int i) {
        int i2;
        int i3 = this.A01;
        if (i3 < i || (i2 = this.A00) <= 0) {
            C19960vt.A00("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(this.A00));
            return;
        }
        this.A00 = i2 - 1;
        this.A01 = i3 - i;
    }
}
