package X;

import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.0Ce  reason: invalid class name and case insensitive filesystem */
public class C02480Ce {
    public static final C02490Cf A06 = new C02490Cf(4, 5);
    public static volatile C02480Ce A07;
    public final AnonymousClass009 A00;
    public final AnonymousClass00S A01;
    public final AnonymousClass09V A02;
    public final C007703s A03;
    public final C02510Ch A04;
    public final SecureRandom A05 = new SecureRandom();

    public C02480Ce(AnonymousClass00S r2, AnonymousClass009 r3, AnonymousClass09V r4, C02510Ch r5, C007703s r6) {
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = r4;
        this.A03 = r6;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass2KD A00(java.io.InputStream r3, X.AnonymousClass2KK r4, int r5) {
        /*
            X.2bA r2 = new X.2bA     // Catch:{ IOException -> 0x001c }
            r2.<init>(r3, r4, r5)     // Catch:{ IOException -> 0x001c }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0015 }
        L_0x0009:
            int r0 = r2.read(r1)     // Catch:{ all -> 0x0015 }
            if (r0 >= 0) goto L_0x0009
            X.2KD r0 = r2.A04     // Catch:{ all -> 0x0015 }
            r2.close()
            return r0
        L_0x0015:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x001b }
        L_0x001b:
            throw r0
        L_0x001c:
            r1 = move-exception
            java.lang.String r0 = "mediaupload/calculate-sidecar/ioexception"
            com.whatsapp.util.Log.e(r0, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02480Ce.A00(java.io.InputStream, X.2KK, int):X.2KD");
    }

    public static final String A01() {
        try {
            byte[] bArr = new byte[32];
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
            return Base64.encodeToString(bArr, 2);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public C50242Ty A02(AnonymousClass2KN r12, File file, int[] iArr) {
        AnonymousClass009 r0 = this.A00;
        if (file != null) {
            FileInputStream A0M = C02230Bd.A0M(r0, file);
            this.A03.A06(A0M);
            long A002 = AnonymousClass0FO.A00(iArr);
            if (A002 == -1) {
                return A04(new BufferedInputStream(A0M), r12);
            }
            AnonymousClass2KL r7 = new AnonymousClass2KL(new BufferedInputStream(A0M), MessageDigest.getInstance("SHA-256"));
            AnonymousClass2KL r9 = new AnonymousClass2KL(new AnonymousClass35K(r7, A002), MessageDigest.getInstance("SHA-256"));
            InputStream A42 = r12.A42(new AnonymousClass35R(r9, r7));
            AnonymousClass2KL r10 = new AnonymousClass2KL(new AnonymousClass35K(A42, A002), MessageDigest.getInstance("SHA-256"));
            return new C50242Ty(this, r7, new AnonymousClass2KL(new AnonymousClass35R(r10, A42), MessageDigest.getInstance("SHA-256")), r9, r10);
        }
        throw null;
    }

    public C50242Ty A03(AnonymousClass1WC r4, AnonymousClass2KN r5, File file) {
        AnonymousClass2TF r1 = r4.A02;
        if (!r1.A0A) {
            AnonymousClass2KL r12 = new AnonymousClass2KL(A06(r4, file), MessageDigest.getInstance("SHA-256"));
            return new C50242Ty(this, r12, r12);
        }
        int[] iArr = r1.A0E;
        if (iArr == null || iArr.length <= 0) {
            return A04(A06(r4, file), r5);
        }
        return A02(r5, file, iArr);
    }

    public C50242Ty A04(InputStream inputStream, AnonymousClass2KN r6) {
        AnonymousClass2KL r3 = new AnonymousClass2KL(inputStream, MessageDigest.getInstance("SHA-256"));
        return new C50242Ty(this, r3, new AnonymousClass2KL(r6.A42(r3), MessageDigest.getInstance("SHA-256")));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C50252Tz A05(X.AnonymousClass2U0 r6, X.AnonymousClass1WC r7, X.AnonymousClass2KO r8) {
        /*
            r5 = this;
            X.2So r0 = r6.A00
            byte[] r0 = r0.A01
            X.2KN r1 = r8.A6C(r0)
            java.io.File r0 = r7.A01()
            X.2Ty r4 = r5.A03(r7, r1, r0)
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x003a }
        L_0x0014:
            X.2KL r1 = r4.A00     // Catch:{ all -> 0x003a }
            int r0 = r1.read(r2)     // Catch:{ all -> 0x003a }
            if (r0 >= 0) goto L_0x0014
            X.2KL r0 = r4.A03     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r0.A00()     // Catch:{ all -> 0x003a }
            r3 = 0
            X.2Tw r2 = new X.2Tw     // Catch:{ all -> 0x003a }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r1.A00()     // Catch:{ all -> 0x003a }
            X.2Tw r1 = new X.2Tw     // Catch:{ all -> 0x003a }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x003a }
            X.2Tz r0 = new X.2Tz     // Catch:{ all -> 0x003a }
            r0.<init>(r2, r1, r6)     // Catch:{ all -> 0x003a }
            r4.close()
            return r0
        L_0x003a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02480Ce.A05(X.2U0, X.1WC, X.2KO):X.2Tz");
    }

    public final InputStream A06(AnonymousClass1WC r4, File file) {
        if (r4 instanceof C56892jM) {
            return new C57332k8(r4.A01(), (C56892jM) r4);
        }
        AnonymousClass009 r0 = this.A00;
        if (file != null) {
            FileInputStream A0M = C02230Bd.A0M(r0, file);
            AnonymousClass1XO r1 = r4.A02.A05;
            if (!(r1 == AnonymousClass1XO.A0I || r1 == AnonymousClass1XO.A08)) {
                this.A03.A06(A0M);
            }
            return new BufferedInputStream(A0M);
        }
        throw null;
    }

    public String A07(AnonymousClass1XO r3, File file, boolean z) {
        AnonymousClass00E.A07(A08(r3, file, z));
        if (AnonymousClass1XO.A05 == r3 || AnonymousClass1XO.A0D == r3) {
            if (z) {
                return C02510Ch.A09(A06);
            }
            return C02510Ch.A09(C02510Ch.A05(this.A00, file));
        } else if (AnonymousClass1XO.A0N != r3 && AnonymousClass1XO.A04 != r3 && AnonymousClass1XO.A0Q != r3) {
            return null;
        } else {
            int i = C02510Ch.A06(this.A00, file, false).A01;
            if (i == 7) {
                return "video/quicktime";
            }
            return i == 3 ? "video/3gpp" : "video/mp4";
        }
    }

    public boolean A08(AnonymousClass1XO r3, File file, boolean z) {
        if (AnonymousClass1XO.A05 == r3 || AnonymousClass1XO.A0D == r3) {
            if (z || this.A04.A0H(file)) {
                return true;
            }
            return false;
        } else if (AnonymousClass1XO.A0N == r3 || AnonymousClass1XO.A04 == r3 || AnonymousClass1XO.A0Q == r3) {
            return this.A04.A0I(file);
        } else {
            return true;
        }
    }
}
