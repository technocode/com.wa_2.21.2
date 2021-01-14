package X;

import android.view.View;

/* renamed from: X.33Z  reason: invalid class name */
public class AnonymousClass33Z implements View.OnLongClickListener {
    public final /* synthetic */ C71863Qp A00;

    public AnonymousClass33Z(C71863Qp r1) {
        this.A00 = r1;
    }

    public boolean onLongClick(View view) {
        View.OnLongClickListener onLongClickListener = this.A00.A00;
        if (onLongClickListener != null) {
            return onLongClickListener.onLongClick(view);
        }
        return false;
    }
}
