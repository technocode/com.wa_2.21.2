package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.3Fz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69163Fz implements AnonymousClass0SG {
    public final /* synthetic */ AnonymousClass3YJ A00;

    public /* synthetic */ C69163Fz(AnonymousClass3YJ r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        AnonymousClass3YJ r1 = this.A00;
        if (((Boolean) obj).booleanValue()) {
            r1.A00.A0G(R.string.payment_vpa_verify_in_progress);
        } else {
            r1.A00.AMi();
        }
    }
}
