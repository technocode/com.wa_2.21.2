package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: X.1sk  reason: invalid class name and case insensitive filesystem */
public final class DialogC40171sk extends DialogC26681Ly {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C02780Dk A01;
    public final /* synthetic */ AnonymousClass03B A02;
    public final /* synthetic */ AnonymousClass0GZ A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC40171sk(Activity activity, AnonymousClass01X r4, AnonymousClass03B r5, C02780Dk r6, Activity activity2, AnonymousClass0GZ r8) {
        super(activity, r4, R.layout.software_too_old, true);
        this.A02 = r5;
        this.A01 = r6;
        this.A00 = activity2;
        this.A03 = r8;
    }

    @Override // X.DialogC26681Ly
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r5 = super.A02;
        DateFormat dateInstance = DateFormat.getDateInstance(2, r5.A0I());
        ((TextView) findViewById(R.id.software_too_old)).setText(Html.fromHtml(r5.A0D(R.string.software_expired_get_from_play_with_date, r5.A06(R.string.localized_app_name), dateInstance.format(this.A02.A02()))));
        SpannableString spannableString = new SpannableString(Html.fromHtml(r5.A0D(R.string.software_expired_current_date, dateInstance.format(new Date()), r5.A06(R.string.localized_app_name))));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("date-settings".equals(uRLSpan.getURL())) {
                    int spanStart = spannableString.getSpanStart(uRLSpan);
                    int spanEnd = spannableString.getSpanEnd(uRLSpan);
                    int spanFlags = spannableString.getSpanFlags(uRLSpan);
                    spannableString.removeSpan(uRLSpan);
                    spannableString.setSpan(new AnonymousClass1M0(this), spanStart, spanEnd, spanFlags);
                }
            }
        }
        TextView textView = (TextView) findViewById(R.id.current_date);
        textView.setText(spannableString);
        textView.setMovementMethod(new LinkMovementMethod());
        findViewById(R.id.beta_optout_text).setVisibility(0);
        View findViewById = findViewById(R.id.beta_optout_button);
        findViewById.setVisibility(0);
        Activity activity = this.A00;
        findViewById.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(activity, 25));
        ViewOnClickEBaseShape1S0200000_I1_0 viewOnClickEBaseShape1S0200000_I1_0 = new ViewOnClickEBaseShape1S0200000_I1_0(this.A03, activity, 4);
        findViewById(R.id.download).setOnClickListener(viewOnClickEBaseShape1S0200000_I1_0);
        findViewById(R.id.update_whatsapp).setOnClickListener(viewOnClickEBaseShape1S0200000_I1_0);
    }
}
