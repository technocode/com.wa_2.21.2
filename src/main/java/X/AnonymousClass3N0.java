package X;

import android.app.PendingIntent;
import com.whatsapp.util.Log;

/* renamed from: X.3N0  reason: invalid class name */
public class AnonymousClass3N0 implements AbstractC655430e {
    public final AnonymousClass0P6 A00;

    @Override // X.AbstractC655430e
    public void A2z() {
    }

    @Override // X.AbstractC655430e
    public int A7U() {
        return 15;
    }

    public AnonymousClass3N0(AnonymousClass0P6 r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC655430e
    public boolean ABV() {
        AnonymousClass0P6 r0 = this.A00;
        if (PendingIntent.getBroadcast(r0.A01.A00, 0, r0.A01(), 536870912) != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC655430e
    public void ANP() {
        this.A00.A02();
    }

    @Override // X.AbstractC655430e
    public void cancel() {
        AnonymousClass0P6 r1 = this.A00;
        Log.d("SchExpAlarms/periodic_api/cancel");
        r1.A05(r1.A01());
    }
}
