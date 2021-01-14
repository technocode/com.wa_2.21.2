package X;

import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: X.0TC  reason: invalid class name */
public class AnonymousClass0TC extends AnonymousClass0S2 {
    public Window.Callback A00;
    public AnonymousClass0TD A01;
    public ArrayList A02 = new ArrayList();
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AbstractC08280an A06 = new C08270am(this);
    public final Runnable A07 = new RunnableEBaseShape0S0100000_I0_0(this, 3);

    public AnonymousClass0TC(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C08290ao r1 = new C08290ao(toolbar, false);
        this.A01 = r1;
        AnonymousClass0V7 r0 = new AnonymousClass0V7(this, callback);
        this.A00 = r0;
        r1.setWindowCallback(r0);
        toolbar.A0R = this.A06;
        r1.setWindowTitle(charSequence);
    }

    public void A0F(int i, int i2) {
        AnonymousClass0TD r2 = this.A01;
        r2.AOC((i & i2) | ((i2 ^ -1) & r2.A65()));
    }
}
