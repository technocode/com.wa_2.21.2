package X;

/* renamed from: X.3ID  reason: invalid class name */
public class AnonymousClass3ID implements AnonymousClass0GT {
    public final /* synthetic */ AbstractC61782tj A00;
    public final /* synthetic */ AnonymousClass3IE A01;

    public AnonymousClass3ID(AnonymousClass3IE r1, AbstractC61782tj r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0GT
    public void AJP(C61072sS r4) {
        C018809u r2 = this.A01.A0R;
        StringBuilder sb = new StringBuilder("syncPendingTransaction onRequestError: ");
        sb.append(r4);
        r2.A07(null, sb.toString(), null);
        AbstractC61782tj r0 = this.A00;
        if (r0 != null) {
            r0.AGY(r4);
        }
    }

    @Override // X.AnonymousClass0GT
    public void AJU(C61072sS r4) {
        C018809u r2 = this.A01.A0R;
        StringBuilder sb = new StringBuilder("syncPendingTransaction onResponseError: ");
        sb.append(r4);
        r2.A07(null, sb.toString(), null);
        AbstractC61782tj r0 = this.A00;
        if (r0 != null) {
            r0.AGY(r4);
        }
    }

    @Override // X.AnonymousClass0GT
    public void AJV(C60982sJ r4) {
        this.A01.A0R.A07(null, "syncPendingTransaction onResponseSuccess", null);
        AbstractC61782tj r0 = this.A00;
        if (r0 != null) {
            r0.AGY(null);
        }
    }
}
