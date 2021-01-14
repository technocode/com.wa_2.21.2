package X;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.1rw  reason: invalid class name and case insensitive filesystem */
public class C39691rw extends C27131Oe {
    public final /* synthetic */ Conversation A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39691rw(Conversation conversation, ActivityC004902h r32, AbstractC004502c r33, View view, AnonymousClass00S r35, AnonymousClass02M r36, AnonymousClass00T r37, AnonymousClass088 r38, AnonymousClass00Y r39, C000300f r40, C04360Kb r41, AnonymousClass0CP r42, AnonymousClass0JO r43, AnonymousClass0Fh r44, AnonymousClass03P r45, AnonymousClass01X r46, AnonymousClass0AL r47, AnonymousClass0GG r48, AnonymousClass0ET r49, AnonymousClass00C r50, C02580Cq r51, C04270Js r52, C40991uH r53, AnonymousClass00D r54, AnonymousClass0AV r55, C26481Lc r56, C04420Kh r57, AnonymousClass022 r58) {
        super(r32, r33, view, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r52, r53, r54, r55, r56, r57, r58, true, true);
        this.A00 = conversation;
    }

    @Override // X.C27131Oe
    public boolean A0O() {
        Conversation conversation = this.A00;
        AnonymousClass03S r0 = conversation.A2u;
        boolean z = !r0.A06();
        int A02 = r0.A02("android.permission.RECORD_AUDIO");
        boolean z2 = false;
        if (A02 != 0) {
            z2 = true;
        }
        if (z2) {
            if (z) {
                Intent putExtra = new Intent(conversation, RequestPermissionActivity.class).putExtra("drawable_ids", new int[]{R.drawable.permission_storage, R.drawable.permission_plus, R.drawable.permission_mic}).putExtra("message_id", R.string.permission_storage_mic_on_audio_msg_request);
                int i = Build.VERSION.SDK_INT;
                int i2 = R.string.permission_storage_mic_on_audio_msg_v30;
                if (i < 30) {
                    i2 = R.string.permission_storage_mic_on_audio_msg;
                }
                conversation.startActivity(putExtra.putExtra("perm_denial_message_id", i2).putExtra("permissions", new String[]{"android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}));
            } else {
                conversation.startActivity(new Intent(conversation, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_mic).putExtra("message_id", R.string.permission_mic_access_on_audio_msg_request).putExtra("perm_denial_message_id", R.string.permission_mic_access_on_audio_msg).putExtra("permissions", new String[]{"android.permission.RECORD_AUDIO"}));
            }
        } else if (!z) {
            return true;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            int i4 = R.string.permission_storage_need_write_access_on_record_audio_v30;
            if (i3 < 30) {
                i4 = R.string.permission_storage_need_write_access_on_record_audio;
            }
            RequestPermissionActivity.A09(conversation, R.string.permission_storage_need_write_access_on_record_audio_request, i4);
        }
        return false;
    }
}
