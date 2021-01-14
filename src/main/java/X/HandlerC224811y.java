package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;

/* renamed from: X.11y  reason: invalid class name and case insensitive filesystem */
public class HandlerC224811y extends Handler {
    public final /* synthetic */ AnonymousClass25M A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC224811y(AnonymousClass25M r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public void handleMessage(Message message) {
        AnonymousClass25M r5 = this.A00;
        if (r5 != null) {
            int i = message.what;
            boolean z = true;
            if (i == 0) {
                AnonymousClass12E r6 = (AnonymousClass12E) message.obj;
                int i2 = message.arg1;
                int i3 = message.arg2;
                if (i3 == -1) {
                    z = false;
                }
                int i4 = r5.A02 - i2;
                r5.A02 = i4;
                if (i4 == 0) {
                    if (r6.A02 == -9223372036854775807L) {
                        r6 = r6.A01(r6.A05, 0, r6.A01);
                    }
                    if ((!r5.A04.A03.A0D() || r5.A06) && r6.A03.A0D()) {
                        r5.A00 = 0;
                        r5.A01 = 0;
                        r5.A03 = 0;
                    }
                    int i5 = 2;
                    if (r5.A06) {
                        i5 = 0;
                    }
                    boolean z2 = r5.A07;
                    r5.A06 = false;
                    r5.A07 = false;
                    r5.A01(r6, z, i3, i5, z2, false);
                }
            } else if (i == 1) {
                AnonymousClass12F r2 = (AnonymousClass12F) message.obj;
                if (!r5.A05.equals(r2)) {
                    r5.A05 = r2;
                    Iterator it = r5.A0H.iterator();
                    while (it.hasNext()) {
                        ((AnonymousClass12G) it.next()).AIV(r2);
                    }
                }
            } else if (i == 2) {
                AnonymousClass11w r22 = (AnonymousClass11w) message.obj;
                Iterator it2 = r5.A0H.iterator();
                while (it2.hasNext()) {
                    ((AnonymousClass12G) it2.next()).AIX(r22);
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            throw null;
        }
    }
}
