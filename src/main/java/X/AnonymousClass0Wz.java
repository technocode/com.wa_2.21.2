package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.0Wz  reason: invalid class name */
public final class AnonymousClass0Wz extends Handler {
    public final /* synthetic */ AnonymousClass0G8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0Wz(AnonymousClass0G8 r2) {
        super(r2.getLooper());
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            AnonymousClass0G8 r4 = this.A00;
            if (AnonymousClass0Fh.A01()) {
                Log.i("xmpp/connection/logout/timeout/skip-voip-active");
                r4.A03.sendEmptyMessageDelayed(0, 10000);
                r4.A04.ANp(Message.obtain(null, 0, 22, 0));
                return;
            }
            Log.i("xmpp/connection/logout/timeout/close-socket");
            AnonymousClass0G8.A01(r4.A01);
        } else if (i == 1) {
            C007303n r7 = (C007303n) message.obj;
            StringBuilder sb = new StringBuilder("xmpp/connection/msgreceipt/check; messageKey=");
            sb.append(r7);
            Log.d(sb.toString());
            AnonymousClass0G8 r6 = this.A00;
            AbstractC007503q A05 = r6.A0R.A0J.A05(r7);
            if (A05 != null && C12080hW.A00(A05.A08, 4) < 0) {
                StringBuilder sb2 = new StringBuilder("message receipt timeout fired; messageKey=");
                sb2.append(r7);
                sb2.append("; fMessage.status=");
                sb2.append(A05.A08);
                Log.w(sb2.toString());
                removeMessages(1);
                r6.A05(true, 0);
            }
        } else if (i == 2) {
            Log.w("connection active timeout fired");
            removeMessages(2);
            this.A00.A05(true, 0);
        }
    }
}
