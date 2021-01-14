package X;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.0nF  reason: invalid class name and case insensitive filesystem */
public final class C15010nF extends ClickableSpan {
    public final int A00;
    public final int A01;
    public final C07890a3 A02;

    public C15010nF(int i, C07890a3 r2, int i2) {
        this.A01 = i;
        this.A02 = r2;
        this.A00 = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.A01);
        C07890a3 r0 = this.A02;
        r0.A02.performAction(this.A00, bundle);
    }
}
