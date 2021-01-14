package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.search.verification.client.R;
import com.whatsapp.inappsupport.ui.FaqItemActivityV2;

/* renamed from: X.2Qu  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnPreDrawListenerC49522Qu implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FaqItemActivityV2 A01;

    public ViewTreeObserver$OnPreDrawListenerC49522Qu(FaqItemActivityV2 faqItemActivityV2, View view) {
        this.A01 = faqItemActivityV2;
        this.A00 = view;
    }

    public boolean onPreDraw() {
        View view = this.A00;
        int height = view.getHeight();
        View findViewById = this.A01.findViewById(R.id.faq_screen_content);
        findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), findViewById.getPaddingBottom() + height);
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
