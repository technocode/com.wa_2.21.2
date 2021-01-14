package X;

import android.app.Dialog;
import android.os.Handler;

/* renamed from: X.0LT  reason: invalid class name */
public abstract class AnonymousClass0LT {
    public void A00() {
        if (!(this instanceof C35021jb)) {
            C34881jN r0 = (C34881jN) ((C34941jT) this).A00.get();
            if (r0 != null) {
                C34881jN.A01(r0);
                return;
            }
            return;
        }
        C35021jb r3 = (C35021jb) this;
        AbstractDialogInterface$OnCancelListenerC35011ja r2 = (AbstractDialogInterface$OnCancelListenerC35011ja) r3.A01.A01;
        r2.A02.set(null);
        Handler handler = ((AnonymousClass261) r2).A00.A05;
        handler.sendMessage(handler.obtainMessage(3));
        Dialog dialog = r3.A00;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
