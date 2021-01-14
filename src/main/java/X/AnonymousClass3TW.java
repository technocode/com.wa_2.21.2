package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.3TW  reason: invalid class name */
public class AnonymousClass3TW extends AnonymousClass0JW {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass0HK A03;
    public final AnonymousClass0Z0 A04;
    public final List A05;

    public AnonymousClass3TW(List list, int i, int i2, int i3, AnonymousClass0Z0 r6, AnonymousClass0HK r7) {
        this.A05 = list;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A04 = r6;
        if (r7 != null) {
            this.A03 = r7;
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass0JW
    public Object A02(Object[] objArr) {
        for (C007003k r4 : this.A05) {
            this.A03.A02(r4, this.A01, (float) this.A00, true);
        }
        return null;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Bundle bundle = new Bundle();
        bundle.putInt("notification_type", this.A02);
        AnonymousClass0Z0 r3 = this.A04;
        r3.A00.obtainMessage(1, new AnonymousClass0Yz("refresh_notification", bundle, null)).sendToTarget();
    }
}
