package X;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import com.google.android.material.chip.Chip;

/* renamed from: X.0Mq  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC04990Mq {
    public void A00(int i) {
        if (this instanceof C36821mw) {
            C36821mw r2 = (C36821mw) this;
            AnonymousClass1Dg r1 = r2.A02;
            r1.A00();
            r1.A01 = true;
            r2.A01.A00(i);
        } else if (!(this instanceof C36751mo) && (this instanceof C36741mn)) {
        }
    }

    public final void A01(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableEBaseShape0S0101000_I0(this, i, 0));
    }

    public void A02(Typeface typeface) {
        if (this instanceof C36821mw) {
            C36821mw r2 = (C36821mw) this;
            AnonymousClass1Dg r1 = r2.A02;
            r1.A00 = Typeface.create(typeface, r1.A07);
            r1.A03(r2.A00, typeface);
            r1.A01 = true;
            r2.A01.A02(typeface);
        } else if (!(this instanceof C36751mo)) {
            Chip chip = ((C36741mn) this).A00;
            chip.setText(chip.getText());
            chip.requestLayout();
            chip.invalidate();
        } else {
            C36761mp r12 = ((C36751mo) this).A00;
            r12.A0m = true;
            r12.A04();
            r12.invalidateSelf();
        }
    }

    public final void A03(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new RunnableEBaseShape1S0200000_I0_0(this, typeface, 1));
    }
}
