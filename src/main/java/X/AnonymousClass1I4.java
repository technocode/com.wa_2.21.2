package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcelable;
import com.whatsapp.DocumentPickerActivity;
import java.util.ArrayList;

/* renamed from: X.1I4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1I4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ DocumentPickerActivity.SendDocumentsConfirmationDialogFragment A00;
    public final /* synthetic */ ArrayList A01;

    public /* synthetic */ AnonymousClass1I4(DocumentPickerActivity.SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment, ArrayList arrayList) {
        this.A00 = sendDocumentsConfirmationDialogFragment;
        this.A01 = arrayList;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DocumentPickerActivity.SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment = this.A00;
        ArrayList<? extends Parcelable> arrayList = this.A01;
        ActivityC004902h A0A = sendDocumentsConfirmationDialogFragment.A0A();
        if (A0A != null) {
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            A0A.setResult(-1, intent);
            A0A.finish();
        }
    }
}
