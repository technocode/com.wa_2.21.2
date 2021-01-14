package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

/* renamed from: X.01g  reason: invalid class name and case insensitive filesystem */
public class C002301g {
    public static Typeface A0I;
    public static Typeface A0J;
    public static C002301g A0K;
    public static Boolean A0L;
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;

    public C002301g(Context context) {
        this.A00 = context.getResources().getDisplayMetrics().density;
        float f = this.A00;
        this.A06 = Math.round((((float) context.getResources().getDisplayMetrics().widthPixels) / f >= 360.0f ? 8.0f : 2.0f) * f);
        this.A04 = (int) (42.0f * f);
        this.A05 = (int) (22.0f * f);
        float f2 = f * 3.0f;
        this.A0H = (int) f2;
        float f3 = f * 4.0f;
        int i = (int) f3;
        this.A0C = i;
        float f4 = f * 2.0f;
        this.A0D = (int) f4;
        this.A0G = (int) (10.0f * f);
        this.A07 = (int) (f3 / 3.0f);
        this.A0F = (int) (f2 / 2.0f);
        this.A0E = Math.max(1, (int) (f / 2.0f));
        this.A02 = (float) i;
        this.A03 = f4;
        this.A09 = (int) (83.333336f * f);
        int i2 = (int) (1.3333334f * f);
        this.A08 = i2;
        this.A01 = 3.3333333f * f;
        this.A0A = (int) (2.6666667f * f);
        this.A0B = i2;
    }

    public static int A00(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.densityDpi;
        if (i >= 320) {
            return (int) (displayMetrics.density * 25.0f);
        }
        if (i >= 240) {
            return 38;
        }
        return i >= 160 ? 25 : 19;
    }

    public static Typeface A01(Context context) {
        Typeface typeface = A0J;
        if (typeface != null) {
            return typeface;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Typeface create = Typeface.create("sans-serif-medium", 0);
            A0J = create;
            return create;
        }
        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf");
        A0J = createFromAsset;
        return createFromAsset;
    }

    public static void A02() {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(20.0f);
        textPaint.setTypeface(Typeface.DEFAULT);
        float measureText = textPaint.measureText("ABCabc123");
        if (Build.VERSION.SDK_INT >= 21) {
            A0L = Boolean.TRUE;
            return;
        }
        boolean z = false;
        if (measureText == 105.0f) {
            z = true;
        }
        A0L = Boolean.valueOf(z);
    }

    public static void A03(TextView textView) {
        if (A0L == null) {
            A02();
        }
        if (A0L.booleanValue()) {
            textView.setTypeface(A01(textView.getContext()));
            return;
        }
        Typeface typeface = A0I;
        boolean z = true;
        if (typeface == null) {
            typeface = Typeface.create(Typeface.DEFAULT, 1);
            A0I = typeface;
        }
        textView.setTypeface(typeface);
        TextPaint paint = textView.getPaint();
        if ((A0I.getStyle() & 1) != 0) {
            z = false;
        }
        paint.setFakeBoldText(z);
    }

    public void A04(EditText editText) {
        float f = this.A00;
        if (f >= 1.5f) {
            editText.setMaxLines(6);
        } else if (f >= 1.0f) {
            editText.setMaxLines(5);
        } else {
            editText.setMaxLines(4);
        }
    }
}
