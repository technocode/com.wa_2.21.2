package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2vd  reason: invalid class name and case insensitive filesystem */
public class C62962vd extends LinearLayout {
    public TextView A00 = ((TextView) LayoutInflater.from(getContext()).inflate(R.layout.payment_help_support_information_row, (ViewGroup) this, true).findViewById(R.id.contact_bank_details));
    public final C000300f A01 = C000300f.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();

    public C62962vd(Context context) {
        super(context);
    }

    public void setContactInformation(String str) {
        String A09 = this.A01.A09(AbstractC000400g.A4G);
        if (!TextUtils.isEmpty(A09) && AnonymousClass0MH.A07(str)) {
            setWhatsAppContactDetails(A09, str);
        } else if (!TextUtils.isEmpty(A09)) {
            setWhatsAppContactDetails(A09, null);
        } else {
            setVisibility(8);
        }
    }

    public final void setWhatsAppContactDetails(String str, String str2) {
        String A0D;
        if (AnonymousClass0MH.A07(str2)) {
            A0D = this.A02.A0D(R.string.contact_support_for_payment, str, str2);
        } else {
            A0D = this.A02.A0D(R.string.contact_support_for_payment_no_transaction, str);
        }
        SpannableString spannableString = new SpannableString(A0D);
        URLSpan uRLSpan = new URLSpan(AnonymousClass008.A0K("tel:", str));
        int indexOf = A0D.indexOf(str);
        spannableString.setSpan(uRLSpan, indexOf, str.length() + indexOf, 33);
        this.A00.setText(spannableString);
        this.A00.setVisibility(0);
    }
}
