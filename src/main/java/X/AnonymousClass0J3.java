package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import com.whatsapp.util.NativeUtils;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0J3  reason: invalid class name */
public class AnonymousClass0J3 {
    public long A00;
    public long A01;
    public Boolean A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass0J2 A06;
    public final AnonymousClass03U A07;
    public final String A08;
    public final String A09;
    public final List A0A = new LinkedList();
    public final List A0B = new LinkedList();
    public final List A0C = new LinkedList();
    public final List A0D = new LinkedList();
    public final AtomicReference A0E = new AtomicReference();

    public AnonymousClass0J3(AnonymousClass03U r2, String str, String str2, AnonymousClass0J2 r5, boolean z, boolean z2) {
        this.A07 = r2;
        this.A08 = str;
        this.A09 = str2;
        this.A06 = r5;
        this.A04 = z;
        this.A05 = z2;
    }

    public static String A00(URL url) {
        if (!(url == null || url.getHost() == null)) {
            try {
                return InetAddress.getByName(url.getHost()).getHostAddress();
            } catch (UnknownHostException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x039e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03da, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03e6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03ea, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x039a, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(X.AnonymousClass0J5 r20) {
        /*
        // Method dump skipped, instructions count: 1065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0J3.A01(X.0J5):int");
    }

    public final Pair A02() {
        boolean z;
        Socket socket = (Socket) this.A0E.get();
        int i = 0;
        if (socket != null) {
            try {
                i = NativeUtils.getFileDescriptorForSocket(socket);
                z = true;
            } catch (UnsupportedOperationException e) {
                Log.w("httpsformpost/getSocketInfo", e);
            } catch (UnsatisfiedLinkError e2) {
                Log.w("httpsformpost/getSocketInfo", e2);
            }
            return new Pair(Integer.valueOf(i), Boolean.valueOf(z));
        }
        z = false;
        return new Pair(Integer.valueOf(i), Boolean.valueOf(z));
    }

    public final void A03(C49412Qj r11, OutputStream outputStream, AtomicLong atomicLong, Pair pair) {
        int intValue = ((Number) pair.first).intValue();
        boolean booleanValue = ((Boolean) pair.second).booleanValue();
        long j = r11.A00;
        long j2 = j;
        while (j > 0) {
            j -= r11.A01.skip(j);
        }
        byte[] bArr = new byte[16384];
        do {
            int read = r11.A01.read(bArr);
            if (read != -1) {
                int i = 0;
                outputStream.write(bArr, 0, read);
                j2 += (long) read;
                AnonymousClass0J2 r6 = this.A06;
                if (r6 != null) {
                    if (booleanValue) {
                        try {
                            i = NativeUtils.getBytesInSocketOutputQueue(intValue);
                        } catch (UnsupportedOperationException unused) {
                        }
                    }
                    r6.AEq(j2 - ((long) i));
                }
            } else {
                atomicLong.set(j2);
                return;
            }
        } while (!Thread.currentThread().isInterrupted());
        throw new InterruptedIOException();
    }

    public void A04(InputStream inputStream, String str, String str2, long j, long j2) {
        this.A0A.add(new C49412Qj(inputStream, str, str2, j, false));
    }
}
