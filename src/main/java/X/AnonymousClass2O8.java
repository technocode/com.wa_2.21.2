package X;

import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.2O8  reason: invalid class name */
public class AnonymousClass2O8 extends ClickableSpan {
    public final /* synthetic */ Runnable A00;

    public AnonymousClass2O8(Runnable runnable) {
        this.A00 = runnable;
    }

    public void onClick(View view) {
        this.A00.run();
    }
}
