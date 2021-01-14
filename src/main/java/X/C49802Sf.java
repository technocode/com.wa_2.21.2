package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2Sf  reason: invalid class name and case insensitive filesystem */
public class C49802Sf implements LocationListener {
    public long A00;
    public Location A01;
    public Location A02;
    public PowerManager.WakeLock A03;
    public final SparseIntArray A04 = new SparseIntArray();
    public final AnonymousClass0AV A05;
    public final AnonymousClass0C1 A06;
    public final AnonymousClass0AX A07;
    public final AnonymousClass03P A08;
    public final AnonymousClass00D A09;
    public final AnonymousClass0E5 A0A;

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public C49802Sf(AnonymousClass03P r2, AnonymousClass00D r3, AnonymousClass0AV r4, AnonymousClass0C1 r5, AnonymousClass0AX r6, AnonymousClass0E5 r7) {
        if (r2 != null) {
            this.A08 = r2;
            if (r3 != null) {
                this.A09 = r3;
                if (r4 != null) {
                    this.A05 = r4;
                    if (r5 != null) {
                        this.A06 = r5;
                        if (r6 != null) {
                            this.A07 = r6;
                            this.A0A = r7;
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void A00() {
        long j = this.A00;
        if (j != 0) {
            int i = (int) ((j - (j % 3600000)) / 1000);
            SparseIntArray sparseIntArray = this.A04;
            sparseIntArray.put(i, sparseIntArray.get(i, 0) + ((int) (System.currentTimeMillis() - j)));
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
                int keyAt = sparseIntArray.keyAt(i2);
                int i3 = sparseIntArray.get(keyAt);
                if (i2 != 0) {
                    sb.append(";");
                }
                sb.append(keyAt);
                sb.append(",");
                sb.append(i3);
            }
            AnonymousClass008.A0m(this.A09, "location_shared_duration", sb.toString());
            this.A00 = 0;
        }
    }

    public void A01(String str) {
        SparseIntArray sparseIntArray;
        long j;
        long j2;
        int i;
        String obj;
        Location location = this.A02;
        if (location == null || location.getTime() + 120000 < System.currentTimeMillis()) {
            Location A032 = this.A06.A03(str);
            if (A032 != null && A032.getTime() + 7200000 < System.currentTimeMillis()) {
                A032 = null;
            }
            StringBuilder A0S = AnonymousClass008.A0S("MyLocationUpdater/onStartCommand/start; ");
            if (A032 == null) {
                obj = "location=null";
            } else {
                StringBuilder A0S2 = AnonymousClass008.A0S("location.provider=");
                A0S2.append(A032.getProvider());
                obj = A0S2.toString();
            }
            AnonymousClass008.A1U(A0S, obj);
            if (A032 != null) {
                this.A02 = A032;
                this.A0A.AHL(A032);
            }
        }
        if (this.A00 != 0) {
            A00();
        }
        this.A00 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        long j3 = 0;
        while (true) {
            sparseIntArray = this.A04;
            if (i2 >= sparseIntArray.size()) {
                break;
            }
            int keyAt = sparseIntArray.keyAt(i2);
            int i3 = sparseIntArray.get(keyAt);
            if ((((long) keyAt) * 1000) + 86400000 >= System.currentTimeMillis()) {
                j3 += (long) i3;
            } else {
                arrayList.add(Integer.valueOf(keyAt));
            }
            i2++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sparseIntArray.delete(((Number) it.next()).intValue());
        }
        boolean z = this.A07.A00;
        AnonymousClass0AW r2 = this.A05.A00;
        boolean A012 = r2.A01();
        double A002 = r2.A00();
        if (Double.isNaN(A002)) {
            A002 = 100.0d;
        }
        if (z) {
            this.A00 = 0;
        } else {
            if (A012 && A002 > 30.0d) {
                this.A00 = 0;
            } else if (j3 > 7200000 || (!A012 && A002 <= 15.0d)) {
                this.A00 = 0;
            } else if (j3 > 1800000 || (!A012 && A002 <= 30.0d)) {
                j = 5000;
                j2 = 10000;
                i = 2;
                AnonymousClass0C1 r9 = this.A06;
                r9.A06(this);
                StringBuilder sb = new StringBuilder();
                sb.append("MyLocationUpdater/onStartCommand/request location updates; powerSaveMode=");
                sb.append(z);
                sb.append("; duration=");
                sb.append(j3);
                sb.append("; locationProviders=");
                sb.append(i);
                sb.append("; updateInterval=");
                sb.append(j2);
                Log.i(sb.toString());
                r9.A05(i, j2, j, this, "location-updater");
            }
            j = 1000;
            j2 = 5000;
            i = 3;
            AnonymousClass0C1 r92 = this.A06;
            r92.A06(this);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MyLocationUpdater/onStartCommand/request location updates; powerSaveMode=");
            sb2.append(z);
            sb2.append("; duration=");
            sb2.append(j3);
            sb2.append("; locationProviders=");
            sb2.append(i);
            sb2.append("; updateInterval=");
            sb2.append(j2);
            Log.i(sb2.toString());
            r92.A05(i, j2, j, this, "location-updater");
        }
        j2 = 30000;
        j = 10000;
        i = 0;
        AnonymousClass0C1 r922 = this.A06;
        r922.A06(this);
        try {
            StringBuilder sb22 = new StringBuilder();
            sb22.append("MyLocationUpdater/onStartCommand/request location updates; powerSaveMode=");
            sb22.append(z);
            sb22.append("; duration=");
            sb22.append(j3);
            sb22.append("; locationProviders=");
            sb22.append(i);
            sb22.append("; updateInterval=");
            sb22.append(j2);
            Log.i(sb22.toString());
            r922.A05(i, j2, j, this, "location-updater");
        } catch (IllegalArgumentException e) {
            Log.w("MyLocationUpdater/onCreate/GPS error ", e);
        }
    }

    public void onLocationChanged(Location location) {
        Log.i("MyLocationUpdater/onLocationChanged");
        if (C02770Dj.A03(location, this.A02)) {
            this.A02 = location;
            this.A0A.AHL(location);
            this.A01 = location;
            return;
        }
        if (location.getAccuracy() < 80.0f) {
            this.A01 = location;
        }
        if (this.A01 != null && this.A02.getTime() + 40000 < this.A01.getTime()) {
            Location location2 = this.A01;
            this.A02 = location2;
            this.A0A.AHL(location2);
        }
    }
}
