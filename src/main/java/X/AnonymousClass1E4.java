package X;

import android.text.TextUtils;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.1E4  reason: invalid class name */
public class AnonymousClass1E4 {
    public int A00 = -1;
    public AnonymousClass1E5 A01;
    public TabLayout A02;
    public CharSequence A03;
    public CharSequence A04;

    public void A00() {
        TabLayout tabLayout = this.A02;
        if (tabLayout != null) {
            tabLayout.A0F(this, true);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public void A01(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.A03) && !TextUtils.isEmpty(charSequence)) {
            this.A01.setContentDescription(charSequence);
        }
        this.A04 = charSequence;
        AnonymousClass1E5 r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        }
    }
}
