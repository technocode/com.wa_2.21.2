package X;

import android.os.Handler;
import android.os.Message;
import java.util.List;

/* renamed from: X.0zt  reason: invalid class name and case insensitive filesystem */
public class C22110zt implements Handler.Callback {
    public final /* synthetic */ C22120zu A00;

    public C22110zt(C22120zu r1) {
        this.A00 = r1;
    }

    public boolean handleMessage(Message message) {
        C21120yD r1 = this.A00.A04;
        if (r1.A00.isEmpty()) {
            return true;
        }
        List list = r1.A00;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5 && 0 < list.size()) {
                                list.get(0);
                                throw null;
                            }
                        } else if (0 < list.size()) {
                            list.get(0);
                            throw null;
                        }
                    } else if (0 < list.size()) {
                        list.get(0);
                        throw null;
                    }
                } else if (0 < list.size()) {
                    list.get(0);
                    throw null;
                }
            } else if (0 < list.size()) {
                list.get(0);
                throw null;
            }
        } else if (0 < list.size()) {
            list.get(0);
            throw null;
        }
        return true;
    }
}
