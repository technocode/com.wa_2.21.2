package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.TextData;
import com.whatsapp.status.playback.widget.TextStatusContentView;
import com.whatsapp.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.32X  reason: invalid class name */
public class AnonymousClass32X extends FrameLayout {
    public AnonymousClass32U A00;
    public TextStatusContentView A01;
    public List A02 = new ArrayList();
    public final AnonymousClass03P A03 = AnonymousClass03P.A00();
    public final C02590Cr A04 = C02590Cr.A00();
    public final AnonymousClass022 A05 = AnonymousClass022.A00();

    public AnonymousClass32X(Context context) {
        super(context);
        this.A01 = (TextStatusContentView) LayoutInflater.from(context).inflate(R.layout.status_playback_text, (ViewGroup) this, true).findViewById(R.id.message_text);
    }

    public static AnonymousClass32X A00(Context context, C05490Ot r15, boolean z) {
        String str;
        int i;
        int min;
        AnonymousClass32X r5 = new AnonymousClass32X(context);
        TextData textData = r15.A01;
        if (textData != null) {
            r5.setTextContentProperties(textData);
        }
        String A022 = C660232m.A02(r15.A0u());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A022);
        C002001d.A1C(r5.A03, r5.A05, spannableStringBuilder);
        C002001d.A1H(spannableStringBuilder, r5.getContext(), r5.A01.getPaint(), r5.A04);
        AnonymousClass1Y8.A06(spannableStringBuilder);
        int i2 = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        int i3 = R.color.transparent;
        if (z) {
            i3 = R.color.white_alpha_20;
        }
        int A002 = C004302a.A00(r5.getContext(), i3);
        int length = uRLSpanArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i2 < length) {
            URLSpan uRLSpan = uRLSpanArr[i2];
            String url = uRLSpan.getURL();
            int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
            spannableStringBuilder.removeSpan(uRLSpan);
            try {
                String host = new URL(url).getHost();
                int indexOf = url.indexOf(host);
                if (indexOf < 0) {
                    StringBuilder sb = new StringBuilder("cannot find host ");
                    sb.append(host);
                    sb.append(" in ");
                    sb.append(url);
                    Log.e(sb.toString());
                    str = url.substring(0, Math.min(34, url.length()));
                } else {
                    String substring = url.substring(host.length() + indexOf);
                    if (host.toLowerCase(Locale.US).startsWith("www.")) {
                        host = host.substring(4);
                    }
                    int length2 = substring.length();
                    if (length2 > 12 || length2 + host.length() > 34) {
                        min = Math.min(length2, Math.max(length2 - 12, (host.length() + length2) - 34));
                        substring = substring.substring(0, length2 - min);
                    } else {
                        min = 0;
                    }
                    if (substring.length() == 1) {
                        substring = "";
                    }
                    str = AnonymousClass008.A0K(host, substring);
                    int length3 = str.length();
                    if (length3 > 34) {
                        StringBuilder A0S = AnonymousClass008.A0S("…");
                        A0S.append(str.substring(length3 - 34));
                        str = A0S.toString();
                    }
                    if (min > 0) {
                        str = AnonymousClass008.A0K(str, "…");
                    }
                }
                i = 0;
            } catch (MalformedURLException e) {
                StringBuilder sb2 = new StringBuilder("unvalid url ");
                sb2.append(url);
                Log.e(sb2.toString(), e);
                i = 0;
                str = url.substring(0, Math.min(34, url.length()));
            }
            spannableStringBuilder.setSpan(new C664134d(str, url, A002), spanStart, spanEnd, i);
            i4 += spanEnd - spanStart;
            ImageSpan[] imageSpanArr = (ImageSpan[]) spannableStringBuilder.getSpans(spanStart, spanEnd, ImageSpan.class);
            int length4 = imageSpanArr.length;
            while (i < length4) {
                spannableStringBuilder.removeSpan(imageSpanArr[i]);
                i++;
            }
            i2++;
            i5 = 0;
        }
        r5.A01.setText(spannableStringBuilder);
        int A0B = C28051Sr.A0B(A022);
        int length5 = A022.length();
        int i6 = 0;
        while (i6 < length5 && A0B > 0) {
            int codePointAt = A022.codePointAt(i6);
            if (Character.isWhitespace(codePointAt)) {
                A0B--;
            }
            i6 += Character.charCount(codePointAt);
        }
        r5.A00 = new AnonymousClass32U(((long) (Math.min((A0B - i4) + length, (int) SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS) * 60)) + 2000);
        r5.A02.clear();
        while (i5 < length) {
            r5.A02.add(uRLSpanArr[i5].getURL());
            i5++;
        }
        return r5;
    }

    public List getDisplayedUrls() {
        return this.A02;
    }

    public AnonymousClass32U getStaticContentPlayer() {
        return this.A00;
    }

    private void setTextContentProperties(TextData textData) {
        int i = textData.textColor;
        if (i != 0) {
            this.A01.setTextColor(i);
        }
        int i2 = textData.backgroundColor;
        if (i2 != 0) {
            setBackgroundColor(i2);
        }
        this.A01.setTypeface(C660232m.A01(getContext(), textData.fontStyle));
    }
}
