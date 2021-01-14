package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.dialogs.ProgressDialogFragment;

/* renamed from: X.0Rr  reason: invalid class name and case insensitive filesystem */
public class C06090Rr {
    public static boolean A02;
    public static final String A03 = ProgressDialogFragment.class.getName();
    public DialogFragment A00;
    public final ActivityC004702f A01;

    public C06090Rr(ActivityC004702f r1) {
        this.A01 = r1;
    }

    public void A00() {
        A02 = false;
        if (!C002001d.A3D(this.A01)) {
            DialogFragment dialogFragment = this.A00;
            if (dialogFragment != null) {
                dialogFragment.A0r();
            }
            this.A00 = null;
        }
    }
}
