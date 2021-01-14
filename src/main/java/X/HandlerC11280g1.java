package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.0g1  reason: invalid class name and case insensitive filesystem */
public final class HandlerC11280g1 extends Handler implements AbstractC11290g2 {
    public boolean A00;
    public final /* synthetic */ AnonymousClass0G8 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC11280g1(AnonymousClass0G8 r2) {
        super(r2.getLooper());
        this.A01 = r2;
    }

    public void A00(Message message) {
        message.what = 0;
        sendMessage(message);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        r2 = (android.os.Handler) r7.A0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r2 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r0 = new java.lang.StringBuilder("xmpp/handler/send/iq-response; id=");
        r0.append(r3);
        com.whatsapp.util.Log.d(r0.toString());
        r2.obtainMessage(8, r3).sendToTarget();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0090, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0091, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r10) {
        /*
        // Method dump skipped, instructions count: 434
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC11280g1.handleMessage(android.os.Message):void");
    }
}
