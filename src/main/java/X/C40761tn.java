package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.StatusPrivacyActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.1tn  reason: invalid class name and case insensitive filesystem */
public class C40761tn extends AnonymousClass0JW {
    public final long A00 = SystemClock.elapsedRealtime();
    public final AnonymousClass02M A01;
    public final AnonymousClass01J A02;
    public final AnonymousClass01X A03;
    public final AnonymousClass09E A04;
    public final WeakReference A05;

    public C40761tn(StatusPrivacyActivity statusPrivacyActivity, AnonymousClass02M r4, AnonymousClass09E r5, AnonymousClass01J r6, AnonymousClass01X r7) {
        this.A05 = new WeakReference(statusPrivacyActivity);
        this.A01 = r4;
        this.A04 = r5;
        this.A02 = r6;
        this.A03 = r7;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        ActivityC004702f r3 = (ActivityC004702f) this.A05.get();
        if (r3 == null || C002001d.A3D(r3)) {
            this.A01.A02();
            return;
        }
        r3.A0K.A00();
        this.A01.A0C(this.A03.A06(R.string.status_settings_updated), 0);
        r3.finish();
    }
}
