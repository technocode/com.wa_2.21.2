package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.voipcalling.CallsFragment;

/* renamed from: X.37h  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC671237h implements DialogInterface.OnClickListener {
    public final /* synthetic */ CallsFragment.ClearCallLogDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC671237h(CallsFragment.ClearCallLogDialogFragment clearCallLogDialogFragment) {
        this.A00 = clearCallLogDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CallsFragment.ClearCallLogDialogFragment clearCallLogDialogFragment = this.A00;
        ProgressDialogFragment A002 = ProgressDialogFragment.A00(R.string.processing, R.string.register_wait_message);
        A002.A0u(clearCallLogDialogFragment.A0H, null);
        clearCallLogDialogFragment.A03.ANF(new RunnableEBaseShape9S0200000_I1_4(clearCallLogDialogFragment, A002, 31));
    }
}
