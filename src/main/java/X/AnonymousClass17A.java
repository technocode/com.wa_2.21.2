package X;

import android.util.Pair;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.17A  reason: invalid class name */
public abstract class AnonymousClass17A {
    public void A00(AnonymousClass179 r4) {
        BasePendingResult basePendingResult = (BasePendingResult) this;
        C001801b.A1a(true, "Callback cannot be null.");
        synchronized (basePendingResult.A07) {
            if (basePendingResult.A09()) {
                r4.AEP(basePendingResult.A02);
            } else {
                basePendingResult.A09.add(r4);
            }
        }
    }

    public void A01(AnonymousClass17D r7) {
        BasePendingResult basePendingResult = (BasePendingResult) this;
        synchronized (basePendingResult.A07) {
            boolean z = false;
            if (!basePendingResult.A0C) {
                z = true;
            }
            C001801b.A1b(z, "Result has already been consumed.");
            C001801b.A1b(true, "Cannot set callbacks if then() has been called.");
            if (!basePendingResult.A03) {
                if (basePendingResult.A09()) {
                    HandlerC34731j7 r2 = basePendingResult.A06;
                    AnonymousClass17C A02 = basePendingResult.A02();
                    if (r2 != null) {
                        r2.sendMessage(r2.obtainMessage(1, new Pair(r7, A02)));
                    } else {
                        throw null;
                    }
                } else {
                    basePendingResult.A01 = r7;
                }
            }
        }
    }
}
