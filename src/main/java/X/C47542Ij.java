package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: X.2Ij  reason: invalid class name and case insensitive filesystem */
public class C47542Ij implements SensorEventListener {
    public final /* synthetic */ C28301Tu A00;

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C47542Ij(C28301Tu r1) {
        this.A00 = r1;
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        C28301Tu r0 = C28301Tu.A0i;
        if (r0 == null) {
            C28301Tu r02 = this.A00;
            r02.A0O(false);
            r02.A0J();
            return;
        }
        C28301Tu r2 = this.A00;
        if (r0 != r2) {
            r2.A0J();
            return;
        }
        float f = sensorEvent.values[0];
        if (f >= 5.0f || f == r2.A07.getMaximumRange()) {
            r2.A0O(false);
        } else {
            r2.A0O(true);
        }
    }
}
