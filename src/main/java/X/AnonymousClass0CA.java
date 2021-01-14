package X;

import android.hardware.TriggerEvent;
import android.hardware.TriggerEventListener;

/* renamed from: X.0CA  reason: invalid class name */
public class AnonymousClass0CA extends TriggerEventListener {
    public final /* synthetic */ AnonymousClass0C4 A00;

    public AnonymousClass0CA(AnonymousClass0C4 r1) {
        this.A00 = r1;
    }

    public void onTrigger(TriggerEvent triggerEvent) {
        AnonymousClass0C4 r3 = this.A00;
        if (!r3.A05) {
            r3.A07 = false;
        } else if (r3.A06) {
            r3.A01.requestTriggerSensor(r3.A02, r3.A00);
        }
    }
}
