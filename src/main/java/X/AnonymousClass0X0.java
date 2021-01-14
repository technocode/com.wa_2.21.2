package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.0X0  reason: invalid class name */
public final class AnonymousClass0X0 extends Handler implements AnonymousClass0X1 {
    public final /* synthetic */ AnonymousClass0G8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0X0(AnonymousClass0G8 r2) {
        super(r2.getLooper());
        this.A00 = r2;
    }

    public void A00(String str) {
        AnonymousClass09M r1 = this.A00.A0k;
        if (r1 != null) {
            AnonymousClass008.A16("xmppIncomingMessageRouter/onXmppMessageDropped id:", str);
            if (str != null) {
                synchronized (r1.A08) {
                    r1.A06.obtainMessage(5, str).sendToTarget();
                }
                return;
            }
            return;
        }
        throw null;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            Log.i("xmpp/connection/recv/sending_channel_ready");
            AnonymousClass0G8 r3 = this.A00;
            r3.A04 = (AnonymousClass0XJ) message.obj;
            AbstractC03370Fx r2 = r3.A0b;
            HandlerC07510Xy r1 = new HandlerC07510Xy(r3);
            Handler handler = (Handler) r2;
            if (handler != null) {
                Log.d("xmpp/handler/send/sending_channel_ready");
                handler.obtainMessage(0, r1).sendToTarget();
                return;
            }
            throw null;
        } else if (i == 1) {
            Log.d("xmpp/connection/recv/send_error");
            AnonymousClass0G8 r22 = this.A00;
            if (message.obj == r22.A06) {
                r22.A02(true);
            }
        } else if (i == 2) {
            Log.d("xmpp/connection/recv/message_sent");
            AnonymousClass0G8 r32 = this.A00;
            C007303n r23 = (C007303n) message.obj;
            if (r32 != null) {
                AnonymousClass008.A1S(AnonymousClass008.A0S("xmpp/connection/message/sent "), r23.A01);
                AnonymousClass0Wz r33 = r32.A03;
                if (r33 != null) {
                    StringBuilder sb = new StringBuilder("xmpp/connection/msgreceipt/start; messageKey=");
                    sb.append(r23);
                    Log.d(sb.toString());
                    r33.sendMessageDelayed(r33.obtainMessage(1, r23), 45000);
                    return;
                }
                throw null;
            }
            throw null;
        }
    }
}
