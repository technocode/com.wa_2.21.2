package X;

import android.app.PendingIntent;
import android.content.Intent;
import com.whatsapp.schedulers.alarm.SchedulerExperimentAlarmReceiver;
import com.whatsapp.util.Log;

/* renamed from: X.3Mz  reason: invalid class name and case insensitive filesystem */
public class C70943Mz implements AbstractC655430e {
    public final AnonymousClass0P6 A00;

    @Override // X.AbstractC655430e
    public void A2z() {
    }

    @Override // X.AbstractC655430e
    public int A7U() {
        return 15;
    }

    public C70943Mz(AnonymousClass0P6 r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC655430e
    public boolean ABV() {
        AnonymousClass00G r2 = this.A00.A01;
        Intent intent = new Intent(r2.A00, SchedulerExperimentAlarmReceiver.class);
        intent.setAction("com.whatsapp.schexp.PERIODIC_MANUAL");
        if (PendingIntent.getBroadcast(r2.A00, 0, intent, 536870912) != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC655430e
    public void ANP() {
        this.A00.A04();
    }

    @Override // X.AbstractC655430e
    public void cancel() {
        AnonymousClass0P6 r3 = this.A00;
        if (r3 != null) {
            Log.d("SchExpAlarms/manual/cancel");
            Intent intent = new Intent(r3.A01.A00, SchedulerExperimentAlarmReceiver.class);
            intent.setAction("com.whatsapp.schexp.PERIODIC_MANUAL");
            r3.A05(intent);
            return;
        }
        throw null;
    }
}
