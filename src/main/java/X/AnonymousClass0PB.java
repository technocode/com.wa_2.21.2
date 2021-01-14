package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0PB  reason: invalid class name */
public class AnonymousClass0PB {
    public static volatile AnonymousClass0PB A0C;
    public final C02270Bi A00 = new C02270Bi(0);
    public final AnonymousClass009 A01;
    public final AnonymousClass00D A02;
    public final C014408c A03;
    public final C006903j A04;
    public final C015308l A05;
    public final C014508d A06;
    public final AnonymousClass0P2 A07;
    public final AnonymousClass0P1 A08;
    public final AnonymousClass0PT A09;
    public final AnonymousClass0FZ A0A;
    public final AnonymousClass00T A0B;

    public AnonymousClass0PB(C015308l r3, C014408c r4, AnonymousClass009 r5, AnonymousClass00T r6, C006903j r7, AnonymousClass0PT r8, AnonymousClass0FZ r9, C014508d r10, AnonymousClass00D r11, AnonymousClass0P1 r12, AnonymousClass0P2 r13) {
        this.A05 = r3;
        this.A03 = r4;
        this.A01 = r5;
        this.A0B = r6;
        this.A04 = r7;
        this.A09 = r8;
        this.A0A = r9;
        this.A06 = r10;
        this.A02 = r11;
        this.A08 = r12;
        this.A07 = r13;
    }

    public static AnonymousClass0PB A00() {
        if (A0C == null) {
            synchronized (AnonymousClass0PB.class) {
                if (A0C == null) {
                    A0C = new AnonymousClass0PB(C015308l.A00(), C014408c.A00(), AnonymousClass009.A00(), C002101e.A00(), C006903j.A00(), AnonymousClass0PT.A00(), AnonymousClass0FZ.A00(), C014508d.A00(), AnonymousClass00D.A00(), AnonymousClass0P1.A00(), AnonymousClass0P2.A00());
                }
            }
        }
        return A0C;
    }

    public synchronized int A01() {
        return ((Integer) this.A00.A01()).intValue();
    }

    public final void A02(Set set, boolean z) {
        C014508d r4 = this.A06;
        r4.A05();
        ReentrantReadWriteLock.WriteLock writeLock = r4.A09;
        writeLock.lock();
        this.A04.A0A();
        StringBuilder sb = new StringBuilder("ForcedDBMigration/running forced migrations. blocking = ");
        sb.append(z);
        Log.i(sb.toString());
        try {
            this.A07.A02(new AnonymousClass0PS(new AnonymousClass0PR[0]), set);
        } finally {
            if (A03(set, z) || !z) {
                r4.A05();
                writeLock.unlock();
                this.A0A.A04(true);
            }
        }
    }

    public boolean A03(Set set, boolean z) {
        boolean z2;
        if (!this.A05.A0C()) {
            Log.e("ForcedDBMigration/failed to migrate jidStore");
            z2 = false;
        } else {
            z2 = true;
        }
        if (!this.A03.A0G()) {
            Log.e("ForcedDBMigration/failed to migrate chatStore");
            z2 = false;
        }
        Iterator it = set.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            AnonymousClass0PN r1 = (AnonymousClass0PN) this.A09.A02().A00.get(str);
            if (r1 != null && !r1.A0G()) {
                AnonymousClass008.A17("ForcedDBMigration/failed to migrate ", str);
                if (z3 || r1.A0L()) {
                    z2 = false;
                } else {
                    z2 = false;
                    z3 = true;
                }
            }
        }
        if (z2) {
            Log.i("ForcedDBMigration/successfully migrated all forced migration");
            this.A00.A08(5);
            return z2;
        }
        AnonymousClass008.A1H("ForcedDBMigration/failed to migrate all forced migration. blocking = ", z);
        AnonymousClass009 r9 = this.A01;
        AnonymousClass00A r12 = new AnonymousClass00A("ForcedDatabaseMigrationManager/failedToMigrate");
        if (r9 != null) {
            Log.e("UNCAUGHT EXCEPTION", r12);
            AnonymousClass00D r4 = this.A02;
            if (r4.A0n(86400000, "forced_migration_failed_upload_timestamp")) {
                r9.A06(false, true, false, false, false, new HashSet(Collections.singletonList("log_files_upload")), null, null);
                r4.A0B("forced_migration_failed_upload_timestamp");
            }
            C02270Bi r13 = this.A00;
            if (!z) {
                r13.A08(2);
                return z2;
            }
            int i = 4;
            if (z3) {
                i = 3;
            }
            r13.A08(Integer.valueOf(i));
            return z2;
        }
        throw null;
    }

    public final synchronized boolean A04(boolean z) {
        C014508d r0 = this.A06;
        r0.A05();
        if (!r0.A01) {
            return false;
        }
        HashSet hashSet = new HashSet();
        AnonymousClass0PT r6 = this.A09;
        Iterator it = new ArrayList(r6.A02().A00.values()).iterator();
        while (it.hasNext()) {
            AnonymousClass0PN r5 = (AnonymousClass0PN) it.next();
            AnonymousClass0P1 r02 = this.A08;
            String str = r5.A0A;
            if (r02.A00.contains(str) && r5.A02() == 3 && !r5.A0G()) {
                hashSet.add(str);
            }
        }
        boolean z2 = !hashSet.isEmpty();
        if (!z2) {
            Iterator it2 = new ArrayList(r6.A02().A00.values()).iterator();
            while (it2.hasNext()) {
                AnonymousClass0PN r52 = (AnonymousClass0PN) it2.next();
                if (r52.A0H() && r52.A02() == 3 && !r52.A0G()) {
                    hashSet.add(r52.A0A);
                }
            }
        }
        if (hashSet.isEmpty()) {
            return false;
        }
        if (this.A07.A0I.get()) {
            return false;
        }
        C02270Bi r1 = this.A00;
        if (((Integer) r1.A01()).intValue() != 0) {
            return true;
        }
        r1.A08(1);
        this.A0A.A04(false);
        if (z) {
            A02(hashSet, z2);
        } else {
            this.A0B.ANJ(new RunnableEBaseShape0S0210000_I0(this, hashSet, z2, 7));
        }
        return true;
    }
}
