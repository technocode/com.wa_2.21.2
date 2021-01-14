package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.3At  reason: invalid class name and case insensitive filesystem */
public class C67853At implements LocationListener {
    public final /* synthetic */ AnonymousClass0C4 A00;
    public final /* synthetic */ AnonymousClass0K4 A01;

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public C67853At(AnonymousClass0C4 r1, AnonymousClass0K4 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            StringBuilder A0S = AnonymousClass008.A0S("qrsession/location/changed ");
            A0S.append(location.getTime());
            A0S.append(" ");
            A0S.append(location.getAccuracy());
            Log.i(A0S.toString());
            AnonymousClass0C4 r3 = this.A00;
            r3.A0K.ANF(new RunnableEBaseShape1S0300000_I0_1(r3, this.A01, location));
            r3.A09.A06(this);
        }
    }
}
