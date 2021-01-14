package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.2LE  reason: invalid class name */
public class AnonymousClass2LE implements LocationListener {
    public final /* synthetic */ AnonymousClass1VI A00;
    public final /* synthetic */ C02430Bz A01;

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public AnonymousClass2LE(C02430Bz r1, AnonymousClass1VI r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            StringBuilder A0S = AnonymousClass008.A0S("CompanionDevice/location/changed ");
            A0S.append(location.getTime());
            A0S.append(" ");
            A0S.append(location.getAccuracy());
            Log.i(A0S.toString());
            C02430Bz r1 = this.A01;
            r1.A08(this.A00, location);
            r1.A03.A06(this);
        }
    }
}
