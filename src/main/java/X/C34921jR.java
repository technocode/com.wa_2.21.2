package X;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: X.1jR  reason: invalid class name and case insensitive filesystem */
public final class C34921jR implements AnonymousClass17D {
    public final /* synthetic */ AnonymousClass178 A00;
    public final /* synthetic */ AnonymousClass260 A01;
    public final /* synthetic */ C34881jN A02;
    public final /* synthetic */ boolean A03;

    public C34921jR(C34881jN r1, AnonymousClass260 r2, boolean z, AnonymousClass178 r4) {
        this.A02 = r1;
        this.A01 = r2;
        this.A03 = z;
        this.A00 = r4;
    }

    @Override // X.AnonymousClass17D
    public final void AJX(AnonymousClass17C r5) {
        Status status = (Status) r5;
        C34881jN r3 = this.A02;
        C234916a A002 = C234916a.A00(r3.A07);
        String A04 = A002.A04("defaultGoogleSignInAccount");
        A002.A05("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(A04)) {
            A002.A05(C234916a.A01("googleSignInAccount", A04));
            A002.A05(C234916a.A01("googleSignInOptions", A04));
        }
        if (status.A01 <= 0 && r3.A04()) {
            r3.A03();
            r3.A02();
        }
        this.A01.A06(status);
        if (this.A03) {
            this.A00.A03();
        }
    }
}
