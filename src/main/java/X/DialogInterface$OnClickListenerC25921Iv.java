package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.widget.CheckBox;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.ReportSpamDialogFragment;

/* renamed from: X.1Iv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC25921Iv implements DialogInterface.OnClickListener {
    public final /* synthetic */ CheckBox A00;
    public final /* synthetic */ ReportSpamDialogFragment A01;
    public final /* synthetic */ C007003k A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ DialogInterface$OnClickListenerC25921Iv(ReportSpamDialogFragment reportSpamDialogFragment, C007003k r2, String str, CheckBox checkBox) {
        this.A01 = reportSpamDialogFragment;
        this.A02 = r2;
        this.A03 = str;
        this.A00 = checkBox;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ReportSpamDialogFragment reportSpamDialogFragment = this.A01;
        C007003k r5 = this.A02;
        String str = this.A03;
        CheckBox checkBox = this.A00;
        if (i == -1) {
            boolean isChecked = checkBox.isChecked();
            if (reportSpamDialogFragment.A04.A03(reportSpamDialogFragment.A00())) {
                reportSpamDialogFragment.A0h(new Intent(reportSpamDialogFragment.A00(), HomeActivity.class).addFlags(603979776));
                reportSpamDialogFragment.A00.A05(R.string.reporting_spam_title, R.string.register_wait_message);
                reportSpamDialogFragment.A06.ANF(new RunnableEBaseShape0S1210000_I1(reportSpamDialogFragment, isChecked, r5, str, 0));
            }
        }
    }
}
