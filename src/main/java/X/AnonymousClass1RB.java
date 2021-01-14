package X;

import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1RB  reason: invalid class name */
public class AnonymousClass1RB {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public final AnonymousClass009 A07;
    public final AnonymousClass088 A08;
    public final C000300f A09;
    public final C02300Bl A0A;
    public final AnonymousClass0HQ A0B;
    public final C41401uy A0C;
    public final GoogleBackupService A0D;
    public final AnonymousClass0JJ A0E;
    public final AnonymousClass1R0 A0F;
    public final AbstractC03860Ib A0G;
    public final AnonymousClass1RF A0H;
    public final AnonymousClass03R A0I;
    public final AnonymousClass00G A0J;
    public final AnonymousClass03S A0K;
    public final AnonymousClass00D A0L;
    public final C02290Bk A0M;
    public final C014508d A0N;
    public final AnonymousClass00Y A0O;
    public final C44041zP A0P;
    public final AnonymousClass09H A0Q;
    public final AbstractC007203m A0R;
    public final String A0S;
    public final List A0T;
    public final Map A0U = new ConcurrentHashMap();
    public final AtomicInteger A0V = new AtomicInteger(0);
    public final AtomicLong A0W = new AtomicLong(0);
    public final AtomicLong A0X;
    public final AtomicLong A0Y = new AtomicLong(0);
    public final AtomicLong A0Z;
    public final boolean A0a;

    public AnonymousClass1RB(AnonymousClass00G r5, AnonymousClass009 r6, AnonymousClass088 r7, AnonymousClass00Y r8, AnonymousClass03R r9, C000300f r10, AnonymousClass09H r11, C02300Bl r12, AnonymousClass0JJ r13, C02290Bk r14, C014508d r15, AnonymousClass1R0 r16, AnonymousClass03S r17, AnonymousClass00D r18, AnonymousClass0HQ r19, String str, List list, AtomicLong atomicLong, AtomicLong atomicLong2, AnonymousClass1RF r24, AbstractC03860Ib r25, GoogleBackupService googleBackupService, boolean z, C41401uy r28, C44041zP r29) {
        this.A0J = r5;
        this.A0S = str;
        this.A07 = r6;
        this.A0T = list;
        this.A08 = r7;
        this.A0C = r28;
        this.A0O = r8;
        this.A0I = r9;
        this.A09 = r10;
        this.A0Z = atomicLong;
        this.A0Q = r11;
        this.A0G = r25;
        this.A0A = r12;
        this.A0E = r13;
        this.A0H = r24;
        this.A0a = z;
        this.A0X = atomicLong2;
        this.A0D = googleBackupService;
        this.A0M = r14;
        this.A0N = r15;
        this.A0F = r16;
        this.A0K = r17;
        this.A0L = r18;
        this.A0B = r19;
        this.A0P = r29;
        r29.A0B = 2;
        this.A0R = new C41601vK(r18, r10, r7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r2.A02() != false) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
        // Method dump skipped, instructions count: 1166
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RB.A00():void");
    }

    public final void A01(File file, String str) {
        if (this.A0U.get(AnonymousClass0JJ.A08(this.A0I, this.A0J.A00, file)) == null) {
            StringBuilder sb = new StringBuilder("gdrive/backup/files/");
            sb.append(str);
            sb.append("/cancel-backup");
            Log.e(sb.toString());
            StringBuilder sb2 = new StringBuilder("File ");
            sb2.append(file);
            sb2.append(" not backed up");
            throw new C41561vG(sb2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0310, code lost:
        if (r10.length() <= 0) goto L_0x0312;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02() {
        /*
        // Method dump skipped, instructions count: 2420
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RB.A02():boolean");
    }

    public final boolean A03(List list, AtomicReference atomicReference) {
        if (!this.A0B.A0Y.get()) {
            Log.i("gdrive/backup/cancelled.");
            return true;
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            Log.i("gdrive/backup", th);
            if (th instanceof C41491v9) {
                throw th;
            } else if (th instanceof C41481v8) {
                throw th;
            } else if (th instanceof C41531vD) {
                throw th;
            } else if (th instanceof C41501vA) {
                throw th;
            } else if (th instanceof C41551vF) {
                throw th;
            } else if (th instanceof C41461v5) {
                throw th;
            } else if (th instanceof C41511vB) {
                throw th;
            } else if (th instanceof AnonymousClass1v7) {
                throw th;
            }
        }
        AtomicLong atomicLong = this.A0X;
        if (atomicLong.get() > 0) {
            AtomicLong atomicLong2 = this.A0Y;
            if ((((double) atomicLong2.get()) * 100.0d) / ((double) atomicLong.get()) > 1.0d) {
                StringBuilder A0S2 = AnonymousClass008.A0S("gdrive/backup/too-many-failures/");
                A0S2.append((((double) atomicLong2.get()) * 100.0d) / ((double) atomicLong.get()));
                A0S2.append("% bytes");
                Log.i(A0S2.toString());
                return true;
            }
        }
        if (list.size() <= 0) {
            return false;
        }
        AtomicInteger atomicInteger = this.A0V;
        if ((((double) atomicInteger.get()) * 100.0d) / ((double) list.size()) <= 1.0d) {
            return false;
        }
        StringBuilder A0S3 = AnonymousClass008.A0S("gdrive/backup/too-many-failures/");
        A0S3.append((((double) atomicInteger.get()) * 100.0d) / ((double) list.size()));
        A0S3.append("% files");
        Log.i(A0S3.toString());
        return true;
    }
}
