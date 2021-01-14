package androidx.appcompat.widget;

import X.AnonymousClass05p;
import X.AnonymousClass0N2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0T3;
import X.AnonymousClass0TL;
import X.AnonymousClass0WQ;
import X.AnonymousClass0ZX;
import X.C002001d;
import X.C06360Sy;
import X.C12910jI;
import X.C13530kO;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.search.verification.client.R;

public class SwitchCompat extends CompoundButton {
    public static final Property A0d = new C13530kO();
    public static final int[] A0e = {16842912};
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public ObjectAnimator A0G;
    public ColorStateList A0H;
    public ColorStateList A0I = null;
    public ColorStateList A0J = null;
    public PorterDuff.Mode A0K = null;
    public PorterDuff.Mode A0L = null;
    public Drawable A0M;
    public Drawable A0N;
    public Layout A0O;
    public Layout A0P;
    public TransformationMethod A0Q;
    public VelocityTracker A0R = VelocityTracker.obtain();
    public CharSequence A0S;
    public CharSequence A0T;
    public boolean A0U = false;
    public boolean A0V = false;
    public boolean A0W = false;
    public boolean A0X = false;
    public boolean A0Y;
    public boolean A0Z;
    public final Rect A0a = new Rect();
    public final TextPaint A0b;
    public final AnonymousClass0ZX A0c;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchStyle);
        ColorStateList colorStateList;
        Typeface typeface;
        Typeface create;
        int i;
        int resourceId;
        boolean z = true;
        this.A0b = new TextPaint(1);
        this.A0b.density = getResources().getDisplayMetrics().density;
        AnonymousClass0TL r1 = new AnonymousClass0TL(context, context.obtainStyledAttributes(attributeSet, AnonymousClass0T3.A0a, R.attr.switchStyle, 0));
        Drawable A022 = r1.A02(2);
        this.A0M = A022;
        if (A022 != null) {
            A022.setCallback(this);
        }
        Drawable A023 = r1.A02(11);
        this.A0N = A023;
        if (A023 != null) {
            A023.setCallback(this);
        }
        TypedArray typedArray = r1.A02;
        this.A0T = typedArray.getText(0);
        this.A0S = typedArray.getText(1);
        this.A0Y = typedArray.getBoolean(3, true);
        this.A0C = typedArray.getDimensionPixelSize(8, 0);
        this.A07 = typedArray.getDimensionPixelSize(5, 0);
        this.A08 = typedArray.getDimensionPixelSize(6, 0);
        this.A0Z = typedArray.getBoolean(4, false);
        ColorStateList A012 = r1.A01(9);
        if (A012 != null) {
            this.A0I = A012;
            this.A0U = true;
        }
        PorterDuff.Mode A002 = AnonymousClass0WQ.A00(typedArray.getInt(10, -1), null);
        if (null != A002) {
            this.A0K = A002;
            this.A0V = true;
        }
        if (this.A0U || this.A0V) {
            A01();
        }
        ColorStateList A013 = r1.A01(12);
        if (A013 != null) {
            this.A0J = A013;
            this.A0W = true;
        }
        PorterDuff.Mode A003 = AnonymousClass0WQ.A00(typedArray.getInt(13, -1), null);
        if (this.A0L != A003) {
            this.A0L = A003;
            this.A0X = true;
        }
        if (this.A0W || this.A0X) {
            A02();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AnonymousClass0T3.A0b);
            if ((!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = AnonymousClass05p.A00(context, resourceId)) == null) && (colorStateList = obtainStyledAttributes.getColorStateList(3)) == null) {
                this.A0H = getTextColors();
            } else {
                this.A0H = colorStateList;
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = (float) dimensionPixelSize;
                if (f != this.A0b.getTextSize()) {
                    this.A0b.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = obtainStyledAttributes.getInt(1, -1);
            int i3 = obtainStyledAttributes.getInt(2, -1);
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                typeface = Typeface.SERIF;
            } else if (i2 != 3) {
                typeface = null;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            float f2 = 0.0f;
            if (i3 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i3);
                } else {
                    create = Typeface.create(typeface, i3);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i = create.getStyle();
                } else {
                    i = 0;
                }
                int i4 = (-1 ^ i) & i3;
                this.A0b.setFakeBoldText((i4 & 1) == 0 ? false : z);
                this.A0b.setTextSkewX((i4 & 2) != 0 ? -0.25f : f2);
            } else {
                this.A0b.setFakeBoldText(false);
                this.A0b.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                this.A0Q = new C12910jI(getContext());
            } else {
                this.A0Q = null;
            }
            obtainStyledAttributes.recycle();
        }
        AnonymousClass0ZX r0 = new AnonymousClass0ZX(this);
        this.A0c = r0;
        r0.A07(attributeSet, R.attr.switchStyle);
        typedArray.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0F = viewConfiguration.getScaledTouchSlop();
        this.A03 = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public final Layout A00(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        TransformationMethod transformationMethod = this.A0Q;
        if (transformationMethod != null) {
            charSequence2 = transformationMethod.getTransformation(charSequence, this);
        }
        TextPaint textPaint = this.A0b;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void A01() {
        Drawable drawable = this.A0M;
        if (drawable == null) {
            return;
        }
        if (this.A0U || this.A0V) {
            Drawable mutate = C002001d.A0d(drawable).mutate();
            this.A0M = mutate;
            if (this.A0U) {
                C002001d.A2b(mutate, this.A0I);
            }
            if (this.A0V) {
                C002001d.A2c(this.A0M, this.A0K);
            }
            if (this.A0M.isStateful()) {
                this.A0M.setState(getDrawableState());
            }
        }
    }

    public final void A02() {
        Drawable drawable = this.A0N;
        if (drawable == null) {
            return;
        }
        if (this.A0W || this.A0X) {
            Drawable mutate = C002001d.A0d(drawable).mutate();
            this.A0N = mutate;
            if (this.A0W) {
                C002001d.A2b(mutate, this.A0J);
            }
            if (this.A0X) {
                C002001d.A2c(this.A0N, this.A0L);
            }
            if (this.A0N.isStateful()) {
                this.A0N.setState(getDrawableState());
            }
        }
    }

    public void draw(Canvas canvas) {
        Rect rect;
        Rect rect2 = this.A0a;
        int i = this.A06;
        int i2 = this.A0A;
        int i3 = this.A09;
        int i4 = this.A04;
        int thumbOffset = getThumbOffset() + i;
        Drawable drawable = this.A0M;
        if (drawable != null) {
            rect = AnonymousClass0WQ.A01(drawable);
        } else {
            rect = AnonymousClass0WQ.A01;
        }
        Drawable drawable2 = this.A0N;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i5 = rect2.left;
            thumbOffset += i5;
            int i6 = rect.left;
            if (i6 > i5) {
                i += i6 - i5;
            }
            int i7 = rect.top;
            int i8 = rect2.top;
            int i9 = (i7 - i8) + i2;
            if (i7 <= i8) {
                i9 = i2;
            }
            int i10 = rect.right;
            int i11 = rect2.right;
            if (i10 > i11) {
                i3 -= i10 - i11;
            }
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            int i14 = i4 - (i12 - i13);
            if (i12 <= i13) {
                i14 = i4;
            }
            this.A0N.setBounds(i, i9, i3, i14);
        }
        Drawable drawable3 = this.A0M;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.A0D + rect2.right;
            this.A0M.setBounds(i15, i2, i16, i4);
            Drawable background = getBackground();
            if (background != null) {
                C002001d.A2a(background, i15, i2, i16, i4);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.A0M;
        if (drawable != null) {
            C002001d.A2X(drawable, f, f2);
        }
        Drawable drawable2 = this.A0N;
        if (drawable2 != null) {
            C002001d.A2X(drawable2, f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A0M;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0N;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C06360Sy.A01(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A0B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.A08 : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C06360Sy.A01(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A0B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.A08 : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.A0Y;
    }

    public boolean getSplitTrack() {
        return this.A0Z;
    }

    public int getSwitchMinWidth() {
        return this.A07;
    }

    public int getSwitchPadding() {
        return this.A08;
    }

    private boolean getTargetCheckedState() {
        return this.A00 > 0.5f;
    }

    public CharSequence getTextOff() {
        return this.A0S;
    }

    public CharSequence getTextOn() {
        return this.A0T;
    }

    public Drawable getThumbDrawable() {
        return this.A0M;
    }

    private int getThumbOffset() {
        float f;
        if (C06360Sy.A01(this)) {
            f = 1.0f - this.A00;
        } else {
            f = this.A00;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.A0N;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.A0a;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.A0M;
        if (drawable2 != null) {
            rect = AnonymousClass0WQ.A01(drawable2);
        } else {
            rect = AnonymousClass0WQ.A01;
        }
        return ((((this.A0B - this.A0D) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    public int getThumbTextPadding() {
        return this.A0C;
    }

    public ColorStateList getThumbTintList() {
        return this.A0I;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.A0K;
    }

    public Drawable getTrackDrawable() {
        return this.A0N;
    }

    public ColorStateList getTrackTintList() {
        return this.A0J;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.A0L;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A0M;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A0N;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.A0G;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.A0G.end();
            this.A0G = null;
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, A0e);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.A0a;
        Drawable drawable = this.A0N;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.A0A;
        int i2 = this.A04;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.A0M;
        if (drawable != null) {
            if (!this.A0Z || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect A012 = AnonymousClass0WQ.A01(drawable2);
                drawable2.copyBounds(rect);
                rect.left += A012.left;
                rect.right -= A012.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.A0P;
        } else {
            layout = this.A0O;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.A0H;
            if (colorStateList != null) {
                this.A0b.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.A0b.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((float) ((width >> 1) - (layout.getWidth() >> 1)), (float) (((i3 + i4) >> 1) - (layout.getHeight() >> 1)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (isChecked()) {
            charSequence = this.A0T;
        } else {
            charSequence = this.A0S;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.A0M != null) {
            Rect rect = this.A0a;
            Drawable drawable = this.A0N;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect A012 = AnonymousClass0WQ.A01(this.A0M);
            i5 = Math.max(0, A012.left - rect.left);
            i9 = Math.max(0, A012.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C06360Sy.A01(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.A0B + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.A0B) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) >> 1;
            int i10 = this.A05;
            i7 = height - (i10 >> 1);
            i8 = i10 + i7;
        } else if (gravity != 80) {
            i7 = getPaddingTop();
            i8 = this.A05 + i7;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i7 = i8 - this.A05;
        }
        this.A06 = i6;
        this.A0A = i7;
        this.A04 = i8;
        this.A09 = width;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.A0Y) {
            if (this.A0P == null) {
                this.A0P = A00(this.A0T);
            }
            if (this.A0O == null) {
                this.A0O = A00(this.A0S);
            }
        }
        Rect rect = this.A0a;
        Drawable drawable = this.A0M;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.A0M.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.A0M.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.A0Y) {
            i5 = (this.A0C << 1) + Math.max(this.A0P.getWidth(), this.A0O.getWidth());
        } else {
            i5 = 0;
        }
        this.A0D = Math.max(i5, i3);
        Drawable drawable2 = this.A0N;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.A0N.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.A0M;
        if (drawable3 != null) {
            Rect A012 = AnonymousClass0WQ.A01(drawable3);
            i7 = Math.max(i7, A012.left);
            i8 = Math.max(i8, A012.right);
        }
        int max = Math.max(this.A07, (this.A0D << 1) + i7 + i8);
        int max2 = Math.max(i6, i4);
        this.A0B = max;
        this.A05 = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.A0T;
        } else {
            charSequence = this.A0S;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009d, code lost:
        if (isEnabled() == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != 3) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        float f = 1.0f;
        if (getWindowToken() == null || !AnonymousClass0Q7.A0j(this)) {
            ObjectAnimator objectAnimator = this.A0G;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!isChecked) {
                f = 0.0f;
            }
            setThumbPosition(f);
            return;
        }
        if (!isChecked) {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, A0d, f);
        this.A0G = ofFloat;
        ofFloat.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.A0G.setAutoCancel(true);
        }
        this.A0G.start();
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass0N2.A0Z(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.A0Y != z) {
            this.A0Y = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.A0Z = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.A07 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.A08 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.A0b;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.A0S = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.A0T = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0M;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.A0M = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.A00 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AnonymousClass05p.A01(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.A0C = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.A0I = colorStateList;
        this.A0U = true;
        A01();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.A0K = mode;
        this.A0V = true;
        A01();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.A0N;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.A0N = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AnonymousClass05p.A01(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.A0J = colorStateList;
        this.A0W = true;
        A02();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.A0L = mode;
        this.A0X = true;
        A02();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0M || drawable == this.A0N;
    }
}
