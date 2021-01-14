package X;

import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.2Nu  reason: invalid class name and case insensitive filesystem */
public class C48812Nu extends ClickableSpan {
    public final /* synthetic */ Runnable A00;

    public C48812Nu(Runnable runnable) {
        this.A00 = runnable;
    }

    public void onClick(View view) {
        this.A00.run();
    }
}
