package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Bx  reason: invalid class name and case insensitive filesystem */
public final class C02420Bx implements AnonymousClass09O, AnonymousClass0By {
    public static volatile C02420Bx A09;
    public Runnable A00;
    public final AnonymousClass01I A01;
    public final C000300f A02;
    public final AnonymousClass0C3 A03;
    public final C02410Bw A04;
    public final AnonymousClass00S A05;
    public final C02430Bz A06;
    public final AnonymousClass09H A07;
    public final AnonymousClass00T A08;

    @Override // X.AnonymousClass0By
    public void AEz(AnonymousClass2F8 r1) {
    }

    @Override // X.AnonymousClass0By
    public void AF3(AnonymousClass1VI r1) {
    }

    public C02420Bx(AnonymousClass00S r1, AnonymousClass01I r2, AnonymousClass00T r3, C000300f r4, AnonymousClass09H r5, C02430Bz r6, C02410Bw r7, AnonymousClass0C3 r8) {
        this.A05 = r1;
        this.A01 = r2;
        this.A08 = r3;
        this.A02 = r4;
        this.A07 = r5;
        this.A06 = r6;
        this.A04 = r7;
        this.A03 = r8;
    }

    public static C02420Bx A00() {
        if (A09 == null) {
            synchronized (C02420Bx.class) {
                if (A09 == null) {
                    A09 = new C02420Bx(AnonymousClass00S.A00(), AnonymousClass01I.A00(), C002101e.A00(), C000300f.A00(), AnonymousClass09H.A01(), C02430Bz.A00(), C02410Bw.A00(), AnonymousClass0C3.A00());
                }
            }
        }
        return A09;
    }

    public void A01() {
        AnonymousClass0OS[] r3;
        AnonymousClass0M5[] r2;
        AnonymousClass0M5 r0;
        synchronized (this) {
            Runnable runnable = this.A00;
            if (runnable != null) {
                this.A08.AMj(runnable);
                this.A00 = null;
                Log.i("SyncdDeleteAllDataHandler/resetSchedule removed scheduled sync");
            }
        }
        if (A05()) {
            AnonymousClass09H r7 = this.A07;
            AnonymousClass09K r1 = r7.A02;
            if (r1.A06 && r1.A02) {
                C02410Bw r32 = this.A04;
                r32.A02(r32.A00.getInt("syncd_dirty", -1) + 1);
                C02430Bz r12 = this.A06;
                if (!((AbstractCollection) r12.A03()).isEmpty()) {
                    Log.i("SyncdDeleteAllDataApiHandler/handleDirtyState: logoutAllCompanionDevices");
                    r12.A04();
                    return;
                }
                Log.i("SyncdDeleteAllDataApiHandler/handleDirtyState: sendDeleteAllDataIq");
                AnonymousClass01I r02 = this.A01;
                r02.A04();
                UserJid userJid = r02.A03;
                if (userJid != null) {
                    String A022 = r7.A02();
                    StringBuilder sb = new StringBuilder("SyncdDeleteAllDataApiHandler/sendIqWithCallback ");
                    sb.append(A022);
                    Log.i(sb.toString());
                    C64272xu r4 = new C64272xu("iq");
                    AnonymousClass0OS r03 = new AnonymousClass0OS("to", userJid);
                    List list = r4.A01;
                    list.add(r03);
                    list.add(new AnonymousClass0OS("xmlns", "w:sync:app:state", null, (byte) 0));
                    list.add(new AnonymousClass0OS("type", "set", null, (byte) 0));
                    list.add(new AnonymousClass0OS("id", A022, null, (byte) 0));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    if (!arrayList2.isEmpty()) {
                        r3 = (AnonymousClass0OS[]) arrayList2.toArray(new AnonymousClass0OS[0]);
                    } else {
                        r3 = null;
                    }
                    if (!arrayList.isEmpty()) {
                        r2 = (AnonymousClass0M5[]) arrayList.toArray(new AnonymousClass0M5[0]);
                    } else {
                        r2 = null;
                    }
                    if (r2 == null) {
                        r0 = new AnonymousClass0M5("delete_all_data", r3, null, null);
                    } else {
                        r0 = new AnonymousClass0M5("delete_all_data", r3, r2, null);
                    }
                    r4.A02.add(r0);
                    r7.A0B(250, A022, r4.A00(), this, 0);
                }
            }
        }
    }

    public void A02() {
        Log.i("SyncdDeleteAllDataApiHandler/markSyncdDirty");
        if (!A04()) {
            C02410Bw r1 = this.A04;
            r1.A02(0);
            r1.A00.edit().remove("syncd_last_companion_dereg_time").apply();
        }
    }

    public synchronized void A03() {
        boolean A052 = A05();
        StringBuilder sb = new StringBuilder();
        sb.append("SyncdDeleteAllDataHandler/schedule isSyncdDirtyAndShouldRetry = ");
        sb.append(A052);
        Log.i(sb.toString());
        if (A052) {
            this.A00 = this.A08.ANO(new RunnableEBaseShape2S0100000_I0_2(this, 13), 1000);
        } else {
            this.A08.ANF(new RunnableEBaseShape2S0100000_I0_2(this.A03, 14));
        }
    }

    public boolean A04() {
        return this.A04.A00.getInt("syncd_dirty", -1) != -1;
    }

    public boolean A05() {
        int i = this.A04.A00.getInt("syncd_dirty", -1);
        return i != -1 && i < 4;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        StringBuilder sb = new StringBuilder("SyncdDeleteAllDataApiHandler/onDeliveryFailure ");
        sb.append(str);
        Log.e(sb.toString());
        A03();
    }

    @Override // X.AnonymousClass0By
    public void AF0(C05350Oe r2, int i) {
        if (A04()) {
            Log.i("SyncdDeleteAllDataApiHandler/onDeviceLogoutError");
            A03();
        }
    }

    @Override // X.AnonymousClass0By
    public void AF1(AnonymousClass2F8 r3) {
        if (A04()) {
            Log.e("SyncdDeleteAllDataApiHandler/onDeviceRegistered: This should be rare and suggested to check more logs.");
            return;
        }
        Log.i("SyncdDeleteAllDataApiHandler/onDeviceRegistered removeLastCompanionDeregTime");
        this.A04.A00.edit().remove("syncd_last_companion_dereg_time").apply();
    }

    @Override // X.AnonymousClass0By
    public void AF2(C05350Oe r5) {
        if (A04()) {
            Log.i("SyncdDeleteAllDataApiHandler/onDeviceRemoved");
            this.A04.A02(0);
            A01();
            return;
        }
        C000300f r2 = this.A02;
        if (r2.A06(AbstractC000400g.A41) >= 2 && r2.A06(AbstractC000400g.A3T) > 0 && !(!((AbstractCollection) this.A06.A03()).isEmpty())) {
            Log.i("SyncdDeleteAllDataApiHandler/onDeviceRemoved setLastCompanionDeregTime");
            C02410Bw r1 = this.A04;
            r1.A00.edit().putLong("syncd_last_companion_dereg_time", this.A05.A05()).apply();
        }
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r5) {
        Pair A0j = C002001d.A0j(r5);
        StringBuilder sb = new StringBuilder("SyncdDeleteAllDataApiHandler/onError ");
        sb.append(A0j);
        Log.e(sb.toString());
        A03();
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r5) {
        StringBuilder sb = new StringBuilder("SyncdDeleteAllDataApiHandler/onSuccess ");
        sb.append(str);
        sb.append(" response: ");
        sb.append(r5);
        Log.i(sb.toString());
        this.A08.ANF(new RunnableEBaseShape2S0100000_I0_2(this, 16));
    }
}
