package X;

import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.0a4  reason: invalid class name and case insensitive filesystem */
public final class C07900a4 extends AbstractC06760Up {
    public C07900a4() {
        super(R.id.tag_screen_reader_focusable);
    }

    @Override // X.AbstractC06760Up
    public Object A01(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }

    @Override // X.AbstractC06760Up
    public void A02(View view, Object obj) {
        view.setScreenReaderFocusable(((Boolean) obj).booleanValue());
    }
}
