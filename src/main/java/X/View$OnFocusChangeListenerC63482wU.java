package X;

import android.view.View;

/* renamed from: X.2wU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnFocusChangeListenerC63482wU implements View.OnFocusChangeListener {
    public final /* synthetic */ AnonymousClass3IN A00;

    public /* synthetic */ View$OnFocusChangeListenerC63482wU(AnonymousClass3IN r1) {
        this.A00 = r1;
    }

    public final void onFocusChange(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.A00.A00;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }
}
