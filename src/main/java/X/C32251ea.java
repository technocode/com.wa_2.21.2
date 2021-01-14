package X;

import android.app.Activity;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* renamed from: X.1ea  reason: invalid class name and case insensitive filesystem */
public class C32251ea implements LocationListener {
    public static final String[] A06 = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    public Location A00;
    public C32021eD A01;
    public C32251ea A02;
    public boolean A03;
    public final Context A04;
    public final LocationManager A05;

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public C32251ea(Context context) {
        this.A04 = context;
        this.A05 = (LocationManager) context.getSystemService("location");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r1 <= 200) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.location.Location r7, android.location.Location r8) {
        /*
            r6 = 0
            if (r7 != 0) goto L_0x0004
            return r6
        L_0x0004:
            r5 = 1
            if (r8 != 0) goto L_0x0008
            return r5
        L_0x0008:
            long r3 = r7.getTime()
            long r0 = r8.getTime()
            long r3 = r3 - r0
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0019
            return r5
        L_0x0019:
            r1 = -120000(0xfffffffffffe2b40, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0021
            return r6
        L_0x0021:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r4 = 0
            if (r0 <= 0) goto L_0x0029
            r4 = 1
        L_0x0029:
            float r1 = r7.getAccuracy()
            float r0 = r8.getAccuracy()
            float r1 = r1 - r0
            int r1 = (int) r1
            r3 = 1
            if (r1 <= 0) goto L_0x003c
            r3 = 0
            r0 = 200(0xc8, float:2.8E-43)
            r2 = 1
            if (r1 > r0) goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            java.lang.String r0 = r7.getProvider()
            java.lang.String r1 = r8.getProvider()
            if (r0 != 0) goto L_0x0054
            r0 = 0
            if (r1 != 0) goto L_0x004b
            r0 = 1
        L_0x004b:
            if (r3 != 0) goto L_0x0053
            if (r4 == 0) goto L_0x0059
            if (r2 != 0) goto L_0x0059
            if (r0 == 0) goto L_0x0059
        L_0x0053:
            return r5
        L_0x0054:
            boolean r0 = r0.equals(r1)
            goto L_0x004b
        L_0x0059:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32251ea.A00(android.location.Location, android.location.Location):boolean");
    }

    public void A01(boolean z) {
        if (this.A02 == null) {
            this.A02 = this;
        }
        this.A03 = z;
        if (z && Build.VERSION.SDK_INT >= 23) {
            Context context = this.A04;
            if (!(context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 && context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0)) {
                boolean z2 = context instanceof Activity;
                C19550vD.A0O.A00();
                if (z2) {
                    return;
                }
                return;
            }
        }
        if (this.A03) {
            C32251ea r8 = this.A02;
            List<String> providers = r8.A05.getProviders(true);
            Location location = r8.A00;
            if (providers != null) {
                for (String str : providers) {
                    Location lastKnownLocation = r8.A05.getLastKnownLocation(str);
                    if (A00(lastKnownLocation, location)) {
                        location = lastKnownLocation;
                    }
                }
            }
            if (location == null || System.currentTimeMillis() - location.getTime() >= 7200000) {
                r8.A00 = null;
            } else {
                r8.A00 = location;
                C32021eD r0 = r8.A01;
                if (r0 != null) {
                    r0.A00.A0E.invalidate();
                }
            }
            Criteria criteria = new Criteria();
            try {
                criteria.setAccuracy(1);
                LocationManager locationManager = r8.A05;
                locationManager.requestLocationUpdates(locationManager.getBestProvider(criteria, true), 50, 0.0f, r8);
            } catch (Exception unused) {
            }
            try {
                criteria.setAccuracy(2);
                LocationManager locationManager2 = r8.A05;
                locationManager2.requestLocationUpdates(locationManager2.getBestProvider(criteria, true), 50, 0.0f, r8);
            } catch (Exception unused2) {
            }
        } else {
            C32251ea r1 = this.A02;
            r1.A05.removeUpdates(r1);
        }
    }

    public void onLocationChanged(Location location) {
        if (A00(location, this.A00)) {
            this.A00 = location;
            C32021eD r0 = this.A01;
            if (r0 != null) {
                r0.A00.A0E.invalidate();
            }
        }
    }
}
