package X;

import java.nio.ByteBuffer;

/* renamed from: X.2EV  reason: invalid class name */
public class AnonymousClass2EV {
    public static final int[] A0A = {2, 3, 4, 6, 8};
    public ByteBuffer A00;
    public final AbstractC19820vf A01;
    public final AnonymousClass2EU A02 = new AnonymousClass2EU();
    public final AnonymousClass2EY A03;
    public final AnonymousClass2EZ A04 = new AnonymousClass2EZ();
    public final AbstractC46582Ea A05;
    public final Object A06 = new Object();
    public volatile boolean A07;
    public volatile boolean A08;
    public volatile boolean A09;

    public AnonymousClass2EV(C50862Wj r5) {
        C50892Wm r3 = new C50892Wm(this);
        this.A05 = r3;
        this.A01 = new C50872Wk(this);
        this.A03 = new AnonymousClass2EY(3, r3, new C50882Wl(r5));
    }

    public void A00() {
        if (this.A08) {
            this.A08 = false;
            this.A03.A01();
        }
    }
}
