package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.0fK  reason: invalid class name and case insensitive filesystem */
public class C10860fK extends AnonymousClass0JW {
    public final AnonymousClass0EH A00;
    public final C007003k A01;
    public final WeakReference A02;

    public C10860fK(C007003k r2, AnonymousClass0EH r3, AnonymousClass2Z5 r4) {
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = new WeakReference(r4);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        UserJid userJid;
        AnonymousClass2Z5 r1;
        C12130hb r5 = (C12130hb) obj;
        UserJid userJid2 = null;
        if (r5 != null) {
            UserJid userJid3 = r5.A00;
            userJid = r5.A01;
            if (userJid3 == null || userJid == null) {
                Log.e("ChangeNumberNotificationBanner/GetChangeNumberMessageTask trying to show change number message for non-user jids");
            } else {
                userJid2 = userJid3;
                r1 = (AnonymousClass2Z5) this.A02.get();
                if (r1 != null && userJid2 != null && userJid != null) {
                    r1.A02 = userJid2;
                    r1.A03 = userJid;
                    if (r1.A03()) {
                        if (r1.A04()) {
                            r1.A05();
                            return;
                        } else {
                            r1.A04.postDelayed(new RunnableEBaseShape2S0100000_I0_2(r1, 33), 500);
                            return;
                        }
                    } else if (r1.A04()) {
                        r1.A02(true);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        userJid = null;
        r1 = (AnonymousClass2Z5) this.A02.get();
        if (r1 != null) {
        }
    }
}
