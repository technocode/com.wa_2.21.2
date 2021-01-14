package X;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$1;

/* renamed from: X.0SH  reason: invalid class name */
public final class AnonymousClass0SH {
    public final AnonymousClass0SI A00 = new AnonymousClass0SI();
    public final AbstractC005402n A01;

    public AnonymousClass0SH(AbstractC005402n r2) {
        this.A01 = r2;
    }

    public void A00(Bundle bundle) {
        AbstractC005402n r3 = this.A01;
        AbstractC013907w A75 = r3.A75();
        if (((C013807v) A75).A02 == EnumC014207z.INITIALIZED) {
            A75.A00(new Recreator(r3));
            AnonymousClass0SI r1 = this.A00;
            if (!r1.A04) {
                if (bundle != null) {
                    r1.A00 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                A75.A00(new SavedStateRegistry$1(r1));
                r1.A04 = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }
}
