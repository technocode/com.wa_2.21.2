package X;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.whatsapp.WebImagePicker;

/* renamed from: X.1KD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1KD implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C11090fh A00;

    public /* synthetic */ AnonymousClass1KD(C11090fh r1) {
        this.A00 = r1;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C11090fh r3 = this.A00;
        ProgressDialog progressDialog = r3.A00;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        r3.A00 = null;
        ((AnonymousClass0JW) r3).A00.cancel(true);
        WebImagePicker webImagePicker = r3.A02;
        if (webImagePicker.A09 == r3) {
            webImagePicker.A09 = null;
        }
    }
}
