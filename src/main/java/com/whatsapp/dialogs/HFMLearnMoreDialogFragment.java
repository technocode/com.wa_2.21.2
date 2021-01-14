package com.whatsapp.dialogs;

import X.AbstractC000400g;
import X.AnonymousClass01X;
import X.C000300f;
import X.C002001d;
import X.C05270Nw;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public class HFMLearnMoreDialogFragment extends FAQLearnMoreDialogFragment {
    public final C000300f A00 = C000300f.A00();

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: android.text.SpannableStringBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.whatsapp.dialogs.FAQLearnMoreDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        AnonymousClass01X r11;
        String str;
        C000300f r1 = this.A00;
        int A06 = r1.A06(AbstractC000400g.A36);
        if (r1.A0D(AbstractC000400g.A1D)) {
            r11 = ((FAQLearnMoreDialogFragment) this).A01;
            String A0A = r11.A0A(R.plurals.hfm_multicast_limit_reached_with_faq_updated, (long) A06, Integer.valueOf(A06));
            StringBuilder sb = new StringBuilder();
            sb.append("hfmlearnmore/");
            sb.append((Object) A0A);
            Log.d(sb.toString());
            str = A0A;
        } else {
            r11 = ((FAQLearnMoreDialogFragment) this).A01;
            String A0A2 = r11.A0A(R.plurals.hfm_multicast_limit_reached_with_faq, (long) A06, "\"hfm-icon\"", Integer.valueOf(A06));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("hfmlearnmore/");
            sb2.append(A0A2);
            Log.d(sb2.toString());
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize((float) A02().getDimensionPixelSize(R.dimen.subtitle_text_size));
            Drawable A0b = C002001d.A0b(A00(), R.drawable.ic_frequently_forwarded, R.color.forwarded_message_arrow_tint);
            int indexOf = TextUtils.indexOf(A0A2, "\"hfm-icon\"");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0A2);
            C05270Nw.A02(spannableStringBuilder, A0b, textPaint, -1, indexOf, "\"hfm-icon\"".length() + indexOf);
            str = spannableStringBuilder;
        }
        return FAQLearnMoreDialogFragment.A00(A01(), ((FAQLearnMoreDialogFragment) this).A02, ((FAQLearnMoreDialogFragment) this).A00, ((FAQLearnMoreDialogFragment) this).A03, r11, "26000253", str, null, null);
    }
}
