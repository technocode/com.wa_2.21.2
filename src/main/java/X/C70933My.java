package X;

import com.whatsapp.util.Log;

/* renamed from: X.3My  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70933My implements AbstractC011806y {
    public final /* synthetic */ AnonymousClass0XF A00;

    public /* synthetic */ C70933My(AnonymousClass0XF r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC011806y
    public final void AFt(Exception exc) {
        AnonymousClass0XF r1 = this.A00;
        String message = exc.getMessage();
        int i = 500;
        if (exc instanceof AnonymousClass170) {
            i = ((AnonymousClass170) exc).mStatus.A01;
        }
        r1.A01.A0O(null, i, message);
        Log.e("requestAttestation/onError", exc);
    }
}
