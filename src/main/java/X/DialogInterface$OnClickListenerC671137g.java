package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallSpamActivity;

/* renamed from: X.37g  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC671137g implements DialogInterface.OnClickListener {
    public final /* synthetic */ CallSpamActivity.ReportSpamOrBlockDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC671137g(CallSpamActivity.ReportSpamOrBlockDialogFragment reportSpamOrBlockDialogFragment) {
        this.A00 = reportSpamOrBlockDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CallSpamActivity.ReportSpamOrBlockDialogFragment reportSpamOrBlockDialogFragment = this.A00;
        if (!reportSpamOrBlockDialogFragment.A0G.A05()) {
            Log.w("callspamactivity/spam/report/no-network-cannot-block-report");
            boolean A02 = AnonymousClass04j.A02(reportSpamOrBlockDialogFragment.A0A());
            int i2 = R.string.no_network_cannot_block;
            if (A02) {
                i2 = R.string.no_network_cannot_block_airplane;
            }
            reportSpamOrBlockDialogFragment.A0B.A06(i2, 0);
            return;
        }
        reportSpamOrBlockDialogFragment.A0B.A0A(null);
        ActivityC004902h A0A = reportSpamOrBlockDialogFragment.A0A();
        if (A0A != null) {
            reportSpamOrBlockDialogFragment.A0L.ANF(new RunnableEBaseShape9S0200000_I1_4(reportSpamOrBlockDialogFragment, A0A, 30));
            return;
        }
        throw null;
    }
}
