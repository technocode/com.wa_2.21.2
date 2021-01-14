package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2Mt  reason: invalid class name */
public class AnonymousClass2Mt {
    public int A00;
    public RectF A01;
    public RectF A02;
    public String A03;
    public List A04;

    public AnonymousClass2Mt() {
    }

    public AnonymousClass2Mt(RectF rectF, RectF rectF2, int i, List list) {
        this.A02 = rectF;
        this.A01 = rectF2;
        this.A04 = list;
        this.A00 = i;
    }

    public static Matrix A00(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        float f6;
        float f7;
        Matrix matrix = new Matrix();
        float f8 = f3 % 180.0f;
        if (f8 == 90.0f) {
            f6 = f2 / f4;
            f7 = f / f5;
        } else {
            float f9 = f2 / f5;
            f6 = f / f4;
            f7 = f9;
        }
        matrix.preScale(f6, f7);
        if (z) {
            Matrix matrix2 = new Matrix();
            matrix2.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            matrix.preConcat(matrix2);
            float f10 = f4;
            if (f8 == 90.0f) {
                f10 = f5;
            }
            matrix.preTranslate(-f10, 0.0f);
        }
        if (z2) {
            Matrix matrix3 = new Matrix();
            matrix3.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            matrix.preConcat(matrix3);
            float f11 = f5;
            if (f8 == 90.0f) {
                f11 = f4;
            }
            matrix.preTranslate(-f11, 0.0f);
        }
        matrix.preRotate(f3);
        if (f3 == 90.0f) {
            matrix.preTranslate(0.0f, -f5);
        } else if (f3 == 180.0f) {
            matrix.preTranslate(-f4, -f5);
            return matrix;
        } else if (f3 == 270.0f) {
            matrix.preTranslate(-f4, 0.0f);
            return matrix;
        } else if (f3 != 0.0f) {
            throw new IllegalArgumentException();
        }
        return matrix;
    }

    public String A01() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("l", (int) (this.A02.left * 100.0f));
        jSONObject.put("t", (int) (this.A02.top * 100.0f));
        jSONObject.put("r", (int) (this.A02.right * 100.0f));
        jSONObject.put("b", (int) (this.A02.bottom * 100.0f));
        jSONObject.put("crop-l", (int) (this.A01.left * 100.0f));
        jSONObject.put("crop-t", (int) (this.A01.top * 100.0f));
        jSONObject.put("crop-r", (int) (this.A01.right * 100.0f));
        jSONObject.put("crop-b", (int) (this.A01.bottom * 100.0f));
        jSONObject.put("rotate", this.A00);
        JSONArray jSONArray = new JSONArray();
        for (AbstractC48582Mw r1 : this.A04) {
            JSONObject jSONObject2 = new JSONObject();
            r1.A0F(jSONObject2);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("shapes", jSONArray);
        return jSONObject.toString();
    }

    public void A02(Bitmap bitmap, int i) {
        Canvas canvas = new Canvas(bitmap);
        A05(canvas, bitmap, i, false, false);
        for (AbstractC48582Mw r1 : this.A04) {
            if (r1 instanceof C53182cf) {
                r1.A0A(canvas);
            }
        }
        for (AbstractC48582Mw r12 : this.A04) {
            if (!(r12 instanceof C53182cf)) {
                r12.A0A(canvas);
            }
        }
    }

    public void A03(Bitmap bitmap, int i, boolean z, boolean z2) {
        Canvas canvas = new Canvas(bitmap);
        A05(canvas, bitmap, i, z, z2);
        A04(canvas);
    }

    public final void A04(Canvas canvas) {
        for (AbstractC48582Mw r1 : this.A04) {
            if (r1 instanceof C53182cf) {
                r1.A09(canvas);
            }
        }
        for (AbstractC48582Mw r12 : this.A04) {
            if (!(r12 instanceof C53182cf)) {
                r12.A09(canvas);
            }
        }
    }

    public void A05(Canvas canvas, Bitmap bitmap, int i, boolean z, boolean z2) {
        canvas.concat(A00((float) bitmap.getWidth(), (float) bitmap.getHeight(), (float) i, this.A02.width(), this.A02.height(), z, z2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(java.io.File r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.A01()
            java.io.FileWriter r1 = new java.io.FileWriter
            r1.<init>(r3)
            r1.write(r0)     // Catch:{ all -> 0x0010 }
            r1.close()
            return
        L_0x0010:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0016 }
        L_0x0016:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Mt.A06(java.io.File):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(java.io.File r4, android.content.Context r5, X.C02590Cr r6, X.C000300f r7, X.C002701k r8, X.AnonymousClass01X r9, X.AnonymousClass0D1 r10) {
        /*
            r3 = this;
            java.io.FileReader r0 = new java.io.FileReader
            r0.<init>(r4)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
        L_0x000f:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0019
            r1.append(r0)     // Catch:{ all -> 0x0024 }
            goto L_0x000f
        L_0x0019:
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0024 }
            r3.A08(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0024 }
            r2.close()
            return
        L_0x0024:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x002a }
        L_0x002a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Mt.A07(java.io.File, android.content.Context, X.0Cr, X.00f, X.01k, X.01X, X.0D1):void");
    }

    public void A08(String str, Context context, C02590Cr r11, C000300f r12, C002701k r13, AnonymousClass01X r14, AnonymousClass0D1 r15) {
        AbstractC48582Mw r2;
        JSONObject jSONObject = new JSONObject(str);
        RectF rectF = new RectF();
        this.A02 = rectF;
        rectF.left = ((float) jSONObject.getInt("l")) / 100.0f;
        this.A02.top = ((float) jSONObject.getInt("t")) / 100.0f;
        this.A02.right = ((float) jSONObject.getInt("r")) / 100.0f;
        this.A02.bottom = ((float) jSONObject.getInt("b")) / 100.0f;
        RectF rectF2 = new RectF();
        this.A01 = rectF2;
        rectF2.left = ((float) jSONObject.getInt("crop-l")) / 100.0f;
        this.A01.top = ((float) jSONObject.getInt("crop-t")) / 100.0f;
        this.A01.right = ((float) jSONObject.getInt("crop-r")) / 100.0f;
        this.A01.bottom = ((float) jSONObject.getInt("crop-b")) / 100.0f;
        this.A00 = jSONObject.getInt("rotate");
        JSONArray jSONArray = jSONObject.getJSONArray("shapes");
        this.A04 = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            switch (string.hashCode()) {
                case -2069773495:
                    if (string.equals("thinking-bubble")) {
                        r2 = new C53242cl();
                        break;
                    } else {
                        continue;
                    }
                case -1890252483:
                    if (string.equals("sticker")) {
                        r2 = new C59472nj(context, r12, r15);
                        break;
                    } else {
                        continue;
                    }
                case -1676415975:
                    if (string.equals("digital-clock")) {
                        r2 = new C59452nh(context, r14, false);
                        break;
                    } else {
                        continue;
                    }
                case -1493474063:
                    if (string.equals("analog-clock")) {
                        r2 = new C60482pY(context, r14, false);
                        break;
                    } else {
                        continue;
                    }
                case -841189240:
                    if (string.equals("speech-bubble-oval")) {
                        r2 = new C53202ch();
                        break;
                    } else {
                        continue;
                    }
                case -841116134:
                    if (string.equals("speech-bubble-rect")) {
                        r2 = new C53212ci();
                        break;
                    } else {
                        continue;
                    }
                case 110873:
                    if (string.equals("pen")) {
                        r2 = new C53182cf(r13.A0E(274));
                        break;
                    } else {
                        continue;
                    }
                case 114276:
                    if (string.equals("svg")) {
                        r2 = new C60502pa(context);
                        break;
                    } else {
                        continue;
                    }
                case 3423314:
                    if (string.equals("oval")) {
                        r2 = new C53172ce();
                        break;
                    } else {
                        continue;
                    }
                case 3496420:
                    if (string.equals("rect")) {
                        r2 = new C53192cg();
                        break;
                    } else {
                        continue;
                    }
                case 3556653:
                    if (string.equals("text")) {
                        r2 = new C53232ck(context, r11, r14);
                        break;
                    } else {
                        continue;
                    }
                case 93090825:
                    if (string.equals("arrow")) {
                        r2 = new AnonymousClass2cZ();
                        break;
                    } else {
                        continue;
                    }
                case 96632902:
                    if (string.equals("emoji")) {
                        r2 = new C59462ni(context, r11, r12.A0D(AbstractC000400g.A2I));
                        break;
                    } else {
                        continue;
                    }
                case 1901043637:
                    if (string.equals("location")) {
                        r2 = new C60492pZ(context, r14, false, r14.A06(R.string.attach_location));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            r2.A04();
            if (r2 instanceof C53182cf) {
                C53182cf r1 = (C53182cf) r2;
                if (r1.A09) {
                    r1.A00 = context.getResources().getDisplayMetrics().density;
                    r1.A05 = true;
                }
            }
            if (r2.A0G(jSONObject2)) {
                this.A04.add(r2);
            }
        }
    }

    public boolean A09() {
        return A0A(new String[]{"arrow", "oval", "thinking-bubble", "speech-bubble-oval", "speech-bubble-rect", "svg", "digital-clock", "analog-clock", "location", "sticker", "emoji"});
    }

    public final boolean A0A(String[] strArr) {
        List<AbstractC48582Mw> list = this.A04;
        if (list == null) {
            return false;
        }
        for (AbstractC48582Mw r0 : list) {
            if (C002001d.A3i(strArr, r0.A02())) {
                return true;
            }
        }
        return false;
    }
}
