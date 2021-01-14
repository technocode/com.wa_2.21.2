package com.google.android.material.textfield;

import X.AbstractC06520Tq;
import X.AbstractC06530Tr;
import X.AbstractC15200nf;
import X.AnonymousClass05p;
import X.AnonymousClass0N2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0TL;
import X.AnonymousClass0WQ;
import X.AnonymousClass1E7;
import X.AnonymousClass1E9;
import X.AnonymousClass1EA;
import X.AnonymousClass1EB;
import X.C002001d;
import X.C004302a;
import X.C008805h;
import X.C05560Pe;
import X.C06340Sv;
import X.C06510Tp;
import X.C07920a6;
import X.C08030aM;
import X.C08040aN;
import X.C08060aP;
import X.C24821Dd;
import X.C24831De;
import X.C36951nC;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.search.verification.client.R;
import java.lang.reflect.Method;

public class TextInputLayout extends LinearLayout {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public ValueAnimator A0A;
    public ColorStateList A0B;
    public ColorStateList A0C;
    public ColorStateList A0D;
    public PorterDuff.Mode A0E;
    public Typeface A0F;
    public Drawable A0G;
    public Drawable A0H;
    public Drawable A0I;
    public Drawable A0J;
    public GradientDrawable A0K;
    public EditText A0L;
    public TextView A0M;
    public CheckableImageButton A0N;
    public CharSequence A0O;
    public CharSequence A0P;
    public CharSequence A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final int A0e;
    public final int A0f;
    public final int A0g;
    public final int A0h;
    public final int A0i;
    public final int A0j;
    public final int A0k;
    public final int A0l;
    public final int A0m;
    public final int A0n;
    public final Rect A0o = new Rect();
    public final RectF A0p = new RectF();
    public final FrameLayout A0q;
    public final C24821Dd A0r = new C24821Dd(this);
    public final AnonymousClass1E9 A0s = new AnonymousClass1E9(this);

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textInputStyle);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.A0q = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(this.A0q);
        C24821Dd r2 = this.A0r;
        TimeInterpolator timeInterpolator = C08060aP.A03;
        r2.A0O = timeInterpolator;
        r2.A07();
        C24821Dd r22 = this.A0r;
        r22.A0N = timeInterpolator;
        r22.A07();
        C24821Dd r4 = this.A0r;
        if (r4.A0K != 8388659) {
            r4.A0K = 8388659;
            r4.A07();
        }
        int[] iArr = C08030aM.A0x;
        C08040aN.A01(context, attributeSet, R.attr.textInputStyle, 2131952412);
        C08040aN.A02(context, attributeSet, iArr, R.attr.textInputStyle, 2131952412, new int[0]);
        AnonymousClass0TL r10 = new AnonymousClass0TL(context, context.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, 2131952412));
        TypedArray typedArray = r10.A02;
        this.A0X = typedArray.getBoolean(21, true);
        setHint(typedArray.getText(1));
        this.A0W = typedArray.getBoolean(20, true);
        this.A0e = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_bottom_offset);
        this.A0g = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.A0f = typedArray.getDimensionPixelOffset(4, 0);
        this.A03 = typedArray.getDimension(8, 0.0f);
        this.A02 = typedArray.getDimension(7, 0.0f);
        this.A00 = typedArray.getDimension(5, 0.0f);
        this.A01 = typedArray.getDimension(6, 0.0f);
        this.A04 = typedArray.getColor(2, 0);
        this.A09 = typedArray.getColor(9, 0);
        this.A0h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default);
        this.A0i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused);
        this.A07 = this.A0h;
        setBoxBackgroundMode(typedArray.getInt(3, 0));
        if (typedArray.hasValue(0)) {
            ColorStateList A012 = r10.A01(0);
            this.A0C = A012;
            this.A0B = A012;
        }
        this.A0l = C004302a.A00(context, R.color.mtrl_textinput_default_box_stroke_color);
        this.A0m = C004302a.A00(context, R.color.mtrl_textinput_disabled_color);
        this.A0n = C004302a.A00(context, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (typedArray.getResourceId(22, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(22, 0));
        }
        int resourceId = typedArray.getResourceId(16, 0);
        boolean z = typedArray.getBoolean(15, false);
        int resourceId2 = typedArray.getResourceId(19, 0);
        boolean z2 = typedArray.getBoolean(18, false);
        CharSequence text = typedArray.getText(17);
        boolean z3 = typedArray.getBoolean(11, false);
        setCounterMaxLength(typedArray.getInt(12, -1));
        this.A0k = typedArray.getResourceId(14, 0);
        this.A0j = typedArray.getResourceId(13, 0);
        this.A0b = typedArray.getBoolean(25, false);
        this.A0I = r10.A02(24);
        this.A0Q = typedArray.getText(23);
        if (typedArray.hasValue(26)) {
            this.A0T = true;
            this.A0D = r10.A01(26);
        }
        if (typedArray.hasValue(27)) {
            this.A0U = true;
            this.A0E = C008805h.A0A(typedArray.getInt(27, -1), null);
        }
        typedArray.recycle();
        setHelperTextEnabled(z2);
        setHelperText(text);
        setHelperTextTextAppearance(resourceId2);
        setErrorEnabled(z);
        setErrorTextAppearance(resourceId);
        setCounterEnabled(z3);
        A05();
        AnonymousClass0Q7.A0W(this, 2);
    }

    public static void A00(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                A00((ViewGroup) childAt, z);
            }
        }
    }

    public final int A01() {
        float f;
        if (!this.A0X) {
            return 0;
        }
        int i = this.A05;
        if (i == 0 || i == 1) {
            f = this.A0r.A03();
        } else if (i != 2) {
            return 0;
        } else {
            f = this.A0r.A03() / 2.0f;
        }
        return (int) f;
    }

    public void A02() {
        Drawable background;
        Drawable background2;
        TextView textView;
        int i;
        EditText editText = this.A0L;
        if (editText != null && (background = editText.getBackground()) != null) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 == 21 || i2 == 22) && (background2 = this.A0L.getBackground()) != null && !this.A0V) {
                Drawable newDrawable = background2.getConstantState().newDrawable();
                if (background2 instanceof DrawableContainer) {
                    Drawable.ConstantState constantState = newDrawable.getConstantState();
                    boolean z = false;
                    if (!C008805h.A04) {
                        try {
                            Method declaredMethod = DrawableContainer.class.getDeclaredMethod("setConstantState", DrawableContainer.DrawableContainerState.class);
                            C008805h.A03 = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                            Log.e("DrawableUtils", "Could not fetch setConstantState(). Oh well.");
                        }
                        C008805h.A04 = true;
                    }
                    Method method = C008805h.A03;
                    if (method != null) {
                        try {
                            method.invoke(background2, constantState);
                            z = true;
                        } catch (Exception unused2) {
                            Log.e("DrawableUtils", "Could not invoke setConstantState(). Oh well.");
                        }
                    }
                    this.A0V = z;
                }
                if (!this.A0V) {
                    this.A0L.setBackground(newDrawable);
                    this.A0V = true;
                    A06();
                }
            }
            if (AnonymousClass0WQ.A03(background)) {
                background = background.mutate();
            }
            AnonymousClass1E9 r1 = this.A0s;
            if (r1.A07()) {
                TextView textView2 = r1.A0A;
                if (textView2 != null) {
                    i = textView2.getCurrentTextColor();
                } else {
                    i = -1;
                }
                background.setColorFilter(C06340Sv.A00(i, PorterDuff.Mode.SRC_IN));
            } else if (!this.A0S || (textView = this.A0M) == null) {
                C002001d.A2W(background);
                this.A0L.refreshDrawableState();
            } else {
                background.setColorFilter(C06340Sv.A00(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r2 == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r0.hasFocus() == false) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A03():void");
    }

    public final void A04() {
        int i;
        Drawable drawable;
        if (this.A0K != null) {
            int i2 = this.A05;
            if (i2 == 1) {
                this.A07 = 0;
            } else if (i2 == 2 && this.A09 == 0) {
                this.A09 = this.A0C.getColorForState(getDrawableState(), this.A0C.getDefaultColor());
            }
            EditText editText = this.A0L;
            if (editText != null && this.A05 == 2) {
                if (editText.getBackground() != null) {
                    this.A0G = this.A0L.getBackground();
                }
                this.A0L.setBackground(null);
            }
            EditText editText2 = this.A0L;
            if (!(editText2 == null || this.A05 != 1 || (drawable = this.A0G) == null)) {
                editText2.setBackground(drawable);
            }
            int i3 = this.A07;
            if (i3 > -1 && (i = this.A06) != 0) {
                this.A0K.setStroke(i3, i);
            }
            this.A0K.setCornerRadii(getCornerRadiiAsArray());
            this.A0K.setColor(this.A04);
            invalidate();
        }
    }

    public final void A05() {
        Drawable drawable;
        Drawable drawable2 = this.A0I;
        if (drawable2 == null) {
            return;
        }
        if (this.A0T || this.A0U) {
            Drawable mutate = C002001d.A0d(drawable2).mutate();
            this.A0I = mutate;
            if (this.A0T) {
                C002001d.A2b(mutate, this.A0D);
            }
            if (this.A0U) {
                C002001d.A2c(this.A0I, this.A0E);
            }
            CheckableImageButton checkableImageButton = this.A0N;
            if (checkableImageButton != null && checkableImageButton.getDrawable() != (drawable = this.A0I)) {
                this.A0N.setImageDrawable(drawable);
            }
        }
    }

    public final void A06() {
        int i = this.A05;
        if (i == 0) {
            this.A0K = null;
        } else if (i == 2 && this.A0X && !(this.A0K instanceof AnonymousClass1E7)) {
            this.A0K = new AnonymousClass1E7();
        } else if (this.A0K == null) {
            this.A0K = new GradientDrawable();
        }
        if (this.A05 != 0) {
            A08();
        }
        A0A();
    }

    public final void A07() {
        AbstractC06520Tq r1;
        float A022;
        float f;
        if (A0G()) {
            RectF rectF = this.A0p;
            C24821Dd r4 = this.A0r;
            CharSequence charSequence = r4.A0W;
            if (AnonymousClass0Q7.A05(r4.A0i) == 1) {
                r1 = C06510Tp.A02;
            } else {
                r1 = C06510Tp.A01;
            }
            boolean A002 = ((AbstractC06530Tr) r1).A00(charSequence, charSequence.length());
            Rect rect = r4.A0d;
            if (!A002) {
                A022 = (float) rect.left;
            } else {
                A022 = ((float) rect.right) - r4.A02();
            }
            rectF.left = A022;
            rectF.top = (float) rect.top;
            if (!A002) {
                f = r4.A02() + A022;
            } else {
                f = (float) rect.right;
            }
            rectF.right = f;
            float A032 = r4.A03() + ((float) rect.top);
            rectF.bottom = A032;
            float f2 = rectF.left;
            float f3 = (float) this.A0g;
            float f4 = f2 - f3;
            rectF.left = f4;
            float f5 = rectF.top - f3;
            rectF.top = f5;
            float f6 = rectF.right + f3;
            rectF.right = f6;
            float f7 = A032 + f3;
            rectF.bottom = f7;
            AnonymousClass1E7 r0 = (AnonymousClass1E7) this.A0K;
            if (r0 != null) {
                r0.A00(f4, f5, f6, f7);
                return;
            }
            throw null;
        }
    }

    public final void A08() {
        FrameLayout frameLayout = this.A0q;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
        int A012 = A01();
        if (A012 != layoutParams.topMargin) {
            layoutParams.topMargin = A012;
            frameLayout.requestLayout();
        }
    }

    public final void A09() {
        boolean z;
        EditText editText = this.A0L;
        if (editText != null) {
            if (!this.A0b || ((editText == null || !(editText.getTransformationMethod() instanceof PasswordTransformationMethod)) && !this.A0c)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.A0N == null) {
                    LayoutInflater from = LayoutInflater.from(getContext());
                    FrameLayout frameLayout = this.A0q;
                    CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(R.layout.design_text_input_password_icon, (ViewGroup) frameLayout, false);
                    this.A0N = checkableImageButton;
                    checkableImageButton.setImageDrawable(this.A0I);
                    this.A0N.setContentDescription(this.A0Q);
                    frameLayout.addView(this.A0N);
                    this.A0N.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 3));
                }
                EditText editText2 = this.A0L;
                if (editText2 != null && editText2.getMinimumHeight() <= 0) {
                    this.A0L.setMinimumHeight(this.A0N.getMinimumHeight());
                }
                this.A0N.setVisibility(0);
                this.A0N.setChecked(this.A0c);
                Drawable drawable = this.A0J;
                if (drawable == null) {
                    drawable = new ColorDrawable();
                    this.A0J = drawable;
                }
                drawable.setBounds(0, 0, this.A0N.getMeasuredWidth(), 1);
                Drawable[] A1p = AnonymousClass0N2.A1p(this.A0L);
                Drawable drawable2 = A1p[2];
                Drawable drawable3 = this.A0J;
                if (drawable2 != drawable3) {
                    this.A0H = drawable2;
                }
                AnonymousClass0N2.A1N(this.A0L, A1p[0], A1p[1], drawable3, A1p[3]);
                this.A0N.setPadding(this.A0L.getPaddingLeft(), this.A0L.getPaddingTop(), this.A0L.getPaddingRight(), this.A0L.getPaddingBottom());
                return;
            }
            CheckableImageButton checkableImageButton2 = this.A0N;
            if (checkableImageButton2 != null && checkableImageButton2.getVisibility() == 0) {
                this.A0N.setVisibility(8);
            }
            if (this.A0J != null) {
                Drawable[] A1p2 = AnonymousClass0N2.A1p(this.A0L);
                if (A1p2[2] == this.A0J) {
                    AnonymousClass0N2.A1N(this.A0L, A1p2[0], A1p2[1], this.A0H, A1p2[3]);
                    this.A0J = null;
                }
            }
        }
    }

    public final void A0A() {
        Drawable background;
        if (this.A05 != 0 && this.A0K != null && this.A0L != null && getRight() != 0) {
            int left = this.A0L.getLeft();
            EditText editText = this.A0L;
            int i = 0;
            if (editText != null) {
                int i2 = this.A05;
                if (i2 == 1) {
                    i = editText.getTop();
                } else if (i2 == 2) {
                    i = A01() + editText.getTop();
                }
            }
            int right = this.A0L.getRight();
            int bottom = this.A0L.getBottom() + this.A0e;
            if (this.A05 == 2) {
                int i3 = this.A0i;
                int i4 = i3 >> 1;
                left += i4;
                i -= i4;
                right -= i4;
                bottom += i3 / 2;
            }
            this.A0K.setBounds(left, i, right, bottom);
            A04();
            EditText editText2 = this.A0L;
            if (editText2 != null && (background = editText2.getBackground()) != null) {
                if (AnonymousClass0WQ.A03(background)) {
                    background = background.mutate();
                }
                C24831De.A00(this, this.A0L, new Rect());
                Rect bounds = background.getBounds();
                if (bounds.left != bounds.right) {
                    Rect rect = new Rect();
                    background.getPadding(rect);
                    background.setBounds(bounds.left - rect.left, bounds.top, (rect.right << 1) + bounds.right, this.A0L.getBottom());
                }
            }
        }
    }

    public void A0B(float f) {
        C24821Dd r4 = this.A0r;
        if (r4.A0B != f) {
            if (this.A0A == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.A0A = valueAnimator;
                valueAnimator.setInterpolator(C08060aP.A02);
                this.A0A.setDuration(167L);
                this.A0A.addUpdateListener(new AnonymousClass1EB(this));
            }
            this.A0A.setFloatValues(r4.A0B, f);
            this.A0A.start();
        }
    }

    public void A0C(int i) {
        int i2;
        boolean z = this.A0S;
        if (this.A08 == -1) {
            this.A0M.setText(String.valueOf(i));
            this.A0M.setContentDescription(null);
            this.A0S = false;
        } else {
            if (AnonymousClass0Q7.A03(this.A0M) == 1) {
                AnonymousClass0Q7.A0V(this.A0M, 0);
            }
            boolean z2 = false;
            if (i > this.A08) {
                z2 = true;
            }
            this.A0S = z2;
            if (z != z2) {
                TextView textView = this.A0M;
                if (z2) {
                    i2 = this.A0j;
                } else {
                    i2 = this.A0k;
                }
                A0D(textView, i2);
                if (this.A0S) {
                    AnonymousClass0Q7.A0V(this.A0M, 1);
                }
            }
            TextView textView2 = this.A0M;
            Context context = getContext();
            Integer valueOf = Integer.valueOf(i);
            textView2.setText(context.getString(R.string.character_counter_pattern, valueOf, Integer.valueOf(this.A08)));
            this.A0M.setContentDescription(getContext().getString(R.string.character_counter_content_description, valueOf, Integer.valueOf(this.A08)));
        }
        if (this.A0L != null && z != this.A0S) {
            A0F(false, false);
            A03();
            A02();
        }
    }

    public void A0D(TextView textView, int i) {
        try {
            AnonymousClass0N2.A1K(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        AnonymousClass0N2.A1K(textView, 2131952068);
        textView.setTextColor(C004302a.A00(getContext(), R.color.design_error));
    }

    public void A0E(boolean z) {
        boolean z2;
        if (this.A0b) {
            int selectionEnd = this.A0L.getSelectionEnd();
            EditText editText = this.A0L;
            if (editText == null || !(editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                this.A0L.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.A0c = false;
                z2 = false;
            } else {
                this.A0L.setTransformationMethod(null);
                this.A0c = true;
                z2 = true;
            }
            this.A0N.setChecked(z2);
            if (z) {
                this.A0N.jumpDrawablesToCurrentState();
            }
            this.A0L.setSelection(selectionEnd);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (android.text.TextUtils.isEmpty(r0.getText()) != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r0.hasFocus() == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(boolean r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 271
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0F(boolean, boolean):void");
    }

    public final boolean A0G() {
        return this.A0X && !TextUtils.isEmpty(this.A0O) && (this.A0K instanceof AnonymousClass1E7);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.A0q;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            A08();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.A0P == null || (editText = this.A0L) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.A0a;
        this.A0a = false;
        CharSequence hint = editText.getHint();
        this.A0L.setHint(this.A0P);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.A0L.setHint(hint);
            this.A0a = z;
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.A0d = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A0d = false;
    }

    public void draw(Canvas canvas) {
        GradientDrawable gradientDrawable = this.A0K;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        super.draw(canvas);
        if (this.A0X) {
            this.A0r.A0F(canvas);
        }
    }

    public void drawableStateChanged() {
        ColorStateList colorStateList;
        if (!this.A0Z) {
            boolean z = true;
            this.A0Z = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!AnonymousClass0Q7.A0j(this) || !isEnabled()) {
                z = false;
            }
            A0F(z, false);
            A02();
            A0A();
            A03();
            C24821Dd r2 = this.A0r;
            if (r2 != null) {
                r2.A0c = drawableState;
                ColorStateList colorStateList2 = r2.A0P;
                boolean z2 = true;
                if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = r2.A0Q) == null || !colorStateList.isStateful())) {
                    z2 = false;
                } else {
                    r2.A07();
                }
                if (z2 || false) {
                    invalidate();
                }
            }
            this.A0Z = false;
        }
    }

    private Drawable getBoxBackground() {
        int i = this.A05;
        if (i == 1 || i == 2) {
            return this.A0K;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.A04;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.A00;
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.A01;
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.A02;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.A03;
    }

    public int getBoxStrokeColor() {
        return this.A09;
    }

    private float[] getCornerRadiiAsArray() {
        boolean z = true;
        if (AnonymousClass0Q7.A05(this) != 1) {
            z = false;
        }
        float[] fArr = new float[8];
        if (!z) {
            float f = this.A03;
            fArr[0] = f;
            fArr[1] = f;
            float f2 = this.A02;
            fArr[2] = f2;
            fArr[3] = f2;
            float f3 = this.A00;
            fArr[4] = f3;
            fArr[5] = f3;
            float f4 = this.A01;
            fArr[6] = f4;
            fArr[7] = f4;
            return fArr;
        }
        float f5 = this.A02;
        fArr[0] = f5;
        fArr[1] = f5;
        float f6 = this.A03;
        fArr[2] = f6;
        fArr[3] = f6;
        float f7 = this.A01;
        fArr[4] = f7;
        fArr[5] = f7;
        float f8 = this.A00;
        fArr[6] = f8;
        fArr[7] = f8;
        return fArr;
    }

    public int getCounterMaxLength() {
        return this.A08;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.A0R || !this.A0S || (textView = this.A0M) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.A0B;
    }

    public EditText getEditText() {
        return this.A0L;
    }

    public CharSequence getError() {
        AnonymousClass1E9 r1 = this.A0s;
        if (r1.A0E) {
            return r1.A0C;
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        TextView textView = this.A0s.A0A;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int getErrorTextCurrentColor() {
        TextView textView = this.A0s.A0A;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHelperText() {
        AnonymousClass1E9 r1 = this.A0s;
        if (r1.A0F) {
            return r1.A0D;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.A0s.A0B;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.A0X) {
            return this.A0O;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.A0r.A03();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.A0r.A04();
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.A0Q;
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.A0I;
    }

    public Typeface getTypeface() {
        return this.A0F;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EditText editText;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (this.A0K != null) {
            A0A();
        }
        if (this.A0X && (editText = this.A0L) != null) {
            Rect rect = this.A0o;
            C24831De.A00(this, editText, rect);
            int compoundPaddingLeft = this.A0L.getCompoundPaddingLeft() + rect.left;
            int compoundPaddingRight = rect.right - this.A0L.getCompoundPaddingRight();
            int i6 = this.A05;
            if (i6 == 1) {
                i5 = getBoxBackground().getBounds().top + this.A0f;
            } else if (i6 != 2) {
                i5 = getPaddingTop();
            } else {
                i5 = getBoxBackground().getBounds().top - A01();
            }
            C24821Dd r7 = this.A0r;
            int compoundPaddingTop = this.A0L.getCompoundPaddingTop() + rect.top;
            int compoundPaddingBottom = rect.bottom - this.A0L.getCompoundPaddingBottom();
            Rect rect2 = r7.A0e;
            if (!C24821Dd.A01(rect2, compoundPaddingLeft, compoundPaddingTop, compoundPaddingRight, compoundPaddingBottom)) {
                rect2.set(compoundPaddingLeft, compoundPaddingTop, compoundPaddingRight, compoundPaddingBottom);
                r7.A0Y = true;
                r7.A06();
            }
            int paddingBottom = (i4 - i2) - getPaddingBottom();
            Rect rect3 = r7.A0d;
            if (!C24821Dd.A01(rect3, compoundPaddingLeft, i5, compoundPaddingRight, paddingBottom)) {
                rect3.set(compoundPaddingLeft, i5, compoundPaddingRight, paddingBottom);
                r7.A0Y = true;
                r7.A06();
            }
            r7.A07();
            if (A0G() && !this.A0Y) {
                A07();
            }
        }
    }

    public void onMeasure(int i, int i2) {
        A09();
        super.onMeasure(i, i2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C36951nC)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C36951nC r2 = (C36951nC) parcelable;
        super.onRestoreInstanceState(((AbstractC15200nf) r2).A00);
        setError(r2.A00);
        if (r2.A01) {
            A0E(true);
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C36951nC r1 = new C36951nC(super.onSaveInstanceState());
        if (this.A0s.A07()) {
            r1.A00 = getError();
        }
        r1.A01 = this.A0c;
        return r1;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            A04();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C004302a.A00(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.A05) {
            this.A05 = i;
            A06();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.A09 != i) {
            this.A09 = i;
            A03();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.A0R != z) {
            if (z) {
                C05560Pe r1 = new C05560Pe(getContext(), null);
                this.A0M = r1;
                r1.setId(R.id.textinput_counter);
                Typeface typeface = this.A0F;
                if (typeface != null) {
                    this.A0M.setTypeface(typeface);
                }
                this.A0M.setMaxLines(1);
                A0D(this.A0M, this.A0k);
                this.A0s.A04(this.A0M, 2);
                EditText editText = this.A0L;
                if (editText == null) {
                    A0C(0);
                } else {
                    A0C(editText.getText().length());
                }
            } else {
                this.A0s.A05(this.A0M, 2);
                this.A0M = null;
            }
            this.A0R = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.A08 != i) {
            if (i > 0) {
                this.A08 = i;
            } else {
                this.A08 = -1;
            }
            if (this.A0R) {
                EditText editText = this.A0L;
                A0C(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.A0B = colorStateList;
        this.A0C = colorStateList;
        if (this.A0L != null) {
            A0F(false, false);
        }
    }

    private void setEditText(EditText editText) {
        if (this.A0L == null) {
            if (!(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.A0L = editText;
            A06();
            setTextInputAccessibilityDelegate(new C07920a6(this));
            EditText editText2 = this.A0L;
            if (editText2 == null || !(editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                C24821Dd r1 = this.A0r;
                Typeface typeface = this.A0L.getTypeface();
                r1.A0V = typeface;
                r1.A0T = typeface;
                r1.A07();
            }
            C24821Dd r3 = this.A0r;
            float textSize = this.A0L.getTextSize();
            if (r3.A0F != textSize) {
                r3.A0F = textSize;
                r3.A07();
            }
            int gravity = this.A0L.getGravity();
            int i = (gravity & -113) | 48;
            if (r3.A0K != i) {
                r3.A0K = i;
                r3.A07();
            }
            if (r3.A0M != gravity) {
                r3.A0M = gravity;
                r3.A07();
            }
            this.A0L.addTextChangedListener(new AnonymousClass1EA(this));
            if (this.A0B == null) {
                this.A0B = this.A0L.getHintTextColors();
            }
            if (this.A0X) {
                if (TextUtils.isEmpty(this.A0O)) {
                    CharSequence hint = this.A0L.getHint();
                    this.A0P = hint;
                    setHint(hint);
                    this.A0L.setHint((CharSequence) null);
                }
                this.A0a = true;
            }
            if (this.A0M != null) {
                A0C(this.A0L.getText().length());
            }
            this.A0s.A01();
            A09();
            A0F(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    public void setEnabled(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                int childCount2 = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = viewGroup.getChildAt(i2);
                    childAt2.setEnabled(z);
                    if (childAt2 instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt2;
                        int childCount3 = viewGroup2.getChildCount();
                        for (int i3 = 0; i3 < childCount3; i3++) {
                            View childAt3 = viewGroup2.getChildAt(i3);
                            childAt3.setEnabled(z);
                            if (childAt3 instanceof ViewGroup) {
                                A00((ViewGroup) childAt3, z);
                            }
                        }
                    }
                }
            }
        }
        super.setEnabled(z);
    }

    public void setError(CharSequence charSequence) {
        AnonymousClass1E9 r3 = this.A0s;
        if (!r3.A0E) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Animator animator = r3.A06;
            if (animator != null) {
                animator.cancel();
            }
            r3.A0C = charSequence;
            r3.A0A.setText(charSequence);
            int i = r3.A00;
            if (i != 1) {
                r3.A01 = 1;
            }
            r3.A03(i, r3.A01, r3.A08(r3.A0A, charSequence));
            return;
        }
        r3.A02();
    }

    public void setErrorEnabled(boolean z) {
        AnonymousClass1E9 r3 = this.A0s;
        if (r3.A0E != z) {
            Animator animator = r3.A06;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                C05560Pe r1 = new C05560Pe(r3.A0H, null);
                r3.A0A = r1;
                r1.setId(R.id.textinput_error);
                Typeface typeface = r3.A07;
                if (typeface != null) {
                    r3.A0A.setTypeface(typeface);
                }
                int i = r3.A03;
                r3.A03 = i;
                TextView textView = r3.A0A;
                if (textView != null) {
                    r3.A0I.A0D(textView, i);
                }
                r3.A0A.setVisibility(4);
                AnonymousClass0Q7.A0V(r3.A0A, 1);
                r3.A04(r3.A0A, 0);
            } else {
                r3.A02();
                r3.A05(r3.A0A, 0);
                r3.A0A = null;
                TextInputLayout textInputLayout = r3.A0I;
                textInputLayout.A02();
                textInputLayout.A03();
            }
            r3.A0E = z;
        }
    }

    public void setErrorTextAppearance(int i) {
        AnonymousClass1E9 r0 = this.A0s;
        r0.A03 = i;
        TextView textView = r0.A0A;
        if (textView != null) {
            r0.A0I.A0D(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        TextView textView = this.A0s.A0A;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            AnonymousClass1E9 r3 = this.A0s;
            if (!r3.A0F) {
                setHelperTextEnabled(true);
            }
            Animator animator = r3.A06;
            if (animator != null) {
                animator.cancel();
            }
            r3.A0D = charSequence;
            r3.A0B.setText(charSequence);
            int i = r3.A00;
            if (i != 2) {
                r3.A01 = 2;
            }
            r3.A03(i, r3.A01, r3.A08(r3.A0B, charSequence));
        } else if (this.A0s.A0F) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        TextView textView = this.A0s.A0B;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        AnonymousClass1E9 r3 = this.A0s;
        if (r3.A0F != z) {
            Animator animator = r3.A06;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                C05560Pe r1 = new C05560Pe(r3.A0H, null);
                r3.A0B = r1;
                r1.setId(R.id.textinput_helper_text);
                Typeface typeface = r3.A07;
                if (typeface != null) {
                    r3.A0B.setTypeface(typeface);
                }
                r3.A0B.setVisibility(4);
                AnonymousClass0Q7.A0V(r3.A0B, 1);
                int i = r3.A04;
                r3.A04 = i;
                TextView textView = r3.A0B;
                if (textView != null) {
                    AnonymousClass0N2.A1K(textView, i);
                }
                r3.A04(r3.A0B, 1);
            } else {
                Animator animator2 = r3.A06;
                if (animator2 != null) {
                    animator2.cancel();
                }
                int i2 = r3.A00;
                if (i2 == 2) {
                    r3.A01 = 0;
                }
                r3.A03(i2, r3.A01, r3.A08(r3.A0B, null));
                r3.A05(r3.A0B, 1);
                r3.A0B = null;
                TextInputLayout textInputLayout = r3.A0I;
                textInputLayout.A02();
                textInputLayout.A03();
            }
            r3.A0F = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        AnonymousClass1E9 r0 = this.A0s;
        r0.A04 = i;
        TextView textView = r0.A0B;
        if (textView != null) {
            AnonymousClass0N2.A1K(textView, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.A0X) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.A0W = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.A0X) {
            this.A0X = z;
            if (!z) {
                this.A0a = false;
                if (!TextUtils.isEmpty(this.A0O) && TextUtils.isEmpty(this.A0L.getHint())) {
                    this.A0L.setHint(this.A0O);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.A0L.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.A0O)) {
                        setHint(hint);
                    }
                    this.A0L.setHint((CharSequence) null);
                }
                this.A0a = true;
            }
            if (this.A0L != null) {
                A08();
            }
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.A0O)) {
            this.A0O = charSequence;
            this.A0r.A0G(charSequence);
            if (!this.A0Y) {
                A07();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C24821Dd r0 = this.A0r;
        r0.A0C(i);
        this.A0C = r0.A0P;
        if (this.A0L != null) {
            A0F(false, false);
            A08();
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setPasswordVisibilityToggleContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.A0Q = charSequence;
        CheckableImageButton checkableImageButton = this.A0N;
        if (checkableImageButton != null) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass05p.A01(getContext(), i);
        } else {
            drawable = null;
        }
        setPasswordVisibilityToggleDrawable(drawable);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.A0I = drawable;
        CheckableImageButton checkableImageButton = this.A0N;
        if (checkableImageButton != null) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        EditText editText;
        if (this.A0b != z) {
            this.A0b = z;
            if (!z && this.A0c && (editText = this.A0L) != null) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.A0c = false;
            A09();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.A0D = colorStateList;
        this.A0T = true;
        A05();
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.A0E = mode;
        this.A0U = true;
        A05();
    }

    public void setTextInputAccessibilityDelegate(C07920a6 r2) {
        EditText editText = this.A0L;
        if (editText != null) {
            AnonymousClass0Q7.A0d(editText, r2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.A0F) {
            this.A0F = typeface;
            C24821Dd r0 = this.A0r;
            r0.A0V = typeface;
            r0.A0T = typeface;
            r0.A07();
            AnonymousClass1E9 r1 = this.A0s;
            if (typeface != r1.A07) {
                r1.A07 = typeface;
                TextView textView = r1.A0A;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = r1.A0B;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.A0M;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }
}
