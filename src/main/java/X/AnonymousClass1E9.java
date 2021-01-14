package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1E9  reason: invalid class name */
public final class AnonymousClass1E9 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Animator A06;
    public Typeface A07;
    public FrameLayout A08;
    public LinearLayout A09;
    public TextView A0A;
    public TextView A0B;
    public CharSequence A0C;
    public CharSequence A0D;
    public boolean A0E;
    public boolean A0F;
    public final float A0G;
    public final Context A0H;
    public final TextInputLayout A0I;

    public AnonymousClass1E9(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.A0H = context;
        this.A0I = textInputLayout;
        this.A0G = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final TextView A00(int i) {
        if (i == 1) {
            return this.A0A;
        }
        if (i != 2) {
            return null;
        }
        return this.A0B;
    }

    public void A01() {
        TextInputLayout textInputLayout;
        EditText editText;
        LinearLayout linearLayout = this.A09;
        if (linearLayout != null && (editText = (textInputLayout = this.A0I).A0L) != null) {
            AnonymousClass0Q7.A0Z(linearLayout, AnonymousClass0Q7.A07(editText), 0, AnonymousClass0Q7.A06(textInputLayout.A0L), 0);
        }
    }

    public void A02() {
        this.A0C = null;
        Animator animator = this.A06;
        if (animator != null) {
            animator.cancel();
        }
        if (this.A00 == 1) {
            if (!this.A0F || TextUtils.isEmpty(this.A0D)) {
                this.A01 = 0;
            } else {
                this.A01 = 2;
            }
        }
        A03(this.A00, this.A01, A08(this.A0A, null));
    }

    public final void A03(int i, int i2, boolean z) {
        TextView A002;
        TextView A003;
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.A06 = animatorSet;
            ArrayList arrayList = new ArrayList();
            A06(arrayList, this.A0F, this.A0B, 2, i, i2);
            A06(arrayList, this.A0E, this.A0A, 1, i, i2);
            C008805h.A0q(animatorSet, arrayList);
            animatorSet.addListener(new AnonymousClass1E8(this, i2, A00(i), i, A00(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (!(i2 == 0 || (A003 = A00(i2)) == null)) {
                A003.setVisibility(0);
                A003.setAlpha(1.0f);
            }
            if (!(i == 0 || (A002 = A00(i)) == null)) {
                A002.setVisibility(4);
                if (i == 1) {
                    A002.setText((CharSequence) null);
                }
            }
            this.A00 = i2;
        }
        TextInputLayout textInputLayout = this.A0I;
        textInputLayout.A02();
        textInputLayout.A0F(z, false);
        textInputLayout.A03();
    }

    public void A04(TextView textView, int i) {
        if (this.A09 == null && this.A08 == null) {
            Context context = this.A0H;
            LinearLayout linearLayout = new LinearLayout(context);
            this.A09 = linearLayout;
            linearLayout.setOrientation(0);
            TextInputLayout textInputLayout = this.A0I;
            textInputLayout.addView(this.A09, -1, -2);
            FrameLayout frameLayout = new FrameLayout(context);
            this.A08 = frameLayout;
            this.A09.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.A09.addView(new C15590oK(context), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (textInputLayout.A0L != null) {
                A01();
            }
        }
        if (i == 0 || i == 1) {
            this.A08.setVisibility(0);
            this.A08.addView(textView);
            this.A02++;
        } else {
            this.A09.addView(textView, i);
        }
        this.A09.setVisibility(0);
        this.A05++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0009, code lost:
        if (r7 == 1) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.widget.TextView r6, int r7) {
        /*
            r5 = this;
            android.widget.LinearLayout r4 = r5.A09
            if (r4 != 0) goto L_0x0005
            return
        L_0x0005:
            r3 = 1
            if (r7 == 0) goto L_0x000b
            r0 = 0
            if (r7 != r3) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            r2 = 8
            if (r0 == 0) goto L_0x0030
            android.widget.FrameLayout r1 = r5.A08
            if (r1 == 0) goto L_0x0030
            int r0 = r5.A02
            int r0 = r0 - r3
            r5.A02 = r0
            if (r0 != 0) goto L_0x001e
            r1.setVisibility(r2)
        L_0x001e:
            android.widget.FrameLayout r0 = r5.A08
            r0.removeView(r6)
        L_0x0023:
            int r1 = r5.A05
            int r1 = r1 - r3
            r5.A05 = r1
            android.widget.LinearLayout r0 = r5.A09
            if (r1 != 0) goto L_0x002f
            r0.setVisibility(r2)
        L_0x002f:
            return
        L_0x0030:
            r4.removeView(r6)
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1E9.A05(android.widget.TextView, int):void");
    }

    public final void A06(List list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                boolean z2 = false;
                if (i3 == i) {
                    z2 = true;
                }
                float f = 0.0f;
                if (z2) {
                    f = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
                ofFloat.setDuration(167L);
                ofFloat.setInterpolator(C08060aP.A03);
                list.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.A0G, 0.0f);
                    ofFloat2.setDuration(217L);
                    ofFloat2.setInterpolator(C08060aP.A04);
                    list.add(ofFloat2);
                }
            }
        }
    }

    public boolean A07() {
        if (this.A01 != 1 || this.A0A == null || TextUtils.isEmpty(this.A0C)) {
            return false;
        }
        return true;
    }

    public final boolean A08(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.A0I;
        if (!AnonymousClass0Q7.A0j(textInputLayout) || !textInputLayout.isEnabled()) {
            return false;
        }
        return this.A01 != this.A00 || textView == null || !TextUtils.equals(textView.getText(), charSequence);
    }
}
