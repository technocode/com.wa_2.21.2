package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandomSpi;

/* renamed from: X.0tF  reason: invalid class name and case insensitive filesystem */
public final class C18370tF extends SecureRandomSpi {
    public static DataInputStream A00;
    public static OutputStream A01;
    public static final File A02 = new File("/dev/urandom");
    public static final Object A03 = new Object();
    public boolean seeded;

    public byte[] engineGenerateSeed(int i) {
        byte[] bArr = new byte[i];
        engineNextBytes(bArr);
        return bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineNextBytes(byte[] r5) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18370tF.engineNextBytes(byte[]):void");
    }

    public void engineSetSeed(byte[] bArr) {
        OutputStream outputStream;
        if ("samsung".equalsIgnoreCase(Build.MANUFACTURER)) {
            this.seeded = true;
            return;
        }
        try {
            synchronized (A03) {
                outputStream = A01;
                if (outputStream == null) {
                    outputStream = new FileOutputStream(A02);
                    A01 = outputStream;
                }
            }
            outputStream.write(bArr);
            outputStream.flush();
            this.seeded = true;
        } catch (IOException e) {
            Log.w("unable to seed PRNG", e);
        }
    }
}
