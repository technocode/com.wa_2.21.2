package X;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1HV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1HV implements DialogInterface.OnClickListener {
    public final /* synthetic */ AtomicInteger A00;

    public /* synthetic */ AnonymousClass1HV(AtomicInteger atomicInteger) {
        this.A00 = atomicInteger;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.set(i);
        ((AnonymousClass0MD) dialogInterface).A02(-1).setEnabled(true);
    }
}
