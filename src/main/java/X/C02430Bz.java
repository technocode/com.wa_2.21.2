package X;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Message;
import com.whatsapp.companiondevice.CompanionDeviceVerificationReceiver;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: X.0Bz  reason: invalid class name and case insensitive filesystem */
public class C02430Bz extends AnonymousClass1YF implements AnonymousClass0C0 {
    public static volatile C02430Bz A0K;
    public AnonymousClass2F8 A00;
    public Comparator A01 = AnonymousClass2LD.A00;
    public final AnonymousClass009 A02;
    public final AnonymousClass0C1 A03;
    public final AnonymousClass02M A04;
    public final AnonymousClass01I A05;
    public final AnonymousClass03P A06;
    public final AnonymousClass00S A07;
    public final AnonymousClass00G A08;
    public final AnonymousClass00D A09;
    public final AnonymousClass01X A0A;
    public final C001000o A0B;
    public final C001400w A0C;
    public final C015908r A0D;
    public final AnonymousClass09H A0E;
    public final C015808q A0F;
    public final AnonymousClass02H A0G;
    public final AnonymousClass00T A0H;
    public final Object A0I = new Object();
    public final Set A0J = new HashSet();

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{213};
    }

    public C02430Bz(AnonymousClass00S r3, AnonymousClass02M r4, AnonymousClass009 r5, AnonymousClass01I r6, AnonymousClass00G r7, AnonymousClass00T r8, C015908r r9, AnonymousClass09H r10, C001400w r11, AnonymousClass03P r12, AnonymousClass01X r13, C015808q r14, C001000o r15, AnonymousClass00D r16, AnonymousClass0C1 r17) {
        this.A07 = r3;
        this.A04 = r4;
        this.A02 = r5;
        this.A05 = r6;
        this.A08 = r7;
        this.A0H = r8;
        this.A0D = r9;
        this.A0E = r10;
        this.A0C = r11;
        this.A06 = r12;
        this.A0A = r13;
        this.A0F = r14;
        this.A0B = r15;
        this.A09 = r16;
        this.A03 = r17;
        this.A0G = new AnonymousClass02H(r8, false);
    }

    public static C02430Bz A00() {
        if (A0K == null) {
            synchronized (C02430Bz.class) {
                if (A0K == null) {
                    A0K = new C02430Bz(AnonymousClass00S.A00(), AnonymousClass02M.A00(), AnonymousClass009.A00(), AnonymousClass01I.A00(), AnonymousClass00G.A01, C002101e.A00(), C015908r.A00(), AnonymousClass09H.A01(), C001400w.A02, AnonymousClass03P.A00(), AnonymousClass01X.A00(), C015808q.A00(), C001000o.A00(), AnonymousClass00D.A00(), AnonymousClass0C1.A01());
                }
            }
        }
        return A0K;
    }

    public final AnonymousClass1VI A02(DeviceJid deviceJid) {
        if (!this.A0F.A01()) {
            return null;
        }
        return (AnonymousClass1VI) this.A0D.A04.A01().A00.get(deviceJid);
    }

    public List A03() {
        if (!this.A0F.A01()) {
            return new ArrayList();
        }
        return new ArrayList(new ArrayList(this.A0D.A01().A00.values()));
    }

    public void A04() {
        C05350Oe A022 = this.A0D.A04.A01().A02();
        if (A022.A00.isEmpty()) {
            A06(A022);
            return;
        }
        AnonymousClass2XT r12 = new AnonymousClass2XT(this.A0E, new AnonymousClass2bW(this));
        r12.A00 = A022;
        AnonymousClass09H r8 = r12.A02;
        String A023 = r8.A02();
        AnonymousClass0M5 r4 = new AnonymousClass0M5("remove-companion-device", new AnonymousClass0OS[]{new AnonymousClass0OS("all", "true", null, (byte) 0)}, null, null);
        AnonymousClass008.A1H("app/sendRemoveAllDevicesRequest success: ", r8.A0B(237, A023, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("to", AnonymousClass0QU.A00), new AnonymousClass0OS("id", A023, null, (byte) 0), new AnonymousClass0OS("xmlns", "md", null, (byte) 0), new AnonymousClass0OS("type", "set", null, (byte) 0)}, r4), r12, 0));
    }

    public void A05(AnonymousClass0PU r15, boolean z) {
        AnonymousClass0PU A012 = this.A0D.A01();
        if (r15 != null) {
            HashSet hashSet = new HashSet();
            Iterator it = A012.A01().iterator();
            while (true) {
                C28351Tz r1 = (C28351Tz) it;
                if (!r1.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) r1.next();
                Object key = entry.getKey();
                Map map = r15.A00;
                if (!map.containsKey(key) || (z && ((Number) map.get(entry.getKey())).intValue() != ((AnonymousClass1VI) entry.getValue()).A03)) {
                    hashSet.add(entry.getKey());
                }
            }
            C05350Oe r5 = new C05350Oe(hashSet, null);
            if (!r5.A00.isEmpty()) {
                this.A0G.execute(new RunnableEBaseShape0S0210000_I0(this, r5, false, 6));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = r15.A01().iterator();
            while (true) {
                C28351Tz r12 = (C28351Tz) it2;
                if (!r12.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) r12.next();
                Object key2 = entry2.getKey();
                AnonymousClass01I r0 = this.A05;
                r0.A04();
                if (!key2.equals(r0.A02)) {
                    Object key3 = entry2.getKey();
                    Map map2 = A012.A00;
                    if (!map2.containsKey(key3) || (z && ((AnonymousClass1VI) map2.get(entry2.getKey())).A03 != ((Number) entry2.getValue()).intValue())) {
                        arrayList.add(entry2.getKey());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    DeviceJid deviceJid = (DeviceJid) it3.next();
                    synchronized (this.A0I) {
                        AnonymousClass2F8 r02 = this.A00;
                        if (r02 == null || !r02.A01.A05.equals(deviceJid)) {
                            A09(deviceJid);
                            AnonymousClass009 r3 = this.A02;
                            StringBuilder sb = new StringBuilder();
                            sb.append("toAdd=");
                            sb.append(arrayList);
                            r3.A04("ContactSyncDevicesUpdater/update add unknown device of self", sb.toString(), false);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("companion-device-manager/complete pending registration: ");
                            sb2.append(deviceJid);
                            Log.d(sb2.toString());
                            AnonymousClass2F8 r7 = this.A00;
                            StringBuilder A0S = AnonymousClass008.A0S("companion-device-manager/device registered: ");
                            DeviceJid deviceJid2 = r7.A01.A05;
                            A0S.append(deviceJid2);
                            Log.d(A0S.toString());
                            Set<AnonymousClass0By> set = super.A00;
                            synchronized (set) {
                                for (AnonymousClass0By r03 : set) {
                                    r03.AF1(r7);
                                }
                            }
                            AnonymousClass2F8 r04 = this.A00;
                            if (r04 != null && r04.A01.A05.equals(deviceJid2)) {
                                AnonymousClass2F8 r72 = this.A00;
                                AnonymousClass1VI r32 = r72.A01;
                                this.A0G.execute(new RunnableEBaseShape0S0300000_I0_0(this, r32, r72, 34));
                                AnonymousClass00D r73 = this.A09;
                                String rawString = r32.A05.getRawString();
                                if (rawString != null) {
                                    String string = r73.A00.getString("companion_device_verification_ids", null);
                                    if (string != null) {
                                        rawString = AnonymousClass008.A0L(string, ",", rawString);
                                    }
                                    AnonymousClass008.A0m(r73, "companion_device_verification_ids", rawString);
                                    Application application = this.A08.A00;
                                    if (PendingIntent.getBroadcast(application, 0, new Intent(application, CompanionDeviceVerificationReceiver.class), 536870912) == null) {
                                        long currentTimeMillis = System.currentTimeMillis() + ((long) (new Random().nextDouble() * 1.08E7d)) + 3600000;
                                        AnonymousClass008.A0z("CompanionDevice/scheduleCompanionDeviceVerificationAlarm/ whenMillis ", currentTimeMillis);
                                        AlarmManager A022 = this.A06.A02();
                                        if (A022 != null) {
                                            PendingIntent broadcast = PendingIntent.getBroadcast(application, 0, new Intent(application, CompanionDeviceVerificationReceiver.class), 134217728);
                                            if (Build.VERSION.SDK_INT >= 19) {
                                                A022.setExact(0, currentTimeMillis, broadcast);
                                            } else {
                                                A022.set(0, currentTimeMillis, broadcast);
                                            }
                                        } else {
                                            Log.w("CompanionDevice/scheduleCompanionDeviceVerificationAlarm AlarmManager is null");
                                        }
                                    }
                                    this.A00 = null;
                                } else {
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        } else if (!A012.A00.isEmpty()) {
            this.A0G.execute(new RunnableEBaseShape0S0210000_I0(this, A012.A02(), false, 6));
        }
    }

    public final void A06(C05350Oe r4) {
        Set<AnonymousClass0By> set = super.A00;
        synchronized (set) {
            for (AnonymousClass0By r0 : set) {
                r0.AF2(r4);
            }
        }
    }

    public final void A07(AnonymousClass1VI r4) {
        Set<AnonymousClass0By> set = super.A00;
        synchronized (set) {
            for (AnonymousClass0By r0 : set) {
                r0.AF3(r4);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.AnonymousClass1VI r13, android.location.Location r14) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02430Bz.A08(X.1VI, android.location.Location):void");
    }

    public void A09(DeviceJid deviceJid) {
        AnonymousClass2XT r12 = new AnonymousClass2XT(this.A0E, new AnonymousClass2bW(this));
        r12.A00 = C05350Oe.A00(deviceJid);
        AnonymousClass09H r8 = r12.A02;
        String A022 = r8.A02();
        AnonymousClass0OS[] r2 = new AnonymousClass0OS[1];
        if (deviceJid != null) {
            r2[0] = new AnonymousClass0OS("jid", deviceJid);
            AnonymousClass0M5 r5 = new AnonymousClass0M5("remove-companion-device", r2, null, null);
            AnonymousClass008.A1H("app/sendRemoveDeviceRequest success: ", r8.A0B(237, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("to", AnonymousClass0QU.A00), new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("xmlns", "md", null, (byte) 0), new AnonymousClass0OS("type", "set", null, (byte) 0)}, r5), r12, 0));
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass0C0
    public boolean AAE(int i, Message message) {
        long A052;
        if (i != 213) {
            return false;
        }
        if (message == null) {
            return true;
        }
        AnonymousClass0M5 r4 = (AnonymousClass0M5) message.obj;
        DeviceJid deviceJid = (DeviceJid) r4.A09(DeviceJid.class, "from", this.A02);
        if (this.A05.A08(deviceJid)) {
            String A0G2 = r4.A0G("type", null);
            if (A0G2 == null || "available".equals(A0G2)) {
                A052 = this.A07.A05();
                this.A0J.add(deviceJid);
            } else if (!"unavailable".equals(A0G2)) {
                return true;
            } else {
                A052 = AnonymousClass0OT.A01(r4);
                this.A0J.remove(deviceJid);
            }
            if (A052 == 0) {
                return true;
            }
            this.A0H.ANF(new RunnableEBaseShape0S0200100_I0(this, A052, deviceJid, 3));
            return true;
        }
        Log.d("Invalid device presence");
        return true;
    }
}
