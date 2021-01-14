package com.whatsapp;

import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass03P;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.C003701u;
import X.C004302a;
import X.C05690Pr;
import X.C05710Pt;
import X.C06180Sc;
import X.C06570Tw;
import X.DialogInterface$OnClickListenerC26031Jg;
import X.DialogInterface$OnClickListenerC26041Jh;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Set;

public class SuspiciousLinkWarningDialogFragment extends WaDialogFragment {
    public final AnonymousClass02M A00 = AnonymousClass02M.A00();
    public final C06180Sc A01 = C06180Sc.A00();
    public final AnonymousClass03P A02 = AnonymousClass03P.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final AnonymousClass0M9 A04 = AnonymousClass0M9.A01();

    public static SuspiciousLinkWarningDialogFragment A00(String str, Set set) {
        SuspiciousLinkWarningDialogFragment suspiciousLinkWarningDialogFragment = new SuspiciousLinkWarningDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putSerializable("phishingChars", new HashSet(set));
        suspiciousLinkWarningDialogFragment.A0N(bundle);
        return suspiciousLinkWarningDialogFragment;
    }

    @Override // X.AnonymousClass037, com.whatsapp.base.WaDialogFragment, androidx.fragment.app.DialogFragment
    public void A0f() {
        super.A0f();
        TextView textView = (TextView) ((DialogFragment) this).A03.findViewById(16908299);
        if (textView != null) {
            textView.setMovementMethod(new C05710Pt());
            textView.setTextColor(C004302a.A00(A0A(), R.color.suspicious_link_dialog_message_color));
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        SpannableString spannableString;
        int length;
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            String string = bundle2.getString("url");
            Bundle bundle3 = ((AnonymousClass037) this).A06;
            if (bundle3 != null) {
                AbstractCollection abstractCollection = (AbstractCollection) bundle3.getSerializable("phishingChars");
                String obj = this.A04.A03("general", "26000162", null).toString();
                AnonymousClass01X r4 = this.A03;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(r4.A0D(R.string.suspicious_link_dialog_description, obj)));
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                if (uRLSpanArr != null) {
                    for (URLSpan uRLSpan : uRLSpanArr) {
                        spannableStringBuilder.setSpan(new C05690Pr(A00(), this.A00, this.A02, this.A01, uRLSpan.getURL()), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
                    }
                    for (URLSpan uRLSpan2 : uRLSpanArr) {
                        spannableStringBuilder.removeSpan(uRLSpan2);
                    }
                }
                spannableStringBuilder.append((CharSequence) "\n\n");
                if (!TextUtils.isEmpty(string) && abstractCollection != null) {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C004302a.A00(A00(), R.color.suspicious_link_text_background_color));
                    if (string.codePointCount(0, string.length()) > 96) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C003701u.A07(string, 96));
                        sb.append("…");
                        spannableString = new SpannableString(sb.toString());
                    } else {
                        spannableString = new SpannableString(string);
                    }
                    String[] split = Uri.parse(string).getHost().split("\\.");
                    int i = -1;
                    for (String str : split) {
                        boolean z = false;
                        int i2 = 0;
                        int i3 = -1;
                        while (true) {
                            length = str.length();
                            if (i2 >= length) {
                                break;
                            }
                            int codePointAt = str.codePointAt(i2);
                            int charCount = Character.charCount(codePointAt);
                            if (abstractCollection.contains(Integer.valueOf(codePointAt))) {
                                i3 = string.indexOf(codePointAt, i3 + 1);
                                spannableString.setSpan(new StyleSpan(1), i3, i3 + charCount, 33);
                                z = true;
                            }
                            i2 += charCount;
                        }
                        if (z) {
                            i = string.indexOf(str, i + 1);
                            spannableString.setSpan(foregroundColorSpan, i, length + i, 33);
                        }
                    }
                    C06570Tw r1 = r4.A02().A01;
                    spannableStringBuilder.append(r1.A03(spannableString, r1.A01));
                }
                AnonymousClass0MB r2 = new AnonymousClass0MB(A0A());
                String A06 = r4.A06(R.string.suspicious_link_dialog_title);
                AnonymousClass0MC r12 = r2.A01;
                r12.A0I = A06;
                r12.A0E = spannableStringBuilder;
                r12.A0J = true;
                r2.A05(r4.A06(R.string.suspicious_link_warning_negative_button_text), new DialogInterface$OnClickListenerC26041Jh(this, string));
                r2.A07(r4.A06(R.string.suspicious_link_warning_positive_button_text), new DialogInterface$OnClickListenerC26031Jg(this));
                return r2.A00();
            }
            throw null;
        }
        throw null;
    }
}
