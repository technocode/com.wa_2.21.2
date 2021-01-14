package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;

/* renamed from: X.0CE  reason: invalid class name */
public class AnonymousClass0CE extends Handler {
    public final HashMap A00 = new HashMap();
    public final /* synthetic */ AnonymousClass0CD A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0CE(AnonymousClass0CD r2, Looper looper) {
        super(looper);
        this.A01 = r2;
    }

    public final void A00(AnonymousClass02N r5, boolean z) {
        if (!hasMessages(0, r5) && !hasMessages(3, r5)) {
            if (!hasMessages(2, r5)) {
                AnonymousClass0CD r1 = this.A01;
                if (r1.A01.A06 && (z || hasMessages(5, r5))) {
                    r1.A02.A09(Message.obtain(null, 0, 5, 0, r5));
                }
            }
            removeMessages(4, r5);
            removeMessages(5, r5);
        }
    }

    public void handleMessage(Message message) {
        int i = message.what;
        int i2 = 0;
        if (i == 0) {
            Object obj = message.obj;
            if (message.arg1 == 1) {
                i2 = 1;
            }
            int i3 = message.arg2;
            if (!hasMessages(1, obj) && !hasMessages(4, obj)) {
                removeMessages(0, obj);
                if (hasMessages(2, obj) || hasMessages(5, obj)) {
                    HashMap hashMap = this.A00;
                    Number number = (Number) hashMap.get(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (number != null && currentTimeMillis - number.longValue() > 10000) {
                        AnonymousClass0CD r1 = this.A01;
                        if (r1.A01.A06) {
                            if (i2 != 0) {
                                r1.A02.A09(Message.obtain(null, 0, 4, i3, obj));
                            }
                            hashMap.put(obj, Long.valueOf(currentTimeMillis));
                        }
                    }
                } else {
                    AnonymousClass0CD r12 = this.A01;
                    if (r12.A01.A06) {
                        if (i2 != 0) {
                            r12.A02.A09(Message.obtain(null, 0, 4, i3, obj));
                        }
                        this.A00.put(obj, Long.valueOf(System.currentTimeMillis()));
                    }
                }
                removeMessages(2, obj);
                sendMessageDelayed(obtainMessage(2, i2, 0, obj), 2500);
            }
        } else if (i == 1 || i == 2) {
            Object obj2 = message.obj;
            boolean z = false;
            if (message.arg1 == 1) {
                z = true;
            }
            if (!hasMessages(0, obj2) && !hasMessages(3, obj2)) {
                if (!hasMessages(5, obj2)) {
                    AnonymousClass0CD r13 = this.A01;
                    if (r13.A01.A06 && z) {
                        r13.A02.A09(Message.obtain(null, 0, 5, 0, obj2));
                    }
                }
                removeMessages(1, obj2);
                removeMessages(2, obj2);
            }
        } else if (i == 3) {
            Object obj3 = message.obj;
            int i4 = message.arg2;
            if (!hasMessages(1, obj3) && !hasMessages(4, obj3)) {
                if (!hasMessages(2, obj3)) {
                    AnonymousClass0CD r14 = this.A01;
                    if (r14.A01.A06) {
                        r14.A02.A09(Message.obtain(null, 0, 4, i4, obj3));
                    }
                }
                sendMessageDelayed(obtainMessage(5, 0, 0, obj3), 30000);
            }
        } else if (i == 4) {
            A00((AnonymousClass02N) message.obj, false);
        } else if (i == 5) {
            A00((AnonymousClass02N) message.obj, true);
        }
    }
}
