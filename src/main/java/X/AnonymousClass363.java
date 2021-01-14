package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: X.363  reason: invalid class name */
public final class AnonymousClass363 {
    public SensorEventListener A00;
    public final Sensor A01;
    public final SensorManager A02;

    public AnonymousClass363(AnonymousClass03P r3) {
        SensorManager A07 = r3.A07();
        this.A02 = A07;
        this.A01 = A07.getDefaultSensor(8);
    }
}
