package X;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1ja  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractDialogInterface$OnCancelListenerC35011ja extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public final Handler A00 = new HandlerC04640Ld(Looper.getMainLooper());
    public final AnonymousClass0LP A01;
    public final AtomicReference A02 = new AtomicReference(null);
    public volatile boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractDialogInterface$OnCancelListenerC35011ja(AbstractC04610La r4) {
        super(r4);
        AnonymousClass0LP r2 = AnonymousClass0LP.A00;
        this.A01 = r2;
    }

    public void A06(C34661ix r4, int i) {
        AnonymousClass17J r1 = ((AnonymousClass261) this).A00;
        if (!r1.A03(r4, i)) {
            Handler handler = r1.A05;
            handler.sendMessage(handler.obtainMessage(5, i, 0, r4));
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        int i;
        C34661ix r2 = new C34661ix(13, null);
        AtomicReference atomicReference = this.A02;
        C237217g r0 = (C237217g) atomicReference.get();
        if (r0 == null) {
            i = -1;
        } else {
            i = r0.A00;
        }
        A06(r2, i);
        atomicReference.set(null);
        Handler handler = ((AnonymousClass261) this).A00.A05;
        handler.sendMessage(handler.obtainMessage(3));
    }
}
