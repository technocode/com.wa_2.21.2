package X;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Sf  reason: invalid class name and case insensitive filesystem */
public class C06210Sf {
    public static final Map A05;
    public static volatile C06210Sf A06;
    public final C02780Dk A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass03P A02;
    public final AnonymousClass01X A03;
    public final C03190Fd A04;

    static {
        HashMap hashMap = new HashMap();
        A05 = hashMap;
        hashMap.put("terms-of-service", "https://www.whatsapp.com/legal/#terms-of-service");
        Map map = A05;
        map.put("privacy-policy", "https://www.whatsapp.com/legal/#privacy-policy");
        map.put("end-to-end-encryption", "https://faq.whatsapp.com/general/28030015/");
        map.put("facebook-companies", "https://www.facebook.com/help/111814505650678");
        map.put("how-whatsapp-works-with-the-facebook-companies", "https://faq.whatsapp.com/general/26000112/");
        map.put("privacy-policy-managing-and-deleting-your-information", "https://www.whatsapp.com/legal/#privacy-policy-managing-and-deleting-your-information");
        map.put("privacy-policy-our-global-operations", "https://www.whatsapp.com/legal/#privacy-policy-our-global-operations");
        map.put("terms-of-service-age", "https://www.whatsapp.com/legal/#terms-of-service-age");
        map.put("cookies", "https://www.whatsapp.com/legal/#cookies");
    }

    public C06210Sf(AnonymousClass02M r1, C03190Fd r2, C02780Dk r3, AnonymousClass03P r4, AnonymousClass01X r5) {
        this.A01 = r1;
        this.A04 = r2;
        this.A00 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    public static C06210Sf A00() {
        if (A06 == null) {
            synchronized (C06210Sf.class) {
                if (A06 == null) {
                    A06 = new C06210Sf(AnonymousClass02M.A00(), C03190Fd.A00(), C02780Dk.A02(), AnonymousClass03P.A00(), AnonymousClass01X.A00());
                }
            }
        }
        return A06;
    }

    public Uri A01(String str) {
        String str2;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        AnonymousClass01X r2 = this.A03;
        buildUpon.appendQueryParameter("lg", r2.A04());
        buildUpon.appendQueryParameter("lc", r2.A03());
        if (this.A04.A07(AbstractC000400g.A0K)) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        buildUpon.appendQueryParameter("eea", str2);
        return buildUpon.build();
    }

    public CharSequence A02(Context context, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, str.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                spannableStringBuilder.setSpan(new AnonymousClass29o(this, context, this.A01, this.A02, this.A00, uRLSpan.getURL(), context), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            }
            for (URLSpan uRLSpan2 : uRLSpanArr) {
                spannableStringBuilder.removeSpan(uRLSpan2);
            }
        }
        return spannableStringBuilder;
    }
}
