package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.Statistics$Data;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.0QV  reason: invalid class name */
public class AnonymousClass0QV extends Handler implements AbstractC000900m {
    public Statistics$Data A00;
    public File A01;
    public final CountDownLatch A02 = new CountDownLatch(1);
    public volatile boolean A03;
    public final /* synthetic */ AnonymousClass0CL A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0QV(AnonymousClass0CL r3, Looper looper, C003301q r5) {
        super(looper);
        this.A04 = r3;
        r5.A01(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r3 = this;
            java.io.File r1 = r3.A01
            if (r1 == 0) goto L_0x0035
            X.0CL r0 = r3.A04     // Catch:{ IOException -> 0x002e }
            X.00C r0 = r0.A02     // Catch:{ IOException -> 0x002e }
            X.03T r0 = r0.A04     // Catch:{ IOException -> 0x002e }
            X.03t r2 = new X.03t     // Catch:{ IOException -> 0x002e }
            r2.<init>(r0, r1)     // Catch:{ IOException -> 0x002e }
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0027 }
            r1.<init>(r2)     // Catch:{ all -> 0x0027 }
            com.whatsapp.Statistics$Data r0 = r3.A00     // Catch:{ all -> 0x0020 }
            r1.writeObject(r0)     // Catch:{ all -> 0x0020 }
            r1.close()
            r2.close()
            return
        L_0x0020:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0026 }
        L_0x0026:
            throw r0
        L_0x0027:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x002d }
        L_0x002d:
            throw r0
        L_0x002e:
            r1 = move-exception
            java.lang.String r0 = "error saving statistics file"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0035:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QV.A00():void");
    }

    public final void A01(int i, long j) {
        if (this.A03) {
            this.A00.rx_roaming_bytes += j;
        }
        if (i == 0) {
            this.A00.rx_media_bytes += j;
        } else if (i == 1) {
            this.A00.rx_message_service_bytes += j;
        } else if (i == 2) {
            this.A00.rx_voip_bytes += j;
        } else if (i == 3) {
            this.A00.rx_google_drive_bytes += j;
        } else if (i == 4) {
            this.A00.rx_status_bytes += j;
        }
    }

    public final void A02(int i, long j) {
        if (this.A03) {
            this.A00.tx_roaming_bytes += j;
        }
        if (i == 0) {
            this.A00.tx_media_bytes += j;
        } else if (i == 1) {
            this.A00.tx_message_service_bytes += j;
        } else if (i == 2) {
            this.A00.tx_voip_bytes += j;
        } else if (i == 3) {
            this.A00.tx_google_drive_bytes += j;
        } else if (i == 4) {
            this.A00.tx_status_bytes += j;
        }
    }

    @Override // X.AbstractC000900m
    public void AEa(AnonymousClass0JF r2) {
        this.A03 = r2.A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0146, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0151, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleMessage(android.os.Message r13) {
        /*
        // Method dump skipped, instructions count: 454
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QV.handleMessage(android.os.Message):void");
    }
}
