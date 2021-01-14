package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;

/* renamed from: X.1qd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38901qd implements AbstractC27251Ot {
    public final /* synthetic */ AnonymousClass0XK A00;
    public final /* synthetic */ Jid A01;
    public final /* synthetic */ AnonymousClass3M7 A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C38901qd(AnonymousClass0XK r1, AnonymousClass3M7 r2, String str, Jid jid) {
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = str;
        this.A01 = jid;
    }

    @Override // X.AbstractC27251Ot
    public final void AIE(C27241Os r8, boolean z) {
        String str;
        C670236x r0;
        AnonymousClass0XK r6 = this.A00;
        AnonymousClass3M7 r5 = this.A02;
        String str2 = this.A03;
        Jid jid = this.A01;
        if (z) {
            if (r8 == null || !r8.A0A() || (r0 = r8.A08) == null) {
                str = null;
            } else {
                str = r0.A02;
            }
            if (!TextUtils.isEmpty(str)) {
                r5.A00 = str;
                r6.A12.A01(str2, r5, 40);
                r6.A0B.A09(str2, jid, "web");
                return;
            }
            r6.A13.A0E(str2, 404);
            r6.A0B.A09(str2, jid, "web");
        }
    }
}
