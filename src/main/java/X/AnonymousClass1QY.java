package X;

import android.content.DialogInterface;
import android.widget.Toast;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;

/* renamed from: X.1QY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1QY implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SingleChoiceListDialogFragment A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String[] A03;
    public final /* synthetic */ boolean[] A04;

    public /* synthetic */ AnonymousClass1QY(SingleChoiceListDialogFragment singleChoiceListDialogFragment, boolean[] zArr, int i, String[] strArr, String str) {
        this.A01 = singleChoiceListDialogFragment;
        this.A04 = zArr;
        this.A00 = i;
        this.A03 = strArr;
        this.A02 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SingleChoiceListDialogFragment singleChoiceListDialogFragment = this.A01;
        boolean[] zArr = this.A04;
        int i2 = this.A00;
        String[] strArr = this.A03;
        String str = this.A02;
        if (zArr == null || zArr[i]) {
            singleChoiceListDialogFragment.A00.AKA(i2, i, strArr);
            singleChoiceListDialogFragment.A03.set(true);
            dialogInterface.dismiss();
        } else if (str != null) {
            Toast A012 = singleChoiceListDialogFragment.A01.A01(str, 0);
            A012.setGravity(17, 0, 0);
            A012.show();
        }
    }
}
