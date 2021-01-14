package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0P2  reason: invalid class name */
public class AnonymousClass0P2 {
    public static volatile AnonymousClass0P2 A0J;
    public final AnonymousClass0AV A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass01I A02;
    public final C000300f A03;
    public final AnonymousClass0IW A04;
    public final AnonymousClass00C A05;
    public final AnonymousClass00S A06;
    public final AnonymousClass00D A07;
    public final C015308l A08;
    public final AnonymousClass0I6 A09;
    public final C014508d A0A;
    public final AnonymousClass0PP A0B;
    public final AnonymousClass0PO A0C;
    public final AnonymousClass0P1 A0D;
    public final AnonymousClass0PM A0E;
    public final AnonymousClass0PT A0F;
    public final AnonymousClass00Y A0G;
    public final AbstractC02190Az A0H;
    public final AtomicBoolean A0I = new AtomicBoolean(false);

    public AnonymousClass0P2(AnonymousClass00S r3, C015308l r4, AnonymousClass009 r5, AnonymousClass01I r6, AnonymousClass00Y r7, C000300f r8, AnonymousClass0IW r9, AnonymousClass0PM r10, AnonymousClass00C r11, AnonymousClass0PT r12, AnonymousClass0PO r13, AnonymousClass00D r14, C014508d r15, AnonymousClass0AV r16, AnonymousClass0P1 r17, AnonymousClass0I6 r18, AnonymousClass0PP r19, AbstractC02190Az r20) {
        this.A06 = r3;
        this.A08 = r4;
        this.A01 = r5;
        this.A02 = r6;
        this.A0G = r7;
        this.A03 = r8;
        this.A04 = r9;
        this.A0E = r10;
        this.A05 = r11;
        this.A0F = r12;
        this.A0C = r13;
        this.A07 = r14;
        this.A0A = r15;
        this.A00 = r16;
        this.A0D = r17;
        this.A09 = r18;
        this.A0B = r19;
        this.A0H = r20;
    }

    public static AnonymousClass0P2 A00() {
        if (A0J == null) {
            synchronized (AnonymousClass0P2.class) {
                if (A0J == null) {
                    A0J = new AnonymousClass0P2(AnonymousClass00S.A00(), C015308l.A00(), AnonymousClass009.A00(), AnonymousClass01I.A00(), AnonymousClass00Y.A00(), C000300f.A00(), AnonymousClass0IW.A00(), AnonymousClass0PM.A00(), AnonymousClass00C.A00(), AnonymousClass0PT.A00(), AnonymousClass0PO.A00(), AnonymousClass00D.A00(), C014508d.A00(), AnonymousClass0AV.A00(), AnonymousClass0P1.A00(), AnonymousClass0I6.A00(), AnonymousClass0PP.A00(), new C02180Ay(C06300Sr.A00, null));
                }
            }
        }
        return A0J;
    }

    public int A01(AnonymousClass0PN r6) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = new ArrayList(this.A0F.A02().A00.values()).iterator();
            while (it.hasNext()) {
                AnonymousClass0PN r2 = (AnonymousClass0PN) it.next();
                if (r2.A0B().contains(r6.A0A)) {
                    arrayList.add(r2);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AnonymousClass0PN r3 = (AnonymousClass0PN) it2.next();
            int A012 = A01(r3);
            if (A012 != 3) {
                StringBuilder A0S = AnonymousClass008.A0S("DatabaseMigrationManager/processMigrations; name=");
                A0S.append(r6.A0A);
                A0S.append("; cannot rollback, because reverse dependency ");
                A0S.append(r3.A0A);
                A0S.append(" cannot be rolled (");
                A0S.append(A012);
                A0S.append(")");
                Log.i(A0S.toString());
                return A012;
            }
        }
        if (r6.A0G() || r6.A0F()) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("DatabaseMigrationManager/processMigrations; name=");
                sb.append(r6.A0A);
                sb.append("; trying to rollback migration.");
                Log.i(sb.toString());
                r6.A0D();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DatabaseMigrationManager/processMigrations; name=");
                sb2.append(r6.A0A);
                sb2.append("; migration was rolled back.");
                Log.i(sb2.toString());
                if (r6.A0G() || r6.A0F()) {
                    this.A01.A04("db-rollback-had-no-effect", r6.A0A, false);
                }
                return 3;
            } catch (Exception unused) {
                StringBuilder A0S2 = AnonymousClass008.A0S("DatabaseMigrationManager/processMigrations/error; name=");
                A0S2.append(r6.A0A);
                A0S2.append("; failed to rollback migration.");
                Log.e(A0S2.toString());
                return 4;
            }
        } else {
            AnonymousClass008.A1X(AnonymousClass008.A0S("DatabaseMigrationManager/processMigrations; name="), r6.A0A, "; rollback not needed, already in original state");
            return 3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0441, code lost:
        if (r18 != 0) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x049c, code lost:
        if (r7.optBoolean("enabled") == false) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x058d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x058e, code lost:
        if (r12 != null) goto L_0x0590;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0593, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0596, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x059a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass0PS r27, java.util.Set r28) {
        /*
        // Method dump skipped, instructions count: 1519
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0P2.A02(X.0PS, java.util.Set):void");
    }

    public void A03(AnonymousClass0PN r7, int i) {
        AnonymousClass1z8 r3 = new AnonymousClass1z8();
        Double valueOf = Double.valueOf((double) this.A0A.A02());
        r3.A01 = valueOf;
        r3.A00 = valueOf;
        r3.A09 = r7.A0A;
        r3.A02 = Double.valueOf((double) this.A05.A03());
        r3.A05 = 0L;
        r3.A07 = 0L;
        r3.A08 = 0L;
        r3.A06 = Long.valueOf(r7.A04());
        r3.A04 = 1;
        r3.A03 = Integer.valueOf(i);
        this.A0G.A0B(r3, null, false);
    }
}
