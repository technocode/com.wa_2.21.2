package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.whatsapp.util.Log;

/* renamed from: X.362  reason: invalid class name */
public class AnonymousClass362 implements SensorEventListener {
    public boolean A00;
    public final /* synthetic */ AnonymousClass363 A01;
    public final /* synthetic */ AnonymousClass3TD A02;

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public AnonymousClass362(AnonymousClass363 r1, AnonymousClass3TD r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean z = false;
        float f = sensorEvent.values[0];
        if (f < 5.0f && f != this.A01.A01.getMaximumRange()) {
            z = true;
        }
        if (z != this.A00) {
            this.A00 = z;
            AnonymousClass3U7 r2 = this.A02.A00;
            StringBuilder sb = new StringBuilder("voip/service/proximitylistener.onchanged ");
            sb.append(r2);
            Log.i(sb.toString());
            if (z) {
                r2.A0J();
            } else {
                r2.A0I();
            }
        }
    }
}
