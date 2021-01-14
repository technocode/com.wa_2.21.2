package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3I2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3I2 implements AbstractC61032sO {
    public final /* synthetic */ C73773Yq A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass3I2(C73773Yq r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    @Override // X.AbstractC61032sO
    public final void AJh(boolean z, boolean z2, String str, String str2, UserJid userJid, boolean z3, C61072sS r12) {
        C73773Yq r3 = this.A00;
        String str3 = this.A01;
        r3.A0B(false);
        if (!z || r12 != null) {
            if (!z3) {
                if (r12 != null) {
                    C63372wJ r4 = new C63372wJ(8);
                    AnonymousClass01X r2 = r3.A0I;
                    String A06 = r2.A06(C69293Gm.A00(r12.code, r3.A03.A04));
                    if (TextUtils.isEmpty(A06)) {
                        A06 = r2.A06(R.string.payment_invalid_vpa_error_text);
                    }
                    r4.A07 = A06;
                    ((AnonymousClass3IE) r3).A06.A07(r4);
                    return;
                }
                r3.A0R.A04("Unable to validate the receiver to send payment again");
                return;
            }
        } else if (!z3) {
            AnonymousClass3I9 r1 = new AnonymousClass3I9(105);
            r1.A04 = str3;
            r1.A09 = str2;
            r1.A08 = str;
            ((AnonymousClass3IE) r3).A06.A07(r1);
            return;
        }
        C63372wJ r13 = new C63372wJ(13);
        r13.A05 = userJid;
        r13.A0A = str3;
        ((AnonymousClass3IE) r3).A06.A07(r13);
    }
}
