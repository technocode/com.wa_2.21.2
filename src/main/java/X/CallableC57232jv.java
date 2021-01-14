package X;

import com.whatsapp.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.2jv  reason: invalid class name and case insensitive filesystem */
public class CallableC57232jv implements Callable, AbstractC50012Tb, AnonymousClass1W4 {
    public final C000300f A00;
    public final AnonymousClass0CL A01;
    public final AnonymousClass0CW A02;
    public final C50002Ta A03;
    public final C50042Te A04;
    public final AnonymousClass1WD A05;
    public final AnonymousClass0CT A06;
    public final FutureTask A07 = new FutureTask(this);

    public CallableC57232jv(AnonymousClass0CL r2, C000300f r3, AnonymousClass0CT r4, AnonymousClass0CW r5, C50042Te r6, AnonymousClass1WD r7, C50002Ta r8) {
        this.A01 = r2;
        this.A00 = r3;
        this.A06 = r4;
        this.A02 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r8;
    }

    public final void A00() {
        if (this.A07.isCancelled()) {
            throw new CancellationException("plaindownload/cancelled");
        }
    }

    @Override // X.AbstractC50012Tb
    public AnonymousClass2TY A3u() {
        try {
            FutureTask futureTask = this.A07;
            futureTask.run();
            return (AnonymousClass2TY) futureTask.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            Log.e("plaindownload/exception ", e);
            return new AnonymousClass2TY(new AnonymousClass1W8(13));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0171, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r4.A02.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0177, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x017b, code lost:
        if (r5 != null) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0180, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0183, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        ((X.AnonymousClass21V) r3).A01.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x018b, code lost:
        throw r1;
     */
    @Override // X.AnonymousClass1W4
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1W3 AN8(X.AnonymousClass0J5 r20) {
        /*
        // Method dump skipped, instructions count: 726
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CallableC57232jv.AN8(X.0J5):X.1W3");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ad  */
    @Override // java.util.concurrent.Callable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call() {
        /*
        // Method dump skipped, instructions count: 482
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CallableC57232jv.call():java.lang.Object");
    }

    @Override // X.AbstractC50012Tb
    public void cancel() {
        this.A07.cancel(true);
    }
}
