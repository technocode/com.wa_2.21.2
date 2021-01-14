package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;
import java.util.LinkedList;

/* renamed from: X.0X2  reason: invalid class name */
public final class AnonymousClass0X2 extends HandlerThread {
    public AnonymousClass0OT A00;
    public boolean A01 = true;
    public final C03320Fs A02;
    public final AnonymousClass009 A03;
    public final AnonymousClass09T A04;
    public final AnonymousClass0CL A05;
    public final AnonymousClass0X1 A06;
    public final AnonymousClass0X3 A07 = new AnonymousClass0X3(this);
    public final LinkedList A08 = new LinkedList();

    public AnonymousClass0X2(AnonymousClass0X1 r3, AnonymousClass009 r4, AnonymousClass0CL r5, AnonymousClass09T r6, C03320Fs r7) {
        super("WriterThread", 1);
        this.A06 = r3;
        this.A03 = r4;
        this.A05 = r5;
        this.A04 = r6;
        this.A02 = r7;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r0 != false) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:1016:0x381a  */
    /* JADX WARNING: Removed duplicated region for block: B:1018:0x384d  */
    /* JADX WARNING: Removed duplicated region for block: B:1043:0x393f  */
    /* JADX WARNING: Removed duplicated region for block: B:1054:0x39a2  */
    /* JADX WARNING: Removed duplicated region for block: B:1063:0x39d0  */
    /* JADX WARNING: Removed duplicated region for block: B:693:0x2418  */
    /* JADX WARNING: Removed duplicated region for block: B:696:0x2424  */
    /* JADX WARNING: Removed duplicated region for block: B:980:0x36b8  */
    /* JADX WARNING: Removed duplicated region for block: B:983:0x36d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.os.Message r47) {
        /*
        // Method dump skipped, instructions count: 24368
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0X2.A00(android.os.Message):void");
    }

    public void onLooperPrepared() {
        AnonymousClass0X1 r2 = this.A06;
        AnonymousClass0XA r1 = new AnonymousClass0XA(this);
        Handler handler = (Handler) r2;
        if (handler != null) {
            Log.d("xmpp/connection/send/sending_channel_ready");
            handler.obtainMessage(0, r1).sendToTarget();
            return;
        }
        throw null;
    }
}
