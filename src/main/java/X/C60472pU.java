package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.SuspiciousLinkWarningDialogFragment;
import java.util.Set;

/* renamed from: X.2pU  reason: invalid class name and case insensitive filesystem */
public class C60472pU extends C05690Pr {
    public final Set A00;

    public C60472pU(Context context, AnonymousClass02M r2, AnonymousClass03P r3, AbstractC02790Dl r4, String str, Set set) {
        super(context, r2, r3, r4, str);
        this.A00 = set;
    }

    @Override // X.AbstractC05700Ps, X.C05690Pr
    public void onClick(View view) {
        Set set = this.A00;
        if (set != null) {
            ((ActivityC004702f) view.getContext()).APm(SuspiciousLinkWarningDialogFragment.A00(this.A06, set));
            return;
        }
        super.onClick(view);
    }
}
