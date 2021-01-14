package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2kv  reason: invalid class name and case insensitive filesystem */
public final class C57822kv implements AnonymousClass1UE {
    public boolean A00 = true;
    public final AnonymousClass009 A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass0X5 A03;
    public final AnonymousClass01I A04;
    public final AnonymousClass0AH A05;
    public final AnonymousClass09G A06;
    public final C000300f A07;
    public final AnonymousClass01J A08;
    public final C017009c A09;
    public final AnonymousClass01A A0A;
    public final AnonymousClass08B A0B;
    public final AnonymousClass00G A0C;
    public final AnonymousClass01X A0D;
    public final AnonymousClass0E6 A0E;
    public final C001000o A0F;
    public final AnonymousClass0DG A0G;
    public final C006903j A0H;
    public final AnonymousClass01K A0I;
    public final C018609s A0J;
    public final AnonymousClass01P A0K;
    public final C44281zn A0L;
    public final AnonymousClass0X6 A0M;
    public final AnonymousClass0AR A0N;
    public final AnonymousClass0IA A0O;
    public final C28991Wn A0P;
    public final AnonymousClass0AD A0Q;
    public final AnonymousClass0GR A0R;
    public final C02040Ak A0S;
    public final C01970Ad A0T;
    public final AnonymousClass1XJ A0U;
    public final AnonymousClass0AL A0V;
    public final AnonymousClass09D A0W;
    public final AnonymousClass0X9 A0X;
    public final AnonymousClass00T A0Y;
    public final boolean A0Z;

    public C57822kv(AnonymousClass02M r2, AnonymousClass009 r3, AnonymousClass01I r4, AnonymousClass00G r5, AnonymousClass00T r6, C006903j r7, AnonymousClass0DG r8, AnonymousClass0AR r9, C000300f r10, AnonymousClass09G r11, AnonymousClass01J r12, AnonymousClass01A r13, AnonymousClass0AH r14, AnonymousClass01X r15, AnonymousClass0AL r16, C01970Ad r17, AnonymousClass08B r18, AnonymousClass01K r19, AnonymousClass0X5 r20, C001000o r21, C28991Wn r22, AnonymousClass01P r23, AnonymousClass0X6 r24, C02040Ak r25, AnonymousClass0IA r26, C017009c r27, AnonymousClass0X9 r28, C018609s r29, AnonymousClass0AD r30, AnonymousClass0GR r31, AnonymousClass09D r32, AnonymousClass0E6 r33, AnonymousClass1XJ r34, C44281zn r35, boolean z) {
        this.A02 = r2;
        this.A01 = r3;
        this.A04 = r4;
        this.A0C = r5;
        this.A0Y = r6;
        this.A0H = r7;
        this.A0G = r8;
        this.A0N = r9;
        this.A0Z = z;
        this.A07 = r10;
        this.A06 = r11;
        this.A08 = r12;
        this.A0A = r13;
        this.A0D = r15;
        this.A05 = r14;
        this.A0V = r16;
        this.A0T = r17;
        this.A0B = r18;
        this.A0I = r19;
        this.A03 = r20;
        this.A0F = r21;
        this.A0P = r22;
        this.A0K = r23;
        this.A0M = r24;
        this.A0S = r25;
        this.A0O = r26;
        this.A09 = r27;
        this.A0X = r28;
        this.A0J = r29;
        this.A0Q = r30;
        this.A0R = r31;
        this.A0W = r32;
        this.A0E = r33;
        this.A0U = r34;
        this.A0L = r35;
    }

    public final void A00(int i) {
        C44281zn r1 = this.A0L;
        r1.A00 = Boolean.FALSE;
        r1.A04 = Integer.valueOf(i);
        if (this.A0Z) {
            this.A06.A05(this.A0U);
            this.A00 = false;
        }
    }

    public boolean A01(C02840Dr r6) {
        DeviceJid of;
        AnonymousClass1XJ r4 = this.A0U;
        C007303n r0 = r4.A09;
        if (r0 == null) {
            r0 = r4.A0a;
        }
        AnonymousClass02N r2 = r0.A00;
        if (AnonymousClass1VY.A0e(r2)) {
            DeviceJid of2 = DeviceJid.of(r4.A02());
            if (of2 != null && this.A04.A08(of2)) {
                if ((r6.A00 & 2048) != 2048) {
                    return true;
                }
                C76413eV r02 = r6.A0Q;
                if (r02 == null) {
                    r02 = C76413eV.A09;
                }
                int i = r02.A00;
                if ((i & 32) == 32 || (i & 64) == 64) {
                    return false;
                }
                return true;
            }
            return false;
        } else if (!AnonymousClass1VY.A0Y(r2) || (of = DeviceJid.of(r4.A06)) == null || !this.A04.A08(of) || r4.A08 != null || r4.A07 == null) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:559:0x0bb5 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: X.009 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v196, resolved type: X.099 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v18, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r4v22, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r4v29, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0529, code lost:
        if (r8 != false) goto L_0x052b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0b95, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0b97, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0b9e, code lost:
        if (r3 == r4) goto L_0x0ba0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0ba0, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0ba6, code lost:
        r3 = 35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0ba9, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0baa, code lost:
        A00(r3.e2eFailureReason.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x0c77, code lost:
        throw new java.lang.IllegalArgumentException("Invalid failure reason");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:452:0x094b  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0960  */
    /* JADX WARNING: Removed duplicated region for block: B:520:0x0aa1  */
    /* JADX WARNING: Removed duplicated region for block: B:523:0x0aab  */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x0adf  */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x0afd  */
    /* JADX WARNING: Removed duplicated region for block: B:553:0x0b9e  */
    /* JADX WARNING: Removed duplicated region for block: B:556:0x0ba6  */
    /* JADX WARNING: Removed duplicated region for block: B:557:0x0ba9 A[ExcHandler: 2xf (r3v18 'e' X.2xf A[CUSTOM_DECLARE]), Splitter:B:314:0x06cb] */
    /* JADX WARNING: Removed duplicated region for block: B:559:0x0bb5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x0bef  */
    /* JADX WARNING: Removed duplicated region for block: B:569:0x0c2d  */
    /* JADX WARNING: Removed duplicated region for block: B:585:0x0c62  */
    /* JADX WARNING: Removed duplicated region for block: B:602:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0233  */
    @Override // X.AnonymousClass1UE
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AA9(byte[] r43) {
        /*
        // Method dump skipped, instructions count: 3233
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57822kv.AA9(byte[]):void");
    }
}
