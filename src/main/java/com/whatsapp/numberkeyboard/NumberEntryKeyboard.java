package com.whatsapp.numberkeyboard;

import X.AbstractC58752mS;
import X.AnonymousClass01X;
import X.AnonymousClass03P;
import X.AnonymousClass2WB;
import X.AnonymousClass2WC;
import X.AnonymousClass2WD;
import X.AnonymousClass2WG;
import X.C004302a;
import X.C06140Ry;
import X.C28051Sr;
import X.C58742mR;
import X.C60292p9;
import X.C60302pA;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class NumberEntryKeyboard extends LinearLayout {
    public static final int A0H = ((int) Math.floor(20.399999618530273d));
    public int A00;
    public int A01;
    public long A02 = -1;
    public Paint A03;
    public RectF A04;
    public View A05;
    public EditText A06;
    public C58742mR A07;
    public AnonymousClass2WC A08;
    public Map A09 = new HashMap();
    public Map A0A;
    public boolean A0B;
    public View[][] A0C;
    public AnonymousClass2WD[][] A0D;
    public final View.OnTouchListener A0E = new AnonymousClass2WB(this);
    public final AnonymousClass03P A0F = AnonymousClass03P.A00();
    public final AnonymousClass01X A0G = AnonymousClass01X.A00();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NumberEntryKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        AnonymousClass2WC A002;
        boolean z = false;
        LinearLayout.inflate(getContext(), R.layout.number_entry_keyboard, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.custom_key_container);
        if (!(attributeSet == null || context.getTheme().obtainStyledAttributes(attributeSet, C06140Ry.A1L, 0, 0).getInteger(0, 0) != 1 || (A002 = A00(this.A0G)) == null)) {
            this.A08 = A002;
            viewGroup.addView(((AbstractC58752mS) A002).A00(context));
        }
        if (this.A0G.A0M()) {
            this.A0C = new View[][]{new View[]{findViewById(R.id.one_key), findViewById(R.id.two_key), findViewById(R.id.three_key)}, new View[]{findViewById(R.id.four_key), findViewById(R.id.five_key), findViewById(R.id.six_key)}, new View[]{findViewById(R.id.seven_key), findViewById(R.id.eight_key), findViewById(R.id.nine_key)}, new View[]{viewGroup, findViewById(R.id.zero_key), findViewById(R.id.backspace_key)}};
        } else {
            this.A0C = new View[][]{new View[]{findViewById(R.id.three_key), findViewById(R.id.two_key), findViewById(R.id.one_key)}, new View[]{findViewById(R.id.six_key), findViewById(R.id.five_key), findViewById(R.id.four_key)}, new View[]{findViewById(R.id.nine_key), findViewById(R.id.eight_key), findViewById(R.id.seven_key)}, new View[]{findViewById(R.id.backspace_key), findViewById(R.id.zero_key), viewGroup}};
        }
        if (attributeSet != null && context.getTheme().obtainStyledAttributes(attributeSet, C06140Ry.A1L, 0, 0).getInteger(0, 0) == 1) {
            setCustomKey(A00(this.A0G));
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.number_entry_keyboard_horizontal_padding);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setOrientation(1);
        setBackgroundColor(C004302a.A00(getContext(), R.color.number_entry_keyboard_bg_color));
        for (int i2 = 0; i2 < this.A0C.length; i2++) {
            int i3 = 0;
            while (true) {
                View[][] viewArr = this.A0C;
                if (i3 >= viewArr[i2].length) {
                    break;
                }
                View view = viewArr[i2][i3];
                if (view != null && (view instanceof TextView)) {
                    TextView textView = (TextView) view;
                    NumberFormat A0G2 = this.A0G.A0G();
                    int id = view.getId();
                    if (id == R.id.zero_key) {
                        i = 0;
                    } else if (id == R.id.one_key) {
                        i = 1;
                    } else if (id == R.id.two_key) {
                        i = 2;
                    } else if (id == R.id.three_key) {
                        i = 3;
                    } else if (id == R.id.four_key) {
                        i = 4;
                    } else if (id == R.id.five_key) {
                        i = 5;
                    } else if (id == R.id.six_key) {
                        i = 6;
                    } else if (id == R.id.seven_key) {
                        i = 7;
                    } else {
                        i = 9;
                        if (id == R.id.eight_key) {
                            i = 8;
                        }
                    }
                    textView.setText(A0G2.format((long) i));
                }
                i3++;
            }
        }
        z = Settings.System.getFloat(context.getContentResolver(), "window_animation_scale", 1.0f) == 1.0f ? true : z;
        this.A0B = z;
        if (z) {
            Paint paint = new Paint(1);
            this.A03 = paint;
            paint.setColor(C004302a.A00(context, R.color.number_entry_keyboard_ripple_color));
            this.A03.setStyle(Paint.Style.FILL);
            this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            this.A04 = new RectF();
            this.A0A = new HashMap();
            this.A07 = new C58742mR(this);
        }
        setOnTouchListener(this.A0E);
    }

    public static AnonymousClass2WC A00(AnonymousClass01X r1) {
        return C28051Sr.A0r(r1).equals(".") ? new C60302pA() : new C60292p9();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0B) {
            for (Number number : this.A0A.keySet()) {
                AnonymousClass2WG r6 = (AnonymousClass2WG) this.A0A.get(Long.valueOf(number.longValue()));
                PointF pointF = r6.A04;
                float f = r6.A00;
                float f2 = pointF.x;
                float f3 = f / 2.0f;
                float f4 = pointF.y;
                this.A04.set(f2 - f3, f4 - f3, f2 + f3, f4 + f3);
                this.A03.setAlpha(r6.A01);
                canvas.drawOval(this.A04, this.A03);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            View[][] viewArr = this.A0C;
            int length = viewArr[0].length;
            float f2 = width / ((float) length);
            int length2 = viewArr.length;
            float f3 = height / ((float) length2);
            int floor = ((int) Math.floor((double) f2)) + 12;
            this.A00 = floor;
            this.A01 = (int) (((float) floor) / 2.0f);
            int[] iArr = new int[2];
            iArr[1] = length;
            iArr[0] = length2;
            this.A0D = (AnonymousClass2WD[][]) Array.newInstance(AnonymousClass2WD.class, iArr);
            for (int i6 = 0; i6 < this.A0C.length; i6++) {
                int i7 = 0;
                while (true) {
                    View[][] viewArr2 = this.A0C;
                    int length3 = viewArr2[0].length;
                    if (i7 >= length3) {
                        break;
                    }
                    View view = viewArr2[i6][i7];
                    float f4 = ((float) i7) * f2;
                    float f5 = ((float) i6) * f3;
                    float f6 = f4 + f2;
                    float f7 = f5 + f3;
                    if (i7 == 0) {
                        i5 = getPaddingLeft();
                    } else if (i7 == length3 - 1) {
                        i5 = -getPaddingRight();
                    } else {
                        f = 0.0f;
                        AnonymousClass2WD r1 = new AnonymousClass2WD(new RectF(f4, f5, f6, f7), new PointF(((f4 + f6) / 2.0f) + f, (f5 + f7) / 2.0f));
                        this.A0D[i6][i7] = r1;
                        this.A09.put(view, r1);
                        i7++;
                    }
                    f = (float) i5;
                    AnonymousClass2WD r12 = new AnonymousClass2WD(new RectF(f4, f5, f6, f7), new PointF(((f4 + f6) / 2.0f) + f, (f5 + f7) / 2.0f));
                    this.A0D[i6][i7] = r12;
                    this.A09.put(view, r12);
                    i7++;
                }
            }
        }
    }

    public void setCustomKey(AnonymousClass2WC r4) {
        this.A08 = r4;
        View[] viewArr = this.A0C[3];
        char c = 2;
        if (this.A0G.A0M()) {
            c = 0;
        }
        ViewGroup viewGroup = (ViewGroup) viewArr[c];
        viewGroup.removeAllViews();
        if (r4 != null) {
            viewGroup.addView(((AbstractC58752mS) r4).A00(getContext()));
        }
        invalidate();
    }

    public void setEditText(WaEditText waEditText) {
        this.A06 = waEditText;
    }
}
