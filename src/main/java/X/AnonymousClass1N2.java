package X;

import android.location.Location;
import com.whatsapp.PlaceInfo;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1N2  reason: invalid class name */
public class AnonymousClass1N2 {
    public int A00 = 0;
    public int A01 = 0;
    public final AnonymousClass01I A02;
    public final C000300f A03;
    public final AnonymousClass00G A04;
    public final AnonymousClass0ET A05;
    public final C02660Cy A06;
    public final String A07 = UUID.randomUUID().toString();
    public final ArrayList A08 = new ArrayList();
    public final AtomicInteger A09 = new AtomicInteger();

    public AnonymousClass1N2(AnonymousClass00G r2, AnonymousClass01I r3, C000300f r4, AnonymousClass0ET r5, C02660Cy r6) {
        this.A02 = r3;
        this.A04 = r2;
        this.A03 = r4;
        this.A05 = r5;
        this.A06 = r6;
    }

    public static final void A00(Location location, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PlaceInfo placeInfo = (PlaceInfo) it.next();
            if (placeInfo.A00 == null) {
                Location location2 = new Location("");
                placeInfo.A00 = location2;
                location2.setLatitude(placeInfo.lat);
                placeInfo.A00.setLongitude(placeInfo.lon);
            }
            placeInfo.dist = (double) placeInfo.A00.distanceTo(location);
        }
        Collections.sort(list, C25821Il.A00);
    }

    public final int A01() {
        if (this.A00 == 0) {
            int A062 = this.A03.A06(AbstractC000400g.A3L);
            if (A062 == 1 || A062 == 3) {
                this.A00 = A062;
            } else {
                AnonymousClass01I r0 = this.A02;
                r0.A04();
                UserJid userJid = r0.A03;
                if (userJid != null) {
                    if (userJid.hashCode() % 3 == 0) {
                        this.A00 = 1;
                    } else {
                        this.A00 = 3;
                    }
                }
            }
        }
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0209, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x020a, code lost:
        if (r16 != null) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x020f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0261, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r0.A01.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0269, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1N1 A02(android.location.Location r24, int r25, java.lang.String r26, java.lang.String r27) {
        /*
        // Method dump skipped, instructions count: 618
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1N2.A02(android.location.Location, int, java.lang.String, java.lang.String):X.1N1");
    }

    public final void A03(AnonymousClass1N1 r15) {
        int i;
        AnonymousClass0ET r6 = this.A05;
        int i2 = r15.source;
        int i3 = 2;
        if (i2 != 1) {
            i = 2;
            if (i2 != 3) {
                i = 4;
            }
        } else {
            i = 3;
        }
        int A012 = A01();
        if (A012 == 1) {
            i3 = 3;
        } else if (A012 != 3) {
            i3 = 4;
        }
        int intValue = r15.responseCode.intValue();
        String str = r15.responseCodeDescr;
        int i4 = r15.requestIndex;
        boolean z = r15.responseCached;
        String str2 = r15.query;
        int size = r15.places.size();
        long j = r15.responseTime;
        if (r6 != null) {
            C445120k r4 = new C445120k();
            r4.A03 = Integer.valueOf(i);
            r4.A04 = Integer.valueOf(i3);
            r4.A02 = Integer.valueOf(intValue);
            r4.A07 = str;
            r4.A05 = Long.valueOf((long) i4);
            r4.A00 = Boolean.valueOf(z);
            r4.A08 = str2;
            r4.A01 = Double.valueOf((double) size);
            r4.A06 = Long.valueOf(j);
            r6.A09.A09(r4, 1);
            AnonymousClass00Y.A01(r4, "");
            return;
        }
        throw null;
    }
}
