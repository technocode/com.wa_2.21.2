package X;

/* renamed from: X.25Y  reason: invalid class name */
public final class AnonymousClass25Y extends AbstractC34121hw {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass12R A03;

    public AnonymousClass25Y(AnonymousClass12R r3, int i) {
        super(new C34221i6(i));
        this.A03 = r3;
        int A002 = r3.A00();
        this.A00 = A002;
        this.A01 = r3.A01();
        this.A02 = i;
        if (A002 > 0 && i > Integer.MAX_VALUE / A002) {
            throw new IllegalStateException("LoopingMediaSource contains too many periods");
        }
    }
}
