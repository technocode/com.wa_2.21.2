package androidx.lifecycle;

import X.AbstractC005102k;
import X.AbstractC013907w;
import X.AnonymousClass082;
import X.AnonymousClass0SD;
import X.AnonymousClass0SI;
import X.AnonymousClass0SK;
import X.C013807v;
import X.C15610oN;
import X.EnumC014207z;
import java.util.Map;

public final class SavedStateHandleController implements AnonymousClass0SK {
    public boolean A00 = false;
    public final C15610oN A01;
    public final String A02;

    public SavedStateHandleController(String str, C15610oN r3) {
        this.A02 = str;
        this.A01 = r3;
    }

    public static void A00(AnonymousClass0SD r2, AnonymousClass0SI r3, AbstractC013907w r4) {
        Object obj;
        Map map = r2.A00;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = map.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !savedStateHandleController.A00) {
            savedStateHandleController.A02(r3, r4);
            A01(r3, r4);
        }
    }

    public static void A01(final AnonymousClass0SI r2, final AbstractC013907w r3) {
        EnumC014207z r1 = ((C013807v) r3).A02;
        if (r1 == EnumC014207z.INITIALIZED || r1.compareTo((Enum) EnumC014207z.STARTED) >= 0) {
            r2.A01();
        } else {
            r3.A00(new AnonymousClass0SK() {
                /* class androidx.lifecycle.SavedStateHandleController.AnonymousClass1 */

                @Override // X.AnonymousClass0SK
                public void AKQ(AbstractC005102k r2, AnonymousClass082 r3) {
                    if (r3 == AnonymousClass082.ON_START) {
                        ((C013807v) AbstractC013907w.this).A01.A01(this);
                        r2.A01();
                    }
                }
            });
        }
    }

    public void A02(AnonymousClass0SI r4, AbstractC013907w r5) {
        if (!this.A00) {
            this.A00 = true;
            r5.A00(this);
            if (r4.A01.A02(this.A02, this.A01.A00) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    @Override // X.AnonymousClass0SK
    public void AKQ(AbstractC005102k r2, AnonymousClass082 r3) {
        if (r3 == AnonymousClass082.ON_DESTROY) {
            this.A00 = false;
            ((C013807v) r2.A75()).A01.A01(this);
        }
    }
}
