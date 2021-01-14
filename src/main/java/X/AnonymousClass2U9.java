package X;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.2U9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2U9 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ MediaViewBaseFragment A00;

    public /* synthetic */ AnonymousClass2U9(MediaViewBaseFragment mediaViewBaseFragment) {
        this.A00 = mediaViewBaseFragment;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A00;
        Rect rect = new Rect();
        mediaViewBaseFragment.A00 = rect;
        rect.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        if (mediaViewBaseFragment.A09 != null) {
            for (int i = 0; i < mediaViewBaseFragment.A09.getChildCount(); i++) {
                mediaViewBaseFragment.A0y(mediaViewBaseFragment.A09.getChildAt(i));
            }
        }
        return windowInsets;
    }
}
