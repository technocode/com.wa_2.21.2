package X;

import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.1QD  reason: invalid class name */
public class AnonymousClass1QD {
    public final byte[] A00;
    public final byte[] A01;

    public AnonymousClass1QD(byte[] bArr, byte[] bArr2) {
        this.A00 = bArr;
        this.A01 = bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(byte[] r4) {
        /*
            r3 = 0
        L_0x0001:
            int r2 = r4.length
            if (r3 >= r2) goto L_0x000d
            byte r1 = r4[r3]
            r0 = 45
            if (r1 != r0) goto L_0x000d
            int r3 = r3 + 1
            goto L_0x0001
        L_0x000d:
            if (r3 != r2) goto L_0x0017
            java.lang.String r0 = "BackupFooter/verify-jid/empty-suffix"
            com.whatsapp.util.Log.e(r0)
            java.lang.String r0 = ""
            return r0
        L_0x0017:
            int r2 = r2 - r3
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3, r2)
            java.lang.String r0 = r0.trim()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QD.A00(byte[]):java.lang.String");
    }

    public AnonymousClass1QC A01(AnonymousClass0GV r6, String str, String str2) {
        AnonymousClass008.A18("BackupFooter/verify-integrity/actual-digest/  ", str);
        String A04 = C007603r.A04(this.A00);
        StringBuilder sb = new StringBuilder("BackupFooter/verify-integrity/expected-digest/");
        sb.append(A04);
        Log.i(sb.toString());
        if (str.equals(A04)) {
            Log.i("BackupFooter/verify-integrity/digest-matches/success");
            if (this.A01 == null || str2 == null || !A02(str2)) {
                return new AnonymousClass1QC(1, null);
            }
            r6.A01("BackupFooter/verify-integrity/jid-mismatch", 4);
            return new AnonymousClass1QC(4, null);
        }
        r6.A01(AnonymousClass008.A0M("BackupFooter/verify-integrity/failed expected-digest:", A04, " actual-digest:", str), 4);
        return new AnonymousClass1QC(2, null);
    }

    public boolean A02(String str) {
        byte[] bArr = this.A01;
        if (bArr == null) {
            return false;
        }
        String A002 = A00(bArr);
        if (str.endsWith(A002)) {
            return false;
        }
        StringBuilder sb = new StringBuilder("BackupFooter/has-jid-user-mismatch/expected-jid-user-ends-with: ");
        sb.append(A002);
        sb.append(" ");
        sb.append(" actual-jid-user: ");
        sb.append(str);
        Log.e(sb.toString());
        return true;
    }

    public String toString() {
        String str;
        StringBuilder A0S = AnonymousClass008.A0S("BackupFooter{digest=");
        A0S.append(Arrays.toString(this.A00));
        A0S.append(", jidSuffix=");
        byte[] bArr = this.A01;
        if (bArr != null) {
            str = Arrays.toString(bArr);
        } else {
            str = "null";
        }
        A0S.append(str);
        A0S.append('}');
        return A0S.toString();
    }
}
