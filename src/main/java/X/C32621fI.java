package X;

/* renamed from: X.1fI  reason: invalid class name and case insensitive filesystem */
public class C32621fI implements AbstractC20210wK {
    public final C32691fQ A00;

    public C32621fI(C32691fQ r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC20210wK
    public int A6V(int i) {
        return this.A00.A08[i];
    }

    @Override // X.AbstractC20210wK
    public int getFrameCount() {
        return this.A00.A04.getFrameCount();
    }

    @Override // X.AbstractC20210wK
    public int getLoopCount() {
        return this.A00.A04.getLoopCount();
    }
}
