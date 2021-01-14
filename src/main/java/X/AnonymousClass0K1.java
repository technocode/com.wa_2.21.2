package X;

import android.os.ConditionVariable;
import android.os.Message;
import com.whatsapp.jobqueue.job.SendWebForwardJob;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0K1  reason: invalid class name */
public class AnonymousClass0K1 {
    public static volatile AnonymousClass0K1 A09;
    public final AnonymousClass01J A00;
    public final C02760Di A01;
    public final AnonymousClass00T A02;
    public final C02400Bv A03;
    public final AnonymousClass0C4 A04;
    public final AtomicInteger A05 = new AtomicInteger();
    public final AtomicInteger A06 = new AtomicInteger();
    public final Condition A07;
    public final ReentrantLock A08;

    public AnonymousClass0K1(AnonymousClass00T r2, C02400Bv r3, AnonymousClass0C4 r4, AnonymousClass01J r5, C02760Di r6) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.A08 = reentrantLock;
        this.A07 = reentrantLock.newCondition();
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = r5;
        this.A01 = r6;
    }

    public static AnonymousClass0K1 A00() {
        if (A09 == null) {
            synchronized (AnonymousClass0K1.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass0K1(C002101e.A00(), C02400Bv.A00(), AnonymousClass0C4.A00(), AnonymousClass01J.A00(), C02760Di.A00());
                }
            }
        }
        return A09;
    }

    public void A01(AnonymousClass02N r13, boolean z, Collection collection, int i) {
        ArrayList arrayList;
        C02400Bv r3 = this.A03;
        if (r3.A03() && r13 != null && collection != null && collection.size() != 0) {
            C57872l0 r11 = new C57872l0(this, r13, z, collection, i);
            ((AbstractC67843As) r11).A00 = r3.A01().A03;
            AnonymousClass0C4 r4 = this.A04;
            AnonymousClass237 r8 = new AnonymousClass237(r4, r11);
            ArrayList arrayList2 = null;
            int size = collection.size();
            if (z) {
                ArrayList arrayList3 = new ArrayList(size);
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C64392y7 A012 = C02760Di.A01((AbstractC007503q) it.next(), null, false);
                    if (A012 != null) {
                        arrayList3.add(A012);
                    }
                }
                arrayList = arrayList3;
            } else {
                ArrayList arrayList4 = new ArrayList(size);
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((AbstractC007503q) it2.next()).A0n);
                }
                arrayList = null;
                arrayList2 = arrayList4;
            }
            String A032 = r4.A03();
            AnonymousClass01J r42 = this.A00;
            String str = r3.A01().A03;
            int i2 = 8;
            if (z) {
                i2 = 7;
            }
            AnonymousClass1XZ r112 = new AnonymousClass1XZ(r13, i2);
            r112.A00 = i;
            r42.A00.A01(new SendWebForwardJob(A032, str, Message.obtain(null, 0, 55, 0, new AnonymousClass22L(A032, r13, r8, arrayList2, arrayList, r112))));
        }
    }

    public void A02(AbstractC007503q r13) {
        if (!AnonymousClass0FI.A0V(r13)) {
            throw new IllegalArgumentException("message thumb not loaded");
        } else if (this.A03.A03() && A04()) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(r13);
            A03(null, arrayList, 4, false, false, null, null, 4, null, null);
        }
    }

    public final void A03(String str, List list, int i, boolean z, boolean z2, ConditionVariable conditionVariable, ConditionVariable conditionVariable2, int i2, C007303n r22, Map map) {
        int i3;
        if (3 == i) {
            i3 = this.A05.getAndIncrement();
        } else {
            i3 = -1;
        }
        AnonymousClass2V8 r7 = new AnonymousClass2V8(this, conditionVariable, conditionVariable2, i, i3);
        if ((str != null || (list != null && (list.size() != 0 || i == 0))) && (this.A03.A03() || z2)) {
            RunnableC50452Ut r1 = new RunnableC50452Ut(this, list, r22, str, i, r7, z2, i2, map);
            if (z) {
                r1.run();
                return;
            }
            try {
                this.A02.ANF(r1);
            } catch (Exception e) {
                Log.e("app/xmpp/send/qr_msgs dispatch error ", e);
                r7.A00();
            }
        } else {
            r7.A00();
        }
    }

    public final boolean A04() {
        AnonymousClass0K4 A022 = this.A04.A02(this.A03.A01().A00);
        if (A022 == null || !A022.A0F.A0D(AbstractC000400g.A26) || !A022.A0D) {
            return true;
        }
        return false;
    }
}
