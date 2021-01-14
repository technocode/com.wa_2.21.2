package X;

import android.os.ConditionVariable;

/* renamed from: X.0HO  reason: invalid class name */
public class AnonymousClass0HO implements AbstractC02140Au {
    public static volatile AnonymousClass0HO A0P;
    public boolean A00;
    public boolean A01;
    public final AnonymousClass0AV A02;
    public final AnonymousClass02M A03;
    public final AnonymousClass01I A04;
    public final AnonymousClass0IY A05;
    public final C000300f A06;
    public final C02300Bl A07;
    public final AnonymousClass0HQ A08;
    public final AnonymousClass0IW A09;
    public final AnonymousClass00C A0A;
    public final AnonymousClass03P A0B;
    public final AnonymousClass00G A0C;
    public final AnonymousClass00D A0D;
    public final AnonymousClass01X A0E;
    public final AnonymousClass01K A0F;
    public final C03890Ie A0G = new C03890Ie();
    public final C02290Bk A0H;
    public final AnonymousClass0IX A0I;
    public final AnonymousClass0AR A0J;
    public final AnonymousClass0BB A0K;
    public final AnonymousClass02J A0L;
    public final AnonymousClass0BZ A0M;
    public final AnonymousClass0GV A0N;
    public final AnonymousClass00T A0O;

    public AnonymousClass0HO(AnonymousClass00G r3, AnonymousClass02M r4, AnonymousClass01I r5, AnonymousClass00T r6, AnonymousClass0AR r7, C000300f r8, AnonymousClass0IW r9, AnonymousClass03P r10, AnonymousClass01X r11, AnonymousClass0IX r12, AnonymousClass01K r13, C02300Bl r14, AnonymousClass0BZ r15, AnonymousClass02J r16, AnonymousClass0BB r17, AnonymousClass00C r18, C02290Bk r19, AnonymousClass00D r20, AnonymousClass0AV r21, AnonymousClass0IY r22, AnonymousClass0GV r23, AnonymousClass0HQ r24) {
        this.A0C = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A0O = r6;
        this.A0J = r7;
        this.A06 = r8;
        this.A09 = r9;
        this.A0B = r10;
        this.A0E = r11;
        this.A0I = r12;
        this.A0F = r13;
        this.A07 = r14;
        this.A0M = r15;
        this.A0L = r16;
        this.A0K = r17;
        this.A0A = r18;
        this.A0H = r19;
        this.A0D = r20;
        this.A02 = r21;
        this.A05 = r22;
        this.A0N = r23;
        this.A08 = r24;
        r22.A01(new C52552bJ(this));
    }

    public static AnonymousClass0HO A00() {
        if (A0P == null) {
            synchronized (AnonymousClass0HO.class) {
                if (A0P == null) {
                    A0P = new AnonymousClass0HO(AnonymousClass00G.A01, AnonymousClass02M.A00(), AnonymousClass01I.A00(), C002101e.A00(), AnonymousClass0AR.A00(), C000300f.A00(), AnonymousClass0IW.A00(), AnonymousClass03P.A00(), AnonymousClass01X.A00(), AnonymousClass0IX.A00(), AnonymousClass01K.A00(), C02300Bl.A00(), AnonymousClass0BZ.A00(), AnonymousClass02J.A02(), AnonymousClass0BB.A00(), AnonymousClass00C.A00(), C02290Bk.A02(), AnonymousClass00D.A00(), AnonymousClass0AV.A00(), AnonymousClass0IY.A00(), AnonymousClass0GV.A00(), AnonymousClass0HQ.A00());
                }
            }
        }
        return A0P;
    }

    public final void A01() {
        AnonymousClass0GV r4 = this.A0N;
        synchronized (r4) {
            r4.A00 = true;
        }
        r4.A01("localbackupmanager/sendCreateBackupKeyIfNeeded/started", 2);
        if (AnonymousClass0HY.A0F(this.A0C.A00)) {
            byte[] A0C2 = C007603r.A0C(16);
            byte[] A0H2 = AnonymousClass0HY.A0H(A0C2);
            if (A0H2 != null) {
                ConditionVariable conditionVariable = new ConditionVariable(false);
                this.A0J.A0T(A0H2, A0C2, new RunnableEBaseShape2S0100000_I0_2(conditionVariable, 47));
                r4.A01("localbackupmanager/backup/waiting-for-the-key", 2);
                if (!conditionVariable.block(32000)) {
                    r4.A01("localbackupmanager/backup/backup-key-not-received", 4);
                } else {
                    r4.A01("localbackupmanager/backup/key-received", 2);
                }
            } else {
                r4.A01("localbackupmanager/backup/backup-key/null/account-hash/null", 3);
            }
        }
    }

    public void A02(long j, AbstractC47932Kg r18) {
        C03890Ie r9 = this.A0G;
        r9.A00(r18);
        this.A0O.ANC(new C52612bP(this.A0C, j, this.A09, this.A0B, this.A0L, r9, this.A0I, this.A0F, this.A07, this.A0M, this.A0K, this, this.A0H), new Void[0]);
    }

    public final boolean A03(boolean z) {
        AnonymousClass01I r0 = this.A04;
        r0.A04();
        return r0.A00 != null && this.A00 && z && !this.A0A.A07() && this.A02.A00.A02();
    }

    @Override // X.AbstractC02140Au
    public void AGf() {
        if (A03(this.A05.A00)) {
            A02(-1, new C52602bO(this, null));
        }
    }
}
