package X;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.1xk  reason: invalid class name and case insensitive filesystem */
public class C43071xk extends AbstractC25311Gi {
    public static C43071xk A03 = new C43071xk();
    public final AnonymousClass02M A00 = AnonymousClass02M.A00();
    public final C06180Sc A01 = C06180Sc.A00();
    public final AnonymousClass03P A02 = AnonymousClass03P.A00();

    public final Spannable A01(AnonymousClass05q r16, AnonymousClass2B0 r17) {
        String str = r17.A04;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        List<String> list = r17.A09;
        if (list != null) {
            for (String str2 : list) {
                JSONObject jSONObject = new JSONObject(str2);
                int i = jSONObject.getInt("offset");
                int i2 = jSONObject.getInt("length");
                String string = jSONObject.getString("style");
                switch (string.hashCode()) {
                    case -2125451728:
                        if (string.equals("ITALIC")) {
                            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2 + i, 0);
                            break;
                        } else {
                            break;
                        }
                    case 2044549:
                        if (string.equals("BOLD")) {
                            spannableStringBuilder.setSpan(new StyleSpan(1), i, i2 + i, 0);
                            break;
                        } else {
                            break;
                        }
                    case 1759631020:
                        if (string.equals("UNDERLINE")) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2 + i, 0);
                            break;
                        } else {
                            break;
                        }
                    case 2143721139:
                        if (string.equals("STRIKETHROUGH")) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2 + i, 0);
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        List<String> list2 = r17.A06;
        if (list2 != null) {
            for (String str3 : list2) {
                JSONObject jSONObject2 = new JSONObject(str3);
                int i3 = jSONObject2.getInt("offset");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(jSONObject2.getInt("color")), i3, jSONObject2.getInt("length") + i3, 0);
            }
        }
        List<String> list3 = r17.A07;
        if (list3 != null) {
            for (String str4 : list3) {
                C43231y0 r2 = new C43231y0(new JSONObject(str4));
                C05690Pr r9 = new C05690Pr(((AnonymousClass05r) r16).A00, this.A00, this.A02, this.A01, r2.A02);
                r9.A00 = new C43001xd(r17, r2, r16);
                int i4 = r2.A01;
                spannableStringBuilder.setSpan(r9, i4, r2.A00 + i4, 0);
            }
        }
        List<String> list4 = r17.A08;
        if (list4 == null) {
            return spannableStringBuilder;
        }
        for (String str5 : list4) {
            JSONObject jSONObject3 = new JSONObject(str5);
            int i5 = jSONObject3.getInt("offset");
            spannableStringBuilder.setSpan(new RelativeSizeSpan((float) jSONObject3.getDouble("scale")), i5, jSONObject3.getInt("length") + i5, 0);
        }
        return spannableStringBuilder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        if (r7 != null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(com.whatsapp.TextEmojiLabel r4, X.AnonymousClass05q r5, X.AnonymousClass2B0 r6, java.lang.Object r7) {
        /*
            r3 = this;
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 != 0) goto L_0x000a
            android.text.Spannable r7 = r3.A01(r5, r6)     // Catch:{ JSONException -> 0x000e }
            if (r7 == 0) goto L_0x0020
        L_0x000a:
            r4.setText(r7)
            goto L_0x0020
        L_0x000e:
            r2 = move-exception
            java.lang.String r1 = "WaTextWithEntitiesComponentBinder/bind/exception parsing formatted string: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0)
        L_0x0020:
            java.lang.Integer r0 = r6.A03
            if (r0 == 0) goto L_0x002b
            int r0 = r0.intValue()
            r4.setGravity(r0)
        L_0x002b:
            java.lang.String r0 = r6.A05
            if (r0 == 0) goto L_0x003d
            float r0 = X.AnonymousClass05i.A02(r0)     // Catch:{ 060 -> 0x0037 }
            r4.setTextSize(r0)     // Catch:{ 060 -> 0x0037 }
            goto L_0x003d
        L_0x0037:
            r1 = move-exception
            java.lang.String r0 = "PAY: WaTextWithEntitiesComponentBinder/bind cannot parse text size"
            com.whatsapp.util.Log.d(r0, r1)
        L_0x003d:
            java.lang.Float r0 = r6.A02
            if (r0 == 0) goto L_0x0048
            int r0 = r0.intValue()
            r4.setLineHeight(r0)
        L_0x0048:
            X.05x r0 = r6.A00
            if (r0 == 0) goto L_0x0057
            java.lang.Integer r0 = r0.A00(r5)
            int r0 = r0.intValue()
            r4.setTextColor(r0)
        L_0x0057:
            X.AnonymousClass008.A0d(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43071xk.A02(com.whatsapp.TextEmojiLabel, X.05q, X.2B0, java.lang.Object):void");
    }
}
