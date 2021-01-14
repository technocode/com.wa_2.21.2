package X;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.whatsapp.location.FinalLiveLocationBroadcastReceiver;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.Log;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: X.01S  reason: invalid class name */
public class AnonymousClass01S {
    public static volatile AnonymousClass01S A0d;
    public int A00 = 0;
    public long A01;
    public long A02;
    public long A03 = 0;
    public long A04;
    public C02900Dx A05;
    public Long A06 = null;
    public Map A07;
    public Map A08;
    public final AnonymousClass02M A09;
    public final AnonymousClass01I A0A;
    public final AnonymousClass01J A0B;
    public final AnonymousClass04v A0C;
    public final AnonymousClass01A A0D;
    public final AnonymousClass03P A0E;
    public final AnonymousClass00S A0F;
    public final AnonymousClass00G A0G;
    public final AnonymousClass00D A0H;
    public final C001000o A0I;
    public final C001400w A0J;
    public final AnonymousClass0A8 A0K;
    public final AnonymousClass01K A0L;
    public final C02810Dn A0M;
    public final C02770Dj A0N;
    public final AnonymousClass0AR A0O;
    public final C02360Br A0P;
    public final Object A0Q = new Object();
    public final Object A0R = new Object();
    public final Object A0S = new Object();
    public final Runnable A0T = new RunnableEBaseShape3S0100000_I0_3(this, 12);
    public final Runnable A0U = new RunnableEBaseShape3S0100000_I0_3(this, 13);
    public final HashSet A0V = new HashSet();
    public final List A0W = new ArrayList();
    public final List A0X = new ArrayList();
    public final Map A0Y = new HashMap();
    public final Map A0Z = new HashMap();
    public final Map A0a = new HashMap();
    public final Map A0b = new HashMap();
    public final Map A0c = new HashMap();

    public AnonymousClass01S(AnonymousClass00G r7, AnonymousClass00S r8, AnonymousClass02M r9, AnonymousClass01I r10, AnonymousClass0AR r11, AnonymousClass01J r12, C02770Dj r13, AnonymousClass01A r14, C001400w r15, AnonymousClass03P r16, C02360Br r17, AnonymousClass08B r18, AnonymousClass01K r19, AnonymousClass0AC r20, C001000o r21, AnonymousClass04v r22, AnonymousClass00D r23, C02810Dn r24, AnonymousClass0A8 r25) {
        this.A0G = r7;
        this.A0F = r8;
        this.A09 = r9;
        this.A0A = r10;
        this.A0O = r11;
        this.A0B = r12;
        this.A0N = r13;
        this.A0D = r14;
        this.A0E = r16;
        this.A0P = r17;
        this.A0L = r19;
        this.A0I = r21;
        this.A0C = r22;
        this.A0H = r23;
        this.A0M = r24;
        this.A0K = r25;
        this.A0J = r15;
        r18.A01(new C02820Dp(this));
        r20.A01(new C02830Dq(this, r19));
        SharedPreferences sharedPreferences = r23.A00;
        this.A04 = sharedPreferences.getLong("live_location_sharing_session_total_time", 0);
        this.A02 = sharedPreferences.getLong("live_location_sharing_session_start_time", 0);
        this.A01 = sharedPreferences.getLong("live_location_sharing_session_end_time", 0);
    }

    public static AnonymousClass01S A00() {
        if (A0d == null) {
            synchronized (AnonymousClass01S.class) {
                if (A0d == null) {
                    AnonymousClass00G r5 = AnonymousClass00G.A01;
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass02M A003 = AnonymousClass02M.A00();
                    AnonymousClass01I A004 = AnonymousClass01I.A00();
                    AnonymousClass0AR A005 = AnonymousClass0AR.A00();
                    AnonymousClass01J A006 = AnonymousClass01J.A00();
                    C02770Dj A007 = C02770Dj.A00();
                    AnonymousClass01A A008 = AnonymousClass01A.A00();
                    C001400w r13 = C001400w.A02;
                    AnonymousClass03P A009 = AnonymousClass03P.A00();
                    C02360Br A0010 = C02360Br.A00();
                    AnonymousClass08B r16 = AnonymousClass08B.A00;
                    AnonymousClass01K A0011 = AnonymousClass01K.A00();
                    AnonymousClass0AC r18 = AnonymousClass0AC.A00;
                    C001000o A0012 = C001000o.A00();
                    AnonymousClass04v A0013 = AnonymousClass04v.A00();
                    AnonymousClass00D A0014 = AnonymousClass00D.A00();
                    if (C02810Dn.A03 == null) {
                        synchronized (C02810Dn.class) {
                            if (C02810Dn.A03 == null) {
                                C02810Dn.A03 = new C02810Dn(r5, AnonymousClass04q.A00());
                            }
                        }
                    }
                    A0d = new AnonymousClass01S(r5, A002, A003, A004, A005, A006, A007, A008, r13, A009, A0010, r16, A0011, r18, A0012, A0013, A0014, C02810Dn.A03, AnonymousClass0A8.A00);
                }
            }
        }
        return A0d;
    }

    public static final C02900Dx A01(UserJid userJid, C02840Dr r6, C02850Ds r7) {
        C02890Dw r3 = r6.A0M;
        if (r3 == null) {
            r3 = C02890Dw.A0B;
        }
        C02900Dx r62 = new C02900Dx(userJid);
        r62.A00 = r3.A00;
        r62.A01 = r3.A01;
        r62.A03 = r3.A03;
        int i = r3.A04;
        if ((i & 8) == 8) {
            float f = r3.A02;
            if (!Float.isNaN(f)) {
                r62.A02 = f;
            }
        }
        r62.A04 = r3.A05;
        if ((i & 128) == 128 && r7 != null) {
            r62.A05 = (((long) r3.A06) * 1000) + r7.A0E;
        }
        return r62;
    }

    public final int A02(int i) {
        int i2;
        synchronized (this.A0Q) {
            i2 = (i ^ -1) & this.A00;
            this.A00 = i2;
        }
        return i2;
    }

    public final long A03() {
        long j;
        synchronized (this.A0S) {
            SharedPreferences sharedPreferences = this.A0H.A00;
            long j2 = sharedPreferences.getLong("live_location_sequence_number", -1);
            long A022 = this.A0F.A02() * 1000;
            if (A022 > j2) {
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingManager/getNextSequenceNumber; got a new sequence number; currentSequenceNumber=");
                sb.append(A022);
                Log.i(sb.toString());
                j2 = A022;
            }
            j = j2 + 1;
            sharedPreferences.edit().putLong("live_location_sequence_number", j).apply();
        }
        return j;
    }

    public long A04(AnonymousClass02N r4) {
        synchronized (this.A0S) {
            C02910Dy r0 = (C02910Dy) A0D().get(r4);
            if (r0 == null) {
                return -1;
            }
            return r0.A01;
        }
    }

    public long A05(C02850Ds r5) {
        C02920Dz r1;
        synchronized (this.A0R) {
            Map A0C2 = A0C();
            C007303n r2 = r5.A0n;
            Map map = (Map) A0C2.get(r2.A00);
            if (map == null || (r1 = (C02920Dz) map.get(r5.A08())) == null || !r2.equals(r1.A02)) {
                return -1;
            }
            return r1.A00;
        }
    }

    public long A06(C02850Ds r5) {
        C007303n r3 = r5.A0n;
        AnonymousClass02N r1 = r3.A00;
        if (r1 != null) {
            synchronized (this.A0S) {
                C02910Dy r12 = (C02910Dy) A0D().get(r1);
                if (r12 == null || !r12.A02.equals(r3)) {
                    return -1;
                }
                return r12.A01;
            }
        }
        throw null;
    }

    public final C02850Ds A07(C007303n r4) {
        AbstractC007503q A052 = this.A0L.A0J.A05(r4);
        if (!(A052 instanceof C02850Ds) || A052.A0r) {
            return null;
        }
        return (C02850Ds) A052;
    }

    public ArrayList A08(AnonymousClass02N r12) {
        ArrayList arrayList;
        C02900Dx r0;
        synchronized (this.A0R) {
            Map map = (Map) A0C().get(r12);
            long A052 = this.A0F.A05();
            arrayList = new ArrayList();
            if (map != null) {
                for (C02920Dz r5 : map.values()) {
                    long j = r5.A00;
                    if ((j == 0 || j > A052) && (r0 = (C02900Dx) this.A0c.get(r5.A01)) != null) {
                        arrayList.add(r0);
                    }
                }
            }
        }
        return arrayList;
    }

    public List A09() {
        ArrayList arrayList;
        synchronized (this.A0S) {
            A0D();
            Set A0E2 = A0E();
            ((AbstractSet) A0E2).removeAll(this.A0V);
            StringBuilder sb = new StringBuilder();
            sb.append("LocationSharingManager/getJidsNeedingSenderKey; jids.size=");
            sb.append(((HashSet) A0E2).size());
            Log.i(sb.toString());
            arrayList = new ArrayList(A0E2);
        }
        return arrayList;
    }

    public List A0A() {
        ArrayList arrayList;
        synchronized (this.A0S) {
            Map A0D2 = A0D();
            arrayList = new ArrayList(A0D2.size());
            long A052 = this.A0F.A05();
            for (C02910Dy r5 : A0D2.values()) {
                long j = r5.A01;
                if (j == 0 || j > A052) {
                    AnonymousClass01A r1 = this.A0D;
                    AnonymousClass02N r0 = r5.A02.A00;
                    if (r0 != null) {
                        arrayList.add(r1.A09(r0));
                    } else {
                        throw null;
                    }
                }
            }
        }
        return arrayList;
    }

    public List A0B(AnonymousClass02N r12) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.A0R) {
            Map map = (Map) A0C().get(r12);
            long A052 = this.A0F.A05();
            if (map != null) {
                for (C02920Dz r5 : map.values()) {
                    long j = r5.A00;
                    if (j == 0 || j > A052) {
                        arrayList.add(r5.A01);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014f, code lost:
        if (r3 != null) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0154, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A0C() {
        /*
        // Method dump skipped, instructions count: 385
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01S.A0C():java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010c, code lost:
        if (r1 != null) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0111, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A0D() {
        /*
        // Method dump skipped, instructions count: 355
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01S.A0D():java.util.Map");
    }

    public final Set A0E() {
        Map A0D2 = A0D();
        HashSet hashSet = new HashSet();
        long A052 = this.A0F.A05();
        for (C02910Dy r5 : A0D2.values()) {
            long j = r5.A01;
            if (j == 0 || j > A052) {
                hashSet.addAll(r5.A03);
            }
        }
        return hashSet;
    }

    public void A0F() {
        Log.i("LocationSharingManager/cancelShareLocation");
        synchronized (this.A0S) {
            Iterator it = new ArrayList(A0D().keySet()).iterator();
            while (it.hasNext()) {
                A0P((AnonymousClass02N) it.next());
            }
        }
    }

    public void A0G() {
        boolean z;
        Log.d("LocationSharingManager/checkIfNeedToSendFinalLiveLocationUpdate");
        if (A0b()) {
            Object obj = this.A0Q;
            synchronized (obj) {
                z = false;
                if ((this.A00 & 1) == 1) {
                    z = true;
                }
            }
            if (!z) {
                Application application = this.A0G.A00;
                Log.d("LocationSharingService/start-location-reporting");
                C004302a.A06(application, new Intent(application, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.START_LOCATION_REPORTING").putExtra("duration", 40000L));
                synchronized (obj) {
                    this.A00 |= 1;
                }
            }
        }
    }

    public void A0H() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.A0S) {
            Map A0D2 = A0D();
            StringBuilder sb = new StringBuilder();
            sb.append("LocationSharingManager/updateSendingEnd; sendingMap.size=");
            sb.append(A0D2.size());
            Log.d(sb.toString());
            long A052 = this.A0F.A05();
            for (Map.Entry entry : A0D2.entrySet()) {
                long j = ((C02910Dy) entry.getValue()).A01;
                if (j != 0 && j <= A052) {
                    arrayList.add(entry.getKey());
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0P((AnonymousClass02N) it.next());
        }
        A0N();
    }

    public void A0I() {
        Log.i("LocationSharingManager/removeMyLocationSenderKey");
        AnonymousClass01I r0 = this.A0A;
        r0.A04();
        DeviceJid deviceJid = r0.A02;
        if (deviceJid != null) {
            AnonymousClass0E6 A0A2 = C001801b.A0A(deviceJid);
            synchronized (this.A0S) {
                C001400w r2 = this.A0J;
                r2.A00.execute(new RunnableEBaseShape3S0200000_I0_2(this, A0A2, 10));
                this.A0V.clear();
                this.A0b.clear();
                try {
                    int A012 = this.A0M.A00().A01().A01("location_key_distribution", null, null, "deleteAllLocationReceiverHasKey/DELETE_LOCATION_KEY_DISTRIBUTION");
                    StringBuilder sb = new StringBuilder("LocationSharingStore/deleteAllLocationReceiverHasKey/deleted ");
                    sb.append(A012);
                    sb.append(" rows");
                    Log.i(sb.toString());
                } catch (Exception e) {
                    Log.e("LocationSharingStore/deleteAllLocationReceiverHasKey/delete failed", e);
                    throw new RuntimeException(e);
                }
            }
            AnonymousClass04v r02 = this.A0C;
            r02.A00.A01(new AnonymousClass0E7());
            return;
        }
        throw null;
    }

    public void A0J() {
        C02900Dx r5;
        C02900Dx r0;
        synchronized (this) {
            r5 = this.A05;
        }
        if (r5 != null) {
            if (A0b()) {
                synchronized (this.A0S) {
                    boolean z = false;
                    for (C02910Dy r11 : A0D().values()) {
                        long j = r11.A01;
                        C007303n r7 = r11.A02;
                        C02850Ds A072 = A07(r7);
                        if (!(A072 == null || j == 0)) {
                            C02900Dx r1 = r11.A00;
                            C02900Dx r9 = r1;
                            if (r1 == null && (r0 = A072.A02) != null) {
                                r11.A00 = r0;
                                r1 = r0;
                                r9 = r0;
                                z = true;
                            } else if (r1 == null) {
                                long j2 = r5.A05;
                                if (j >= j2 && j <= j2 + 240000) {
                                    r9 = new C02900Dx(r5.A06);
                                    r11.A00 = r9;
                                    r9.A00(r5);
                                    this.A0B.A00.A01(new SendFinalLiveLocationNotificationJob(r7, r5, (int) ((r5.A05 - A072.A0E) / 1000)));
                                    z = true;
                                }
                            }
                            if (r1.A05 + 30000 < j) {
                                long j3 = r5.A05;
                                if (j >= j3 && j <= j3 + 30000) {
                                    r9.A00(r5);
                                    this.A0B.A00.A01(new SendFinalLiveLocationNotificationJob(r7, r5, (int) ((r5.A05 - A072.A0E) / 1000)));
                                    z = true;
                                }
                            }
                        }
                    }
                    if (z) {
                        A0N();
                    }
                }
                if (!A0b() && A02(1) == 0) {
                    LocationSharingService.A00(this.A0G.A00);
                }
            }
            C02840Dr A042 = this.A0N.A04(r5, null);
            long max = Math.max(0L, (this.A0F.A05() - r5.A05) / 1000);
            try {
                Object obj = this.A0J.A00.submit(new AnonymousClass2SA(this, A042)).get();
                AnonymousClass0AR r3 = this.A0O;
                if (r3.A04.A06) {
                    AnonymousClass008.A10("sendmethods/sendLocation elapsed=", max);
                    r3.A08.A09(Message.obtain(null, 0, 84, 0, Pair.create(Long.valueOf(max), obj)));
                }
            } catch (InterruptedException | ExecutionException e) {
                Log.e("LocationSharingManager/encryptAndSendLocation error", e);
            }
        } else {
            Log.w("LocationSharingManager/sendLatestLocation/try to send location, but no location available");
        }
    }

    public final void A0K() {
        Application application = this.A0G.A00;
        PendingIntent broadcast = PendingIntent.getBroadcast(application, 0, new Intent(application, FinalLiveLocationBroadcastReceiver.class), 536870912);
        if (broadcast != null) {
            AlarmManager A022 = this.A0E.A02();
            if (A022 != null) {
                A022.cancel(broadcast);
            } else {
                Log.w("LocationSharingManager/cancelFinalLiveLocationUpdateAlarm/AlarmManager is null");
            }
            broadcast.cancel();
        }
    }

    public final void A0L() {
        synchronized (this.A0S) {
            Set A0E2 = A0E();
            HashSet hashSet = new HashSet(this.A0V);
            hashSet.removeAll(A0E2);
            if (!hashSet.isEmpty()) {
                A0I();
            }
        }
    }

    public final void A0M() {
        AnonymousClass02M r0 = this.A09;
        Runnable runnable = this.A0T;
        Handler handler = r0.A02;
        handler.removeCallbacks(runnable);
        Long l = null;
        synchronized (this.A0R) {
            for (Map map : A0C().values()) {
                for (C02920Dz r7 : map.values()) {
                    if (l == null || r7.A00 < l.longValue()) {
                        l = Long.valueOf(r7.A00);
                    }
                }
            }
        }
        if (l != null) {
            long A052 = this.A0F.A05();
            long longValue = l.longValue();
            if (longValue > A052) {
                handler.postDelayed(runnable, longValue - A052);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (r8 < r20.longValue()) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0N() {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01S.A0N():void");
    }

    public void A0O(Location location) {
        C02900Dx A052 = this.A0N.A05(location);
        synchronized (this) {
            C02900Dx r0 = this.A05;
            if (r0 == null || A052.A05 > r0.A05) {
                this.A05 = A052;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        r1 = r6.A0W.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r1.hasNext() == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        ((X.AnonymousClass0ED) r1.next()).AKd(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        A0N();
        r4 = r6.A09;
        r4.A02.post(new java.lang.RunnableEBaseShape3S0200000_I0_2(r6, r7, 11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        if (A0c() != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        com.whatsapp.util.Log.i("LocationSharingManager/onStopLocationReporting");
        A02(2);
        com.whatsapp.location.LocationSharingService.A00(r6.A0G.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        r0 = r6.A0B;
        r0.A00.A01(new com.whatsapp.jobqueue.job.SendDisableLiveLocationJob(r7, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(X.AnonymousClass02N r7) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01S.A0P(X.02N):void");
    }

    public final void A0Q(AnonymousClass02N r7, UserJid userJid) {
        StringBuilder sb = new StringBuilder("LocationSharingManager/onReceiveStopSharing; jid=");
        sb.append(r7);
        sb.append("; participant=");
        sb.append(userJid);
        Log.i(sb.toString());
        synchronized (this.A0R) {
            Map A0C2 = A0C();
            Map map = (Map) A0C2.get(r7);
            if (map != null) {
                UserJid userJid2 = userJid;
                if (userJid == null) {
                    userJid2 = r7;
                }
                A0U((C02920Dz) map.remove(userJid2));
                C02810Dn r2 = this.A0M;
                if (r7 == null) {
                    throw null;
                } else if (r2 != null) {
                    if (userJid != null) {
                        r2.A08(false, r7, Collections.singletonList(userJid));
                    } else {
                        r2.A09(false, Collections.singletonList(r7));
                    }
                    if (map.isEmpty()) {
                        A0C2.remove(r7);
                    }
                } else {
                    throw null;
                }
            }
            A0a(A0C2);
        }
        for (AnonymousClass0EF r0 : this.A0X) {
            r0.AJ7(r7, userJid);
        }
        A0M();
        AnonymousClass02M r22 = this.A09;
        r22.A02.post(new RunnableEBaseShape3S0200000_I0_2(this, r7, 13));
    }

    public void A0R(AnonymousClass02N r10, List list) {
        boolean z;
        StringBuilder A0W2 = AnonymousClass008.A0W("LocationSharingManager/onParticipantsLeftGroup; gjid=", r10, "; participants.size=");
        A0W2.append(list.size());
        Log.i(A0W2.toString());
        synchronized (this.A0S) {
            Map A0D2 = A0D();
            C02910Dy r7 = (C02910Dy) A0D2.get(r10);
            z = false;
            if (r7 != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    UserJid userJid = (UserJid) it.next();
                    List list2 = r7.A03;
                    if (list2.contains(userJid)) {
                        list2.remove(userJid);
                        z = true;
                    }
                }
                if (r7.A03.isEmpty()) {
                    Object remove = A0D2.remove(r10);
                    if (remove != null) {
                        C02850Ds A072 = A07(((C02910Dy) remove).A02);
                        if (A072 != null) {
                            A0W(A072);
                        }
                    } else {
                        throw null;
                    }
                }
                this.A0M.A08(true, r10, list);
                A0L();
            }
        }
        if (z) {
            A0N();
            AnonymousClass02M r2 = this.A09;
            r2.A02.post(new RunnableEBaseShape3S0200000_I0_2(this, r10, 12));
        }
        synchronized (this.A0R) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A0Q(r10, (UserJid) it2.next());
            }
        }
    }

    public void A0S(AnonymousClass02U r3) {
        Map map;
        StringBuilder sb = new StringBuilder("LocationSharingManager/onMeLeftGroup; gjid=");
        sb.append(r3);
        Log.i(sb.toString());
        A0P(r3);
        synchronized (this.A0R) {
            map = (Map) A0C().remove(r3);
        }
        if (map != null) {
            for (C02920Dz r0 : map.values()) {
                A0Q(r3, r0.A01);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        r3 = r10.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r8 = r10.A0F.A05();
        r7 = (android.util.Pair) r3.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        if (r7 == null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        r0 = r8 - ((java.lang.Long) r7.first).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        if (r0 >= 60000) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009f, code lost:
        if (((java.lang.Integer) r7.second).intValue() < r13) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("LocationSharingManager/sendLocationKeyRetryRequest/retry too soon; remote_resource=");
        r4.append(r11);
        r4.append("; timeElapsed=");
        r4.append(r0);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bd, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00be, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bf, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("LocationSharingManager/sendLocationKeyRetryRequest/send; remote_resource=");
        r1.append(r11);
        r1.append("; retryCount=");
        r1.append(r13);
        com.whatsapp.util.Log.i(r1.toString());
        r3.put(r11, android.util.Pair.create(java.lang.Long.valueOf(r8), java.lang.Integer.valueOf(r13)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ea, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00eb, code lost:
        r1 = r10.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f1, code lost:
        if (r1.A04.A06 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f3, code lost:
        r3 = r1.A08;
        r2 = android.os.Message.obtain(null, 0, 125, 0);
        r2.getData().putParcelable("jid", r11);
        r2.getData().putByteArray("registrationId", r12);
        r2.getData().putInt("retryCount", r13);
        r3.A09(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0T(com.whatsapp.jid.UserJid r11, byte[] r12, int r13) {
        /*
        // Method dump skipped, instructions count: 290
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01S.A0T(com.whatsapp.jid.UserJid, byte[], int):void");
    }

    public final void A0U(C02920Dz r2) {
        C02850Ds A072;
        if (r2 != null && (A072 = A07(r2.A02)) != null) {
            A0W(A072);
        }
    }

    public void A0V(AnonymousClass0ED r3) {
        List list = this.A0W;
        if (!list.contains(r3)) {
            list.add(r3);
        }
    }

    public final void A0W(C02850Ds r5) {
        int A052 = (int) ((this.A0F.A05() - r5.A0E) / 1000);
        if (A052 < r5.A00) {
            r5.A00 = A052;
            if (((AbstractC02860Dt) r5).A02 == 1) {
                ((AbstractC02860Dt) r5).A02 = 0;
            }
            this.A0L.A0Q(r5, 19);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00de, code lost:
        r1 = r17.A0X.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e8, code lost:
        if (r1.hasNext() == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ea, code lost:
        ((X.AnonymousClass0EF) r1.next()).AJ6(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f4, code lost:
        A0M();
        r2 = r17.A09;
        r2.A02.post(new java.lang.RunnableEBaseShape3S0200000_I0_2(r17, r12, 14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0105, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0X(X.C02850Ds r18, long r19) {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01S.A0X(X.0Ds, long):void");
    }

    public void A0Y(C02850Ds r7, C02900Dx r8) {
        UserJid of;
        C007303n r1 = r7.A0n;
        AnonymousClass02N r5 = r1.A00;
        boolean z = r1.A02;
        if (z) {
            of = null;
        } else if (AnonymousClass1VY.A0Y(r5)) {
            of = UserJid.of(r7.A0G);
        } else {
            of = UserJid.of(r5);
        }
        String str = r1.A01;
        StringBuilder sb = new StringBuilder("LocationSharingManager/storeFinalLiveLocation/jid=");
        sb.append(r5);
        sb.append("; fromMe=");
        sb.append(z);
        sb.append("; msgId=");
        sb.append(str);
        sb.append("; participant=");
        sb.append(of);
        sb.append("; location.time=");
        AnonymousClass008.A1P(sb, r8.A05);
        r7.A02 = r8;
        this.A0L.A0Q(r7, 18);
    }

    public void A0Z(String str, AnonymousClass02N r5) {
        StringBuilder sb = new StringBuilder("LocationSharingManager/cancelShareLocation; msgId=");
        sb.append(str);
        sb.append("; jid=");
        sb.append(r5);
        Log.i(sb.toString());
        synchronized (this.A0S) {
            if (((C02910Dy) A0D().get(r5)) == null) {
                C02850Ds A072 = A07(new C007303n(r5, true, str));
                if (A072 != null) {
                    A0W(A072);
                }
                return;
            }
            A0P(r5);
        }
    }

    public final void A0a(Map map) {
        HashSet hashSet = new HashSet(this.A0c.keySet());
        for (Map map2 : map.values()) {
            for (C02920Dz r0 : map2.values()) {
                hashSet.remove(r0.A01);
            }
        }
        if (!hashSet.isEmpty()) {
            this.A0M.A03(hashSet);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r6 != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        if (r0 > 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r7 <= r2) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0b() {
        /*
            r9 = this;
            X.00S r0 = r9.A0F
            long r2 = r0.A05()
            java.lang.Object r1 = r9.A0S
            monitor-enter(r1)
            java.lang.Long r6 = r9.A06     // Catch:{ all -> 0x005e }
            monitor-exit(r1)     // Catch:{ all -> 0x005e }
            if (r6 == 0) goto L_0x001c
            long r7 = r6.longValue()
            r4 = 0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0026
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0026
        L_0x001c:
            java.lang.String r0 = "LocationSharingManager/hasExpiringLocationReceivers/triggered clearing"
            com.whatsapp.util.Log.i(r0)
            r9.A0H()
            if (r6 == 0) goto L_0x003b
        L_0x0026:
            long r4 = r6.longValue()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x003b
            monitor-enter(r1)
            long r4 = r9.A03     // Catch:{ all -> 0x0033 }
            monitor-exit(r1)     // Catch:{ all -> 0x0033 }
            goto L_0x0036
        L_0x0033:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0033 }
            throw r0
        L_0x0036:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r4 = 1
            if (r0 <= 0) goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            java.lang.String r0 = "LocationSharingManager/hasExpiringLocationReceivers/nextLiveLocationExpiration="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = "; now="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; result="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.d(r0)
            return r4
        L_0x005e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01S.A0b():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0c() {
        /*
            r9 = this;
            java.lang.Object r6 = r9.A0S
            monitor-enter(r6)
            java.util.Map r1 = r9.A0D()     // Catch:{ all -> 0x0033 }
            X.00S r0 = r9.A0F     // Catch:{ all -> 0x0033 }
            long r7 = r0.A05()     // Catch:{ all -> 0x0033 }
            java.util.Collection r0 = r1.values()     // Catch:{ all -> 0x0033 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0033 }
        L_0x0015:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0033 }
            X.0Dy r0 = (X.C02910Dy) r0     // Catch:{ all -> 0x0033 }
            long r3 = r0.A01     // Catch:{ all -> 0x0033 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x002d
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
        L_0x002d:
            r0 = 1
            monitor-exit(r6)     // Catch:{ all -> 0x0033 }
            return r0
        L_0x0030:
            r0 = 0
            monitor-exit(r6)     // Catch:{ all -> 0x0033 }
            return r0
        L_0x0033:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01S.A0c():boolean");
    }

    public boolean A0d() {
        synchronized (this.A0S) {
            List A092 = A09();
            ArrayList arrayList = (ArrayList) A092;
            arrayList.removeAll(this.A0b.keySet());
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.A0b.put((UserJid) it.next(), 0);
            }
            AnonymousClass01J r0 = this.A0B;
            r0.A00.A01(new SendLiveLocationKeyJob(A092));
            return true;
        }
    }

    public boolean A0e(AnonymousClass02N r9) {
        synchronized (this.A0S) {
            C02910Dy r0 = (C02910Dy) A0D().get(r9);
            if (r0 != null) {
                long j = r0.A01;
                long A052 = this.A0F.A05();
                if (j == 0 || j > A052) {
                    return true;
                }
                A0P(r9);
            }
            return false;
        }
    }

    public boolean A0f(UserJid userJid) {
        boolean contains;
        synchronized (this.A0S) {
            contains = ((HashSet) A0E()).contains(userJid);
        }
        return contains;
    }

    public boolean A0g(UserJid userJid, int i) {
        if (i > 4) {
            StringBuilder sb = new StringBuilder("LocationSharingManager/shouldUserGetLocationKeyRetry/reached max retry; remote_resource=");
            sb.append(userJid);
            sb.append("; retryCount=");
            sb.append(i);
            Log.w(sb.toString());
            return false;
        }
        synchronized (this.A0S) {
            if (!A0f(userJid)) {
                return false;
            }
            long A052 = this.A0F.A05();
            Pair pair = (Pair) this.A0Z.get(userJid);
            if (pair != null) {
                long longValue = A052 - ((Long) pair.first).longValue();
                if (longValue < 60000 && ((Integer) pair.second).intValue() >= i) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("LocationSharingManager/shouldUserGetLocationKeyRetry/retry too soon; remote_resource=");
                    sb2.append(userJid);
                    sb2.append("; timeElapsed=");
                    sb2.append(longValue);
                    Log.i(sb2.toString());
                    return false;
                }
            }
            return true;
        }
    }

    public boolean A0h(C02900Dx r13) {
        C02850Ds A072;
        synchronized (this.A0R) {
            Map map = this.A0c;
            UserJid userJid = r13.A06;
            C02900Dx r4 = (C02900Dx) map.get(userJid);
            boolean z = false;
            if (r4 != null && r4.A05 > r13.A05) {
                return false;
            }
            for (Map map2 : A0C().values()) {
                C02920Dz r9 = (C02920Dz) map2.get(userJid);
                if (!(r9 == null || r13.A05 > r9.A00 || (A072 = A07(r9.A02)) == null)) {
                    A0Y(A072, r13);
                    z = true;
                }
            }
            if (z) {
                if (r4 == null) {
                    map.put(userJid, r13);
                } else {
                    r4.A00(r13);
                }
                this.A0M.A02(r13);
            }
            return z;
        }
    }
}
