package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.0eJ  reason: invalid class name and case insensitive filesystem */
public class C10240eJ extends AnonymousClass0JW implements LocationListener {
    public int A00 = 0;
    public int A01 = 15;
    public Location A02 = null;
    public Location A03 = null;
    public Location A04;
    public boolean A05;
    public final AnonymousClass009 A06;
    public final AnonymousClass0C1 A07;
    public final AnonymousClass00S A08;
    public final AnonymousClass03S A09;
    public final AnonymousClass01K A0A;
    public final AnonymousClass01T A0B;
    public final AnonymousClass0AC A0C;
    public final AnonymousClass01N A0D;
    public final C02660Cy A0E;
    public final AnonymousClass01S A0F;
    public final AbstractC02860Dt A0G;

    public C10240eJ(AnonymousClass00S r7, AnonymousClass009 r8, AnonymousClass01K r9, AnonymousClass0AC r10, AnonymousClass01N r11, C02660Cy r12, AnonymousClass03S r13, AnonymousClass0C1 r14, AnonymousClass01S r15, AnonymousClass01T r16, AbstractC02860Dt r17) {
        this.A08 = r7;
        this.A0G = r17;
        this.A06 = r8;
        this.A0A = r9;
        this.A0C = r10;
        this.A0D = r11;
        this.A0E = r12;
        this.A09 = r13;
        this.A0F = r15;
        this.A0B = r16;
        if (r17.A00 == 0.0d || r17.A01 == 0.0d) {
            this.A07 = r14;
            return;
        }
        Location location = new Location("");
        this.A04 = location;
        location.setLatitude(r17.A00);
        this.A04.setLongitude(r17.A01);
        this.A04.setTime(r17.A0E);
        this.A05 = true;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00e6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00f6 */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A00(double r12, double r14, int r16) {
        /*
        // Method dump skipped, instructions count: 467
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10240eJ.A00(double, double, int):byte[]");
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        AnonymousClass0C1 r0 = this.A07;
        if (r0 != null) {
            try {
                r0.A05(3, 1000, 1000, this, "map-download");
            } catch (IllegalArgumentException e) {
                Log.w("MapDownload/registerListener/GPS error ", e);
            }
        }
        AbstractC02860Dt r2 = this.A0G;
        r2.A02 = 1;
        this.A0C.A06(r2, -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0157 A[SYNTHETIC] */
    @Override // X.AnonymousClass0JW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.lang.Object r28) {
        /*
        // Method dump skipped, instructions count: 585
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10240eJ.A03(java.lang.Object):void");
    }

    public void onLocationChanged(Location location) {
        StringBuilder A0S = AnonymousClass008.A0S("MapDownload/onLocationChanged/time diff=");
        A0S.append((System.currentTimeMillis() - location.getTime()) / 1000);
        A0S.append("; accuracy=");
        A0S.append(location.getAccuracy());
        Log.d(A0S.toString());
        if (C02770Dj.A03(location, this.A02)) {
            this.A02 = location;
        }
        int i = this.A00 + 1;
        this.A00 = i;
        if (i >= 2 || location.getAccuracy() < 80.0f) {
            AnonymousClass008.A1K(AnonymousClass008.A0S("MapDownload/onLocationChanged/locationReady; updateCount="), this.A00);
            this.A03 = location;
            this.A05 = true;
        }
    }

    public void onProviderDisabled(String str) {
        AnonymousClass008.A16("MapDownload/onProviderDisabled/provider=", str);
    }

    public void onProviderEnabled(String str) {
        AnonymousClass008.A16("MapDownload/onProviderEnabled/provider=", str);
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder("MapDownload/onStatusChanged/provider=");
        sb.append(str);
        sb.append("; status=");
        sb.append(i);
        Log.d(sb.toString());
    }
}
