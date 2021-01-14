package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.LinkedList;

/* renamed from: X.0XA  reason: invalid class name */
public final class AnonymousClass0XA extends Handler implements AnonymousClass0XJ {
    public final /* synthetic */ AnonymousClass0X2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0XA(AnonymousClass0X2 r2) {
        super(r2.getLooper());
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0XJ
    public boolean AAK() {
        return hasMessages(2) || !this.A00.A08.isEmpty();
    }

    @Override // X.AnonymousClass0XJ
    public void ANf(AnonymousClass0OT r2) {
        Log.d("xmpp/writer/send/connected");
        obtainMessage(0, r2).sendToTarget();
    }

    @Override // X.AnonymousClass0XJ
    public void ANh() {
        Log.d("xmpp/writer/send/disconnected");
        sendEmptyMessage(1);
    }

    @Override // X.AnonymousClass0XJ
    public void ANp(Message message) {
        message.what = 2;
        sendMessage(message);
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            Log.i("xmpp/writer/recv/connected");
            AnonymousClass0X2 r2 = this.A00;
            r2.A00 = (AnonymousClass0OT) message.obj;
            r2.A01 = false;
            while (!r2.A01) {
                LinkedList linkedList = r2.A08;
                if (!linkedList.isEmpty()) {
                    r2.A00((Message) linkedList.remove());
                } else {
                    return;
                }
            }
        } else if (i == 1) {
            Log.d("xmpp/writer/recv/disconnected");
            this.A00.A01 = true;
        } else if (i == 2) {
            this.A00.A00(message);
        }
    }
}
