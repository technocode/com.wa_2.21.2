package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractMap;

/* renamed from: X.08s  reason: invalid class name and case insensitive filesystem */
public class C016008s {
    public static volatile C016008s A04;
    public final C015308l A00;
    public final C014508d A01;
    public final C015708p A02;
    public final C016108t A03 = new C016108t();

    public C016008s(C015308l r2, C014508d r3, C015708p r4) {
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public final void A00(AnonymousClass0OQ r4, UserJid userJid) {
        RunnableEBaseShape2S0200000_I0_1 runnableEBaseShape2S0200000_I0_1 = new RunnableEBaseShape2S0200000_I0_1(this, userJid, 48);
        AnonymousClass00E.A07(r4.A04.A00.inTransaction());
        AnonymousClass08J r0 = r4.A03;
        AnonymousClass1V3 r1 = new AnonymousClass1V3(runnableEBaseShape2S0200000_I0_1);
        Object obj = r0.A01.get();
        if (obj != null) {
            ((AbstractMap) obj).put(userJid, r1);
            return;
        }
        throw null;
    }

    public final void A01(UserJid userJid, DeviceJid deviceJid, long j) {
        C015308l r0 = this.A00;
        long A022 = r0.A02(userJid);
        long A023 = r0.A02(deviceJid);
        AnonymousClass1VB A012 = this.A02.A01("INSERT OR IGNORE INTO user_device(    user_jid_row_id,    device_jid_row_id,    key_index) VALUES (?, ?, ?)", "INSERT_DEVICE_JID_SQL");
        A012.A06(1, A022);
        A012.A06(2, A023);
        A012.A06(3, j);
        A012.A01();
    }
}
