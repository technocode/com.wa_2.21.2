package X;

import android.os.Bundle;
import android.view.View;
import com.whatsapp.group.GroupSettingsActivity;

/* renamed from: X.2fq  reason: invalid class name and case insensitive filesystem */
public class C55002fq extends AbstractView$OnClickListenerC08330av {
    public final /* synthetic */ GroupSettingsActivity A00;

    public C55002fq(GroupSettingsActivity groupSettingsActivity) {
        this.A00 = groupSettingsActivity;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        GroupSettingsActivity groupSettingsActivity = this.A00;
        AnonymousClass02U r1 = groupSettingsActivity.A02;
        boolean z = groupSettingsActivity.A00.A0Z;
        GroupSettingsActivity.EditGroupInfoDialogFragment editGroupInfoDialogFragment = new GroupSettingsActivity.EditGroupInfoDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("gjid", r1.getRawString());
        bundle.putBoolean("default", z);
        editGroupInfoDialogFragment.A0N(bundle);
        groupSettingsActivity.APl(editGroupInfoDialogFragment, null);
    }
}
