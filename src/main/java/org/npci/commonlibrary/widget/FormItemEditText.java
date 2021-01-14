package org.npci.commonlibrary.widget;

import X.AnonymousClass0Q7;
import X.AnonymousClass2R7;
import X.AnonymousClass3BS;
import X.AnonymousClass3BT;
import X.AnonymousClass3BU;
import X.AnonymousClass3BV;
import X.C06560Tv;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;
import java.util.Locale;

public class FormItemEditText extends WaEditText {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public ColorStateList A08;
    public Paint A09;
    public Paint A0A;
    public Paint A0B;
    public Paint A0C;
    public Drawable A0D;
    public View.OnClickListener A0E;
    public String A0F = null;
    public String A0G = null;
    public StringBuilder A0H = null;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public float[] A0M;
    public float[] A0N;
    public float[] A0O;
    public RectF[] A0P;
    public final Rect A0Q;
    public final int[] A0R;
    public final int[][] A0S;

    /* JADX INFO: finally extract failed */
    public FormItemEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.A06 = 0;
        this.A04 = 24.0f;
        this.A03 = 4.0f;
        this.A05 = 8.0f;
        this.A07 = 4;
        this.A0Q = new Rect();
        this.A0K = false;
        this.A01 = 1.0f;
        this.A02 = 2.0f;
        this.A0I = false;
        this.A0J = false;
        this.A0S = new int[][]{new int[]{16842913}, new int[]{16842914}, new int[]{16842908}, new int[]{-16842908}};
        int[] iArr = {-16711936, -65536, -16777216, -7829368};
        this.A0R = iArr;
        this.A08 = new ColorStateList(this.A0S, iArr);
        this.A0O = new float[6];
        this.A0M = new float[6];
        this.A01 = (float) A03(1.0f);
        this.A02 = (float) A03(this.A02);
        this.A04 = (float) A03(this.A04);
        this.A05 = (float) A03(this.A05);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2R7.A12, 0, 0);
        try {
            TypedValue typedValue = new TypedValue();
            obtainStyledAttributes.getValue(0, typedValue);
            this.A06 = typedValue.data;
            this.A0F = obtainStyledAttributes.getString(3);
            this.A0G = obtainStyledAttributes.getString(11);
            this.A01 = obtainStyledAttributes.getDimension(8, this.A01);
            this.A02 = obtainStyledAttributes.getDimension(10, this.A02);
            this.A0L = obtainStyledAttributes.getBoolean(9, false);
            this.A00 = obtainStyledAttributes.getDimension(4, 0.0f);
            this.A04 = obtainStyledAttributes.getDimension(5, this.A04);
            this.A05 = obtainStyledAttributes.getDimension(12, this.A05);
            this.A0K = obtainStyledAttributes.getBoolean(2, this.A0K);
            this.A0D = obtainStyledAttributes.getDrawable(1);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(7);
            if (colorStateList != null) {
                this.A08 = colorStateList;
            }
            obtainStyledAttributes.recycle();
            this.A09 = new Paint(getPaint());
            this.A0A = new Paint(getPaint());
            this.A0C = new Paint(getPaint());
            Paint paint = new Paint(getPaint());
            this.A0B = paint;
            paint.setStrokeWidth(this.A01);
            setFontSize(this.A00);
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorControlActivated, typedValue2, true);
            int i = typedValue2.data;
            int[] iArr2 = this.A0R;
            iArr2[0] = i;
            iArr2[1] = -7829368;
            iArr2[2] = -7829368;
            setBackgroundResource(0);
            int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", 4);
            this.A07 = attributeIntValue;
            this.A03 = (float) attributeIntValue;
            super.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 38));
            super.setOnLongClickListener(new AnonymousClass3BS(this));
            if ((getInputType() & 128) == 128 && TextUtils.isEmpty(this.A0F)) {
                this.A0F = "●";
            } else if ((getInputType() & 16) == 16 && TextUtils.isEmpty(this.A0F)) {
                this.A0F = "●";
            }
            if (!TextUtils.isEmpty(this.A0F)) {
                this.A0H = getMaskChars();
            }
            getPaint().getTextBounds("|", 0, 1, this.A0Q);
            this.A0I = this.A06 > -1 ? true : z;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int A03(float f) {
        return (int) (f * ((float) (getResources().getDisplayMetrics().densityDpi / 160)));
    }

    private CharSequence getFullText() {
        if (this.A0F == null) {
            return getText();
        }
        return getMaskChars();
    }

    private StringBuilder getMaskChars() {
        if (this.A0H == null) {
            this.A0H = new StringBuilder();
        }
        int length = getText().length();
        while (true) {
            StringBuilder sb = this.A0H;
            if (sb.length() == length) {
                return sb;
            }
            if (sb.length() < length) {
                sb.append(this.A0F);
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    @Override // com.whatsapp.WaEditText
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        int colorForState;
        int colorForState2;
        CharSequence fullText = getFullText();
        int length = fullText.length();
        float[] fArr = this.A0O;
        int length2 = fArr.length;
        if (length2 < length) {
            float[] fArr2 = new float[(length + 0)];
            System.arraycopy(fArr, 0, fArr2, 0, length2);
            fArr = fArr2;
        }
        this.A0O = fArr;
        getPaint().getTextWidths(fullText, 0, length, this.A0O);
        String str = this.A0G;
        float f2 = 0.0f;
        if (str != null) {
            float[] fArr3 = this.A0M;
            int length3 = str.length();
            int length4 = fArr3.length;
            if (length4 < length3) {
                float[] fArr4 = new float[(length3 + 0)];
                System.arraycopy(fArr3, 0, fArr4, 0, length4);
                fArr3 = fArr4;
            }
            this.A0M = fArr3;
            getPaint().getTextWidths(this.A0G, this.A0M);
            for (int i2 = 0; i2 < this.A0G.length(); i2++) {
                f2 += this.A0M[i2];
            }
        }
        for (int i3 = 0; ((float) i3) < this.A03; i3++) {
            Drawable drawable = this.A0D;
            if (drawable != null) {
                boolean z = false;
                if (i3 < length) {
                    z = true;
                }
                boolean z2 = false;
                if (i3 == length) {
                    z2 = true;
                }
                if (this.A0J) {
                    drawable.setState(new int[]{16842914});
                } else if (isFocused()) {
                    this.A0D.setState(new int[]{16842908});
                    if (z2) {
                        this.A0D.setState(new int[]{16842908, 16842913});
                    } else if (z) {
                        this.A0D.setState(new int[]{16842908, 16842912});
                    }
                } else {
                    this.A0D.setState(new int[]{-16842908});
                }
                Drawable drawable2 = this.A0D;
                RectF rectF = this.A0P[i3];
                drawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.A0D.draw(canvas);
            }
            float f3 = (this.A00 / 2.0f) + this.A0P[i3].left;
            if (length <= i3) {
                i = 1;
                String str2 = this.A0G;
                if (str2 != null) {
                    canvas.drawText(str2, f3 - (f2 / 2.0f), this.A0N[i3], this.A0C);
                }
            } else if (!this.A0I || i3 != length - 1) {
                i = 1;
                canvas.drawText(fullText, i3, i3 + 1, f3 - (this.A0O[i3] / 2.0f), this.A0N[i3], this.A09);
            } else {
                i = 1;
                canvas.drawText(fullText, i3, i3 + 1, f3 - (this.A0O[i3] / 2.0f), this.A0N[i3], this.A0A);
            }
            if (this.A0D == null) {
                boolean z3 = false;
                if (i3 < length) {
                    z3 = true;
                }
                boolean z4 = false;
                if (i3 == length) {
                    z4 = true;
                }
                if (this.A0J) {
                    Paint paint = this.A0B;
                    int[] iArr = new int[i];
                    iArr[0] = 16842914;
                    paint.setColor(this.A08.getColorForState(iArr, -7829368));
                } else {
                    Paint paint2 = this.A0B;
                    if (isFocused()) {
                        f = this.A02;
                    } else {
                        f = this.A01;
                    }
                    paint2.setStrokeWidth(f);
                    if (z3) {
                        Paint paint3 = this.A0B;
                        int[] iArr2 = new int[i];
                        iArr2[0] = 16842913;
                        paint3.setColor(this.A08.getColorForState(iArr2, -7829368));
                    } else if (z4) {
                        if (isFocused()) {
                            int[] iArr3 = new int[i];
                            iArr3[0] = 16842918;
                            colorForState2 = this.A08.getColorForState(iArr3, -7829368);
                        } else {
                            int[] iArr4 = new int[i];
                            iArr4[0] = -16842918;
                            colorForState2 = this.A08.getColorForState(iArr4, -7829368);
                        }
                        this.A0B.setColor(colorForState2);
                    } else {
                        if (isFocused()) {
                            int[] iArr5 = new int[i];
                            iArr5[0] = 16842908;
                            colorForState = this.A08.getColorForState(iArr5, -7829368);
                        } else {
                            int[] iArr6 = new int[i];
                            iArr6[0] = -16842908;
                            colorForState = this.A08.getColorForState(iArr6, -7829368);
                        }
                        this.A0B.setColor(colorForState);
                    }
                }
                RectF rectF2 = this.A0P[i3];
                canvas.drawLine(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, this.A0B);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            this.A0A.setColor(textColors.getDefaultColor());
            this.A09.setColor(textColors.getDefaultColor());
            this.A0C.setColor(getCurrentHintTextColor());
        }
        int width = (getWidth() - AnonymousClass0Q7.A06(this)) - AnonymousClass0Q7.A07(this);
        float f = this.A04;
        if (f < 0.0f) {
            this.A00 = ((float) width) / ((this.A03 * 2.0f) - 1.0f);
        } else if (this.A00 == 0.0f) {
            float f2 = (float) width;
            float f3 = this.A03;
            this.A00 = (f2 - ((f3 - 1.0f) * f)) / f3;
        }
        int i6 = (int) this.A03;
        this.A0P = new RectF[i6];
        this.A0N = new float[i6];
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        int i7 = 1;
        if (C06560Tv.A00(Locale.getDefault()) == 1) {
            i7 = -1;
            i5 = (int) (((float) (getWidth() - AnonymousClass0Q7.A07(this))) - this.A00);
        } else {
            i5 = AnonymousClass0Q7.A07(this);
        }
        for (int i8 = 0; ((float) i8) < this.A03; i8++) {
            float f4 = (float) i5;
            float f5 = (float) height;
            this.A0P[i8] = new RectF(f4, f5, this.A00 + f4, f5);
            if (this.A0D != null) {
                if (this.A0K) {
                    this.A0P[i8].top = (float) getPaddingTop();
                    RectF rectF = this.A0P[i8];
                    rectF.right = rectF.height() + f4;
                } else {
                    this.A0P[i8].top -= (this.A05 * 2.0f) + ((float) this.A0Q.height());
                }
            }
            float f6 = this.A04;
            if (f6 < 0.0f) {
                i5 = (int) ((((float) i7) * this.A00 * 2.0f) + f4);
            } else {
                i5 = (int) (((this.A00 + f6) * ((float) i7)) + f4);
            }
            float[] fArr = this.A0N;
            RectF[] rectFArr = this.A0P;
            fArr[i8] = rectFArr[i8].bottom - this.A05;
            if (this.A0L) {
                RectF rectF2 = rectFArr[i8];
                rectF2.top /= 2.0f;
                rectF2.bottom /= 2.0f;
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A0J = false;
        RectF[] rectFArr = this.A0P;
        if (rectFArr != null && this.A0I) {
            int i4 = this.A06;
            if (i4 == -1) {
                invalidate();
            } else if (i3 <= i2) {
            } else {
                if (i4 == 0) {
                    this.A0A.setAlpha(125);
                    ValueAnimator ofInt = ValueAnimator.ofInt(125, 255);
                    ofInt.setDuration(150L);
                    ofInt.addUpdateListener(new AnonymousClass3BT(this));
                    AnimatorSet animatorSet = new AnimatorSet();
                    charSequence.length();
                    animatorSet.playTogether(ofInt);
                    animatorSet.start();
                    return;
                }
                float[] fArr = this.A0N;
                float f = rectFArr[i].bottom - this.A05;
                fArr[i] = f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(getPaint().getTextSize() + f, this.A0N[i]);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(new OvershootInterpolator());
                ofFloat.addUpdateListener(new AnonymousClass3BU(this, i));
                this.A0A.setAlpha(255);
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 255);
                ofInt2.setDuration(300L);
                ofInt2.addUpdateListener(new AnonymousClass3BV(this));
                AnimatorSet animatorSet2 = new AnimatorSet();
                charSequence.length();
                animatorSet2.playTogether(ofFloat, ofInt2);
                animatorSet2.start();
            }
        }
    }

    public boolean performClick() {
        return super.performClick();
    }

    public void setCharSize(float f) {
        this.A00 = f;
        invalidate();
    }

    public void setColorStates(ColorStateList colorStateList) {
        this.A08 = colorStateList;
        invalidate();
    }

    @Override // X.C07670Zb
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw new RuntimeException("setCustomSelectionActionModeCallback() not supported.");
    }

    private void setError(boolean z) {
        this.A0J = z;
    }

    public void setFontSize(float f) {
        this.A09.setTextSize(f);
        this.A0A.setTextSize(f);
        this.A0C.setTextSize(f);
    }

    public void setLineStroke(float f) {
        this.A01 = f;
        invalidate();
    }

    public void setLineStrokeCentered(boolean z) {
        this.A0L = z;
        invalidate();
    }

    public void setLineStrokeSelected(float f) {
        this.A02 = f;
        invalidate();
    }

    public void setMargin(int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
        setLayoutParams(marginLayoutParams);
    }

    public void setMaxLength(int i) {
        this.A07 = i;
        this.A03 = (float) i;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A0E = onClickListener;
    }

    public void setSpace(float f) {
        this.A04 = f;
        invalidate();
    }
}
