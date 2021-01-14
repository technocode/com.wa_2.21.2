package X;

import android.app.Activity;
import com.google.android.search.verification.client.R;
import com.whatsapp.UnblockDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2sX  reason: invalid class name and case insensitive filesystem */
public class C61122sX {
    public static volatile C61122sX A06;
    public final AnonymousClass0GG A00;
    public final AnonymousClass01A A01;
    public final C014308b A02;
    public final AnonymousClass01X A03;
    public final C03340Fu A04;
    public final C01970Ad A05;

    public C61122sX(AnonymousClass01A r1, C014308b r2, AnonymousClass01X r3, C01970Ad r4, AnonymousClass0GG r5, C03340Fu r6) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r4;
        this.A00 = r5;
        this.A04 = r6;
    }

    public static C61122sX A00() {
        if (A06 == null) {
            synchronized (C61122sX.class) {
                if (A06 == null) {
                    A06 = new C61122sX(AnonymousClass01A.A00(), C014308b.A00(), AnonymousClass01X.A00(), C01970Ad.A00(), AnonymousClass0GG.A00(), C03340Fu.A00());
                }
            }
        }
        return A06;
    }

    public void A01(Activity activity, UserJid userJid, String str, boolean z, boolean z2, AnonymousClass1KW r13) {
        String str2;
        boolean z3 = false;
        if (userJid != null) {
            z3 = true;
        }
        AnonymousClass01X r5 = this.A03;
        int i = R.string.payment_unblock_ask;
        if (z2) {
            i = R.string.payment_unblock_reject_ask;
        }
        Object[] objArr = new Object[1];
        if (z3) {
            str2 = this.A02.A08(this.A01.A0A(userJid), false);
        } else {
            str2 = str;
        }
        objArr[0] = str2;
        String A0D = r5.A0D(i, objArr);
        AnonymousClass1O8 r1 = null;
        if (z3) {
            r1 = new AnonymousClass3DH(this, activity, r13, userJid);
        } else if (this.A05.A03().A5X() != null) {
            r1 = new AnonymousClass3DI(this, activity, str, r13);
        }
        ((AbstractC004502c) activity).APm(UnblockDialogFragment.A00(A0D, 0, z, r1));
    }
}
