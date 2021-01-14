package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2sF  reason: invalid class name and case insensitive filesystem */
public class C60942sF {
    public static C10180eD A07;
    public static C10170eC A08;
    public C68403Db A00;
    public AbstractC60932sE A01;
    public AnonymousClass3BB A02;
    public final C02010Ah A03;
    public final C02020Ai A04;
    public final C63842x6 A05;
    public final AnonymousClass00T A06;

    public C60942sF(Context context, AnonymousClass02M r17, AnonymousClass01I r18, AnonymousClass00T r19, C63842x6 r20, C02010Ah r21, AnonymousClass04j r22, C03340Fu r23, C02020Ai r24, C68683Ed r25, AnonymousClass0GP r26, C68393Da r27, Context context2, AbstractC60932sE r29, C61082sT r30) {
        this.A06 = r19;
        this.A05 = r20;
        this.A03 = r21;
        this.A04 = r24;
        this.A01 = r29;
        if (AnonymousClass3BB.A02 == null) {
            synchronized (AnonymousClass3BB.class) {
                if (AnonymousClass3BB.A02 == null) {
                    AnonymousClass3BB.A02 = new AnonymousClass3BB();
                    AnonymousClass3BB.A01 = AnonymousClass3BA.A00(context2);
                }
            }
        }
        this.A02 = AnonymousClass3BB.A02;
        r18.A04();
        UserJid userJid = r18.A03;
        if (userJid != null) {
            AnonymousClass3BB r13 = this.A02;
            if (r13 != null) {
                String str = userJid.user;
                if (str != null) {
                    this.A00 = new C68403Db(context, r17, r19, r20, r22, r23, r25, r26, r27, r30, r29, r13, str);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public synchronized void A00() {
        Log.d("PAY: IndiaUpiSetupCoordinator/getChallenge called");
        C63842x6 r4 = this.A05;
        AnonymousClass3BB r5 = this.A02;
        boolean z = false;
        if (!this.A03.A01().getBoolean("payments_sandbox", false)) {
            z = true;
        }
        C10180eD r3 = new C10180eD(r4, r5, z, this.A01, this.A00, this.A04);
        A07 = r3;
        this.A06.ANC(r3, new Void[0]);
    }
}
