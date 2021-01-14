package X;

/* renamed from: X.2hx  reason: invalid class name and case insensitive filesystem */
public class C56032hx implements AnonymousClass0ED {
    public final /* synthetic */ AbstractView$OnCreateContextMenuListenerC56112i5 A00;

    public C56032hx(AbstractView$OnCreateContextMenuListenerC56112i5 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0ED
    public void AKN(AnonymousClass02N r3) {
        AbstractView$OnCreateContextMenuListenerC56112i5 r1 = this.A00;
        if (r3.equals(r1.A0e)) {
            r1.A0I();
            r1.A0E.invalidateOptionsMenu();
        }
    }

    @Override // X.AnonymousClass0ED
    public void AKd(AnonymousClass02N r4) {
        AbstractView$OnCreateContextMenuListenerC56112i5 r2 = this.A00;
        if (r4.equals(r2.A0e)) {
            C02900Dx r0 = r2.A0o;
            if (r0 != null && r2.A0y.A09(r0.A06)) {
                r2.A0o = null;
            }
            r2.A0I();
            r2.A0E.invalidateOptionsMenu();
        }
    }
}
