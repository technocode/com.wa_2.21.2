package X;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* renamed from: X.0T0  reason: invalid class name */
public class AnonymousClass0T0 {
    public static AnonymousClass0T0 A03;
    public final Context A00;
    public final LocationManager A01;
    public final C12840jA A02 = new C12840jA();

    public AnonymousClass0T0(Context context, LocationManager locationManager) {
        this.A00 = context;
        this.A01 = locationManager;
    }

    public final Location A00(String str) {
        try {
            LocationManager locationManager = this.A01;
            if (locationManager.isProviderEnabled(str)) {
                return locationManager.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }
}
