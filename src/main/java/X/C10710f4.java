package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.dialogs.ProgressDialogFragment;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.0f4  reason: invalid class name and case insensitive filesystem */
public class C10710f4 extends AnonymousClass0JW {
    public C007003k A00;
    public ProgressDialogFragment A01;
    public Set A02;
    public final DialogFragment A03;
    public final C04490Ko A04;
    public final WeakReference A05;
    public final boolean A06;

    public C10710f4(AnonymousClass0LW r2, DialogFragment dialogFragment, C04490Ko r4, C007003k r5, boolean z) {
        this.A05 = new WeakReference(r2);
        this.A04 = r4;
        this.A03 = dialogFragment;
        this.A00 = r5;
        this.A06 = z;
    }

    public C10710f4(AnonymousClass0LW r2, DialogFragment dialogFragment, C04490Ko r4, Set set, boolean z) {
        this.A05 = new WeakReference(r2);
        this.A04 = r4;
        this.A03 = dialogFragment;
        this.A02 = set;
        this.A06 = z;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        AnonymousClass0LW r2 = (AnonymousClass0LW) this.A05.get();
        if (r2 != null) {
            ProgressDialogFragment A002 = ProgressDialogFragment.A00(R.string.processing, R.string.register_wait_message);
            this.A01 = A002;
            AnonymousClass0QB r3 = new AnonymousClass0QB(r2);
            r3.A0A(0, A002, "count_progress", 1);
            r3.A01();
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        DialogFragment dialogFragment;
        Number number = (Number) obj;
        AnonymousClass0LW r5 = (AnonymousClass0LW) this.A05.get();
        if (r5 != null && !r5.A0H) {
            ProgressDialogFragment progressDialogFragment = this.A01;
            boolean z = false;
            if (((AnonymousClass037) progressDialogFragment).A04 >= 4) {
                z = true;
            }
            if (z) {
                progressDialogFragment.A0w(false, false);
            } else {
                progressDialogFragment.A01 = true;
            }
            C007003k r0 = this.A00;
            if (r0 != null) {
                dialogFragment = this.A03;
                ConversationsFragment.A04(r0, dialogFragment);
            } else {
                Set set = this.A02;
                dialogFragment = this.A03;
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("selection_jids", AnonymousClass1VY.A0F(set));
                dialogFragment.A0N(bundle);
            }
            Bundle bundle2 = ((AnonymousClass037) dialogFragment).A06;
            if (bundle2 != null) {
                bundle2.putInt("unsentCount", number.intValue());
                bundle2.putBoolean("chatContainsStarredMessages", this.A06);
                AnonymousClass0QB r3 = new AnonymousClass0QB(r5);
                r3.A0A(0, dialogFragment, null, 1);
                r3.A01();
                return;
            }
            throw null;
        }
    }
}
