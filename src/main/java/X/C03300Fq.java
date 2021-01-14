package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.math.BigDecimal;

/* renamed from: X.0Fq  reason: invalid class name and case insensitive filesystem */
public class C03300Fq {
    public static volatile C03300Fq A07;
    public final AnonymousClass01I A00;
    public final AnonymousClass01K A01;
    public final C02010Ah A02;
    public final C02020Ai A03;
    public final C01970Ad A04;
    public final AnonymousClass0GL A05;
    public final AnonymousClass0GN A06;

    public C03300Fq(AnonymousClass01I r4, C01970Ad r5, AnonymousClass01K r6, C02010Ah r7, C02020Ai r8) {
        this.A00 = r4;
        this.A04 = r5;
        this.A01 = r6;
        this.A02 = r7;
        this.A03 = r8;
        AnonymousClass0GK r2 = new AnonymousClass0GK();
        this.A05 = new AnonymousClass0GL(r2);
        this.A06 = new AnonymousClass0GN(null, r2);
    }

    public static C03300Fq A00() {
        if (A07 == null) {
            synchronized (C03300Fq.class) {
                if (A07 == null) {
                    A07 = new C03300Fq(AnonymousClass01I.A00(), C01970Ad.A00(), AnonymousClass01K.A00(), C02010Ah.A00(), C02020Ai.A00());
                }
            }
        }
        return A07;
    }

    public final AnonymousClass0MH A01(long j, AnonymousClass0M5 r13) {
        String A0G = r13.A0G("country", AnonymousClass0MH.A0O);
        byte[] bArr = null;
        int A022 = C006803i.A02(r13.A0G("version", null), 1);
        try {
            bArr = this.A06.ARO(r13);
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("PAY: PaymentsProtoParser serializeProtocolNode: ");
            sb.append(e);
            Log.e(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("PAY PaymentsProtoParser: buildFuturePaymentFromPayNode: futurePayment country=");
        sb2.append(A0G);
        sb2.append(" version=");
        sb2.append(A022);
        Log.i(sb2.toString());
        AnonymousClass0MH r4 = new AnonymousClass0MH(5, j, A0G, A022);
        r4.A0N = bArr;
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if ("PARTIAL".equalsIgnoreCase(r2) == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0MH A02(com.whatsapp.jid.UserJid r15, long r16, X.AnonymousClass0M5 r18) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03300Fq.A02(com.whatsapp.jid.UserJid, long, X.0M5):X.0MH");
    }

    public AnonymousClass0MH A03(UserJid userJid, UserJid userJid2, long j, AnonymousClass0M5 r21) {
        String A0G = r21.A0G("country", this.A03.A02().A02);
        int A022 = C006803i.A02(r21.A0G("version", null), 1);
        String A0G2 = r21.A0G("request-id", null);
        if (A0G2 != null) {
            String A0G3 = r21.A0G("expiry-ts", null);
            if (A0G3 != null) {
                UserJid nullable = UserJid.getNullable(r21.A0G("sender", null));
                if (nullable == null) {
                    nullable = userJid;
                }
                if (A0G != null) {
                    String A5e = C05880Qw.A02.A5e();
                    AnonymousClass1X1 A023 = this.A04.A02(A0G);
                    if (A023 != null) {
                        AbstractC07650Yy A8I = A023.A8I(A5e);
                        if (A8I == null) {
                            throw null;
                        } else if (nullable != null) {
                            AnonymousClass0MH A024 = AnonymousClass0MH.A02(20, 12, nullable, userJid2, C05880Qw.A02.A5e(), new C05900Qy(new BigDecimal(0), 1), j, A0G2, A0G, A022, A8I.A92());
                            AbstractC43791yx AAd = A8I.AAd();
                            if (AAd != null) {
                                A024.A0B(AAd, C006803i.A04(A0G3, j / 1000) * 1000);
                            }
                            return A024;
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.whatsapp.jid.GroupJid] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0320, code lost:
        if (r2 != false) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0323, code lost:
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0118, code lost:
        if (X.C006803i.A02(r58.A0G("is-vpa", null), 0) == 1) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0131, code lost:
        if ("PARTIAL".equalsIgnoreCase(r3) == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x017d, code lost:
        if (r3.A00.doubleValue() <= 0.0d) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01a4, code lost:
        if (r37 == null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02b9, code lost:
        if (r2 != false) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02bb, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02bc, code lost:
        if (r2 == false) goto L_0x0331;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0MH A04(X.AnonymousClass0M5 r58) {
        /*
        // Method dump skipped, instructions count: 1082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03300Fq.A04(X.0M5):X.0MH");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0283, code lost:
        if (r0 == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x028e, code lost:
        if (r0 == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0299, code lost:
        if (r0 == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02a4, code lost:
        if (r0 == false) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0050 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A05(X.AnonymousClass0M5 r31) {
        /*
        // Method dump skipped, instructions count: 706
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03300Fq.A05(X.0M5):java.util.ArrayList");
    }
}
