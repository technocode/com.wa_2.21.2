package X;

import com.whatsapp.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0Cs  reason: invalid class name and case insensitive filesystem */
public class C02600Cs extends AbstractC02610Ct {
    public static volatile C02600Cs A02;
    public final C000300f A00;
    public final C02670Cz A01;

    public C02600Cs(AnonymousClass00G r13, AnonymousClass00S r14, AnonymousClass009 r15, AnonymousClass00T r16, AnonymousClass0CL r17, C000300f r18, C02640Cw r19, AnonymousClass03U r20, AnonymousClass04j r21, C02660Cy r22, AnonymousClass00D r23) {
        super(r13, r14, r15, r16, r17, r19, r20, r21, r22, r23);
        this.A00 = r18;
        this.A01 = new C02670Cz(r13, r15);
    }

    public static C02600Cs A00() {
        if (A02 == null) {
            synchronized (C02600Cs.class) {
                if (A02 == null) {
                    A02 = new C02600Cs(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass009.A00(), C002101e.A00(), AnonymousClass0CL.A00(), C000300f.A00(), C02640Cw.A00(), AnonymousClass03U.A00(), AnonymousClass04j.A00(), C02660Cy.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A02;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x031b, code lost:
        if (r8.A00() != 1) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x034b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x034f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0352, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0356, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0359, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x035d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0372, code lost:
        if (r8.A00() != 1) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x039c, code lost:
        if (r8.A00() == 1) goto L_0x03bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03b9, code lost:
        if (r8.A00() == 1) goto L_0x03bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03bc, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03c2, code lost:
        if (r8.A00() != 1) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03c4, code lost:
        X.AnonymousClass00E.A07(r6);
        r0.unlock();
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x049c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04a0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04b8, code lost:
        if (r1.contains("offsetfile.json") == false) goto L_0x04ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        if (r8.A00() != 1) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x05cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05cf, code lost:
        throw r0;
     */
    @Override // X.AbstractC02610Ct
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0J(X.AbstractC28621Va r22, java.lang.String r23) {
        /*
        // Method dump skipped, instructions count: 1495
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02600Cs.A0J(X.1Va, java.lang.String):boolean");
    }

    public final synchronized void A0K() {
        String A012;
        AnonymousClass2NI A013 = A01();
        if (A013 == null || (A012 = A013.A01(0)) == null) {
            Log.d("EmojiManager/initStorageIfNeeded/idHash is null, can't init flatfileStorage");
        } else {
            C02670Cz r6 = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("downloadable/emoji_");
            sb.append(A012);
            String obj = sb.toString();
            ReentrantLock reentrantLock = r6.A07;
            reentrantLock.lock();
            try {
                if (r6.A00() == 2) {
                    Log.d("FlatfileStorage/init/state is already complete, already inited, returning.");
                } else {
                    int A002 = r6.A00();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("FlatfileStorage/init/trying to init now from current state = ");
                    sb2.append((String) C02670Cz.A08.get(A002));
                    Log.d(sb2.toString());
                    r6.A03(1);
                    synchronized (r6) {
                        r6.A02 = obj;
                    }
                    if (r6.A04()) {
                        r6.A03(2);
                    } else {
                        Log.d("FlatfileStorage/init/prepare was not successful, returning");
                        r6.A03(A002);
                    }
                    reentrantLock.unlock();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public synchronized void A0L(int i) {
        if (this.A00.A06(AbstractC000400g.A45) <= 0) {
            Log.d("EmojiManager/getFilesAsync/ServerProps is turned off, skipping emoji fetch.");
            return;
        }
        int A0G = A0G();
        if (A0G == 3 || A0G == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("EmojiManager/getFilesAsync/State is ");
            sb.append((String) AbstractC02620Cu.A0G.get(Integer.valueOf(A0G)));
            Log.d(sb.toString());
        } else {
            A0H(1);
            this.A0E.ANF(new RunnableEBaseShape0S0101000_I0(this, i, 2));
        }
    }
}
