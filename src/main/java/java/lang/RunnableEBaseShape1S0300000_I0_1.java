package java.lang;

import X.AbstractC000400g;
import X.AbstractC007503q;
import X.AnonymousClass00C;
import X.AnonymousClass00G;
import X.AnonymousClass00Z;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01P;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass03R;
import X.AnonymousClass09H;
import X.AnonymousClass0AK;
import X.AnonymousClass0AT;
import X.AnonymousClass0C4;
import X.AnonymousClass0C6;
import X.AnonymousClass0E6;
import X.AnonymousClass0HR;
import X.AnonymousClass0J9;
import X.AnonymousClass0K4;
import X.AnonymousClass0X4;
import X.AnonymousClass0XH;
import X.AnonymousClass1XX;
import X.AnonymousClass1YL;
import X.AnonymousClass2L6;
import X.AnonymousClass2V1;
import X.AnonymousClass347;
import X.AnonymousClass37W;
import X.C006803i;
import X.C007003k;
import X.C007303n;
import X.C014508d;
import X.C03110Ev;
import X.C04260Jr;
import X.C05440On;
import X.C07420Xo;
import X.C07460Xt;
import X.C28301Tu;
import X.C40411tE;
import X.C43901zB;
import X.C74233aO;
import android.content.ContentValues;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.os.Message;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class RunnableEBaseShape1S0300000_I0_1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableEBaseShape1S0300000_I0_1(AnonymousClass0C4 r3, AnonymousClass0K4 r4, Location location) {
        this.A03 = 11;
        this.A02 = r3;
        this.A01 = r4;
        this.A00 = location;
        r4.A01 = location.getLatitude();
        r4.A02 = location.getLongitude();
        r4.A00 = (double) location.getAccuracy();
    }

    public RunnableEBaseShape1S0300000_I0_1(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final void run() {
        switch (this.A03) {
            case 0:
                C07460Xt r3 = (C07460Xt) this.A00;
                C007003k r2 = (C007003k) this.A01;
                AnonymousClass02N r4 = (AnonymousClass02N) this.A02;
                boolean A06 = r3.A0B.A06(r2);
                r3.A0C.A05.A05(r2);
                if (A06) {
                    r3.A06.A03(r4, r2.A02, 2, null);
                    return;
                } else {
                    r3.A09.A04(r4);
                    return;
                }
            case 1:
                C07460Xt r5 = (C07460Xt) this.A00;
                C007003k r42 = (C007003k) this.A01;
                Object obj = this.A02;
                r42.A06 = 0;
                r5.A08.A0L(r42);
                AnonymousClass0AT r1 = r5.A0J;
                r1.A01.A01(obj);
                r1.A02.A01(obj);
                AnonymousClass02M r22 = r5.A03;
                r22.A02.post(new RunnableEBaseShape1S0300000_I0_1(r5, r42, obj, 0));
                return;
            case 2:
                C07460Xt r43 = (C07460Xt) this.A00;
                AnonymousClass1XX r6 = (AnonymousClass1XX) this.A02;
                ArrayList<C007003k> A0E = r43.A08.A04.A0E((AnonymousClass02N) this.A01);
                if (!A0E.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (C007003k r12 : A0E) {
                        if (r12.A0X) {
                            r12.A0X = false;
                            arrayList.add(r12);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        r43.A07.A0G(arrayList);
                        r43.A0A.A01(arrayList);
                    }
                }
                AnonymousClass09H r52 = r43.A0H;
                String str = r6.A07;
                Jid jid = r6.A01;
                Bundle bundle = new Bundle();
                bundle.putString("msgId", str);
                bundle.putBoolean("isValid", !A0E.isEmpty());
                bundle.putParcelable("toJid", jid);
                r52.A09(Message.obtain(null, 0, 42, 0, bundle));
                return;
            case 3:
                C03110Ev r23 = (C03110Ev) this.A00;
                r23.A01((AbstractC007503q) this.A01);
                r23.A00.A02.post((Runnable) this.A02);
                return;
            case 4:
                ((AnonymousClass0AK) this.A00).A02((C05440On) this.A01);
                ((Runnable) this.A02).run();
                return;
            case 5:
                C07420Xo r62 = (C07420Xo) this.A00;
                UserJid userJid = (UserJid) this.A01;
                AnonymousClass1XX r44 = (AnonymousClass1XX) this.A02;
                AnonymousClass01P r13 = r62.A0C;
                AnonymousClass0J9 A0C = r13.A02.A0C(userJid);
                r13.A00(userJid);
                r62.A02.A03.A0A(userJid);
                if (A0C != null) {
                    AnonymousClass01K r24 = r62.A0B;
                    AnonymousClass37W r14 = new AnonymousClass37W();
                    r14.A03 = A0C.A03;
                    r14.A07 = A0C.A08;
                    r14.A05 = A0C.A00();
                    r14.A02 = AnonymousClass1YL.A00(A0C);
                    r24.A0E(userJid, r14.A01());
                }
                r62.A0F.A0M(r44);
                return;
            case 6:
                AnonymousClass0X4 r45 = (AnonymousClass0X4) this.A00;
                AnonymousClass2V1 r32 = (AnonymousClass2V1) this.A01;
                Object obj2 = this.A02;
                try {
                    r45.A04(r32, (long) r45.A0A.A06(AbstractC000400g.A3M));
                    Set set = r45.A1I;
                    synchronized (set) {
                        set.remove(obj2);
                    }
                    return;
                } catch (Throwable th) {
                    Set set2 = r45.A1I;
                    synchronized (set2) {
                        set2.remove(obj2);
                        throw th;
                    }
                }
            case 7:
                ((AnonymousClass0X4) this.A00).A0O.A0P((AnonymousClass0E6) this.A01, (C007303n) this.A02);
                return;
            case 8:
                AnonymousClass0XH r46 = (AnonymousClass0XH) this.A00;
                AnonymousClass1XX r33 = (AnonymousClass1XX) this.A01;
                AnonymousClass02N r25 = (AnonymousClass02N) this.A02;
                StringBuilder sb = new StringBuilder("ProfilePictureNotificationHandler/profilephotolost ");
                sb.append(r25);
                Log.i(sb.toString());
                if (!C40411tE.A00(r25)) {
                    AnonymousClass01I r0 = r46.A01;
                    r0.A04();
                    AnonymousClass0HR r15 = r0.A01;
                    if (r15 != null && r0.A09(r25)) {
                        r46.A02.A07(r15);
                    }
                }
                r46.A07.A0M(r33);
                return;
            case 9:
                AnonymousClass347 r47 = (AnonymousClass347) this.A00;
                C43901zB r26 = (C43901zB) this.A01;
                AnonymousClass00Z r34 = (AnonymousClass00Z) this.A02;
                AnonymousClass01I r02 = r47.A01;
                r02.A04();
                if (r02.A00 != null) {
                    C014508d r03 = r47.A07;
                    r03.A05();
                    if (r03.A01 && r47.A0A.A02()) {
                        AnonymousClass00C r53 = r47.A04;
                        r26.A0C = Long.valueOf(r53.A03());
                        r26.A0D = Long.valueOf(r53.A05());
                        r26.A05 = Long.valueOf(r53.A02());
                        r26.A06 = Long.valueOf(r53.A04());
                        r26.A00 = r47.A06.A01();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        C74233aO r54 = new C74233aO(r47, r26, atomicBoolean);
                        AnonymousClass2L6 r16 = r47.A08;
                        r16.A07.add(r54);
                        r16.A03(atomicBoolean);
                        AnonymousClass00G r55 = r47.A05;
                        r26.A0B = Long.valueOf((C006803i.A03(r55.A00.getFilesDir().getParentFile(), null) / 10000000) * 10000000);
                        r26.A0A = Long.valueOf((C006803i.A03(r55.A00.getFilesDir(), null) / 10000000) * 10000000);
                        r26.A09 = Long.valueOf((C006803i.A03(r55.A00.getDatabasePath("ignore").getParentFile(), null) / 10000000) * 10000000);
                        r26.A08 = Long.valueOf((C006803i.A03(r55.A00.getCacheDir(), null) / 10000000) * 10000000);
                        AnonymousClass03R r56 = r47.A03;
                        File file = r56.A02;
                        r26.A07 = Long.valueOf((C006803i.A03(file, null) / 10000000) * 10000000);
                        r26.A04 = Long.valueOf((C006803i.A03(r47.A00.A09(), null) / 10000000) * 10000000);
                        r26.A03 = Long.valueOf((C006803i.A03(new File(file, "Databases"), null) / 10000000) * 10000000);
                        r26.A02 = Long.valueOf((C006803i.A03(r56.A02(), null) / 10000000) * 10000000);
                        r47.A09.A08(r26, r34.A00);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                C04260Jr r27 = (C04260Jr) this.A00;
                Object obj3 = this.A01;
                Object obj4 = this.A02;
                if (!C28301Tu.A07() || !C006803i.A0h()) {
                    r27.A01.submit(new RunnableEBaseShape0S0301000_I0(r27, obj3, 5, obj4, 3));
                    return;
                }
                return;
            case 11:
                AnonymousClass0C4 r7 = (AnonymousClass0C4) this.A02;
                try {
                    List<Address> fromLocation = new Geocoder(r7.A0G.A00, r7.A0I.A0I()).getFromLocation(((Location) this.A00).getLatitude(), ((Location) this.A00).getLongitude(), 1);
                    if (fromLocation != null && !fromLocation.isEmpty()) {
                        ((AnonymousClass0K4) this.A01).A0A = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                AnonymousClass0C6 r10 = r7.A0O;
                AnonymousClass0K4 r9 = (AnonymousClass0K4) this.A01;
                String str2 = r9.A0I;
                double d = r9.A01;
                double d2 = r9.A02;
                double d3 = r9.A00;
                String str3 = r9.A0A;
                if (r10 != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("lat", Double.valueOf(d));
                    contentValues.put("lon", Double.valueOf(d2));
                    contentValues.put("accuracy", Double.valueOf(d3));
                    contentValues.put("place_name", str3);
                    r10.A03.A02().A00("sessions", contentValues, "browser_id = ?", new String[]{str2}, "setSessionLocation/UPDATE_SESSIONS");
                    AnonymousClass02M r28 = r7.A0A;
                    r28.A02.post(new RunnableEBaseShape13S0100000_I1_8(r7, 44));
                    return;
                }
                throw null;
            default:
                return;
        }
    }
}
