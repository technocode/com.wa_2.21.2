package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3EB  reason: invalid class name */
public class AnonymousClass3EB extends C61432tA {
    public final Context A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass01I A02;
    public final AnonymousClass04j A03;
    public final C68393Da A04;
    public final AnonymousClass0GP A05;
    public final C01970Ad A06;
    public final C68683Ed A07;

    public AnonymousClass3EB(Context context, AnonymousClass02M r2, AnonymousClass01I r3, C01970Ad r4, AnonymousClass04j r5, C03340Fu r6, C68683Ed r7, AnonymousClass0GP r8, C68393Da r9, C61082sT r10) {
        super(r6, r10);
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r4;
        this.A03 = r5;
        this.A07 = r7;
        this.A05 = r8;
        this.A04 = r9;
    }

    public void A00(UserJid userJid, AbstractC61382t5 r21) {
        AnonymousClass008.A14("PAY: sendGetContactInfoForJid: ", userJid);
        this.A07.AQ7();
        C61082sT r11 = super.A00;
        if (r11 != null) {
            r11.A03("upi-get-vpa");
        }
        super.A01.A09(false, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "upi-get-vpa", null, (byte) 0), new AnonymousClass0OS("user", userJid)}, null, null), new C74563b8(this, this.A00, this.A01, this.A03, this.A05, r11, r21), 0);
    }
}
