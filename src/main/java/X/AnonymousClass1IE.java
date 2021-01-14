package X;

import android.content.DialogInterface;
import com.whatsapp.GdprReportActivity;

/* renamed from: X.1IE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IE implements DialogInterface.OnClickListener {
    public final /* synthetic */ GdprReportActivity.DeleteReportConfirmationDialogFragment A00;

    public /* synthetic */ AnonymousClass1IE(GdprReportActivity.DeleteReportConfirmationDialogFragment deleteReportConfirmationDialogFragment) {
        this.A00 = deleteReportConfirmationDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        GdprReportActivity gdprReportActivity = (GdprReportActivity) this.A00.A0A();
        if (gdprReportActivity != null) {
            AnonymousClass02M r3 = ((ActivityC004702f) gdprReportActivity).A0F;
            if (r3.A0H()) {
                if (gdprReportActivity.A07 != null) {
                    gdprReportActivity.A07 = null;
                }
                C40091sc r2 = new C40091sc(gdprReportActivity, r3, gdprReportActivity.A0A, gdprReportActivity.A0I);
                gdprReportActivity.A07 = r2;
                gdprReportActivity.A0J.ANC(r2, new Void[0]);
            }
        }
    }
}
