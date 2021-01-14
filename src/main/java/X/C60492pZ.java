package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.2pZ  reason: invalid class name and case insensitive filesystem */
public class C60492pZ extends AbstractC59482nk {
    public double A00;
    public double A01;
    public float A02;
    public Picture A03;
    public Picture A04;
    public String A05;
    public String A06;
    public boolean A07;
    public C48562Mu[] A08;
    public C48562Mu[] A09;
    public final Paint A0A = new Paint(1);
    public final Paint A0B = new Paint(1);
    public final Paint A0C = new Paint(1);
    public final Paint A0D = new Paint(1);
    public final TextPaint A0E = new TextPaint(1);
    public final AbstractC48612Mz A0F;
    public final AnonymousClass2N0 A0G;
    public final AnonymousClass2N1 A0H;
    public final boolean A0I;

    public C60492pZ(Context context, AnonymousClass01X r7, boolean z, String str) {
        super(context);
        String str2;
        boolean z2 = true;
        int i = 0;
        this.A07 = false;
        this.A0F = new C53162cd(this);
        this.A0I = z;
        Context context2 = ((AbstractC59482nk) this).A00;
        if (Build.VERSION.SDK_INT >= 21) {
            str2 = "ic_content_sticker_location_60_percent_black.svg";
        } else {
            str2 = "ic_content_sticker_location_black.svg";
        }
        Picture A002 = AbstractC59482nk.A00(context2, str2);
        if (A002 != null) {
            this.A03 = A002;
            Picture A003 = AbstractC59482nk.A00(context2, "ic_content_sticker_location.svg");
            if (A003 != null) {
                this.A04 = A003;
                AnonymousClass00E.A07(this.A03.getWidth() != this.A04.getWidth() ? false : z2);
                this.A0E.setTextSize(46.0f);
                this.A0E.setTextAlign(Paint.Align.CENTER);
                this.A0E.setTypeface(C002301g.A01(context2));
                this.A06 = str;
                String upperCase = str.toUpperCase(Locale.getDefault());
                TextPaint textPaint = this.A0E;
                Picture picture = this.A04;
                this.A05 = TextUtils.ellipsize(upperCase, textPaint, ((1000.0f - ((float) (picture != null ? picture.getWidth() : i))) - 106.0f) - 14.0f, TextUtils.TruncateAt.END).toString();
                A0H();
                this.A0H = new AnonymousClass2N1(context, r7);
                this.A0G = new AnonymousClass2N0();
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC53152cc, X.AbstractC48582Mw
    public void A0E(RectF rectF, float f, float f2, float f3, float f4) {
        float f5;
        float f6 = f3 - f;
        float f7 = f4 - f2;
        boolean z = this.A0I;
        if (z) {
            f5 = f6;
        } else {
            f5 = this.A02;
        }
        float f8 = 130.0f;
        if (z) {
            f8 = Math.min(f6 / 3.0f, (130.0f * f6) / this.A02);
        }
        float f9 = (f6 / 2.0f) + f;
        if (!z) {
            f = f9 - (f5 / 2.0f);
        }
        float f10 = ((f7 / 2.0f) - (f8 / 2.0f)) + f2;
        RectF rectF2 = super.A04;
        rectF2.set(f, f10, f + f5, f8 + f10);
        float f11 = f6 * 2.0f;
        if (!z && f5 > f11) {
            A05(f11 / (f5 + 106.0f));
        }
        rectF2.sort();
        AnonymousClass2N1 r2 = this.A0H;
        if (r2 != null) {
            r2.A00(rectF.width() / 1020.0f);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC48582Mw
    public void A0F(JSONObject jSONObject) {
        super.A0F(jSONObject);
        jSONObject.put("latitude", this.A00);
        jSONObject.put("longitude", this.A01);
        jSONObject.put("Location", this.A06);
        jSONObject.put("displayLocation", this.A05);
        jSONObject.put("theme", this.A07);
    }

    @Override // X.AbstractC48582Mw
    public boolean A0G(JSONObject jSONObject) {
        super.A0G(jSONObject);
        this.A00 = jSONObject.getDouble("latitude");
        this.A01 = jSONObject.getDouble("longitude");
        this.A06 = jSONObject.getString("Location");
        this.A05 = jSONObject.getString("displayLocation");
        this.A07 = jSONObject.getBoolean("theme");
        A0H();
        RectF rectF = super.A04;
        float width = rectF.width();
        float height = rectF.height();
        float f = rectF.left;
        float f2 = rectF.top;
        rectF.set(f, f2, width + f, height + f2);
        rectF.sort();
        return true;
    }

    public final void A0H() {
        float f;
        Picture picture;
        if (this.A03 == null || (picture = this.A04) == null) {
            Log.w("Location/initThemes/Error when loading pin");
            f = 0.0f;
        } else {
            f = ((float) picture.getWidth()) + 14.0f;
        }
        this.A02 = Math.max(300.0f, this.A0E.measureText(this.A05) + f + 106.0f);
        Paint paint = this.A0C;
        paint.setColor(Color.parseColor("#666666"));
        Paint paint2 = this.A0D;
        paint2.setColor(-1);
        C48562Mu[] r1 = new C48562Mu[6];
        this.A09 = r1;
        r1[0] = new C48562Mu(0.0f, 20.0f, this.A02, 110.0f, 20.0f, 20.0f, paint2);
        this.A09[1] = new C48562Mu(20.0f, 0.0f, this.A02 - 20.0f, 130.0f, 20.0f, 20.0f, paint2);
        this.A09[2] = new C48562Mu(10.0f, 30.0f, this.A02 - 10.0f, 100.0f, 10.0f, 10.0f, paint);
        this.A09[3] = new C48562Mu(30.0f, 10.0f, this.A02 - 30.0f, 120.0f, 10.0f, 10.0f, paint);
        this.A09[4] = new C48562Mu(15.0f, 35.0f, this.A02 - 15.0f, 95.0f, 6.0f, 6.0f, paint2);
        this.A09[5] = new C48562Mu(35.0f, 15.0f, this.A02 - 35.0f, 115.0f, 6.0f, 6.0f, paint2);
        Paint paint3 = this.A0B;
        paint3.setColor(-16777216);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAlpha(90);
        Paint paint4 = this.A0A;
        paint4.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        paint4.setColor(-1);
        paint4.setStyle(style);
        paint4.setStrokeWidth(5.0f);
        C48562Mu[] r12 = new C48562Mu[2];
        this.A08 = r12;
        r12[0] = new C48562Mu(0.0f, 0.0f, this.A02, 130.0f, 75.0f, 75.0f, paint3);
        this.A08[1] = new C48562Mu(0.0f, 0.0f, this.A02, 130.0f, 75.0f, 75.0f, paint4);
    }
}
