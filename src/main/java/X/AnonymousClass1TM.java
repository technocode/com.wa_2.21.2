package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import java.util.AbstractMap;
import java.util.Stack;

/* renamed from: X.1TM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1TM implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C011106q A00;
    public final /* synthetic */ C43331yC A01;

    public /* synthetic */ AnonymousClass1TM(C43331yC r1, C011106q r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C43331yC r3 = this.A01;
        ((C010706m) this.A00.A00.get(R.id.bloks_global_bloks_host)).A02.onBackPressed();
        if (0 != 0) {
            Stack stack = r3.A00.A02;
            stack.peek();
            ((AbstractMap) stack.peek()).putAll(null);
        }
    }
}
