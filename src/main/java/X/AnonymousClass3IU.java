package X;

import android.app.Activity;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.3IU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3IU implements AbstractC61032sO {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C63832x5 A01;
    public final /* synthetic */ AnonymousClass3IZ A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ AnonymousClass3IU(C63832x5 r1, AnonymousClass3IZ r2, Activity activity, String str) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = activity;
        this.A03 = str;
    }

    @Override // X.AbstractC61032sO
    public final void AJh(boolean z, boolean z2, String str, String str2, UserJid userJid, boolean z3, C61072sS r15) {
        C63832x5 r1 = this.A01;
        AnonymousClass3IZ r0 = this.A02;
        Activity activity = this.A00;
        String str3 = this.A03;
        if (!z || r15 != null) {
            C69693Ia r2 = r0.A00;
            r2.A01.A07(Boolean.FALSE);
            C63872x9 r12 = new C63872x9(1);
            r12.A01 = r15;
            r2.A02.A07(r12);
        } else if (z3) {
            r1.A00.A01(activity, userJid, str3, true, false, new AnonymousClass3IT(r0, str, str2, z2));
        } else {
            C69693Ia r4 = r0.A00;
            C61992u4 A022 = r4.A02();
            A022.A0A = z2;
            if ("PAY_INTENT".equals(r4.A03) && !TextUtils.isEmpty(A022.A03)) {
                C05900Qy A002 = C05900Qy.A00(A022.A03, C05880Qw.A01.A5z());
                BigDecimal bigDecimal = new BigDecimal(r4.A05.A06(AbstractC000400g.A3m));
                if (!z2 && A002.A00.compareTo(bigDecimal) > 0) {
                    C63872x9 r22 = new C63872x9(7);
                    r22.A02 = C05880Qw.A01.A4S(r4.A06, bigDecimal);
                    r4.A02.A07(r22);
                    return;
                }
            }
            r4.A00.A07(A022);
            C69693Ia.A00(r4);
        }
    }
}
