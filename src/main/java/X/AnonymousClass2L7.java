package X;

import com.whatsapp.util.Log;

/* renamed from: X.2L7  reason: invalid class name */
public class AnonymousClass2L7 {
    public static volatile AnonymousClass2L7 A04;
    public final AnonymousClass01K A00;
    public final C02100Aq A01;
    public final C017809k A02;
    public final C014508d A03;

    public AnonymousClass2L7(AnonymousClass01K r1, C02100Aq r2, C017809k r3, C014508d r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public static final void A00(AnonymousClass02N r3, int i, int i2, C52632bR r6) {
        if (r6 != null) {
            AnonymousClass00D r2 = r6.A01.A02;
            AnonymousClass008.A0m(r2, "storage_usage_deletion_jid", r3.getRawString());
            r2.A00.edit().putInt("storage_usage_deletion_current_msg_cnt", i2).putInt("storage_usage_deletion_all_msg_cnt", i).apply();
            r6.A00.AIs(i2, i);
        }
    }

    public final boolean A01(int i, int i2, C28551Ut r10, C52632bR r11) {
        StringBuilder A0S = AnonymousClass008.A0S("StorageUsageManager/deleteMessagesInternal ");
        AnonymousClass02N r1 = r10.A07;
        A0S.append(r1);
        Log.d(A0S.toString());
        A00(r1, i, i2, r11);
        AnonymousClass01K r0 = this.A00;
        r0.A0C(r1);
        return r0.A0Z(r10, new C59422nd(this, i2, i, r10, r11));
    }
}
