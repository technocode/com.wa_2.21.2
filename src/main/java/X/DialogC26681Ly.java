package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Ly  reason: invalid class name and case insensitive filesystem */
public class DialogC26681Ly extends Dialog {
    public final int A00;
    public final Activity A01;
    public final AnonymousClass01X A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC26681Ly(Activity activity, AnonymousClass01X r3, int i, boolean z) {
        super(activity, z ? R.style.FullScreenDialogNoFloating : R.style.FullScreenDialog);
        this.A02 = r3;
        this.A01 = activity;
        this.A00 = i;
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass0SE.A09(this.A02, getWindow());
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            setContentView(window.getLayoutInflater().inflate(this.A00, (ViewGroup) null, false));
            getWindow().setLayout(-1, -1);
            return;
        }
        throw null;
    }
}
