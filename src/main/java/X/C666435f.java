package X;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.35f  reason: invalid class name and case insensitive filesystem */
public class C666435f {
    public static volatile C666435f A06;
    public final AnonymousClass02M A00;
    public final C06180Sc A01;
    public final AnonymousClass03P A02;
    public final AnonymousClass00D A03;
    public final C02040Ak A04;
    public final C01970Ad A05;

    public C666435f(AnonymousClass02M r1, C06180Sc r2, AnonymousClass03P r3, AnonymousClass00D r4, C01970Ad r5, C02040Ak r6) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r5;
        this.A04 = r6;
    }

    public static C666435f A00() {
        if (A06 == null) {
            synchronized (C666435f.class) {
                if (A06 == null) {
                    A06 = new C666435f(AnonymousClass02M.A00(), C06180Sc.A00(), AnonymousClass03P.A00(), AnonymousClass00D.A00(), C01970Ad.A00(), C02040Ak.A00());
                }
            }
        }
        return A06;
    }

    public SpannableString A01(Context context, String str, String[] strArr, String[] strArr2, Runnable[] runnableArr) {
        SpannableString spannableString = new SpannableString(Html.fromHtml(str));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            int i = 0;
            for (URLSpan uRLSpan : uRLSpanArr) {
                if (strArr[i].equals(uRLSpan.getURL())) {
                    int spanStart = spannableString.getSpanStart(uRLSpan);
                    int spanEnd = spannableString.getSpanEnd(uRLSpan);
                    int spanFlags = spannableString.getSpanFlags(uRLSpan);
                    spannableString.removeSpan(uRLSpan);
                    C05690Pr r10 = new C05690Pr(context, this.A00, this.A02, this.A01, strArr2[i]);
                    r10.A00 = new AnonymousClass3S8(runnableArr, i);
                    spannableString.setSpan(r10, spanStart, spanEnd, spanFlags);
                }
                i++;
            }
        }
        return spannableString;
    }

    public void A02(Context context, Spannable spannable) {
        try {
            Linkify.addLinks(spannable, 10);
            AnonymousClass1Y8.A06(spannable);
            C28051Sr.A1O(spannable, this.A03.A0F());
            C28051Sr.A1N(spannable, this.A05, this.A04);
        } catch (Exception unused) {
        }
        ArrayList A22 = C002001d.A22(spannable);
        if (A22 != null && !A22.isEmpty()) {
            Iterator it = A22.iterator();
            while (it.hasNext()) {
                URLSpan uRLSpan = (URLSpan) it.next();
                spannable.setSpan(new C05690Pr(context, this.A00, this.A02, this.A01, uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
            }
            Iterator it2 = A22.iterator();
            while (it2.hasNext()) {
                spannable.removeSpan(it2.next());
            }
        }
    }
}
