package com.whatsapp;

import X.AbstractC11890hA;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass03P;
import X.AnonymousClass0Pz;
import X.AnonymousClass0Q7;
import X.C002001d;
import X.C004302a;
import X.C004402b;
import X.C02590Cr;
import X.C05250Nu;
import X.C05710Pt;
import X.C11880h9;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.util.List;

public class TextEmojiLabel extends WaTextView {
    public static boolean A0D;
    public static final Spannable.Factory A0E = new C11880h9();
    public static final boolean A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Paint A04;
    public TextView.BufferType A05;
    public AnonymousClass0Pz A06;
    public C05710Pt A07;
    public CharSequence A08;
    public final AnonymousClass03P A09;
    public final AnonymousClass01X A0A;
    public final C02590Cr A0B = C02590Cr.A00();
    public final AnonymousClass022 A0C;

    static {
        boolean z;
        boolean z2 = true;
        try {
            Class cls = Integer.TYPE;
            Layout.class.getDeclaredMethod("processToSupportEmoji", CharSequence.class, cls, cls);
            z = true;
        } catch (NoSuchMethodException | SecurityException unused) {
            z = false;
        }
        A0D = z;
        if (Build.VERSION.SDK_INT >= 19) {
            z2 = false;
        }
        A0F = z2;
    }

    public TextEmojiLabel(Context context) {
        super(context);
        AnonymousClass03P A002;
        AnonymousClass01X A003;
        AnonymousClass022 r1 = null;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass03P.A00();
        }
        this.A09 = A002;
        if (isInEditMode()) {
            A003 = null;
        } else {
            A003 = AnonymousClass01X.A00();
        }
        this.A0A = A003;
        this.A0C = !isInEditMode() ? AnonymousClass022.A00() : r1;
        if (A0F) {
            setSpannableFactory(A0E);
        }
        if (Build.VERSION.SDK_INT == 29) {
            setBreakStrategy(0);
        }
    }

    public TextEmojiLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass03P A002;
        AnonymousClass01X A003;
        AnonymousClass022 r1 = null;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass03P.A00();
        }
        this.A09 = A002;
        if (isInEditMode()) {
            A003 = null;
        } else {
            A003 = AnonymousClass01X.A00();
        }
        this.A0A = A003;
        this.A0C = !isInEditMode() ? AnonymousClass022.A00() : r1;
        if (A0F) {
            setSpannableFactory(A0E);
        }
        if (Build.VERSION.SDK_INT == 29) {
            setBreakStrategy(0);
        }
    }

    public static final String A00(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length * 6);
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            sb.append("0x");
            sb.append(Integer.toHexString(charAt));
            sb.append(", ");
        }
        return sb.toString();
    }

    public void A01(int i) {
        Drawable A032 = C004302a.A03(getContext(), i);
        if (this.A0A.A02().A06) {
            setCompoundDrawablesWithIntrinsicBounds(A032, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A032, (Drawable) null);
        }
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(R.dimen.verified_indicator_padding));
    }

    public void A02(CharSequence charSequence) {
        A04(charSequence, null, false, 0);
    }

    public void A03(CharSequence charSequence, List list, AbstractC11890hA r10, boolean z, int i, boolean z2, int i2) {
        AbstractC11890hA r4 = r10;
        if (z) {
            AnonymousClass03P r1 = this.A09;
            if (z2) {
                charSequence = C002001d.A1D(r1, this.A0C, charSequence, true, i2);
            } else {
                charSequence = C002001d.A1C(r1, this.A0C, charSequence);
            }
        }
        if (i > 0 && charSequence != null && charSequence.length() > i) {
            int charCount = (Character.charCount(Character.codePointAt(charSequence, i - 1)) - 1) + i;
            if (charSequence instanceof Editable) {
                charSequence = ((Editable) charSequence).delete(charCount, charSequence.length());
            } else {
                charSequence = TextUtils.substring(charSequence, 0, charCount);
            }
        }
        CharSequence A1H = C002001d.A1H(charSequence, getContext(), getPaint(), this.A0B);
        if (r10 == null) {
            r4 = AbstractC11890hA.A04;
        }
        setText((CharSequence) AbstractC11890hA.A00(getContext(), A1H, list, r4, false, this.A0A).A00);
    }

    public void A04(CharSequence charSequence, List list, boolean z, int i) {
        A03(charSequence, list, null, z, i, false, 0);
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        AnonymousClass0Pz r0 = this.A06;
        return (r0 != null && r0.A0E(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AnonymousClass0Pz r0 = this.A06;
        return (r0 != null && r0.A0D(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public void onDraw(Canvas canvas) {
        int lineStart;
        if (this.A03 > 0) {
            canvas.drawRect((float) (getPaddingLeft() + getScrollX()), (float) (((getHeight() - getPaddingBottom()) - this.A01) - this.A02), (float) ((getWidth() + getScrollX()) - getPaddingRight()), (float) ((getHeight() - getPaddingBottom()) - this.A01), this.A04);
            return;
        }
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException unused) {
            setText(getText());
        } catch (Exception e) {
            Log.e(e);
            StringBuilder sb = new StringBuilder("measuredwidth: ");
            sb.append(getMeasuredWidth());
            Log.e(sb.toString());
            CharSequence text = getText();
            StringBuilder A0S = AnonymousClass008.A0S("text: ");
            A0S.append(A00(text));
            Log.e(A0S.toString());
            Layout layout = getLayout();
            StringBuilder A0S2 = AnonymousClass008.A0S("line_count: ");
            A0S2.append(layout.getLineCount());
            Log.e(A0S2.toString());
            for (int i = 0; i < layout.getLineCount(); i++) {
                int lineStart2 = layout.getLineStart(i);
                if (i == layout.getLineCount() - 1) {
                    lineStart = text.length();
                } else {
                    lineStart = layout.getLineStart(i + 1);
                }
                if (lineStart2 <= lineStart) {
                    StringBuilder A0U = AnonymousClass008.A0U("line ", i, " (", lineStart2, "-");
                    A0U.append(lineStart);
                    A0U.append("): ");
                    A0U.append(A00(text.subSequence(lineStart2, lineStart)));
                    Log.e(A0U.toString());
                } else {
                    StringBuilder A0U2 = AnonymousClass008.A0U("line ", i, " (", lineStart2, "-");
                    A0U2.append(lineStart);
                    A0U2.append(")");
                    Log.e(A0U2.toString());
                }
            }
            throw new RuntimeException(e);
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        AnonymousClass0Pz r2 = this.A06;
        if (r2 != null) {
            int i2 = r2.A01;
            if (i2 != Integer.MIN_VALUE) {
                r2.A09(i2);
            }
            if (z) {
                r2.A0C(i, rect);
            }
        }
    }

    @Override // X.C05560Pe
    public void onMeasure(int i, int i2) {
        int size;
        CharSequence charSequence;
        int measuredWidth;
        if (this.A03 > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size2 = View.MeasureSpec.getSize(i);
            super.onMeasure(i, i2);
            if (mode != 1073741824) {
                measuredWidth = (size2 * this.A03) / 100;
            } else {
                measuredWidth = getMeasuredWidth();
            }
            setMeasuredDimension(measuredWidth, getMeasuredHeight());
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 == 16 || i3 == 17) {
            try {
                super.onMeasure(i, i2);
            } catch (IndexOutOfBoundsException e) {
                Log.e("textemojilabel/measure ", e);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A08);
                int nextSpanTransition = spannableStringBuilder.nextSpanTransition(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
                while (nextSpanTransition >= 0 && nextSpanTransition < spannableStringBuilder.length()) {
                    spannableStringBuilder.insert(nextSpanTransition, (CharSequence) " ");
                    nextSpanTransition = spannableStringBuilder.nextSpanTransition(nextSpanTransition + 1, spannableStringBuilder.length(), MetricAffectingSpan.class);
                }
                try {
                    this.A08 = spannableStringBuilder;
                    super.setText(spannableStringBuilder);
                    super.onMeasure(i, i2);
                } catch (ArrayIndexOutOfBoundsException e2) {
                    Log.e("textemojilabel/measure1 ", e2);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.A08);
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder2, '\n', 0);
                    while (indexOf >= 0) {
                        int i4 = indexOf + 1;
                        spannableStringBuilder2 = spannableStringBuilder2.replace(indexOf, i4, (CharSequence) " ");
                        indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder2, '\n', i4);
                    }
                    this.A08 = spannableStringBuilder2;
                    super.setText(spannableStringBuilder2);
                    super.onMeasure(i, i2);
                }
            }
        } else {
            super.onMeasure(i, i2);
        }
        if (View.MeasureSpec.getMode(i) != 0 && (size = (View.MeasureSpec.getSize(i) - getCompoundPaddingLeft()) - getCompoundPaddingRight()) > 0 && this.A00 != size && (this.A08 instanceof Spanned) && getEllipsize() != null && (getTransformationMethod() instanceof SingleLineTransformationMethod)) {
            this.A00 = size;
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(this.A08, this);
            } else {
                charSequence = this.A08;
            }
            CharSequence ellipsize = TextUtils.ellipsize(charSequence, getPaint(), (float) size, getEllipsize());
            if (ellipsize != null && !ellipsize.equals(charSequence)) {
                super.setText(ellipsize, this.A05);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.A07 == null) {
            return onTouchEvent;
        }
        CharSequence text = getText();
        return (!(text instanceof Spannable) || getLayout() == null) ? onTouchEvent : onTouchEvent | this.A07.onTouchEvent(this, (Spannable) text, motionEvent);
    }

    public void setAccessibilityHelper(AnonymousClass0Pz r1) {
        this.A06 = r1;
        AnonymousClass0Q7.A0d(this, r1);
    }

    public void setLinkHandler(C05710Pt r1) {
        this.A07 = r1;
    }

    public void setPlaceholder(int i) {
        if (this.A03 != i) {
            this.A03 = i;
            if (i > 0) {
                Paint.FontMetricsInt A002 = C05250Nu.A00(getPaint());
                this.A02 = ((-A002.ascent) * 6) / 10;
                this.A01 = A002.bottom;
                Paint paint = this.A04;
                if (paint == null) {
                    paint = new Paint();
                    this.A04 = paint;
                }
                paint.setColor(C004402b.A03(getPaint().getColor(), (Color.alpha(getPaint().getColor()) * 12) / 255));
            }
            invalidate();
        }
    }

    @Override // android.widget.TextView, com.whatsapp.WaTextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (A0D && charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            for (int i = 0; i < charSequence.length(); i++) {
                char charAt = charSequence.charAt(i);
                if (55296 <= charAt && charAt <= 57343) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    }
                    spannableStringBuilder.replace(i, i + 1, (CharSequence) "□");
                }
            }
            if (spannableStringBuilder != null) {
                charSequence = spannableStringBuilder;
            }
        }
        this.A08 = charSequence;
        this.A05 = bufferType;
        this.A00 = 0;
        if (charSequence != null && charSequence.length() >= 3000) {
            StringBuilder A0S = AnonymousClass008.A0S("textemojilabel/text length/");
            A0S.append(charSequence.length() / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
            Log.d(A0S.toString());
        }
        if ((A0F || this.A07 != null) && (charSequence instanceof Spanned)) {
            super.setText(charSequence, TextView.BufferType.SPANNABLE);
        } else {
            super.setText(charSequence, bufferType);
        }
    }
}
