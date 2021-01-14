package X;

import android.view.Menu;
import android.view.View;
import android.view.Window;

/* renamed from: X.0V7  reason: invalid class name */
public class AnonymousClass0V7 extends AnonymousClass0TK {
    public final /* synthetic */ AnonymousClass0TC A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0V7(AnonymousClass0TC r1, Window.Callback callback) {
        super(callback);
        this.A00 = r1;
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        boolean onPreparePanel = super.A00.onPreparePanel(i, view, menu);
        if (onPreparePanel) {
            AnonymousClass0TC r1 = this.A00;
            if (!r1.A05) {
                r1.A01.AOZ();
                r1.A05 = true;
            }
        }
        return onPreparePanel;
    }
}
