package X;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.2H5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2H5 implements View.OnApplyWindowInsetsListener {
    public static final /* synthetic */ AnonymousClass2H5 A00 = new AnonymousClass2H5();

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        new Rect().set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets;
    }
}
