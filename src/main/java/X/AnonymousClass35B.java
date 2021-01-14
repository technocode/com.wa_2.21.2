package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.DocumentWarningDialogFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.35B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass35B implements DialogInterface.OnClickListener {
    public final /* synthetic */ DocumentWarningDialogFragment A00;

    public /* synthetic */ AnonymousClass35B(DocumentWarningDialogFragment documentWarningDialogFragment) {
        this.A00 = documentWarningDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DocumentWarningDialogFragment documentWarningDialogFragment = this.A00;
        Bundle bundle = ((AnonymousClass037) documentWarningDialogFragment).A06;
        if (bundle != null) {
            long j = bundle.getLong("message_id");
            AnonymousClass01K r8 = documentWarningDialogFragment.A05;
            AnonymousClass0M2 r7 = (AnonymousClass0M2) r8.A0J.A01(j);
            if (r7 != null && ((AnonymousClass0M3) r7).A02 != null) {
                AnonymousClass02M r10 = documentWarningDialogFragment.A02;
                AnonymousClass009 r9 = documentWarningDialogFragment.A01;
                AnonymousClass00T r6 = documentWarningDialogFragment.A07;
                AnonymousClass0BW r5 = documentWarningDialogFragment.A06;
                Context A002 = documentWarningDialogFragment.A00();
                C02780Dk r4 = documentWarningDialogFragment.A00;
                WeakReference weakReference = new WeakReference(A002);
                r10.A05(0, R.string.loading_spinner);
                AnonymousClass3S7 r3 = new AnonymousClass3S7(weakReference, r10, r4, r7);
                C60322pF r2 = new C60322pF(r9, r5, r7);
                ((C41191ud) r2).A01.A03(r3, r10.A06);
                r6.ANF(r2);
                ((AnonymousClass0M3) r7).A02.A07 = 2;
                r8.A0M(r7);
                return;
            }
            return;
        }
        throw null;
    }
}
