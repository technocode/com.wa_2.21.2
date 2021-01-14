package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.2Mc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnFocusChangeListenerC48412Mc implements View.OnFocusChangeListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C48522Mp A01;
    public final /* synthetic */ C06170Sb A02;

    public /* synthetic */ View$OnFocusChangeListenerC48412Mc(C48522Mp r1, C06170Sb r2, Activity activity) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = activity;
    }

    public final void onFocusChange(View view, boolean z) {
        C48522Mp r0 = this.A01;
        C06170Sb r3 = this.A02;
        Activity activity = this.A00;
        Drawable background = r0.A0R.getBackground();
        int i = 204;
        if (z) {
            i = 230;
        }
        background.setAlpha(i);
        if (z) {
            r3.A03(view);
            activity.getWindow().setSoftInputMode(5);
            return;
        }
        r3.A02(view);
        activity.getWindow().setSoftInputMode(3);
    }
}
