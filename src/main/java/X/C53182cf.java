package X;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2cf  reason: invalid class name and case insensitive filesystem */
public class C53182cf extends AbstractC48582Mw {
    public float A00;
    public int A01 = 1;
    public Bitmap A02;
    public PointF A03;
    public AnonymousClass2N9 A04;
    public boolean A05 = false;
    public final Path A06;
    public final PointF A07 = new PointF();
    public final ArrayList A08 = new ArrayList();
    public final boolean A09;

    public C53182cf(boolean z) {
        super.A03.setStyle(Paint.Style.STROKE);
        this.A09 = z;
        Path path = new Path();
        this.A06 = path;
        path.setFillType(Path.FillType.WINDING);
    }

    @Override // X.AbstractC48582Mw
    public void A0F(JSONObject jSONObject) {
        super.A0F(jSONObject);
        if (this.A09) {
            AnonymousClass2N9 r3 = this.A04;
            if (r3 != null) {
                JSONArray jSONArray = new JSONArray();
                for (PointF pointF : r3.A0D) {
                    jSONArray.put((int) (pointF.x * 100.0f));
                    jSONArray.put((int) (pointF.y * 100.0f));
                }
                JSONArray jSONArray2 = new JSONArray();
                for (Object obj : r3.A0E) {
                    jSONArray2.put(obj);
                }
                jSONObject.put("points", jSONArray);
                jSONObject.put("times", jSONArray2);
                jSONObject.put("width", (int) (r3.A07 * 100.0f));
                return;
            }
            throw null;
        }
        JSONArray jSONArray3 = new JSONArray();
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            PointF pointF2 = (PointF) it.next();
            jSONArray3.put((int) (pointF2.x * 100.0f));
            jSONArray3.put((int) (pointF2.y * 100.0f));
        }
        jSONObject.put("points", jSONArray3);
    }

    @Override // X.AbstractC48582Mw
    public boolean A0G(JSONObject jSONObject) {
        super.A0G(jSONObject);
        if (this.A09) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("points");
                JSONArray jSONArray2 = jSONObject.getJSONArray("times");
                float f = ((float) jSONObject.getInt("width")) / 100.0f;
                if (!(jSONArray == null || jSONArray2 == null || f <= 0.0f)) {
                    Bitmap bitmap = this.A02;
                    PointF pointF = this.A03;
                    int i = this.A01;
                    Paint paint = super.A03;
                    float f2 = this.A00;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    float f3 = ((float) jSONObject.getInt("width")) / 100.0f;
                    JSONArray jSONArray3 = jSONObject.getJSONArray("points");
                    for (int i2 = 0; i2 < jSONArray3.length(); i2 += 2) {
                        arrayList.add(new PointF(((float) jSONArray3.getInt(i2)) / 100.0f, ((float) jSONArray3.getInt(i2 + 1)) / 100.0f));
                    }
                    JSONArray jSONArray4 = jSONObject.getJSONArray("times");
                    for (int i3 = 0; i3 < jSONArray4.length(); i3++) {
                        arrayList2.add(Long.valueOf(jSONArray4.getLong(i3)));
                    }
                    AnonymousClass2N9 r10 = new AnonymousClass2N9((PointF) arrayList.get(0), ((Number) arrayList2.get(0)).longValue(), bitmap, pointF, i, paint, f3, f2);
                    for (int i4 = 1; i4 < arrayList.size(); i4++) {
                        r10.A04((PointF) arrayList.get(i4), ((Number) arrayList2.get(i4)).longValue());
                    }
                    int size = arrayList.size() - 1;
                    r10.A03((PointF) arrayList.get(size), ((Number) arrayList2.get(size)).longValue());
                    this.A04 = r10;
                    return true;
                }
            } catch (JSONException unused) {
            }
        }
        ArrayList arrayList3 = this.A08;
        arrayList3.clear();
        Path path = this.A06;
        path.reset();
        JSONArray jSONArray5 = jSONObject.getJSONArray("points");
        for (int i5 = 0; i5 < jSONArray5.length(); i5 += 2) {
            PointF pointF2 = new PointF(((float) jSONArray5.getInt(i5)) / 100.0f, ((float) jSONArray5.getInt(i5 + 1)) / 100.0f);
            if (i5 == 0) {
                arrayList3.add(pointF2);
                path.moveTo(pointF2.x, pointF2.y);
                this.A07.set(pointF2);
            } else {
                A0H(pointF2);
            }
        }
        return true;
    }

    public final void A0H(PointF pointF) {
        PointF pointF2 = this.A07;
        if (!pointF2.equals(pointF)) {
            this.A08.add(pointF);
            Path path = this.A06;
            float f = pointF2.x;
            float f2 = pointF2.y;
            path.quadTo(f, f2, (pointF.x + f) / 2.0f, (pointF.y + f2) / 2.0f);
            pointF2.set(pointF);
        }
    }
}
