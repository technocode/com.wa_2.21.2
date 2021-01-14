package X;

import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/* renamed from: X.34W  reason: invalid class name */
public class AnonymousClass34W {
    public AnonymousClass2T0 A00;
    public AnonymousClass0J5 A01;
    public AnonymousClass34Q A02;
    public Exception A03;
    public String A04;
    public String A05;
    public byte[] A06;
    public final AnonymousClass009 A07;
    public final AnonymousClass088 A08;
    public final AnonymousClass0AH A09;
    public final Mp4Ops A0A;
    public final AnonymousClass0CL A0B;
    public final AnonymousClass00C A0C;
    public final AnonymousClass00G A0D;
    public final AnonymousClass2KK A0E;
    public final AnonymousClass0CW A0F;
    public final AnonymousClass0EN A0G;
    public final C60602pn A0H;
    public final C49982Sy A0I;
    public final AnonymousClass1WA A0J;
    public final AnonymousClass34N A0K;
    public final AnonymousClass0FO A0L;
    public final File A0M;
    public final File A0N;
    public final File A0O;
    public final URL A0P;
    public final int[] A0Q;

    public AnonymousClass34W(AnonymousClass00G r5, Mp4Ops mp4Ops, AnonymousClass009 r7, AnonymousClass088 r8, AnonymousClass0CL r9, AnonymousClass0AH r10, AnonymousClass00C r11, AnonymousClass0EN r12, AnonymousClass0FO r13, AnonymousClass34N r14, byte[] bArr, int[] iArr, URL url, File file, File file2, File file3, C60602pn r21, AnonymousClass1WA r22, C49982Sy r23, AnonymousClass0CW r24, AnonymousClass0J5 r25) {
        this.A0D = r5;
        this.A0A = mp4Ops;
        this.A07 = r7;
        this.A08 = r8;
        this.A0B = r9;
        this.A09 = r10;
        this.A0C = r11;
        this.A0G = r12;
        this.A0L = r13;
        this.A06 = bArr;
        this.A0J = r22;
        this.A0I = r23;
        this.A0Q = iArr;
        this.A0F = r24;
        this.A0E = C28051Sr.A0c(C002001d.A3o(r22.A0T, r22.A08.A03, 80));
        this.A0H = r21;
        this.A0K = r14;
        this.A0P = url;
        this.A0O = file;
        this.A0N = file2;
        this.A0M = file3;
        this.A01 = r25;
        AnonymousClass00E.A07(r22.A00());
        if (r22.A02 != 3) {
            return;
        }
        if (r22.A0H == null) {
            this.A0I.A08 = 4;
        } else {
            this.A0I.A08 = 6;
        }
    }

    public final AbstractC28621Va A00(URL url, long j, long j2) {
        AbstractC28621Va A022 = this.A0F.A02(url, j, j2, this.A01);
        if (this.A00 == null) {
            AnonymousClass21V r3 = (AnonymousClass21V) A022;
            this.A00 = new AnonymousClass2T0(r3.A01.getHeaderField("X-WA-Metadata"), r3.A00);
        }
        return A022;
    }

    public final boolean A01(long j) {
        long j2;
        int i = this.A0H.A0p;
        if (i != 2 && i != 3) {
            return false;
        }
        AnonymousClass1WA r1 = this.A0J;
        if (!r1.A0P || !AnonymousClass0CK.A02(r1.A08) || i != 3) {
            int[] iArr = this.A0Q;
            j2 = iArr != null ? (long) iArr[0] : 262144;
        } else {
            long j3 = r1.A06;
            long j4 = r1.A05;
            if (j4 == 0) {
                j2 = 0;
            } else {
                j2 = (long) Math.ceil((double) ((((float) j3) / ((float) j4)) * 5.0f));
            }
        }
        if (j >= j2) {
            return true;
        }
        return false;
    }

    public final boolean A02(AnonymousClass34O r9) {
        int[] iArr;
        String str;
        AnonymousClass1WA r7 = this.A0J;
        if (r7.A02 == 3 && r9 != null && (iArr = this.A0Q) != null && iArr.length == 4 && (str = r7.A0H) != null && r9.A0A(0) && r9.A0A(1) && r9.A0A(2)) {
            try {
                if (!this.A0L.A02(this.A0N, iArr[0], r7.A0P) || !A03(str)) {
                    return false;
                }
                return A04(iArr);
            } catch (IOException e) {
                Log.e("StreamMediaDownloadHandler/attemptSetPartialProgressiveJpegOnDownloadFailure", e);
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(java.lang.String r8) {
        /*
            r7 = this;
            r6 = 0
            if (r8 != 0) goto L_0x0004
            return r6
        L_0x0004:
            X.009 r5 = r7.A07     // Catch:{ IOException -> 0x0048, NoSuchAlgorithmException -> 0x0046 }
            java.io.File r1 = r7.A0N     // Catch:{ IOException -> 0x0048, NoSuchAlgorithmException -> 0x0046 }
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r0)     // Catch:{ IOException -> 0x0048, NoSuchAlgorithmException -> 0x0046 }
            int[] r0 = r7.A0Q     // Catch:{ IOException -> 0x0048, NoSuchAlgorithmException -> 0x0046 }
            long r2 = X.AnonymousClass0FO.A00(r0)     // Catch:{ IOException -> 0x0048, NoSuchAlgorithmException -> 0x0046 }
            java.io.FileInputStream r1 = X.C02230Bd.A0M(r5, r1)     // Catch:{ IOException -> 0x0048, NoSuchAlgorithmException -> 0x0046 }
            X.35K r0 = new X.35K     // Catch:{ IOException -> 0x0048, NoSuchAlgorithmException -> 0x0046 }
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x0048, NoSuchAlgorithmException -> 0x0046 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0048, NoSuchAlgorithmException -> 0x0046 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0048, NoSuchAlgorithmException -> 0x0046 }
            X.C002001d.A32(r2, r4)     // Catch:{ all -> 0x003f }
            byte[] r1 = r4.digest()     // Catch:{ all -> 0x003f }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x003f }
            r2.close()
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0039
            r0 = 1
            return r0
        L_0x0039:
            java.lang.String r0 = "ProgressiveJpegUtils/setPartialImageFailed plaintextHashes did not match"
            com.whatsapp.util.Log.e(r0)
            return r6
        L_0x003f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0
        L_0x0046:
            r1 = move-exception
            goto L_0x0049
        L_0x0048:
            r1 = move-exception
        L_0x0049:
            java.lang.String r0 = "ProgressiveJpegUtils/validatePartialHashesFailed"
            com.whatsapp.util.Log.e(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34W.A03(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(int[] r8) {
        /*
            r7 = this;
            java.io.File r1 = r7.A0N
            r6 = 0
            r4 = 1
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0045 }
            r5.<init>(r1, r0)     // Catch:{ IOException -> 0x0045 }
            r1 = r8[r6]     // Catch:{ all -> 0x003e }
            r0 = r8[r4]     // Catch:{ all -> 0x003e }
            int r1 = r1 + r0
            r0 = 2
            r0 = r8[r0]     // Catch:{ all -> 0x003e }
            int r1 = r1 + r0
            long r2 = (long) r1     // Catch:{ all -> 0x003e }
            r5.seek(r2)     // Catch:{ all -> 0x003e }
            byte[] r0 = X.C02220Bc.A0B     // Catch:{ all -> 0x003e }
            r5.write(r0)     // Catch:{ all -> 0x003e }
            int r0 = r0.length     // Catch:{ all -> 0x003e }
            long r0 = (long) r0     // Catch:{ all -> 0x003e }
            long r2 = r2 + r0
            r5.setLength(r2)     // Catch:{ all -> 0x003e }
            java.io.FileDescriptor r0 = r5.getFD()     // Catch:{ all -> 0x003e }
            r0.sync()     // Catch:{ all -> 0x003e }
            r5.close()
            X.2Sy r1 = r7.A0I
            monitor-enter(r1)
            r1.A0H = r4     // Catch:{ all -> 0x003b }
            monitor-exit(r1)
            X.34N r1 = r7.A0K
            r0 = 3
            r1.A04(r0)
            return r4
        L_0x003b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x003e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0044 }
        L_0x0044:
            throw r0
        L_0x0045:
            java.lang.String r0 = "ProgressiveJpegUtils/setPartialImageToReadableFile/failed to set file"
            com.whatsapp.util.Log.e(r0)
            X.2Sy r0 = r7.A0I
            r0.A06()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34W.A04(int[]):boolean");
    }
}
