package X;

import android.os.SystemClock;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.34Q  reason: invalid class name */
public class AnonymousClass34Q {
    public static final byte[] A07 = {102, 116, 121, 112};
    public static final byte[] A08 = {109, 100, 97, 116};
    public static final byte[] A09 = {109, 111, 111, 118};
    public int A00 = 0;
    public long A01 = 262144;
    public final long A02;
    public final AnonymousClass009 A03;
    public final Mp4Ops A04;
    public final AnonymousClass00G A05;
    public final File A06;

    public AnonymousClass34Q(AnonymousClass00G r3, Mp4Ops mp4Ops, AnonymousClass009 r5, File file, long j) {
        this.A05 = r3;
        this.A04 = mp4Ops;
        this.A03 = r5;
        this.A06 = file;
        this.A02 = j;
    }

    public static boolean A00(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - 4;
        int length2 = bArr2.length;
        if (length < length2) {
            return false;
        }
        for (int i = 0; i < length2; i++) {
            if (bArr[4 + i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int A01(boolean z) {
        Mp4Ops.LibMp4StreamCheckResult mp4streamcheck;
        try {
            File file = this.A06;
            long j = this.A02;
            Log.i("mp4ops/check/start");
            int i = 0;
            do {
                try {
                    mp4streamcheck = Mp4Ops.mp4streamcheck(file.getAbsolutePath(), z, j);
                    if (!mp4streamcheck.success && mp4streamcheck.ioException) {
                        SystemClock.sleep(100);
                        i++;
                    }
                } catch (Error e) {
                    Log.e("mp4ops/integration fail/", e);
                    throw new C26791Mo(0, "stream integrity check error", new Throwable());
                }
            } while (i < 5);
            if (mp4streamcheck.success) {
                Log.i("mp4ops/streamcheck/finished");
                long j2 = mp4streamcheck.bytesRequiredToExtractThumbnail;
                if (j2 <= 0) {
                    return 1;
                }
                this.A01 = j2;
                return 1;
            }
            StringBuilder A0S = AnonymousClass008.A0S("mp4ops/streamcheck/error_message/");
            A0S.append(mp4streamcheck.errorMessage);
            Log.e(A0S.toString());
            int i2 = mp4streamcheck.errorCode;
            StringBuilder A0S2 = AnonymousClass008.A0S("integrity check failed, error_code: ");
            A0S2.append(i2);
            throw new C26791Mo(i2, A0S2.toString(), new Throwable());
        } catch (C26791Mo e2) {
            Log.e("Mp4StreamCheck/failed/exception", e2);
            Mp4Ops.A01(this.A05.A00, this.A03, this.A06, e2, "stream check on download");
            return 2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e4, code lost:
        r7 = 0;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e7, code lost:
        if (r12 == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e9, code lost:
        if (r0 == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f2, code lost:
        r0 = r14.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f6, code lost:
        if (r7 <= r0) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f8, code lost:
        r14.A00 = 2;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0101, code lost:
        if (r7 <= (r0 - 1024)) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0103, code lost:
        r3 = A01(true);
        r14.A00 = r3;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010b, code lost:
        r3 = A01(false);
        r14.A00 = r3;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0113, code lost:
        if (r0 == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0115, code lost:
        com.whatsapp.util.Log.e("Mp4StreamCheck/mdat before moov, failing check");
        r14.A00 = 2;
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0132, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0142, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(long r15) {
        /*
        // Method dump skipped, instructions count: 323
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34Q.A02(long):boolean");
    }
}
