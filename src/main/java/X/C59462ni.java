package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import com.whatsapp.util.Log;
import org.json.JSONObject;

/* renamed from: X.2ni  reason: invalid class name and case insensitive filesystem */
public class C59462ni extends AbstractC53152cc {
    public BitmapDrawable A00;
    public C03960Il A01;
    public final Context A02;
    public final C02590Cr A03;
    public final boolean A04;
    public final boolean A05;

    public C59462ni(C03960Il r1, Context context, C02590Cr r3, boolean z, boolean z2) {
        this.A02 = context;
        this.A03 = r3;
        this.A04 = z;
        this.A05 = z2;
        this.A01 = r1;
        A0H();
    }

    public C59462ni(Context context, C02590Cr r3, boolean z) {
        this.A02 = context;
        this.A03 = r3;
        this.A04 = false;
        this.A05 = z;
    }

    @Override // X.AbstractC53152cc, X.AbstractC48582Mw
    public void A0E(RectF rectF, float f, float f2, float f3, float f4) {
        super.A0E(rectF, f, f2, f3, f4);
        if (!this.A04) {
            RectF rectF2 = super.A04;
            if (rectF2.width() > 128.0f || rectF2.height() > 128.0f) {
                A05(Math.min(128.0f / rectF2.width(), 128.0f / rectF2.height()));
            }
        }
    }

    @Override // X.AbstractC48582Mw
    public void A0F(JSONObject jSONObject) {
        super.A0F(jSONObject);
        C03960Il r0 = this.A01;
        if (r0 != null) {
            jSONObject.put("emoji", r0.toString());
        }
    }

    @Override // X.AbstractC48582Mw
    public boolean A0G(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("emoji")) {
                return false;
            }
            this.A01 = new C03960Il(jSONObject.getString("emoji"));
            A0H();
            super.A0G(jSONObject);
            return true;
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("EmojiShape/load could not load emoji from ");
            sb.append(jSONObject);
            Log.e(sb.toString(), e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0156, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H() {
        /*
        // Method dump skipped, instructions count: 429
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59462ni.A0H():void");
    }
}
