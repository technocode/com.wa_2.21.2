package X;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.0Sb  reason: invalid class name and case insensitive filesystem */
public class C06170Sb {
    public static volatile C06170Sb A01;
    public final AnonymousClass03P A00;

    public C06170Sb(AnonymousClass03P r1) {
        this.A00 = r1;
    }

    public static C06170Sb A00() {
        if (A01 == null) {
            synchronized (AnonymousClass03P.class) {
                if (A01 == null) {
                    A01 = new C06170Sb(AnonymousClass03P.A00());
                }
            }
        }
        return A01;
    }

    public static boolean A01(View view) {
        Rect rect = new Rect();
        view.getRootView().getWindowVisibleDisplayFrame(rect);
        return ((float) (((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getHeight() - rect.bottom)) >= C002301g.A0K.A00 * 128.0f;
    }

    public void A02(View view) {
        InputMethodManager A0H = this.A00.A0H();
        if (A0H != null) {
            A0H.hideSoftInputFromWindow(view.getWindowToken(), 0);
            return;
        }
        throw null;
    }

    public void A03(View view) {
        InputMethodManager A0H = this.A00.A0H();
        if (A0H != null) {
            A0H.showSoftInput(view, 0);
            return;
        }
        throw null;
    }
}
