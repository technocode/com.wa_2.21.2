package X;

import android.content.Context;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.GroupCallParticipantPicker;
import com.whatsapp.voipcalling.JoinableEducationDialogFragment;

/* renamed from: X.3af  reason: invalid class name and case insensitive filesystem */
public class C74333af extends AbstractC39391rQ {
    public final /* synthetic */ GroupCallParticipantPicker A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74333af(GroupCallParticipantPicker groupCallParticipantPicker, Context context) {
        super(context, R.color.link_color);
        this.A00 = groupCallParticipantPicker;
    }

    @Override // X.AbstractC05700Ps
    public void onClick(View view) {
        AnonymousClass0LW A04 = this.A00.A04();
        if (A04 != null) {
            AnonymousClass0QB r3 = new AnonymousClass0QB(A04);
            r3.A0A(0, JoinableEducationDialogFragment.A00(false, null), null, 1);
            r3.A01();
            return;
        }
        throw null;
    }
}
