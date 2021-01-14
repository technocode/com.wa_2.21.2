package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.group.GroupAddBlacklistPickerActivity;

/* renamed from: X.2fO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C54722fO implements AnonymousClass0SG {
    public final /* synthetic */ GroupAddBlacklistPickerActivity A00;

    public /* synthetic */ C54722fO(GroupAddBlacklistPickerActivity groupAddBlacklistPickerActivity) {
        this.A00 = groupAddBlacklistPickerActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        GroupAddBlacklistPickerActivity groupAddBlacklistPickerActivity = this.A00;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            groupAddBlacklistPickerActivity.A0V();
            return;
        }
        groupAddBlacklistPickerActivity.finish();
        ((ActivityC004702f) groupAddBlacklistPickerActivity).A0F.A06(R.string.failed_to_update_privacy_settings, 1);
    }
}
