package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: X.2KV  reason: invalid class name */
public abstract class AnonymousClass2KV {
    public AnonymousClass1QC A00(AnonymousClass0GV r11) {
        AnonymousClass1Y3 r8;
        int i;
        String str;
        C52592bN r0 = (C52592bN) this;
        AnonymousClass1QA A00 = AnonymousClass1QA.A00(r0.A02, r0.A00, r11, r0.A03);
        StringBuilder A0S = AnonymousClass008.A0S("BackupFile/verifyIntegrity/");
        if (!(A00 instanceof C41291un)) {
            r8 = AnonymousClass1Y3.CRYPT12;
        } else {
            r8 = AnonymousClass1Y3.CRYPT14;
        }
        A0S.append(r8);
        Log.i(A0S.toString());
        C04600Kz r5 = new C04600Kz("BackupFile/getFileDigestWithoutFooter/calculating-actual-digest");
        MessageDigest instance = MessageDigest.getInstance("MD5");
        StringBuilder A0S2 = AnonymousClass008.A0S("BackupFile/getFileDigestWithoutFooter/initial digest = ");
        A0S2.append(C007603r.A04(instance.digest()));
        Log.i(A0S2.toString());
        File file = A00.A01;
        long length = file.length();
        if (!(A00 instanceof C41291un)) {
            i = 20;
        } else {
            i = 16;
        }
        String A0I = C006803i.A0I(file, length - ((long) i), instance);
        r5.A01();
        StringBuilder sb = new StringBuilder("msgstore-integrity-checker/verify-integrity/actual-digest/  ");
        sb.append(A0I);
        Log.i(sb.toString());
        AnonymousClass1QD A01 = A00.A01();
        AnonymousClass0GV r52 = A00.A00;
        StringBuilder A0S3 = AnonymousClass008.A0S("BackupFile/verifyIntegrity/");
        A0S3.append(r8);
        A0S3.append(" ");
        A0S3.append(file);
        A0S3.append(" size=");
        A0S3.append(file.length());
        A0S3.append(" modification time = ");
        A0S3.append(file.lastModified());
        A0S3.append("footer: ");
        A0S3.append(A01);
        A0S3.append("actualDigest: ");
        A0S3.append(A0I);
        r52.A01(A0S3.toString(), 2);
        if (A01 == null) {
            return new AnonymousClass1QC(2, null);
        }
        if (A0I == null) {
            byte[] bArr = A01.A01;
            if (bArr != null) {
                str = Arrays.toString(bArr);
            } else {
                str = "null";
            }
            return new AnonymousClass1QC(2, str);
        } else if (!(A00 instanceof C41291un)) {
            C41281um r4 = (C41281um) A00;
            if (A01.A01 != null) {
                return A01.A01(((AnonymousClass1QA) r4).A00, A0I, r4.A02());
            }
            Log.e("BackupFileCrypt12/verifyFooterIntegrity/jidSuffix is null");
            return new AnonymousClass1QC(2, null);
        } else {
            byte[] bArr2 = A01.A01;
            if (bArr2 != null) {
                return new AnonymousClass1QC(2, AnonymousClass1QD.A00(bArr2));
            }
            return A01.A01(A00.A00, A0I, null);
        }
    }
}
