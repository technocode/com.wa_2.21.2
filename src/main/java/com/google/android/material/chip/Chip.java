package com.google.android.material.chip;

import X.AbstractC04990Mq;
import X.AnonymousClass05p;
import X.AnonymousClass0Nr;
import X.AnonymousClass0Pz;
import X.AnonymousClass0Q7;
import X.AnonymousClass1DM;
import X.AnonymousClass1DN;
import X.AnonymousClass1Dg;
import X.C002001d;
import X.C008805h;
import X.C06570Tw;
import X.C08030aM;
import X.C08040aN;
import X.C08050aO;
import X.C08220af;
import X.C36741mn;
import X.C36761mp;
import X.C459126y;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Chip extends AppCompatCheckBox implements AnonymousClass1DN {
    public static final Rect A0D = new Rect();
    public static final int[] A0E = {16842913};
    public int A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    public RippleDrawable A01;
    public View.OnClickListener A02;
    public CompoundButton.OnCheckedChangeListener A03;
    public C36761mp A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Rect A09 = new Rect();
    public final RectF A0A = new RectF();
    public final AbstractC04990Mq A0B = new C36741mn(this);
    public final C459126y A0C;

    public Chip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle);
        AnonymousClass1Dg r0;
        int resourceId;
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C36761mp r4 = new C36761mp(context);
        Context context2 = r4.A0p;
        TypedArray A002 = C08040aN.A00(context2, attributeSet, C08030aM.A0J, R.attr.chipStyle, 2131952429, new int[0]);
        ColorStateList A082 = C008805h.A08(context2, A002, 8);
        if (r4.A0L != A082) {
            r4.A0L = A082;
            r4.onStateChange(r4.getState());
        }
        float dimension = A002.getDimension(16, 0.0f);
        if (r4.A03 != dimension) {
            r4.A03 = dimension;
            r4.invalidateSelf();
            r4.A04();
        }
        float dimension2 = A002.getDimension(9, 0.0f);
        if (r4.A00 != dimension2) {
            r4.A00 = dimension2;
            r4.invalidateSelf();
        }
        ColorStateList A083 = C008805h.A08(context2, A002, 18);
        if (r4.A0N != A083) {
            r4.A0N = A083;
            r4.onStateChange(r4.getState());
        }
        r4.A06(A002.getDimension(19, 0.0f));
        r4.A0E(C008805h.A08(context2, A002, 30));
        r4.A0L(A002.getText(3));
        if (!A002.hasValue(0) || (resourceId = A002.getResourceId(0, 0)) == 0) {
            r0 = null;
        } else {
            r0 = new AnonymousClass1Dg(context2, resourceId);
        }
        r4.A0K(r0);
        int i = A002.getInt(1, 0);
        if (i == 1) {
            r4.A0Y = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            r4.A0Y = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            r4.A0Y = TextUtils.TruncateAt.END;
        }
        r4.A0O(A002.getBoolean(15, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            r4.A0O(A002.getBoolean(12, false));
        }
        r4.A0H(C008805h.A0B(context2, A002, 11));
        r4.A0C(C008805h.A08(context2, A002, 14));
        r4.A05(A002.getDimension(13, 0.0f));
        r4.A0P(A002.getBoolean(26, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            r4.A0P(A002.getBoolean(21, false));
        }
        r4.A0I(C008805h.A0B(context2, A002, 20));
        r4.A0D(C008805h.A08(context2, A002, 25));
        r4.A08(A002.getDimension(23, 0.0f));
        r4.A0M(A002.getBoolean(4, false));
        r4.A0N(A002.getBoolean(7, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            r4.A0N(A002.getBoolean(6, false));
        }
        r4.A0G(C008805h.A0B(context2, A002, 5));
        r4.A0a = C08050aO.A01(context2, A002, 31);
        r4.A0Z = C08050aO.A01(context2, A002, 27);
        float dimension3 = A002.getDimension(17, 0.0f);
        if (r4.A04 != dimension3) {
            r4.A04 = dimension3;
            r4.invalidateSelf();
            r4.A04();
        }
        r4.A0B(A002.getDimension(29, 0.0f));
        r4.A0A(A002.getDimension(28, 0.0f));
        float dimension4 = A002.getDimension(33, 0.0f);
        if (r4.A0C != dimension4) {
            r4.A0C = dimension4;
            r4.invalidateSelf();
            r4.A04();
        }
        float dimension5 = A002.getDimension(32, 0.0f);
        if (r4.A0B != dimension5) {
            r4.A0B = dimension5;
            r4.invalidateSelf();
            r4.A04();
        }
        r4.A09(A002.getDimension(24, 0.0f));
        r4.A07(A002.getDimension(22, 0.0f));
        float dimension6 = A002.getDimension(10, 0.0f);
        if (r4.A01 != dimension6) {
            r4.A01 = dimension6;
            r4.invalidateSelf();
            r4.A04();
        }
        r4.A0K = A002.getDimensionPixelSize(2, Integer.MAX_VALUE);
        A002.recycle();
        setChipDrawable(r4);
        C459126y r02 = new C459126y(this, this);
        this.A0C = r02;
        AnonymousClass0Q7.A0d(this, r02);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new AnonymousClass1DM(this));
        }
        setChecked(this.A08);
        r4.A0l = false;
        setText(r4.A0d);
        setEllipsize(r4.A0Y);
        setIncludeFontPadding(false);
        AnonymousClass1Dg textAppearance = getTextAppearance();
        if (textAppearance != null) {
            A01(textAppearance);
        }
        setSingleLine();
        setGravity(8388627);
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r1 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (isChecked() != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        r2 = r6.A04;
        r3 = r3 + ((r2.A0A + r2.A09) + r2.A02);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.A00():void");
    }

    public final void A01(AnonymousClass1Dg r4) {
        TextPaint paint = getPaint();
        paint.drawableState = this.A04.getState();
        r4.A01(getContext(), paint, this.A0B);
    }

    public boolean A02() {
        boolean z;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.A02;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        } else {
            z = false;
        }
        this.A0C.A05(0, 1);
        return z;
    }

    public final boolean A03(boolean z) {
        if (this.A00 == Integer.MIN_VALUE) {
            setFocusedVirtualView(-1);
        }
        if (z) {
            if (this.A00 != -1) {
                return false;
            }
            setFocusedVirtualView(0);
            return true;
        } else if (this.A00 != 0) {
            return false;
        } else {
            setFocusedVirtualView(-1);
            return true;
        }
    }

    @Override // X.AnonymousClass1DN
    public void AE6() {
        A00();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = AnonymousClass0Pz.class.getDeclaredField("mHoveredVirtualViewId");
                declaredField.setAccessible(true);
                C459126y r7 = this.A0C;
                if (((Number) declaredField.get(r7)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = AnonymousClass0Pz.class.getDeclaredMethod("updateHoveredVirtualView", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(r7, Integer.valueOf((int) EditorInfoCompat.IME_FLAG_FORCE_ASCII));
                    return true;
                }
            } catch (NoSuchMethodException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            } catch (IllegalAccessException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (InvocationTargetException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (NoSuchFieldException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            }
        }
        if (this.A0C.A0E(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.A0C.A0D(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r1 == false) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.appcompat.widget.AppCompatCheckBox
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawableStateChanged() {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.drawableStateChanged():void");
    }

    public Drawable getCheckedIcon() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A0V;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A0L;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A00;
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.A04;
    }

    public float getChipEndPadding() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A01;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C36761mp r0 = this.A04;
        if (r0 == null || (drawable = r0.A0W) == null) {
            return null;
        }
        if (drawable instanceof AnonymousClass0Nr) {
            return ((AnonymousClass0Nr) drawable).A9v();
        }
        return drawable;
    }

    public float getChipIconSize() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A02;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A0M;
        }
        return null;
    }

    public float getChipMinHeight() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A03;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A04;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A0N;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A05;
        }
        return 0.0f;
    }

    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A03();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A0c;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A06;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A07;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A08;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A0O;
        }
        return null;
    }

    public static RectF getCloseIconTouchBounds(Chip chip) {
        RectF rectF = chip.A0A;
        rectF.setEmpty();
        C36761mp r4 = chip.A04;
        if (!(r4 == null || r4.A03() == null)) {
            Rect bounds = r4.getBounds();
            rectF.setEmpty();
            if (r4.A0S()) {
                float f = r4.A01 + r4.A06 + r4.A07 + r4.A08 + r4.A0B;
                if (C002001d.A07(r4) == 0) {
                    float f2 = (float) bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = (float) bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    public static Rect getCloseIconTouchBoundsInt(Chip chip) {
        RectF closeIconTouchBounds = getCloseIconTouchBounds(chip);
        Rect rect = chip.A09;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A0Y;
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.A00 == 0) {
            rect.set(getCloseIconTouchBoundsInt(this));
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C08050aO getHideMotionSpec() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A0Z;
        }
        return null;
    }

    public float getIconEndPadding() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A09;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A0A;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A0Q;
        }
        return null;
    }

    public C08050aO getShowMotionSpec() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A0a;
        }
        return null;
    }

    public CharSequence getText() {
        C36761mp r0 = this.A04;
        return r0 != null ? r0.A0d : "";
    }

    private AnonymousClass1Dg getTextAppearance() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A0b;
        }
        return null;
    }

    public float getTextEndPadding() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A0B;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            return r0.A0C;
        }
        return 0.0f;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, A0E);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        C36761mp r0;
        if (TextUtils.isEmpty(getText()) || (r0 = this.A04) == null || r0.A0l) {
            super.onDraw(canvas);
            return;
        }
        int save = canvas.save();
        float textStartPadding = getTextStartPadding() + this.A04.A00() + getChipStartPadding();
        if (AnonymousClass0Q7.A05(this) != 0) {
            textStartPadding = -textStartPadding;
        }
        canvas.translate(textStartPadding, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            setFocusedVirtualView(-1);
        } else {
            setFocusedVirtualView(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        invalidate();
        super.onFocusChanged(z, i, rect);
        C459126y r1 = this.A0C;
        int i2 = ((AnonymousClass0Pz) r1).A01;
        if (i2 != Integer.MIN_VALUE) {
            r1.A09(i2);
        }
        if (z) {
            r1.A0C(i, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds(this).contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r6, android.view.KeyEvent r7) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds(this).contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r0 == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r3 != 3) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r3 = r5.getActionMasked()
            android.graphics.RectF r2 = getCloseIconTouchBounds(r4)
            float r1 = r5.getX()
            float r0 = r5.getY()
            boolean r2 = r2.contains(r1, r0)
            r1 = 0
            r0 = 1
            if (r3 == 0) goto L_0x0042
            if (r3 == r0) goto L_0x0032
            r0 = 2
            if (r3 == r0) goto L_0x0028
            r0 = 3
            if (r3 == r0) goto L_0x0040
        L_0x0020:
            boolean r0 = super.onTouchEvent(r5)
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            r1 = 1
        L_0x0027:
            return r1
        L_0x0028:
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0020
            if (r2 != 0) goto L_0x0026
            r4.setCloseIconPressed(r1)
            goto L_0x0026
        L_0x0032:
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0040
            r4.A02()
            r0 = 1
        L_0x003a:
            r4.setCloseIconPressed(r1)
            if (r0 != 0) goto L_0x0026
            goto L_0x0020
        L_0x0040:
            r0 = 0
            goto L_0x003a
        L_0x0042:
            if (r2 == 0) goto L_0x0020
            r4.setCloseIconPressed(r0)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == this.A04 || drawable == this.A01) {
            super.setBackground(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
    }

    public void setBackgroundColor(int i) {
        throw new UnsupportedOperationException("Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == this.A04 || drawable == this.A01) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        throw new UnsupportedOperationException("Do not set the background drawable; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox
    public void setBackgroundResource(int i) {
        throw new UnsupportedOperationException("Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        throw new UnsupportedOperationException("Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        throw new UnsupportedOperationException("Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A0M(z);
        }
    }

    public void setCheckableResource(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A0M(r1.A0p.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C36761mp r0 = this.A04;
        if (r0 == null) {
            this.A08 = z;
        } else if (r0.A0g) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.A03) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A0G(drawable);
        }
    }

    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A0G(AnonymousClass05p.A01(r1.A0p, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A0N(r1.A0p.getResources().getBoolean(i));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A0N(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C36761mp r1 = this.A04;
        if (r1 != null && r1.A0L != colorStateList) {
            r1.A0L = colorStateList;
            r1.onStateChange(r1.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList A002;
        C36761mp r2 = this.A04;
        if (r2 != null && r2.A0L != (A002 = AnonymousClass05p.A00(r2.A0p, i))) {
            r2.A0L = A002;
            r2.onStateChange(r2.getState());
        }
    }

    public void setChipCornerRadius(float f) {
        C36761mp r1 = this.A04;
        if (r1 != null && r1.A00 != f) {
            r1.A00 = f;
            r1.invalidateSelf();
        }
    }

    public void setChipCornerRadiusResource(int i) {
        C36761mp r2 = this.A04;
        if (r2 != null) {
            float dimension = r2.A0p.getResources().getDimension(i);
            if (r2.A00 != dimension) {
                r2.A00 = dimension;
                r2.invalidateSelf();
            }
        }
    }

    public void setChipDrawable(C36761mp r5) {
        C36761mp r1 = this.A04;
        if (r1 != r5) {
            if (r1 != null) {
                r1.A0f = new WeakReference(null);
            }
            this.A04 = r5;
            if (r5 != null) {
                r5.A0f = new WeakReference(this);
                if (C08220af.A00) {
                    this.A01 = new RippleDrawable(C08220af.A01(this.A04.A0Q), this.A04, null);
                    C36761mp r2 = this.A04;
                    if (r2.A0n) {
                        r2.A0n = false;
                        r2.A0P = null;
                        r2.onStateChange(r2.getState());
                    }
                    setBackground(this.A01);
                    return;
                }
                C36761mp r22 = this.A04;
                if (!r22.A0n) {
                    r22.A0n = true;
                    r22.A0P = C08220af.A01(r22.A0Q);
                    r22.onStateChange(r22.getState());
                }
                setBackground(this.A04);
                return;
            }
            throw null;
        }
    }

    public void setChipEndPadding(float f) {
        C36761mp r1 = this.A04;
        if (r1 != null && r1.A01 != f) {
            r1.A01 = f;
            r1.invalidateSelf();
            r1.A04();
        }
    }

    public void setChipEndPaddingResource(int i) {
        C36761mp r2 = this.A04;
        if (r2 != null) {
            float dimension = r2.A0p.getResources().getDimension(i);
            if (r2.A01 != dimension) {
                r2.A01 = dimension;
                r2.invalidateSelf();
                r2.A04();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A0H(drawable);
        }
    }

    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A0H(AnonymousClass05p.A01(r1.A0p, i));
        }
    }

    public void setChipIconSize(float f) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A05(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A05(r1.A0p.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A0C(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A0C(AnonymousClass05p.A00(r1.A0p, i));
        }
    }

    public void setChipIconVisible(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A0O(r1.A0p.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(boolean z) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A0O(z);
        }
    }

    public void setChipMinHeight(float f) {
        C36761mp r1 = this.A04;
        if (r1 != null && r1.A03 != f) {
            r1.A03 = f;
            r1.invalidateSelf();
            r1.A04();
        }
    }

    public void setChipMinHeightResource(int i) {
        C36761mp r2 = this.A04;
        if (r2 != null) {
            float dimension = r2.A0p.getResources().getDimension(i);
            if (r2.A03 != dimension) {
                r2.A03 = dimension;
                r2.invalidateSelf();
                r2.A04();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C36761mp r1 = this.A04;
        if (r1 != null && r1.A04 != f) {
            r1.A04 = f;
            r1.invalidateSelf();
            r1.A04();
        }
    }

    public void setChipStartPaddingResource(int i) {
        C36761mp r2 = this.A04;
        if (r2 != null) {
            float dimension = r2.A0p.getResources().getDimension(i);
            if (r2.A04 != dimension) {
                r2.A04 = dimension;
                r2.invalidateSelf();
                r2.A04();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C36761mp r1 = this.A04;
        if (r1 != null && r1.A0N != colorStateList) {
            r1.A0N = colorStateList;
            r1.onStateChange(r1.getState());
        }
    }

    public void setChipStrokeColorResource(int i) {
        ColorStateList A002;
        C36761mp r2 = this.A04;
        if (r2 != null && r2.A0N != (A002 = AnonymousClass05p.A00(r2.A0p, i))) {
            r2.A0N = A002;
            r2.onStateChange(r2.getState());
        }
    }

    public void setChipStrokeWidth(float f) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A06(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A06(r1.A0p.getResources().getDimension(i));
        }
    }

    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A0I(drawable);
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C36761mp r2 = this.A04;
        if (r2 != null && r2.A0c != charSequence) {
            C06570Tw A022 = C06570Tw.A02();
            r2.A0c = A022.A03(charSequence, A022.A01);
            r2.invalidateSelf();
        }
    }

    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A07(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A07(r1.A0p.getResources().getDimension(i));
        }
    }

    private void setCloseIconFocused(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.A06 != z) {
            this.A06 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.A07 != z) {
            this.A07 = z;
            refreshDrawableState();
        }
    }

    public void setCloseIconResource(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A0I(AnonymousClass05p.A01(r1.A0p, i));
        }
    }

    public void setCloseIconSize(float f) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A08(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A08(r1.A0p.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A09(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A09(r1.A0p.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A0D(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A0D(AnonymousClass05p.A00(r1.A0p, i));
        }
    }

    public void setCloseIconVisible(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A0P(r1.A0p.getResources().getBoolean(i));
        }
    }

    public void setCloseIconVisible(boolean z) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A0P(z);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.A04 != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C36761mp r0 = this.A04;
                if (r0 != null) {
                    r0.A0Y = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    private void setFocusedVirtualView(int i) {
        int i2 = this.A00;
        if (i2 != i) {
            if (i2 == 0) {
                setCloseIconFocused(false);
            }
            this.A00 = i;
            if (i == 0) {
                setCloseIconFocused(true);
            }
        }
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C08050aO r2) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A0Z = r2;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A0Z = C08050aO.A00(r1.A0p, i);
        }
    }

    public void setIconEndPadding(float f) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A0A(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A0A(r1.A0p.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A0B(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A0B(r1.A0p.getResources().getDimension(i));
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A0K = i;
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A03 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.A02 = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A0E(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A0E(AnonymousClass05p.A00(r1.A0p, i));
        }
    }

    public void setShowMotionSpec(C08050aO r2) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A0a = r2;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C36761mp r1 = this.A04;
        if (r1 != null) {
            r1.A0a = C08050aO.A00(r1.A0p, i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.A04 != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            C06570Tw A022 = C06570Tw.A02();
            CharSequence A032 = A022.A03(charSequence, A022.A01);
            if (this.A04.A0l) {
                A032 = null;
            }
            super.setText(A032, bufferType);
            C36761mp r0 = this.A04;
            if (r0 != null) {
                r0.A0L(charSequence);
            }
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C36761mp r2 = this.A04;
        if (r2 != null) {
            r2.A0K(new AnonymousClass1Dg(r2.A0p, i));
        }
        AnonymousClass1Dg textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.A02(getContext(), getPaint(), this.A0B);
            A01(getTextAppearance());
        }
    }

    public void setTextAppearance(AnonymousClass1Dg r5) {
        C36761mp r0 = this.A04;
        if (r0 != null) {
            r0.A0K(r5);
        }
        AnonymousClass1Dg textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.A02(getContext(), getPaint(), this.A0B);
            A01(r5);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C36761mp r2 = this.A04;
        if (r2 != null) {
            r2.A0K(new AnonymousClass1Dg(r2.A0p, i));
        }
        AnonymousClass1Dg textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.A02(context, getPaint(), this.A0B);
            A01(getTextAppearance());
        }
    }

    public void setTextAppearanceResource(int i) {
        C36761mp r2 = this.A04;
        if (r2 != null) {
            r2.A0K(new AnonymousClass1Dg(r2.A0p, i));
        }
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C36761mp r1 = this.A04;
        if (r1 != null && r1.A0B != f) {
            r1.A0B = f;
            r1.invalidateSelf();
            r1.A04();
        }
    }

    public void setTextEndPaddingResource(int i) {
        C36761mp r2 = this.A04;
        if (r2 != null) {
            float dimension = r2.A0p.getResources().getDimension(i);
            if (r2.A0B != dimension) {
                r2.A0B = dimension;
                r2.invalidateSelf();
                r2.A04();
            }
        }
    }

    public void setTextStartPadding(float f) {
        C36761mp r1 = this.A04;
        if (r1 != null && r1.A0C != f) {
            r1.A0C = f;
            r1.invalidateSelf();
            r1.A04();
        }
    }

    public void setTextStartPaddingResource(int i) {
        C36761mp r2 = this.A04;
        if (r2 != null) {
            float dimension = r2.A0p.getResources().getDimension(i);
            if (r2.A0C != dimension) {
                r2.A0C = dimension;
                r2.invalidateSelf();
                r2.A04();
            }
        }
    }
}
