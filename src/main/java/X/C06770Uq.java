package X;

import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Uq  reason: invalid class name and case insensitive filesystem */
public final class C06770Uq extends AbstractC06760Up {
    public C06770Uq() {
        super(R.id.tag_accessibility_heading);
    }

    @Override // X.AbstractC06760Up
    public Object A01(View view) {
        return Boolean.valueOf(view.isAccessibilityHeading());
    }

    @Override // X.AbstractC06760Up
    public void A02(View view, Object obj) {
        view.setAccessibilityHeading(((Boolean) obj).booleanValue());
    }
}
