package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.0S2  reason: invalid class name */
public abstract class AnonymousClass0S2 {
    public float A00() {
        if (this instanceof AnonymousClass0TA) {
            return AnonymousClass0Q7.A00(((AnonymousClass0TA) this).A08);
        }
        if (!(this instanceof AnonymousClass0TC)) {
            return 0.0f;
        }
        return AnonymousClass0Q7.A00(((AnonymousClass0TC) this).A01.A9m());
    }

    public Context A01() {
        if (this instanceof AnonymousClass0TA) {
            AnonymousClass0TA r4 = (AnonymousClass0TA) this;
            Context context = r4.A02;
            if (context != null) {
                return context;
            }
            TypedValue typedValue = new TypedValue();
            r4.A01.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(r4.A01, i);
                r4.A02 = contextThemeWrapper;
                return contextThemeWrapper;
            }
            Context context2 = r4.A01;
            r4.A02 = context2;
            return context2;
        } else if (!(this instanceof AnonymousClass0TC)) {
            return null;
        } else {
            return ((AnonymousClass0TC) this).A01.getContext();
        }
    }

    public void A02(float f) {
        if (this instanceof AnonymousClass0TA) {
            AnonymousClass0Q7.A0Q(((AnonymousClass0TA) this).A08, f);
        } else if (this instanceof AnonymousClass0TC) {
            AnonymousClass0Q7.A0Q(((AnonymousClass0TC) this).A01.A9m(), f);
        } else if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public void A03(Drawable drawable) {
        if (!(this instanceof AnonymousClass0TA)) {
            ((AnonymousClass0TC) this).A01.ANx(drawable);
        } else {
            ((AnonymousClass0TA) this).A08.setPrimaryBackground(drawable);
        }
    }

    public void A04(Drawable drawable) {
        if (this instanceof AnonymousClass0TA) {
            ((AnonymousClass0TA) this).A0B.AOd(drawable);
        } else if (this instanceof AnonymousClass0TC) {
            ((AnonymousClass0TC) this).A01.AOd(drawable);
        }
    }

    public void A05(View view) {
        if (!(this instanceof AnonymousClass0TA)) {
            A06(view, new AnonymousClass0S5(-2, -2));
        } else {
            ((AnonymousClass0TA) this).A0B.AOA(view);
        }
    }

    public void A06(View view, AnonymousClass0S5 r3) {
        if (!(this instanceof AnonymousClass0TA)) {
            AnonymousClass0TC r0 = (AnonymousClass0TC) this;
            if (view != null) {
                view.setLayoutParams(r3);
            }
            r0.A01.AOA(view);
            return;
        }
        view.setLayoutParams(r3);
        ((AnonymousClass0TA) this).A0B.AOA(view);
    }

    public void A07(CharSequence charSequence) {
        if (!(this instanceof AnonymousClass0TA)) {
            ((AnonymousClass0TC) this).A01.AP7(charSequence);
        } else {
            ((AnonymousClass0TA) this).A0B.AP7(charSequence);
        }
    }

    public void A08(CharSequence charSequence) {
        if (!(this instanceof AnonymousClass0TA)) {
            ((AnonymousClass0TC) this).A01.APC(charSequence);
        } else {
            ((AnonymousClass0TA) this).A0B.APC(charSequence);
        }
    }

    public void A09(boolean z) {
        if (this instanceof AnonymousClass0TA) {
            AnonymousClass0TA r1 = (AnonymousClass0TA) this;
            if (z != r1.A0J) {
                r1.A0J = z;
                ArrayList arrayList = r1.A0C;
                if (0 < arrayList.size()) {
                    arrayList.get(0);
                    throw null;
                }
            }
        } else if (this instanceof AnonymousClass0TC) {
            AnonymousClass0TC r12 = (AnonymousClass0TC) this;
            if (z != r12.A03) {
                r12.A03 = z;
                ArrayList arrayList2 = r12.A02;
                if (0 < arrayList2.size()) {
                    arrayList2.get(0);
                    throw null;
                }
            }
        }
    }

    public void A0A(boolean z) {
        if (!(this instanceof AnonymousClass0TA)) {
            AnonymousClass0TC r2 = (AnonymousClass0TC) this;
            int i = 0;
            if (z) {
                i = 4;
            }
            r2.A0F(i, 4);
            return;
        }
        AnonymousClass0TA r22 = (AnonymousClass0TA) this;
        int i2 = 0;
        if (z) {
            i2 = 4;
        }
        r22.A0F(i2, 4);
    }

    public void A0B(boolean z) {
        if (!(this instanceof AnonymousClass0TA)) {
            AnonymousClass0TC r2 = (AnonymousClass0TC) this;
            int i = 0;
            if (z) {
                i = 16;
            }
            r2.A0F(i, 16);
            return;
        }
        AnonymousClass0TA r22 = (AnonymousClass0TA) this;
        int i2 = 0;
        if (z) {
            i2 = 16;
        }
        r22.A0F(i2, 16);
    }

    public void A0C(boolean z) {
        if (!(this instanceof AnonymousClass0TA)) {
            AnonymousClass0TC r2 = (AnonymousClass0TC) this;
            int i = 0;
            if (z) {
                i = 2;
            }
            r2.A0F(i, 2);
            return;
        }
        AnonymousClass0TA r22 = (AnonymousClass0TA) this;
        int i2 = 0;
        if (z) {
            i2 = 2;
        }
        r22.A0F(i2, 2);
    }

    public void A0D(boolean z) {
        if (!(this instanceof AnonymousClass0TA)) {
            AnonymousClass0TC r2 = (AnonymousClass0TC) this;
            int i = 0;
            if (z) {
                i = 8;
            }
            r2.A0F(i, 8);
            return;
        }
        AnonymousClass0TA r22 = (AnonymousClass0TA) this;
        int i2 = 0;
        if (z) {
            i2 = 8;
        }
        r22.A0F(i2, 8);
    }

    public void A0E(boolean z) {
        C12960jN r0;
        if (this instanceof AnonymousClass0TA) {
            AnonymousClass0TA r02 = (AnonymousClass0TA) this;
            r02.A0L = z;
            if (!z && (r0 = r02.A07) != null) {
                r0.A00();
            }
        }
    }
}
