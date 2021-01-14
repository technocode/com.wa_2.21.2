package X;

import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.0Xw  reason: invalid class name and case insensitive filesystem */
public class C07490Xw implements AnonymousClass0C0 {
    public static volatile C07490Xw A03;
    public final C02750Dh A00;
    public final AnonymousClass0AR A01;
    public final C28991Wn A02;

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{212};
    }

    public C07490Xw(AnonymousClass0AR r1, C02750Dh r2, C28991Wn r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    @Override // X.AnonymousClass0C0
    public boolean AAE(int i, Message message) {
        if (i != 212) {
            return false;
        }
        AnonymousClass1XX r6 = (AnonymousClass1XX) message.obj;
        if (r6 != null) {
            AbstractC28981Wm A012 = this.A02.A01(1, r6.A00);
            if (A012 != null) {
                A012.A01(3);
            }
            C02750Dh r5 = this.A00;
            DeviceJid of = DeviceJid.of(r6.A01);
            String str = r6.A07;
            if (of != null && !TextUtils.isEmpty(str)) {
                r5.A0F.ANF(new RunnableEBaseShape0S1200000_I0(r5, of, str, 9));
            }
            this.A01.A0M(r6);
            return true;
        }
        throw null;
    }
}
