package X;

import android.os.Build;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.picker.search.PickerSearchDialogFragment;

/* renamed from: X.1s1  reason: invalid class name and case insensitive filesystem */
public class C39741s1 implements AnonymousClass33U {
    public final /* synthetic */ Conversation A00;

    public C39741s1(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.AnonymousClass33U
    public void AKY(C29241Xq r9, Integer num) {
        Conversation conversation = this.A00;
        if (!conversation.A2u.A06()) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_sending_media_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_sending_media;
            }
            RequestPermissionActivity.A0B(conversation, R.string.permission_storage_need_write_access_on_sending_media_request, i2, false, 812);
        } else if (conversation.A1y.A0H((UserJid) conversation.A0z.A02(UserJid.class))) {
            C002001d.A2O(conversation, 106);
        } else {
            C69873Iw r0 = conversation.A15;
            r0.A06 = false;
            PickerSearchDialogFragment pickerSearchDialogFragment = r0.A03;
            if (pickerSearchDialogFragment != null) {
                pickerSearchDialogFragment.A0x();
            }
            C59842oN r02 = conversation.A11;
            if (r02 != null && !r02.isShowing()) {
                conversation.A0k.A01(false);
            }
            C04360Kb r2 = conversation.A2K;
            AnonymousClass02N r4 = conversation.A14;
            if (r4 != null) {
                r2.A0O(r9, r4, conversation.A17, conversation.A1X, num);
                return;
            }
            throw null;
        }
    }
}
