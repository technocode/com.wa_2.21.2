package X;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.1n9  reason: invalid class name and case insensitive filesystem */
public class C36921n9 implements AbstractC17490rd {
    public boolean A00;
    public final /* synthetic */ TabLayout A01;

    public C36921n9(TabLayout tabLayout) {
        this.A01 = tabLayout;
    }

    @Override // X.AbstractC17490rd
    public void ACb(ViewPager viewPager, AnonymousClass0YE r4, AnonymousClass0YE r5) {
        TabLayout tabLayout = this.A01;
        if (tabLayout.A0L == viewPager) {
            tabLayout.A0C(r5, this.A00);
        }
    }
}
