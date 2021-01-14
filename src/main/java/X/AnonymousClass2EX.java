package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.2EX  reason: invalid class name */
public class AnonymousClass2EX extends Thread {
    public final /* synthetic */ AnonymousClass2EY A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2EX(AnonymousClass2EY r2) {
        super("CameraQRCodeProcessor");
        this.A00 = r2;
    }

    public void run() {
        AnonymousClass1Fh r3;
        while (true) {
            AnonymousClass2EY r2 = this.A00;
            if (r2.A06) {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    AnonymousClass2EZ A4b = r2.A05.A4b();
                    if (A4b != null) {
                        byte[] bArr = A4b.A02;
                        int i = A4b.A01;
                        int i2 = A4b.A00;
                        int i3 = i;
                        if (i >= 320) {
                            i3 = (i * 3) >> 2;
                        }
                        int i4 = i2;
                        if (i2 >= 320) {
                            i4 = (i2 * 3) >> 2;
                        }
                        try {
                            r3 = r2.A03.A00(new C25111Fc(new C37241ns(new C37221nq(bArr, i, i2, (i - i3) >> 1, (i2 - i4) >> 1, i3, i4))), null);
                        } catch (AbstractC25151Fg unused) {
                            r3 = null;
                        }
                        if (r2.A03 == null) {
                            throw null;
                        } else if (r2.A06) {
                            synchronized (r2) {
                                if (r3 != null) {
                                    AnonymousClass1Fh r0 = r2.A00;
                                    if (r0 == null || !r0.A01.equals(r3.A01)) {
                                        r2.A00 = r3;
                                        r2.A04.AHz(r3);
                                    }
                                }
                            }
                        }
                    }
                    long uptimeMillis2 = ((long) (SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS / r2.A02)) - (SystemClock.uptimeMillis() - uptimeMillis);
                    if (r2.A06 && uptimeMillis2 > 0) {
                        Thread.sleep(uptimeMillis2);
                    }
                } catch (InterruptedException unused2) {
                }
            } else {
                return;
            }
        }
    }
}
