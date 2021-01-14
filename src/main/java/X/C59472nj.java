package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;
import org.json.JSONObject;

/* renamed from: X.2nj  reason: invalid class name and case insensitive filesystem */
public class C59472nj extends AbstractC53152cc {
    public int A00;
    public Context A01;
    public Drawable A02;
    public C000300f A03;
    public AnonymousClass0D1 A04;
    public String A05;
    public String A06;
    public final Paint A07 = new Paint(1);

    public C59472nj(Context context, C000300f r4, AnonymousClass0D1 r5) {
        this.A01 = context;
        this.A03 = r4;
        this.A04 = r5;
    }

    public C59472nj(Context context, C29241Xq r4, C000300f r5, AnonymousClass0D1 r6) {
        this.A01 = context;
        this.A05 = r4.A07;
        this.A03 = r5;
        this.A00 = r4.A01;
        this.A06 = r4.A0A;
        this.A04 = r6;
        A0H();
    }

    @Override // X.AbstractC48582Mw
    public void A0F(JSONObject jSONObject) {
        super.A0F(jSONObject);
        String str = this.A05;
        if (str != null && this.A06 != null) {
            jSONObject.put("file_path", str);
            jSONObject.put("plain_file_hash", this.A06);
            jSONObject.put("file_storage_location", this.A00);
        }
    }

    @Override // X.AbstractC48582Mw
    public boolean A0G(JSONObject jSONObject) {
        if (jSONObject.has("file_path") && jSONObject.has("plain_file_hash") && jSONObject.has("file_storage_location")) {
            this.A05 = jSONObject.getString("file_path");
            this.A06 = jSONObject.getString("plain_file_hash");
            this.A00 = jSONObject.getInt("file_storage_location");
            A0H();
        }
        if (this.A02 == null) {
            return false;
        }
        super.A0G(jSONObject);
        return true;
    }

    public final void A0H() {
        int dimensionPixelSize = this.A01.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_size);
        String str = this.A05;
        if (str != null) {
            String str2 = this.A06;
            if (str2 != null) {
                C29241Xq r3 = new C29241Xq();
                int i = this.A00;
                r3.A07 = str;
                r3.A01 = i;
                r3.A0A = str2;
                AnonymousClass0D1 r1 = this.A04;
                Context context = this.A01;
                if (r1 != null) {
                    r1.A05(null, new AnonymousClass3QJ(r3, AnonymousClass0D1.A01(r3, dimensionPixelSize, dimensionPixelSize), dimensionPixelSize, dimensionPixelSize, context, this), null);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void A0I(Canvas canvas, int i, int i2) {
        RectF rectF = super.A04;
        float width = rectF.width() / ((float) i);
        float height = rectF.height() / ((float) i2);
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.scale(width, height);
        canvas.rotate(super.A00);
        float f = ((float) (-i)) / 2.0f;
        canvas.translate(f, f);
    }

    public final void A0J(Canvas canvas, C71913Qu r4) {
        A0I(canvas, r4.getBounds().right, r4.getBounds().bottom);
    }

    public void A0K(Canvas canvas, boolean z) {
        if (z && this.A03.A0D(AbstractC000400g.A2S)) {
            A09(canvas);
        } else if (this.A02 != null) {
            canvas.save();
            Drawable drawable = this.A02;
            if (drawable instanceof C71913Qu) {
                C71913Qu r4 = (C71913Qu) drawable;
                A0J(canvas, r4);
                canvas.drawBitmap(r4.A09.A09, (Rect) null, r4.getBounds(), r4.A03);
            } else {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                A0I(canvas, bitmapDrawable.getBitmap().getWidth(), bitmapDrawable.getBitmap().getHeight());
                bitmapDrawable.draw(canvas);
            }
            canvas.restore();
        }
    }
}
