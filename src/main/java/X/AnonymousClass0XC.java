package X;

import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.0XC  reason: invalid class name */
public class AnonymousClass0XC implements AnonymousClass0C0 {
    public static volatile AnonymousClass0XC A02;
    public AnonymousClass0Z0 A00;
    public final C03160Fa A01;

    public AnonymousClass0XC(C03160Fa r1, AnonymousClass0Z0 r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void A00(Message message) {
        StringBuilder A0S = AnonymousClass008.A0S("voip/onReceiveCallMessage/");
        A0S.append(message.arg1);
        Log.d(A0S.toString());
        Message obtain = Message.obtain(message);
        AnonymousClass0Z0 r3 = this.A00;
        r3.A00.obtainMessage(1, new AnonymousClass0Yz("receive_message", null, obtain)).sendToTarget();
    }

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{150, 192, 193, 197};
    }

    @Override // X.AnonymousClass0C0
    public boolean AAE(int i, Message message) {
        if (!(i == 150 || i == 197)) {
            if (i == 192) {
                if ("terminate".equals(((AnonymousClass1XB) message.obj).A01.tag)) {
                    this.A01.A02();
                }
                A00(message);
                return true;
            } else if (i != 193) {
                return false;
            }
        }
        A00(message);
        return true;
    }
}
