package X;

import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.2Nt  reason: invalid class name and case insensitive filesystem */
public class C48802Nt {
    public final int A00;
    public final View A01;
    public final View A02;

    public C48802Nt(View view, View view2, int i) {
        this.A02 = view;
        this.A01 = view2;
        this.A00 = i;
        if (Build.VERSION.SDK_INT >= 21) {
            view.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver$OnScrollChangedListenerC48772Nq(this));
        }
    }

    public void A00() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.A02.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC48782Nr(this));
        }
    }

    public final void A01() {
        if (this.A02.canScrollVertically(1)) {
            this.A01.setElevation((float) this.A00);
        } else {
            this.A01.setElevation(0.0f);
        }
    }

    public void A02(Context context, TextView textView, String str, ClickableSpan clickableSpan, int i) {
        SpannableString spannableString = new SpannableString(str);
        int length = str.length();
        spannableString.setSpan(clickableSpan, 0, length, 0);
        spannableString.setSpan(new TextAppearanceSpan(context, i), 0, length, 0);
        spannableString.setSpan(new C48792Ns(), 0, length, 0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }
}
