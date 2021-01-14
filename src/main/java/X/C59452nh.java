package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.2nh  reason: invalid class name and case insensitive filesystem */
public class C59452nh extends AbstractC53152cc {
    public float A00;
    public Boolean A01;
    public String A02;
    public String A03;
    public SimpleDateFormat A04;
    public SimpleDateFormat A05;
    public SimpleDateFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final Paint A0B = new Paint(1);
    public final Paint A0C = new TextPaint(1);
    public final Paint A0D = new Paint(1);
    public final Paint A0E = new TextPaint(1);
    public final Paint A0F = new Paint(1);
    public final Paint A0G = new TextPaint(1);
    public final Paint A0H = new Paint(1);
    public final Paint A0I = new TextPaint(1);
    public final Rect A0J = new Rect();
    public final AnonymousClass01X A0K;
    public final AbstractC48612Mz A0L = new C53132ca(this);
    public final AnonymousClass2N0 A0M;
    public final AnonymousClass2N1 A0N;
    public final boolean A0O;
    public final C48562Mu[] A0P = new C48562Mu[2];
    public final C48562Mu[] A0Q = new C48562Mu[2];

    public C59452nh(Context context, AnonymousClass01X r13, boolean z) {
        boolean z2;
        String str;
        this.A0A = context;
        this.A0K = r13;
        Locale A0I2 = r13.A0I();
        this.A06 = new SimpleDateFormat(this.A0K.A05(224), A0I2);
        String A052 = this.A0K.A05(223);
        int length = A052.length();
        int i = 0;
        boolean z3 = false;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = A052.charAt(i);
            z3 = charAt == '\'' ? !z3 : z3;
            if (z3 || charAt != 'a') {
                i++;
            } else if (i != -1) {
                int i2 = i;
                while (i2 > 0) {
                    int codePointBefore = A052.codePointBefore(i2);
                    if (!Character.isSpaceChar(codePointBefore)) {
                        break;
                    }
                    i2 -= Character.charCount(codePointBefore);
                }
                int i3 = i + 1;
                while (i3 < length) {
                    int codePointAt = A052.codePointAt(i3);
                    if (codePointAt != 97 && !Character.isSpaceChar(codePointAt)) {
                        break;
                    }
                    i3 += Character.charCount(codePointAt);
                }
                if (i2 == 0) {
                    String substring = A052.substring(i3);
                    str = A052.substring(0, i3);
                    z2 = false;
                    A052 = substring;
                } else if (i3 == length) {
                    String substring2 = A052.substring(0, i2);
                    str = A052.substring(i2);
                    A052 = substring2;
                } else {
                    Log.e("AM/PM markers in 12-hour formats should be at one end.");
                }
            }
        }
        Log.e("12-hour formats must contain AM/PM marker.");
        str = "";
        z2 = true;
        this.A05 = new SimpleDateFormat(A052, A0I2);
        this.A04 = new SimpleDateFormat(str, A0I2);
        if (this.A0K.A0M()) {
            this.A09 = z2;
        } else {
            String str2 = this.A04.getDateFormatSymbols().getAmPmStrings()[0];
            if (((AbstractC06530Tr) C06510Tp.A02).A00(str2, str2.length())) {
                this.A09 = !z2;
            } else {
                this.A09 = z2;
            }
        }
        this.A0O = z;
        this.A01 = Boolean.TRUE;
        this.A0H.setColor(-1);
        this.A0H.setStyle(Paint.Style.FILL);
        this.A0H.setAlpha(242);
        this.A0F.setColor(-16777216);
        this.A0F.setStyle(Paint.Style.STROKE);
        this.A0F.setAlpha(153);
        this.A0F.setStrokeWidth(5.0f);
        this.A0I.setColor(-16777216);
        this.A0I.setAlpha(179);
        this.A0I.setTextSize(62.0f);
        this.A0I.setTypeface(C002301g.A01(this.A0A));
        this.A0G.setColor(-16777216);
        this.A0G.setAlpha(179);
        this.A0G.setTextSize(40.0f);
        this.A0G.setTypeface(Typeface.DEFAULT_BOLD);
        this.A08 = true;
        this.A0D.setColor(-16777216);
        this.A0D.setStyle(Paint.Style.FILL);
        this.A0D.setAlpha(90);
        this.A0B.setColor(-1);
        this.A0B.setStyle(Paint.Style.STROKE);
        this.A0B.setStrokeWidth(5.0f);
        this.A0E.setColor(-1);
        this.A0E.setTextSize(62.0f);
        this.A0C.setColor(-1);
        this.A0C.setTextSize(40.0f);
        this.A0C.setTypeface(C002301g.A01(this.A0A));
        A0I();
        this.A0N = new AnonymousClass2N1(context, r13);
        this.A0M = new AnonymousClass2N0();
    }

    @Override // X.AbstractC48582Mw
    public void A0F(JSONObject jSONObject) {
        super.A0F(jSONObject);
        jSONObject.put("theme", this.A01);
        jSONObject.put("time", this.A03);
        jSONObject.put("period", this.A02);
    }

    @Override // X.AbstractC48582Mw
    public boolean A0G(JSONObject jSONObject) {
        this.A01 = Boolean.valueOf(jSONObject.getBoolean("theme"));
        this.A03 = jSONObject.getString("time");
        this.A02 = jSONObject.getString("period");
        A0H();
        super.A0G(jSONObject);
        return true;
    }

    public final void A0H() {
        float f;
        if (this.A08) {
            float measureText = this.A0I.measureText(this.A03);
            if (!this.A07) {
                f = this.A0G.measureText(this.A02);
            } else {
                f = 0.0f;
            }
            float f2 = measureText + f + 100.0f;
            this.A00 = f2;
            C48562Mu[] r1 = this.A0P;
            r1[0] = new C48562Mu(0.0f, 0.0f, f2, 116.0f, 58.0f, 58.0f, this.A0D);
            r1[1] = new C48562Mu(2.0f, 2.0f, this.A00 - 2.0f, 114.0f, 58.0f, 58.0f, this.A0B);
            C48562Mu[] r12 = this.A0Q;
            r12[0] = new C48562Mu(0.0f, 0.0f, this.A00, 116.0f, 29.0f, 29.0f, this.A0H);
            r12[1] = new C48562Mu(12.0f, 12.0f, this.A00 - 12.0f, 104.0f, 17.0f, 17.0f, this.A0F);
        }
    }

    public final void A0I() {
        Date date = new Date();
        boolean z = this.A0K.A02().A00;
        this.A07 = z;
        if (z) {
            this.A03 = this.A06.format(date);
            this.A02 = "";
        } else {
            this.A03 = this.A05.format(date);
            this.A02 = this.A04.format(date);
        }
        A0H();
    }

    public final void A0J(Canvas canvas, Paint paint, Paint paint2) {
        String str = this.A03;
        int length = str.length();
        Rect rect = this.A0J;
        paint.getTextBounds(str, 0, length, rect);
        float measureText = (this.A00 / 2.0f) - ((paint2.measureText(this.A02) + paint.measureText(this.A03)) / 2.0f);
        float height = (float) ((rect.height() >> 1) + 58);
        if (this.A07) {
            canvas.drawText(this.A03, measureText, height, paint);
        } else if (this.A09) {
            canvas.drawText(this.A03, measureText, height, paint);
            canvas.drawText(this.A02, paint.measureText(this.A03) + measureText, height, paint2);
        } else {
            canvas.drawText(this.A02, measureText, height, paint2);
            canvas.drawText(this.A03, paint2.measureText(this.A02) + measureText, height, paint);
        }
    }
}
