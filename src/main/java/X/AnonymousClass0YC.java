package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CameraHomeFragment;
import com.whatsapp.HomeActivity;

/* renamed from: X.0YC  reason: invalid class name */
public class AnonymousClass0YC extends AnonymousClass0YD implements AnonymousClass0YF {
    public final int A00;
    public final AnonymousClass0YG[] A01;
    public final /* synthetic */ HomeActivity A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0YC(HomeActivity homeActivity, AnonymousClass0LW r3) {
        super(r3);
        this.A02 = homeActivity;
        int size = HomeActivity.A1v.size();
        this.A00 = size;
        this.A01 = new AnonymousClass0YG[size];
    }

    @Override // X.AnonymousClass0YD, X.AnonymousClass0YE
    public Object A05(ViewGroup viewGroup, int i) {
        AnonymousClass037 r3 = (AnonymousClass037) super.A05(viewGroup, i);
        HomeActivity homeActivity = this.A02;
        if (homeActivity.A0U(i) == 100) {
            homeActivity.A0K = (CameraHomeFragment) r3;
        }
        return r3;
    }

    public final AnonymousClass0YG A0G(int i) {
        AnonymousClass0YG[] r6 = this.A01;
        if (r6[i] == null) {
            AnonymousClass0YG r5 = new AnonymousClass0YG();
            HomeActivity homeActivity = this.A02;
            View inflate = homeActivity.getLayoutInflater().inflate(R.layout.home_tab, (ViewGroup) null, false);
            r5.A01 = inflate;
            TextView textView = (TextView) inflate.findViewById(R.id.tab);
            r5.A04 = textView;
            textView.setText(A04(i));
            r5.A03 = (TextView) r5.A01.findViewById(R.id.badge);
            ImageView imageView = (ImageView) r5.A01.findViewById(R.id.icon);
            r5.A02 = imageView;
            AnonymousClass0N2.A1E(imageView, C004302a.A02(homeActivity, R.color.selector_home_tab_color));
            AnonymousClass01X r3 = ((AnonymousClass2C0) homeActivity).A01;
            if (i == HomeActivity.A04(r3, 100)) {
                r5.A02.setVisibility(0);
                r5.A02.setImageDrawable(C004302a.A03(homeActivity, R.drawable.ic_home_camera).mutate());
                r5.A02.setContentDescription(r3.A06(R.string.camera_button_description));
            } else if (i == HomeActivity.A04(r3, 300)) {
                r5.A02.setImageDrawable(C004302a.A03(homeActivity, R.drawable.new_status_indicator).mutate());
                AnonymousClass0SE.A06(r3, r5.A02, (int) (C002301g.A0K.A00 * 4.5f), 0);
            }
            r6[i] = r5;
        }
        return r6[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2.A0U(r5) == 500) goto L_0x0015;
     */
    @Override // X.AnonymousClass0YF
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A7v(int r5) {
        /*
            r4 = this;
            com.whatsapp.HomeActivity r2 = r4.A02
            com.whatsapp.PagerSlidingTabStrip r3 = r2.A0O
            int r1 = r2.A0U(r5)
            r0 = 100
            if (r1 == r0) goto L_0x0015
            int r2 = r2.A0U(r5)
            r1 = 500(0x1f4, float:7.0E-43)
            r0 = 1
            if (r2 != r1) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r3.setShouldExpand(r0)
            X.0YG r0 = r4.A0G(r5)
            android.view.View r0 = r0.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YC.A7v(int):android.view.View");
    }
}
