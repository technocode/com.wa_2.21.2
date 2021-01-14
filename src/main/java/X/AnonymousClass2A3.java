package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2A3  reason: invalid class name */
public class AnonymousClass2A3 extends AbstractRunnableC448321v implements AnonymousClass1W7 {
    public final long A00;
    public final C000300f A01;
    public final AnonymousClass0CL A02;
    public final AnonymousClass0EV A03;
    public final AnonymousClass00C A04;
    public final AnonymousClass00G A05;
    public final AnonymousClass0ET A06;
    public final AnonymousClass0CW A07;
    public final AnonymousClass1WL A08;
    public final AnonymousClass0CT A09;
    public final AbstractC03150Ez A0A;
    public final String A0B;
    public volatile File A0C;
    public volatile boolean A0D;

    public AnonymousClass2A3(long j, String str, AbstractC03150Ez r5, AnonymousClass00G r6, AnonymousClass0CL r7, C000300f r8, AnonymousClass1WL r9, AnonymousClass0CT r10, AnonymousClass00C r11, AnonymousClass0ET r12, AnonymousClass0EV r13, AnonymousClass0CW r14) {
        super(null);
        this.A02 = r7;
        this.A01 = r8;
        this.A09 = r10;
        this.A04 = r11;
        this.A07 = r14;
        this.A00 = j;
        this.A0B = str;
        this.A0A = r5;
        this.A05 = r6;
        this.A08 = r9;
        this.A06 = r12;
        this.A03 = r13;
        A1j(this);
    }

    public final void A02(boolean z) {
        AnonymousClass008.A1G("ProfilePicturePlainFileDownload/cleanupDownload/isCancelled = ", z);
        if (z) {
            File A012 = AnonymousClass0EX.A01(this.A05.A00, this.A08.A05);
            if (A012.exists()) {
                A012.delete();
            }
        } else {
            this.A0C.delete();
        }
        this.A0A.A1e(this.A0B);
        this.A0D = false;
    }

    @Override // X.AnonymousClass1W7
    public void AFF(boolean z) {
        Log.d("ProfilePicturePlainFileDownload/onDownloadCanceled");
        A02(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass1W7
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AFG(X.AnonymousClass1W8 r10, X.C49982Sy r11) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2A3.AFG(X.1W8, X.2Sy):void");
    }
}
