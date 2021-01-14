package X;

import android.content.Context;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: X.1ZM  reason: invalid class name */
public class AnonymousClass1ZM extends AbstractC06110Rt implements AnonymousClass0MX {
    public Context A00;
    public AbstractC06100Rs A01;
    public AnonymousClass0T8 A02;
    public ActionBarContextView A03;
    public WeakReference A04;
    public boolean A05;

    public AnonymousClass1ZM(Context context, ActionBarContextView actionBarContextView, AbstractC06100Rs r5) {
        this.A00 = context;
        this.A03 = actionBarContextView;
        this.A01 = r5;
        AnonymousClass0T8 r1 = new AnonymousClass0T8(actionBarContextView.getContext());
        r1.A00 = 1;
        this.A02 = r1;
        r1.A03 = this;
    }

    @Override // X.AnonymousClass0MX
    public boolean AHj(AnonymousClass0T8 r2, MenuItem menuItem) {
        return this.A01.ACa(this, menuItem);
    }

    @Override // X.AnonymousClass0MX
    public void AHk(AnonymousClass0T8 r2) {
        A01();
        AnonymousClass23R r0 = ((AbstractC06350Sx) this.A03).A01;
        if (r0 != null) {
            r0.A03();
        }
    }
}
