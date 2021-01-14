package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.1Ln  reason: invalid class name and case insensitive filesystem */
public final class HandlerC26591Ln extends Handler {
    public final Context A00;
    public final C02590Cr A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC26591Ln(Context context, C02590Cr r3, Looper looper) {
        super(looper);
        if (looper != null) {
            this.A00 = context.getApplicationContext();
            this.A01 = r3;
            return;
        }
        throw null;
    }

    public void handleMessage(Message message) {
        C26571Ll r5;
        C26601Lo r0 = (C26601Lo) message.obj;
        AnonymousClass0M7 r3 = null;
        if (r0 != null) {
            r5 = r0.A00;
            r3 = r0.A01;
        } else {
            r5 = null;
        }
        int i = message.arg1;
        C02590Cr r2 = this.A01;
        Context context = this.A00;
        if (r3 != null) {
            Drawable A02 = r2.A02(context, i, r3, 0.6f);
            if (r5 != null) {
                r5.setTag(A02);
                Message.obtain(C26621Lq.A0T, 0, i, 0, r5).sendToTarget();
                return;
            }
            Message.obtain(C26621Lq.A0T, 1, i, 0, A02).sendToTarget();
            return;
        }
        throw null;
    }
}
