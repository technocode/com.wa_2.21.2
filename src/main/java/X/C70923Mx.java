package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.3Mx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70923Mx implements AbstractC011906z {
    public final /* synthetic */ AnonymousClass0XF A00;

    public /* synthetic */ C70923Mx(AnonymousClass0XF r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC011906z
    public final void AKi(Object obj) {
        AnonymousClass0XF r1 = this.A00;
        String A6z = ((AbstractC36061lW) ((AnonymousClass17B) obj).A00).A6z();
        AnonymousClass0AR r2 = r1.A01;
        if (A6z != null) {
            r2.A0O(A6z, 0, null);
        } else {
            r2.A0O(null, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, "Attestation API returned NULL as JWS result");
        }
        AnonymousClass008.A16("requestAttestation/onSuccess/jws=", A6z);
    }
}
