package X;

import android.content.Context;
import android.view.MenuItem;
import java.lang.ref.WeakReference;

/* renamed from: X.0V6  reason: invalid class name */
public class AnonymousClass0V6 extends AbstractC06110Rt implements AnonymousClass0MX {
    public AbstractC06100Rs A00;
    public WeakReference A01;
    public final Context A02;
    public final AnonymousClass0T8 A03;
    public final /* synthetic */ AnonymousClass0TA A04;

    public AnonymousClass0V6(AnonymousClass0TA r3, Context context, AbstractC06100Rs r5) {
        this.A04 = r3;
        this.A02 = context;
        this.A00 = r5;
        AnonymousClass0T8 r1 = new AnonymousClass0T8(context);
        r1.A00 = 1;
        this.A03 = r1;
        r1.A03 = this;
    }

    @Override // X.AnonymousClass0MX
    public boolean AHj(AnonymousClass0T8 r2, MenuItem menuItem) {
        AbstractC06100Rs r0 = this.A00;
        if (r0 != null) {
            return r0.ACa(this, menuItem);
        }
        return false;
    }

    @Override // X.AnonymousClass0MX
    public void AHk(AnonymousClass0T8 r2) {
        if (this.A00 != null) {
            A01();
            AnonymousClass23R r0 = ((AbstractC06350Sx) this.A04.A09).A01;
            if (r0 != null) {
                r0.A03();
            }
        }
    }
}
