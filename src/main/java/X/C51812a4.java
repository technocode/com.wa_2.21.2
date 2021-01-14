package X;

/* renamed from: X.2a4  reason: invalid class name and case insensitive filesystem */
public class C51812a4 {
    public final /* synthetic */ AnonymousClass2IP A00;
    public final /* synthetic */ AbstractC007503q A01;

    public C51812a4(AnonymousClass2IP r1, AbstractC007503q r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A00(float f, float f2, float f3) {
        AnonymousClass2IP r3 = this.A00;
        r3.A06.animate().setDuration(150).alpha(f);
        r3.A01.animate().setDuration(150).alpha(f2);
        r3.A05.animate().setDuration(150).alpha(f2);
        r3.A02.animate().setDuration(150).alpha(f3);
    }

    public void A01(C007303n r4, int i) {
        if (!r4.equals(this.A01.A0n)) {
            return;
        }
        if (i == 0) {
            A00(1.0f, 0.0f, 0.0f);
        } else if (i == 1) {
            A00(0.0f, 0.0f, 1.0f);
        } else if (i == 2) {
            A00(0.0f, 1.0f, 0.0f);
        }
    }
}
