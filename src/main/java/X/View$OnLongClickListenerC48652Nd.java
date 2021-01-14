package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Nd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnLongClickListenerC48652Nd implements View.OnLongClickListener {
    public final /* synthetic */ C53462dJ A00;

    public /* synthetic */ View$OnLongClickListenerC48652Nd(C53462dJ r1) {
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        C53462dJ r4 = this.A00;
        C02590Cr r2 = r4.A04;
        ImageView imageView = r4.A02;
        AnonymousClass1Nh r7 = new AnonymousClass1Nh(r2, imageView, r4.A01.A00);
        r7.A01 = new AnonymousClass2dA(r4);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        View rootView = r4.A03.getRootView();
        int[] iArr2 = new int[2];
        rootView.getRootView().getLocationOnScreen(iArr2);
        r7.showAtLocation(rootView, 51, ((imageView.getMeasuredWidth() / 2) + (iArr[0] - Math.max(0, iArr2[0]))) - (r7.getContentView().getMeasuredWidth() / 2), ((iArr[1] - Math.max(0, iArr2[1])) - r7.getContentView().getMeasuredHeight()) - imageView.getContext().getResources().getDimensionPixelSize(R.dimen.skin_emoji_popup_offset));
        return true;
    }
}
