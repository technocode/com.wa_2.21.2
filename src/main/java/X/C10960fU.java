package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0fU  reason: invalid class name and case insensitive filesystem */
public class C10960fU extends AnonymousClass0JW {
    public WeakReference A00;
    public final C02430Bz A01;
    public final AbstractC28721Vm A02;
    public final AnonymousClass0C4 A03;

    public C10960fU(AnonymousClass0C4 r2, C02430Bz r3, AbstractC28721Vm r4, AbstractC09120cK r5) {
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = new WeakReference(r5);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass2FA r5 = (AnonymousClass2FA) obj;
        AbstractC09120cK r3 = (AbstractC09120cK) this.A00.get();
        if (r3 != null) {
            r3.AII(r5.A02, r5.A00, r5.A01);
        }
    }
}
