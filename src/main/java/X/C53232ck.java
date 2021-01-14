package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.2ck  reason: invalid class name and case insensitive filesystem */
public class C53232ck extends AbstractC48582Mw {
    public static Typeface A0C;
    public static Typeface A0D;
    public static Typeface A0E;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04 = 0;
    public StaticLayout A05;
    public TextPaint A06 = new TextPaint(1);
    public String A07;
    public String A08;
    public final Context A09;
    public final AnonymousClass01X A0A;
    public final C02590Cr A0B;

    public C53232ck(Context context, C02590Cr r4, AnonymousClass01X r5) {
        this.A09 = context;
        this.A0B = r4;
        this.A0A = r5;
        super.A03.setStyle(Paint.Style.FILL);
    }

    public static Typeface A00(Context context) {
        Typeface typeface = A0D;
        if (typeface != null) {
            return typeface;
        }
        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/Oswald-Heavy.ttf");
        A0D = createFromAsset;
        return createFromAsset;
    }

    public static Typeface A01(Context context) {
        Typeface typeface = A0E;
        if (typeface != null) {
            return typeface;
        }
        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/Norican-Regular.ttf");
        A0E = createFromAsset;
        return createFromAsset;
    }

    @Override // X.AbstractC48582Mw
    public void A0E(RectF rectF, float f, float f2, float f3, float f4) {
        this.A03 = Math.abs(f3 - f);
        this.A02 = Math.abs(f4 - f2);
        RectF rectF2 = super.A04;
        rectF2.set(f, f2, f3, f4);
        rectF2.sort();
        A0H();
    }

    @Override // X.AbstractC48582Mw
    public void A0F(JSONObject jSONObject) {
        super.A0F(jSONObject);
        jSONObject.put("orig-w", (int) (this.A03 * 100.0f));
        jSONObject.put("orig-h", (int) (this.A02 * 100.0f));
        jSONObject.put("text", this.A07);
        jSONObject.put("text-size", (int) (this.A06.getTextSize() * 100.0f));
        jSONObject.put("style", this.A04);
    }

    @Override // X.AbstractC48582Mw
    public boolean A0G(JSONObject jSONObject) {
        String str;
        this.A03 = ((float) jSONObject.getInt("orig-w")) / 100.0f;
        this.A02 = ((float) jSONObject.getInt("orig-h")) / 100.0f;
        this.A01 = 0.0f;
        A0J(jSONObject.getString("text"), jSONObject.getInt("style"));
        if (this.A04 == 3) {
            str = this.A08;
        } else {
            str = this.A07;
        }
        this.A06.setTextSize(((float) jSONObject.getInt("text-size")) / 100.0f);
        this.A05 = new StaticLayout(C003701u.A00(C002001d.A1H(str, this.A09, this.A06, this.A0B)), this.A06, ((int) this.A03) + 1, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.A01 = 0.0f;
        for (int i = 0; i < this.A05.getLineCount(); i++) {
            float lineWidth = this.A05.getLineWidth(i);
            if (lineWidth > this.A01) {
                this.A01 = lineWidth;
            }
        }
        this.A00 = (float) this.A05.getHeight();
        super.A0G(jSONObject);
        return true;
    }

    public final void A0H() {
        String str;
        if (!TextUtils.isEmpty(this.A07)) {
            if (this.A04 == 3) {
                str = this.A08;
            } else {
                str = this.A07;
            }
            float f = AbstractC48582Mw.A07 + 1.0f;
            this.A06.setTextSize(f);
            float desiredWidth = Layout.getDesiredWidth(str, this.A06);
            while (f < AbstractC48582Mw.A0A && desiredWidth < super.A04.width()) {
                f += 1.0f;
                this.A06.setTextSize(f);
                desiredWidth = Layout.getDesiredWidth(str, this.A06);
            }
            this.A06.setTextSize(f - 1.0f);
            this.A06.setColor(super.A03.getColor());
            CharSequence A002 = C003701u.A00(C002001d.A1H(str, this.A09, this.A06, this.A0B));
            TextPaint textPaint = this.A06;
            RectF rectF = super.A04;
            this.A05 = new StaticLayout(A002, textPaint, ((int) rectF.width()) + 1, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.A01 = 0.0f;
            for (int i = 0; i < this.A05.getLineCount(); i++) {
                float lineWidth = this.A05.getLineWidth(i);
                if (lineWidth > this.A01) {
                    this.A01 = lineWidth;
                }
            }
            float height = (float) this.A05.getHeight();
            this.A00 = height;
            float f2 = rectF.left;
            float f3 = rectF.top;
            float f4 = rectF.right;
            float f5 = rectF.bottom;
            float f6 = f2 + f4;
            float f7 = this.A01;
            float f8 = f3 + f5;
            rectF.set((f6 - f7) / 2.0f, (f8 - height) / 2.0f, (f6 + f7) / 2.0f, (f8 + height) / 2.0f);
            rectF.sort();
        }
    }

    public void A0I(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            if (i == 3) {
                this.A06.setTypeface(A00(this.A09));
            } else if (i == 2) {
                this.A06.setTypeface(A01(this.A09));
            } else {
                this.A06.setTypeface(Typeface.DEFAULT);
            }
            TextPaint textPaint = this.A06;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            textPaint.setFakeBoldText(z);
            if (this.A01 != 0.0f) {
                RectF rectF = super.A04;
                float width = rectF.width() / this.A01;
                rectF.set(rectF.centerX() - (this.A03 / 2.0f), rectF.centerY() - (this.A02 / 2.0f), (this.A03 / 2.0f) + rectF.centerX(), (this.A02 / 2.0f) + rectF.centerY());
                A0H();
                rectF.set(rectF.centerX() - ((rectF.width() * width) / 2.0f), rectF.centerY() - ((rectF.height() * width) / 2.0f), ((rectF.width() * width) / 2.0f) + rectF.centerX(), ((rectF.height() * width) / 2.0f) + rectF.centerY());
            }
        }
    }

    public void A0J(String str, int i) {
        this.A07 = str;
        this.A08 = str.toUpperCase(this.A0A.A0I());
        this.A04 = i;
        if (i == 3) {
            this.A06.setTypeface(A00(this.A09));
        } else if (i == 2) {
            this.A06.setTypeface(A01(this.A09));
        } else {
            this.A06.setTypeface(Typeface.DEFAULT);
        }
        TextPaint textPaint = this.A06;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if (this.A01 != 0.0f) {
            RectF rectF = super.A04;
            float width = rectF.width() / this.A01;
            rectF.set(rectF.centerX() - (this.A03 / 2.0f), rectF.centerY() - (this.A02 / 2.0f), (this.A03 / 2.0f) + rectF.centerX(), (this.A02 / 2.0f) + rectF.centerY());
            A0H();
            rectF.set(rectF.centerX() - ((rectF.width() * width) / 2.0f), rectF.centerY() - ((rectF.height() * width) / 2.0f), ((rectF.width() * width) / 2.0f) + rectF.centerX(), ((rectF.height() * width) / 2.0f) + rectF.centerY());
        }
    }
}
