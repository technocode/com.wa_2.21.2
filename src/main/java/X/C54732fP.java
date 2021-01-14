package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.group.GroupAddBlacklistPickerActivity;

/* renamed from: X.2fP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C54732fP implements AnonymousClass0SG {
    public final /* synthetic */ GroupAddBlacklistPickerActivity A00;

    public /* synthetic */ C54732fP(GroupAddBlacklistPickerActivity groupAddBlacklistPickerActivity) {
        this.A00 = groupAddBlacklistPickerActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        GroupAddBlacklistPickerActivity groupAddBlacklistPickerActivity = this.A00;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            AnonymousClass02M r2 = ((ActivityC004702f) groupAddBlacklistPickerActivity).A0F;
            r2.A02();
            if (bool.booleanValue()) {
                groupAddBlacklistPickerActivity.setResult(-1);
            } else {
                r2.A06(R.string.coldsync_no_network, 1);
            }
            groupAddBlacklistPickerActivity.finish();
        }
    }
}
