package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I1_1;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Nh  reason: invalid class name */
public class AnonymousClass1Nh extends PopupWindow {
    public View A00;
    public AbstractC26941Ng A01;
    public int[] A02 = new int[2];
    public final int[][] A03;

    public AnonymousClass1Nh(C02590Cr r14, View view, int[] iArr) {
        super(new LinearLayout(view.getContext()), -2, -2);
        LinearLayout linearLayout = (LinearLayout) getContentView();
        linearLayout.setOrientation(0);
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.setFocusable(true);
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.emoji_picker_item);
        int dimensionPixelSize2 = (dimensionPixelSize - view.getContext().getResources().getDimensionPixelSize(R.dimen.emoji_picker_icon)) / 2;
        this.A03 = C28051Sr.A2E(iArr);
        int i = 0;
        while (true) {
            int[][] iArr2 = this.A03;
            if (i < iArr2.length) {
                int[] iArr3 = iArr2[i];
                ImageView imageView = new ImageView(view.getContext());
                imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                imageView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                imageView.setImageDrawable(r14.A02(view.getContext(), -1, new AnonymousClass2d1(iArr3), 0.75f));
                imageView.setTag(Integer.valueOf(i));
                imageView.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 30));
                imageView.setBackgroundResource(R.drawable.selector_orange_gradient);
                imageView.setContentDescription(C03960Il.A00(iArr3));
                linearLayout.addView(imageView);
                i++;
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                setTouchable(true);
                setFocusable(true);
                setOutsideTouchable(true);
                setInputMethodMode(2);
                setBackgroundDrawable(C002001d.A0b(view.getContext(), R.drawable.panel, R.color.skinTonePopupBackground));
                linearLayout.requestFocus();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return;
            }
        }
    }
}
