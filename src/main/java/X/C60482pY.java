package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import java.util.Calendar;
import org.json.JSONObject;

/* renamed from: X.2pY  reason: invalid class name and case insensitive filesystem */
public class C60482pY extends AbstractC59482nk {
    public int A00;
    public int A01;
    public Paint A02 = new Paint(1);
    public Paint A03 = new Paint(1);
    public Picture A04;
    public Picture A05;
    public C48562Mu A06;
    public C48562Mu A07;
    public C48562Mu A08;
    public C48562Mu A09;
    public Boolean A0A;
    public final RectF A0B = new RectF();
    public final AnonymousClass01X A0C;
    public final AbstractC48612Mz A0D = new AnonymousClass2cY(this);
    public final AnonymousClass2N0 A0E;
    public final AnonymousClass2N1 A0F;
    public final boolean A0G;

    public C60482pY(Context context, AnonymousClass01X r15, boolean z) {
        super(context);
        this.A0C = r15;
        this.A0G = z;
        this.A0A = Boolean.FALSE;
        Calendar instance = Calendar.getInstance(r15.A0I());
        this.A00 = instance.get(10);
        this.A01 = instance.get(12);
        Context context2 = ((AbstractC59482nk) this).A00;
        this.A04 = AbstractC59482nk.A00(context2, "clockDarkTheme.svg");
        this.A02.setColor(Color.parseColor("#ECB439"));
        this.A06 = new C48562Mu(190.0f, 249.0f, 398.0f, 263.0f, 7.0f, 7.0f, this.A02);
        this.A07 = new C48562Mu(185.0f, 251.0f, 479.0f, 261.0f, 5.0f, 5.0f, this.A02);
        this.A05 = AbstractC59482nk.A00(context2, "clockLightTheme.svg");
        this.A03.setColor(Color.parseColor("#DC5842"));
        this.A08 = new C48562Mu(201.0f, 248.0f, 370.0f, 264.0f, 8.0f, 8.0f, this.A03);
        this.A09 = new C48562Mu(185.0f, 251.0f, 479.0f, 262.0f, 5.5f, 5.5f, this.A03);
        this.A0F = new AnonymousClass2N1(context, r15);
        this.A0E = new AnonymousClass2N0();
    }

    @Override // X.AbstractC53152cc, X.AbstractC48582Mw
    public void A0E(RectF rectF, float f, float f2, float f3, float f4) {
        super.A0E(rectF, f, f2, f3, f4);
        AnonymousClass2N1 r2 = this.A0F;
        if (r2 != null) {
            r2.A00(rectF.width() / 1020.0f);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC48582Mw
    public void A0F(JSONObject jSONObject) {
        super.A0F(jSONObject);
        jSONObject.put("hour", this.A00);
        jSONObject.put("minute", this.A01);
        jSONObject.put("theme", this.A0A);
    }

    @Override // X.AbstractC48582Mw
    public boolean A0G(JSONObject jSONObject) {
        this.A00 = jSONObject.getInt("hour");
        this.A01 = jSONObject.getInt("minute");
        this.A0A = Boolean.valueOf(jSONObject.getBoolean("theme"));
        super.A0G(jSONObject);
        return true;
    }
}
