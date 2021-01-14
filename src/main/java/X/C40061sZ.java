package X;

import android.location.Location;
import android.location.LocationListener;
import java.lang.ref.WeakReference;

/* renamed from: X.1sZ  reason: invalid class name and case insensitive filesystem */
public class C40061sZ implements AbstractC24441Ao {
    public final int A00;
    public final long A01;
    public final long A02;
    public final WeakReference A03;

    public C40061sZ(long j, long j2, int i, LocationListener locationListener) {
        this.A03 = new WeakReference(locationListener);
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
    }

    @Override // X.AbstractC24441Ao
    public void onLocationChanged(Location location) {
        LocationListener locationListener = (LocationListener) this.A03.get();
        if (locationListener != null) {
            locationListener.onLocationChanged(location);
        }
    }
}
