package X;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.2X4  reason: invalid class name */
public class AnonymousClass2X4 extends AnonymousClass0JW {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C04360Kb A01;
    public final AnonymousClass02N A02;
    public final WeakReference A03;
    public final boolean A04;

    public AnonymousClass2X4(ActivityC004702f r3, AnonymousClass02N r4, C04360Kb r5, boolean z) {
        this.A03 = new WeakReference(r3);
        this.A02 = r4;
        this.A01 = r5;
        this.A04 = z;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        WeakReference weakReference = this.A03;
        if (weakReference.get() != null) {
            ((ActivityC004702f) weakReference.get()).A0G(R.string.register_wait_message);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        ActivityC004702f r3 = (ActivityC004702f) this.A03.get();
        if (r3 != null) {
            r3.AMi();
            r3.A0I(new Intent(r3.getApplicationContext(), HomeActivity.class).addFlags(603979776), false);
        }
    }
}
