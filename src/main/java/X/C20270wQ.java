package X;

/* renamed from: X.0wQ  reason: invalid class name and case insensitive filesystem */
public class C20270wQ {
    public long A00 = -1;
    public final AbstractC20210wK A01;

    public C20270wQ(AbstractC20210wK r3) {
        this.A01 = r3;
    }

    public long A00() {
        long j = this.A00;
        if (j != -1) {
            return j;
        }
        this.A00 = 0;
        AbstractC20210wK r6 = this.A01;
        int frameCount = r6.getFrameCount();
        for (int i = 0; i < frameCount; i++) {
            this.A00 += (long) r6.A6V(i);
        }
        return this.A00;
    }
}
