package androidx.activity;

import X.AbstractC005102k;
import X.AnonymousClass082;
import X.AnonymousClass0SK;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

public final class ImmLeaksCleaner implements AnonymousClass0SK {
    public static int A01;
    public static Field A02;
    public static Field A03;
    public static Field A04;
    public Activity A00;

    public ImmLeaksCleaner(Activity activity) {
        this.A00 = activity;
    }

    @Override // X.AnonymousClass0SK
    public void AKQ(AbstractC005102k r5, AnonymousClass082 r6) {
        if (r6 == AnonymousClass082.ON_DESTROY) {
            if (A01 == 0) {
                try {
                    A01 = 2;
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    A04 = declaredField;
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    A03 = declaredField2;
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    A02 = declaredField3;
                    declaredField3.setAccessible(true);
                    A01 = 1;
                } catch (NoSuchFieldException unused) {
                }
            }
            if (A01 == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.A00.getSystemService("input_method");
                try {
                    Object obj = A02.get(inputMethodManager);
                    if (obj != null) {
                        synchronized (obj) {
                            try {
                                View view = (View) A04.get(inputMethodManager);
                                if (view != null) {
                                    if (!view.isAttachedToWindow()) {
                                        try {
                                            A03.set(inputMethodManager, null);
                                            inputMethodManager.isActive();
                                        } catch (IllegalAccessException unused2) {
                                        }
                                    }
                                }
                            } catch (IllegalAccessException unused3) {
                            } catch (ClassCastException unused4) {
                            }
                        }
                    }
                } catch (IllegalAccessException unused5) {
                }
            }
        }
    }
}
