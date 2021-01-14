package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.Conversation;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: X.0dB  reason: invalid class name and case insensitive filesystem */
public class C09580dB {
    public final Set A00 = new HashSet();

    public void A00() {
        Set<C53362cx> set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                LinkedList<C53362cx> linkedList = null;
                for (C53362cx r7 : set) {
                    AnonymousClass2NP r1 = r7.A00;
                    AnonymousClass00E.A01();
                    if (!r1.A01) {
                        r1.A01 = true;
                        Set<C38571q6> set2 = r1.A03;
                        for (C38571q6 r0 : set2) {
                            Conversation conversation = r0.A00;
                            Handler handler = new Handler(Looper.getMainLooper());
                            Message obtain = Message.obtain(handler, new RunnableEBaseShape0S0100000_I0_0(conversation, 48));
                            obtain.setAsynchronous(true);
                            handler.sendMessageAtFrontOfQueue(obtain);
                        }
                        set2.clear();
                    }
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                    }
                    linkedList.add(r7);
                }
                if (linkedList != null) {
                    for (C53362cx r02 : linkedList) {
                        set.remove(r02);
                    }
                }
            }
        }
    }
}
