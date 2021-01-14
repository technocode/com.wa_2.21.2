package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0Ew  reason: invalid class name and case insensitive filesystem */
public class C03120Ew {
    public static volatile C03120Ew A0H;
    public final AnonymousClass088 A00;
    public final AnonymousClass00S A01;
    public final AnonymousClass00G A02;
    public final AnonymousClass09A A03;
    public final C014408c A04;
    public final AnonymousClass01K A05;
    public final AnonymousClass0AB A06;
    public final C015308l A07;
    public final AnonymousClass0BV A08;
    public final AnonymousClass0B4 A09;
    public final AnonymousClass0AC A0A;
    public final AnonymousClass094 A0B;
    public final C014508d A0C;
    public final C015408m A0D;
    public final AnonymousClass09E A0E;
    public final AnonymousClass022 A0F;
    public final AtomicBoolean A0G = new AtomicBoolean(false);

    public C03120Ew(AnonymousClass00S r3, C015308l r4, C014408c r5, AnonymousClass00G r6, AnonymousClass088 r7, AnonymousClass09E r8, AnonymousClass0AB r9, AnonymousClass0B4 r10, AnonymousClass01K r11, AnonymousClass0AC r12, AnonymousClass0BV r13, C015408m r14, AnonymousClass09A r15, C014508d r16, AnonymousClass022 r17, AnonymousClass094 r18) {
        this.A01 = r3;
        this.A07 = r4;
        this.A04 = r5;
        this.A02 = r6;
        this.A00 = r7;
        this.A0E = r8;
        this.A06 = r9;
        this.A09 = r10;
        this.A05 = r11;
        this.A0A = r12;
        this.A08 = r13;
        this.A0D = r14;
        this.A03 = r15;
        this.A0C = r16;
        this.A0F = r17;
        this.A0B = r18;
    }

    public static C03120Ew A00() {
        if (A0H == null) {
            synchronized (C03120Ew.class) {
                if (A0H == null) {
                    A0H = new C03120Ew(AnonymousClass00S.A00(), C015308l.A00(), C014408c.A00(), AnonymousClass00G.A01, AnonymousClass088.A00(), AnonymousClass09E.A00(), AnonymousClass0AB.A00(), AnonymousClass0B4.A00(), AnonymousClass01K.A00(), AnonymousClass0AC.A00, AnonymousClass0BV.A00(), C015408m.A00(), AnonymousClass09A.A02, C014508d.A00(), AnonymousClass022.A00(), AnonymousClass094.A00());
                }
            }
        }
        return A0H;
    }

    public List A01(UserJid userJid) {
        Throwable th;
        C12060hU r9;
        Cursor cursor;
        Throwable th2;
        long j;
        long j2;
        AnonymousClass00E.A00();
        ArrayList arrayList = new ArrayList();
        AnonymousClass0OQ A032 = this.A0C.A03();
        if (userJid == null) {
            try {
                AnonymousClass0BK r8 = A032.A04;
                String str = AbstractC05370Og.A0w;
                C014408c r0 = this.A04;
                r9 = C12060hU.A00;
                cursor = r8.A07(str, new String[]{String.valueOf(r0.A05(r9))}, "GET_STATUS_MESSAGES_SQL");
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable unused) {
                }
            }
        } else if (AnonymousClass02Z.A00.equals(userJid)) {
            AnonymousClass0BK r82 = A032.A04;
            String str2 = AbstractC05370Og.A1F;
            C014408c r02 = this.A04;
            r9 = C12060hU.A00;
            cursor = r82.A07(str2, new String[]{String.valueOf(r02.A05(r9))}, "SELECT_STATUSES_FOR_ME_SQL");
        } else {
            AnonymousClass0BK r83 = A032.A04;
            String str3 = AbstractC05370Og.A1E;
            C014408c r03 = this.A04;
            r9 = C12060hU.A00;
            cursor = r83.A07(str3, new String[]{String.valueOf(r03.A05(r9)), String.valueOf(this.A07.A02(userJid)), userJid.getRawString()}, "SELECT_STATUSES_FOR_JID_SQL");
        }
        if (userJid != null) {
            try {
                if (this.A0E.A07(userJid) == null) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    A032.close();
                    return arrayList;
                }
            } catch (Throwable th4) {
                th2 = th4;
                try {
                    throw th2;
                } catch (Throwable unused2) {
                }
            }
        }
        long A052 = this.A01.A05();
        long j3 = A052 - 86400000;
        C015408m r1 = this.A0D;
        String A012 = r1.A01("status_psa_exipration_time");
        if (A012 == null) {
            j = 0;
        } else {
            j = Long.parseLong(A012);
        }
        String A013 = r1.A01("status_psa_viewed_time");
        if (A013 == null) {
            j2 = 0;
        } else {
            j2 = Long.parseLong(A013);
        }
        boolean z = false;
        while (cursor.moveToNext()) {
            AbstractC007503q A033 = this.A05.A0J.A03(cursor, r9);
            if (A033 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("statusmsgstore/status-null-message for ");
                sb.append(userJid);
                Log.e(sb.toString());
            } else if (A033.A0m != 15 && !AnonymousClass0ZG.A0K(A033)) {
                try {
                    long j4 = A033.A0E;
                    if (j4 > j3) {
                        arrayList.add(A033);
                    } else if (!AnonymousClass1VY.A0a(A033.A07()) || (j4 <= j2 && A052 >= j && j != 0)) {
                        z = true;
                    } else {
                        arrayList.add(A033);
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    throw th2;
                }
            }
        }
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("statusmsgstore/status-cleanup/ ");
            sb2.append(userJid);
            Log.d(sb2.toString());
            A02(false);
        }
        try {
            cursor.close();
            A032.close();
            return arrayList;
        } catch (Throwable th6) {
            th = th6;
            throw th;
        }
        throw th;
        throw th;
    }

    public void A02(boolean z) {
        if (z) {
            this.A03.A01(new RunnableEBaseShape2S0100000_I0_2(this, 43), 40);
        } else if (this.A0G.compareAndSet(false, true)) {
            this.A03.A01(new RunnableEBaseShape2S0100000_I0_2(this, 45), 41);
        } else {
            Log.d("statusmsgstore/deleteoldstatuses already running; skip");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:174:0x05fa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x05fe, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0601, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0605, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0608, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x060c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01d4, code lost:
        if (X.AnonymousClass0ZG.A0K(r7) == false) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r27.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x00ab A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x023f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(boolean r42) {
        /*
        // Method dump skipped, instructions count: 1599
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03120Ew.A03(boolean):void");
    }
}
