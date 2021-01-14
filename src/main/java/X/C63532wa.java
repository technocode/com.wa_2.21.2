package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2wa  reason: invalid class name and case insensitive filesystem */
public class C63532wa extends LinearLayout {
    public ImageView A00;
    public TextView A01;
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();
    public final C02010Ah A03 = C02010Ah.A00();

    public C63532wa(Context context) {
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.payment_help_support_information_row, (ViewGroup) this, true);
        this.A00 = (ImageView) inflate.findViewById(R.id.bank_logo);
        this.A01 = (TextView) inflate.findViewById(R.id.contact_bank_details);
    }

    public final void setWhatsAppContactDetails(String str, String str2) {
        String A0D;
        if (AnonymousClass0MH.A07(str2)) {
            A0D = this.A02.A0D(R.string.upi_contact_support_for_payment, str, str2);
        } else {
            A0D = this.A02.A0D(R.string.upi_contact_support_for_payment_no_transaction, str);
        }
        SpannableString spannableString = new SpannableString(A0D);
        URLSpan uRLSpan = new URLSpan(AnonymousClass008.A0K("tel:", str));
        int indexOf = A0D.indexOf(str);
        spannableString.setSpan(uRLSpan, indexOf, str.length() + indexOf, 33);
        this.A01.setText(spannableString);
        this.A01.setVisibility(0);
    }
}
