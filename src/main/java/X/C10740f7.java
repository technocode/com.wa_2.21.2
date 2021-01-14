package X;

import android.app.Activity;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;

/* renamed from: X.0f7  reason: invalid class name and case insensitive filesystem */
public final class C10740f7 extends AnonymousClass0JW {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C04360Kb A01;
    public final C47282He A02;
    public final C007003k A03;
    public final String A04;
    public final String A05;
    public final WeakReference A06;
    public final WeakReference A07;
    public final boolean A08;

    public C10740f7(ActivityC004802g r4, C04360Kb r5, C47282He r6, AbstractC004502c r7, C007003k r8, String str, String str2) {
        this.A06 = new WeakReference(r4);
        this.A07 = new WeakReference(r7);
        this.A01 = r5;
        this.A02 = r6;
        this.A08 = true;
        this.A03 = r8;
        this.A05 = str;
        this.A04 = str2;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        WeakReference weakReference = this.A07;
        if (weakReference.get() != null) {
            ((AbstractC004502c) weakReference.get()).APv(0, R.string.register_wait_message);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AbstractC004502c r0 = (AbstractC004502c) this.A07.get();
        if (r0 != null) {
            r0.AMi();
        }
        Activity activity = (Activity) this.A06.get();
        if (activity != null) {
            activity.finish();
        }
    }
}
