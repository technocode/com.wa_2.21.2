package X;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* renamed from: X.1ZE  reason: invalid class name */
public class AnonymousClass1ZE implements AbstractC06100Rs {
    public AbstractC06100Rs A00;
    public final /* synthetic */ AnonymousClass0MW A01;

    public AnonymousClass1ZE(AnonymousClass0MW r1, AbstractC06100Rs r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC06100Rs
    public boolean ACa(AbstractC06110Rt r2, MenuItem menuItem) {
        return this.A00.ACa(r2, menuItem);
    }

    @Override // X.AbstractC06100Rs
    public boolean AEi(AbstractC06110Rt r2, Menu menu) {
        return this.A00.AEi(r2, menu);
    }

    @Override // X.AbstractC06100Rs
    public void AEx(AbstractC06110Rt r5) {
        this.A00.AEx(r5);
        AnonymousClass0MW r3 = this.A01;
        if (r3.A09 != null) {
            r3.A08.getDecorView().removeCallbacks(r3.A0O);
        }
        if (r3.A0K != null) {
            C06330Su r0 = r3.A0M;
            if (r0 != null) {
                r0.A00();
            }
            C06330Su A0E = AnonymousClass0Q7.A0E(r3.A0K);
            A0E.A02(0.0f);
            r3.A0M = A0E;
            AnonymousClass23G r1 = new AnonymousClass23G(this);
            View view = (View) A0E.A01.get();
            if (view != null) {
                A0E.A05(view, r1);
            }
        }
        AnonymousClass02s r12 = r3.A0k;
        if (r12 != null) {
            r12.AKm(r3.A0J);
        }
        r3.A0J = null;
    }

    @Override // X.AbstractC06100Rs
    public boolean AIh(AbstractC06110Rt r2, Menu menu) {
        return this.A00.AIh(r2, menu);
    }
}
