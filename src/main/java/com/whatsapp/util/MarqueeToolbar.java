package com.whatsapp.util;

import X.AnonymousClass01X;
import X.AnonymousClass0Q7;
import X.C08320at;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import java.lang.reflect.Field;

public class MarqueeToolbar extends Toolbar {
    public Runnable A00;
    public boolean A01 = false;
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();

    public MarqueeToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void A0J() {
        if (!this.A01) {
            try {
                Field declaredField = Toolbar.class.getDeclaredField("mTitleTextView");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                if (obj != null) {
                    if (!(obj instanceof TextView)) {
                        this.A01 = true;
                        return;
                    }
                    TextView textView = (TextView) obj;
                    textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                    textView.setMarqueeRepeatLimit(1);
                    textView.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(textView, 20));
                    AnonymousClass0Q7.A0d(textView, new C08320at());
                    if (this.A00 == null) {
                        RunnableEBaseShape4S0200000_I0_3 runnableEBaseShape4S0200000_I0_3 = new RunnableEBaseShape4S0200000_I0_3(this, textView, 12);
                        this.A00 = runnableEBaseShape4S0200000_I0_3;
                        postDelayed(runnableEBaseShape4S0200000_I0_3, 1000);
                    }
                }
            } catch (NoSuchFieldException e) {
                Log.e("util/marqueetoolbar", e);
                this.A01 = true;
            } catch (IllegalAccessException e2) {
                Log.e("util/marqueetoolbar", e2);
                this.A01 = true;
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.A00;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.A00 = null;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(int i) {
        super.setTitle(this.A02.A06(i));
        A0J();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        A0J();
    }
}
