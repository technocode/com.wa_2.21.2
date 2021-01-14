package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar$Tab;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.material.tabs.TabLayout;
import com.google.android.search.verification.client.R;

/* renamed from: X.1E5  reason: invalid class name */
public class AnonymousClass1E5 extends LinearLayout {
    public int A00 = 2;
    public Drawable A01;
    public ImageView A02;
    public TextView A03;
    public AnonymousClass1E4 A04;
    public final /* synthetic */ TabLayout A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1E5(TabLayout tabLayout, Context context) {
        super(context);
        C14940n8 r1;
        this.A05 = tabLayout;
        A01(context);
        int i = tabLayout.A0A;
        int i2 = tabLayout.A0B;
        int i3 = tabLayout.A09;
        int i4 = tabLayout.A08;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 17) {
            setPaddingRelative(i, i2, i3, i4);
        } else {
            setPadding(i, i2, i3, i4);
        }
        setGravity(17);
        setOrientation(!tabLayout.A0R ? 1 : 0);
        setClickable(true);
        Context context2 = getContext();
        if (i5 >= 24) {
            r1 = new C14940n8(PointerIcon.getSystemIcon(context2, 1002));
        } else {
            r1 = new C14940n8(null);
        }
        if (i5 >= 24) {
            setPointerIcon((PointerIcon) r1.A00);
        }
    }

    public final void A00() {
        AnonymousClass1E4 r4 = this.A04;
        boolean z = false;
        if (this.A02 == null) {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
            addView(imageView, 0);
            this.A02 = imageView;
        }
        if (this.A03 == null) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
            addView(textView);
            this.A03 = textView;
            this.A00 = textView.getMaxLines();
        }
        TextView textView2 = this.A03;
        TabLayout tabLayout = this.A05;
        AnonymousClass0N2.A1K(textView2, tabLayout.A0C);
        ColorStateList colorStateList = tabLayout.A0G;
        if (colorStateList != null) {
            this.A03.setTextColor(colorStateList);
        }
        A02(this.A03, this.A02);
        if (r4 != null) {
            if (!TextUtils.isEmpty(r4.A03)) {
                setContentDescription(r4.A03);
            }
            TabLayout tabLayout2 = r4.A02;
            if (tabLayout2 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (tabLayout2.getSelectedTabPosition() == r4.A00) {
                z = true;
            }
        }
        setSelected(z);
    }

    public final void A01(Context context) {
        TabLayout tabLayout = this.A05;
        int i = tabLayout.A0Y;
        GradientDrawable gradientDrawable = null;
        if (i != 0) {
            Drawable A012 = AnonymousClass05p.A01(context, i);
            this.A01 = A012;
            if (A012 != null && A012.isStateful()) {
                this.A01.setState(getDrawableState());
            }
        } else {
            this.A01 = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        RippleDrawable rippleDrawable = gradientDrawable2;
        if (tabLayout.A0F != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList A013 = C08220af.A01(tabLayout.A0F);
            if (Build.VERSION.SDK_INT >= 21) {
                boolean z = tabLayout.A0U;
                GradientDrawable gradientDrawable4 = gradientDrawable2;
                if (z) {
                    gradientDrawable4 = null;
                }
                if (!z) {
                    gradientDrawable = gradientDrawable3;
                }
                rippleDrawable = new RippleDrawable(A013, gradientDrawable4, gradientDrawable);
            } else {
                Drawable A0d = C002001d.A0d(gradientDrawable3);
                C002001d.A2b(A0d, A013);
                rippleDrawable = new LayerDrawable(new Drawable[]{gradientDrawable2, A0d});
            }
        }
        setBackground(rippleDrawable);
        tabLayout.invalidate();
    }

    public final void A02(TextView textView, ImageView imageView) {
        CharSequence charSequence;
        CharSequence charSequence2;
        int i;
        AnonymousClass1E4 r0 = this.A04;
        CharSequence charSequence3 = null;
        if (r0 != null) {
            charSequence = r0.A04;
        } else {
            charSequence = null;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean z = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                setVisibility(0);
            } else {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (!z || imageView.getVisibility() != 0) {
                i = 0;
            } else {
                i = this.A05.A01(8);
            }
            if (this.A05.A0R) {
                if (i != AnonymousClass0N2.A0B(marginLayoutParams)) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        marginLayoutParams.setMarginEnd(i);
                    } else {
                        marginLayoutParams.rightMargin = i;
                    }
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (i != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i;
                if (Build.VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginEnd(0);
                } else {
                    marginLayoutParams.rightMargin = 0;
                }
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        AnonymousClass1E4 r02 = this.A04;
        if (r02 != null) {
            charSequence2 = r02.A03;
        } else {
            charSequence2 = null;
        }
        if (!z) {
            charSequence3 = charSequence2;
        }
        AnonymousClass0N2.A19(this, charSequence3);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A01;
        if (drawable != null && drawable.isStateful() && (false || this.A01.setState(drawableState))) {
            invalidate();
            this.A05.invalidate();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ActionBar$Tab.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ActionBar$Tab.class.getName());
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.A05;
        int i3 = tabLayout.A07;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        super.onMeasure(i, i2);
        if (this.A03 != null) {
            float f = tabLayout.A01;
            int i4 = this.A00;
            ImageView imageView = this.A02;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.A03;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.A00;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.A03.getTextSize();
            int lineCount = this.A03.getLineCount();
            int maxLines = this.A03.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i4 != maxLines)) {
                if (tabLayout.A03 == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.A03.getLayout();
                    if (layout != null) {
                        if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.A03.setTextSize(0, f);
                this.A03.setMaxLines(i4);
                super.onMeasure(i, i2);
            }
        }
    }

    public boolean performClick() {
        boolean performClick = super.performClick();
        if (this.A04 == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.A04.A00();
        return true;
    }

    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.A03;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.A02;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }
}
