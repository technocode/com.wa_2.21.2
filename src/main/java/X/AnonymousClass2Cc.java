package X;

import android.content.Intent;
import android.net.Uri;

/* renamed from: X.2Cc  reason: invalid class name */
public class AnonymousClass2Cc extends ActivityC004602e {
    public final AnonymousClass0GZ A00 = AnonymousClass0GZ.A00();
    public final AnonymousClass00Y A01 = AnonymousClass00Y.A00();

    public Intent A0T(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (this.A00.A02()) {
            str2 = "market://details?id=com.whatsapp.w4b&utm_source=";
        } else {
            str2 = "https://play.google.com/store/apps/details?id=com.whatsapp.w4b&utm_source=";
        }
        sb.append(str2);
        sb.append(str);
        return new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
    }

    public void A0U(int i, int i2, boolean z) {
        C44051zQ r3 = new C44051zQ();
        r3.A00 = Integer.valueOf(i);
        r3.A01 = Integer.valueOf(i2);
        AnonymousClass00Y r2 = this.A01;
        if (z) {
            r2.A0B(r3, null, false);
            return;
        }
        r2.A09(r3, 1);
        AnonymousClass00Y.A01(r3, "");
    }
}
