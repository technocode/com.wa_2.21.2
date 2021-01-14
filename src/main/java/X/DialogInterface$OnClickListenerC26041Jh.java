package X;

import android.content.DialogInterface;
import android.net.Uri;
import com.whatsapp.SuspiciousLinkWarningDialogFragment;

/* renamed from: X.1Jh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC26041Jh implements DialogInterface.OnClickListener {
    public final /* synthetic */ SuspiciousLinkWarningDialogFragment A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ DialogInterface$OnClickListenerC26041Jh(SuspiciousLinkWarningDialogFragment suspiciousLinkWarningDialogFragment, String str) {
        this.A00 = suspiciousLinkWarningDialogFragment;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SuspiciousLinkWarningDialogFragment suspiciousLinkWarningDialogFragment = this.A00;
        suspiciousLinkWarningDialogFragment.A01.ANL(suspiciousLinkWarningDialogFragment.A00(), Uri.parse(this.A01));
    }
}
