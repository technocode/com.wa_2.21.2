package X;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0C1  reason: invalid class name */
public class AnonymousClass0C1 {
    public static volatile AnonymousClass0C1 A09;
    public LocationManager A00;
    public AnonymousClass178 A01;
    public Map A02;
    public final AnonymousClass0C2 A03;
    public final AnonymousClass009 A04;
    public final AnonymousClass03P A05;
    public final AnonymousClass00G A06;
    public final AnonymousClass03S A07;
    public final AnonymousClass0IZ A08;

    public AnonymousClass0C1(AnonymousClass00G r1, AnonymousClass009 r2, AnonymousClass0IZ r3, AnonymousClass03P r4, AnonymousClass03S r5, AnonymousClass0C2 r6) {
        this.A06 = r1;
        this.A04 = r2;
        this.A08 = r3;
        this.A07 = r5;
        this.A05 = r4;
        this.A03 = r6;
    }

    public static LocationRequest A00(C40061sZ r7) {
        LocationRequest locationRequest = new LocationRequest();
        int i = r7.A00;
        if ((i & 1) != 0) {
            locationRequest.A01 = 100;
        } else if ((i & 2) != 0) {
            locationRequest.A01 = 102;
        } else {
            locationRequest.A01 = 105;
        }
        long j = r7.A02;
        LocationRequest.A00(j);
        locationRequest.A04 = j;
        if (!locationRequest.A07) {
            locationRequest.A05 = (long) (((double) j) / 6.0d);
        }
        long j2 = r7.A01;
        LocationRequest.A00(j2);
        locationRequest.A07 = true;
        locationRequest.A05 = j2;
        locationRequest.A00 = 0.0f;
        return locationRequest;
    }

    public static AnonymousClass0C1 A01() {
        if (A09 == null) {
            synchronized (AnonymousClass0C1.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass0C1(AnonymousClass00G.A01, AnonymousClass009.A00(), AnonymousClass0IZ.A01(), AnonymousClass03P.A00(), AnonymousClass03S.A00(), AnonymousClass0C2.A00());
                }
            }
        }
        return A09;
    }

    public Location A02(int i, String str) {
        AnonymousClass03S r3 = this.A07;
        if (r3.A04()) {
            StringBuilder sb = new StringBuilder("FusedLocationManager/getLocation:");
            sb.append(str);
            Log.i(sb.toString());
            A04();
            A07(str);
            AnonymousClass178 r0 = this.A01;
            if (r0 != null && r0.A04()) {
                AnonymousClass178 r32 = this.A01;
                boolean z = false;
                boolean z2 = false;
                if (r32 != null) {
                    z2 = true;
                }
                C001801b.A1a(z2, "GoogleApiClient parameter is required.");
                C34711j3 r1 = C24451Ap.A01;
                if (!(r32 instanceof C34881jN)) {
                    throw new UnsupportedOperationException();
                }
                AbstractC34701j2 r12 = (AbstractC34701j2) ((C34881jN) r32).A0J.get(r1);
                C001801b.A1R(r12, "Appropriate Api was not requested.");
                AnonymousClass2AS r13 = (AnonymousClass2AS) r12;
                if (r13 != null) {
                    z = true;
                }
                C001801b.A1b(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
                try {
                    AnonymousClass1AQ r2 = r13.A00;
                    AnonymousClass1AV r02 = r2.A01;
                    r02.A00();
                    return ((AnonymousClass1AP) r02.A00.A01()).ARh(r2.A00.getPackageName());
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.A00 == null) {
                return null;
            } else {
                if (i == 1) {
                    if (r3.A02("android.permission.ACCESS_FINE_LOCATION") == 0) {
                        return this.A00.getLastKnownLocation("gps");
                    }
                } else if (r3.A02("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    return this.A00.getLastKnownLocation("network");
                }
            }
        }
        AnonymousClass008.A19("FusedLocationManager/getLastKnownLocation/do not have location permissions context:", str);
        return null;
    }

    public Location A03(String str) {
        A04();
        Location A022 = A02(1, str);
        Location A023 = A02(2, str);
        if (A022 == null || (A023 != null && A022.getTime() <= A023.getTime() - 20000)) {
            A022 = A023;
            if (A023 == null) {
                return A022;
            }
        }
        if (A022.getTime() + 7200000 < System.currentTimeMillis()) {
            return null;
        }
        return A022;
    }

    public synchronized void A04() {
        if (this.A00 == null) {
            AnonymousClass00G r2 = this.A06;
            boolean z = false;
            if (AnonymousClass0IZ.A00(r2.A00) == 0) {
                z = true;
            }
            if (z) {
                C40051sY r3 = new C40051sY(this);
                this.A02 = new HashMap();
                AnonymousClass175 r22 = new AnonymousClass175(r2.A00);
                r22.A01(C24451Ap.A02);
                C001801b.A1R(r3, "Listener must not be null");
                r22.A07.add(r3);
                C001801b.A1R(r3, "Listener must not be null");
                r22.A08.add(r3);
                this.A01 = r22.A00();
            } else {
                this.A02 = null;
                this.A01 = null;
            }
            this.A00 = this.A05.A08();
        }
    }

    public void A05(int i, long j, long j2, LocationListener locationListener, String str) {
        AnonymousClass03S r3 = this.A07;
        if (r3.A04()) {
            A04();
            StringBuilder sb = new StringBuilder("FusedLocationManager/requestUpdates/");
            sb.append(str);
            sb.append(" ");
            sb.append(locationListener);
            Log.d(sb.toString());
            A07(str);
            if (this.A01 != null) {
                if (this.A02.isEmpty()) {
                    this.A01.A02();
                }
                C40061sZ r4 = new C40061sZ(j, j2, i, locationListener);
                this.A02.put(locationListener, r4);
                if (this.A01.A04()) {
                    LocationRequest A002 = A00(r4);
                    AnonymousClass178 r2 = this.A01;
                    C001801b.A1R(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
                    r2.A01(new AnonymousClass2BT(r2, A002, r4));
                    return;
                }
                return;
            }
            if ((i & 1) != 0) {
                try {
                    if (this.A00 == null || r3.A02("android.permission.ACCESS_FINE_LOCATION") != 0) {
                        Log.w("FusedLocationManager/requestLocationUpdates/do not have fine location permission");
                    } else {
                        this.A00.requestLocationUpdates("gps", j, 0.0f, locationListener);
                    }
                } catch (RuntimeException e) {
                    Log.e("FusedLocationManager/requestLocationUpdates", e);
                }
            }
            if ((i & 2) != 0) {
                try {
                    if (this.A00 == null || r3.A02("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                        Log.w("FusedLocationManager/requestLocationUpdates/do not have coarse location permission");
                    } else {
                        this.A00.requestLocationUpdates("network", j, 0.0f, locationListener);
                    }
                } catch (RuntimeException e2) {
                    Log.e("FusedLocationManager/requestLocationUpdates", e2);
                }
            }
        }
    }

    public void A06(LocationListener locationListener) {
        StringBuilder sb = new StringBuilder("FusedLocationManager/removeUpdates/ ");
        sb.append(locationListener);
        Log.d(sb.toString());
        A04();
        if (this.A01 != null) {
            C40061sZ r2 = (C40061sZ) this.A02.remove(locationListener);
            if (r2 != null) {
                if (this.A01.A04()) {
                    AnonymousClass178 r1 = this.A01;
                    r1.A01(new AnonymousClass2BU(r1, r2));
                }
                if (this.A02.isEmpty()) {
                    this.A01.A03();
                }
            }
        } else if (this.A00 != null && this.A07.A04()) {
            this.A00.removeUpdates(locationListener);
        }
    }

    public final void A07(String str) {
        if (Build.VERSION.SDK_INT == 29 && !this.A03.A00 && !LocationSharingService.A0C && !"group-chat-live-location-ui-oncreate".equals(str)) {
            this.A04.A03("background-location", 7);
        }
    }

    public boolean A08() {
        A04();
        LocationManager locationManager = this.A00;
        if (locationManager != null) {
            return locationManager.isProviderEnabled("gps") || this.A00.isProviderEnabled("network");
        }
        return false;
    }
}
