package X;

import android.os.Handler;
import android.os.Message;
import java.util.List;

/* renamed from: X.0yn  reason: invalid class name and case insensitive filesystem */
public class C21470yn implements Handler.Callback {
    public final /* synthetic */ C21490yp A00;

    public C21470yn(C21490yp r1) {
        this.A00 = r1;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            C21490yp r5 = this.A00;
            if (r5.A0B) {
                List list = r5.A0A;
                int i = message.arg1;
                if (list != null && i < list.size()) {
                    list.get(i);
                    list.get(list.size() - 1);
                    List list2 = r5.A05.A00;
                    if (0 < list2.size()) {
                        list2.get(0);
                        throw null;
                    }
                }
                return true;
            }
        }
        if (message.what != 2) {
            return false;
        }
        List list3 = this.A00.A05.A00;
        if (0 >= list3.size()) {
            return true;
        }
        list3.get(0);
        throw null;
    }
}
