package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0fJ  reason: invalid class name and case insensitive filesystem */
public class C10850fJ extends AnonymousClass0JW {
    public int A00;
    public long A01 = 1;
    public C28511Up A02;
    public AbstractC007503q A03;
    public final AnonymousClass01K A04 = AnonymousClass01K.A00();
    public final AnonymousClass0AM A05 = AnonymousClass0AM.A00();
    public final C08680bX A06;
    public final AnonymousClass095 A07 = AnonymousClass095.A00();
    public final AnonymousClass02N A08;
    public final AbstractC007503q A09;
    public final WeakReference A0A;
    public final boolean A0B;

    public C10850fJ(AbstractC03710Hi r3, C08680bX r4, boolean z, AbstractC007503q r6) {
        AnonymousClass02N r0 = r4.A05;
        if (r0 != null) {
            this.A08 = r0;
            this.A06 = r4;
            this.A0B = z;
            this.A09 = r6;
            this.A0A = new WeakReference(r3);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        AbstractC03710Hi r3 = (AbstractC03710Hi) this.A0A.get();
        long A052 = this.A05.A05();
        this.A01 = A052;
        if (r3 != null) {
            r3.AEf(this.A0B, A052);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AbstractC03710Hi r0 = (AbstractC03710Hi) this.A0A.get();
        if (r0 != null) {
            r0.AEe(this.A02, this.A03, this.A00, this.A01);
        }
    }
}
