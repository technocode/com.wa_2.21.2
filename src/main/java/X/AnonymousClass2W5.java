package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.util.Log;

/* renamed from: X.2W5  reason: invalid class name */
public class AnonymousClass2W5 implements SensorEventListener {
    public final /* synthetic */ PopupNotification A00;

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public AnonymousClass2W5(PopupNotification popupNotification) {
        this.A00 = popupNotification;
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        PopupNotification popupNotification = this.A00;
        float f = sensorEvent.values[0];
        popupNotification.A00 = f;
        StringBuilder A0S = AnonymousClass008.A0S("popupnotification/proximity:");
        A0S.append(f);
        Log.i(A0S.toString());
    }
}
