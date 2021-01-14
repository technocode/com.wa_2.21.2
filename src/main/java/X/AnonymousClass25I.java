package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.25I  reason: invalid class name */
public class AnonymousClass25I extends AbstractC07100Vx {
    public static AnonymousClass11B A0B = new C33561gy();
    public static AnonymousClass11B A0C = new C33621h5();
    public static AnonymousClass11B A0D = new C33601h3();
    public static AnonymousClass11B A0E = new C33591h2();
    public static AnonymousClass11B A0F = new C33611h4();
    public static AnonymousClass11B A0G = new C33571gz();
    public static AnonymousClass11B A0H = new C33631h6();
    public static AnonymousClass11B A0I = new C33581h0();
    public static AnonymousClass11B A0J = new AnonymousClass1h1();
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public AbstractC16370ph A03;
    public AbstractC30661bi A04;
    public AnonymousClass11H A05;
    public AnonymousClass276 A06;
    public Integer A07;
    public List A08;
    public List A09;
    public final long A0A;

    public AnonymousClass25I(long j) {
        super(AnonymousClass11D.VIEW);
        this.A0A = j;
        AnonymousClass11C[] r3 = {new AnonymousClass11C(this, A0G), new AnonymousClass11C(this, A0B), new AnonymousClass11C(this, A0I), new AnonymousClass11C(this, A0J), new AnonymousClass11C(this, A0E), new AnonymousClass11C(this, A0D), new AnonymousClass11C(this, A0F), new AnonymousClass11C(this, A0C), new AnonymousClass11C(this, A0H)};
        for (int i = 0; i < 9; i++) {
            A07(r3[i]);
        }
    }

    public void A08(AbstractC16450pp r3) {
        List list = this.A09;
        if (list == null) {
            list = new ArrayList(4);
            this.A09 = list;
        }
        list.add(r3);
    }

    @Override // X.AbstractC07100Vx, X.AbstractC009105u
    public /* bridge */ /* synthetic */ AbstractC009105u ABr() {
        return super.ABr();
    }
}
