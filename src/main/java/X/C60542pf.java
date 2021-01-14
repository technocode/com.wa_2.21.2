package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2pf  reason: invalid class name and case insensitive filesystem */
public final class C60542pf extends AbstractC59872oQ {
    public int A00;
    public C49262Ps A01;
    public AnonymousClass0JW A02;
    public String A03;
    public final View A04;
    public final ViewGroup A05;
    public final ImageView A06;
    public final C000300f A07;
    public final AnonymousClass01X A08;
    public final AnonymousClass00Y A09;
    public final AnonymousClass0Eg A0A;
    public final AbstractC49292Px A0B;
    public final AnonymousClass2Q2 A0C;

    public C60542pf(AnonymousClass0Eg r5, AnonymousClass00Y r6, C000300f r7, AnonymousClass03P r8, AnonymousClass01X r9, AnonymousClass022 r10, ViewGroup viewGroup, AbstractC49292Px r12, int i) {
        super(viewGroup);
        this.A0A = r5;
        this.A09 = r6;
        this.A07 = r7;
        this.A08 = r9;
        this.A0B = r12;
        View view = this.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
        this.A06 = (ImageView) view.findViewById(R.id.thumb_view);
        this.A04 = view.findViewById(R.id.loading_progress);
        this.A05 = (ViewGroup) view.findViewById(R.id.video_preview_container);
        if (C002001d.A0A(r10, r8) >= 2012) {
            AnonymousClass2Q2 r0 = new AnonymousClass2Q2(view.getContext());
            this.A0C = r0;
            this.A05.addView(r0.A02, new FrameLayout.LayoutParams(-1, -1));
            this.A05.setVisibility(0);
        }
    }
}
