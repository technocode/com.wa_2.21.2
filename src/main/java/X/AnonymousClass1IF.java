package X;

import android.content.DialogInterface;
import com.whatsapp.GdprReportActivity;

/* renamed from: X.1IF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IF implements DialogInterface.OnClickListener {
    public final /* synthetic */ GdprReportActivity.ShareReportConfirmationDialogFragment A00;

    public /* synthetic */ AnonymousClass1IF(GdprReportActivity.ShareReportConfirmationDialogFragment shareReportConfirmationDialogFragment) {
        this.A00 = shareReportConfirmationDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        GdprReportActivity gdprReportActivity = (GdprReportActivity) this.A00.A0A();
        if (gdprReportActivity != null) {
            gdprReportActivity.A0J.ANC(new C40081sb(gdprReportActivity.A0C, ((ActivityC004702f) gdprReportActivity).A0E, gdprReportActivity), new Void[0]);
        }
    }
}
