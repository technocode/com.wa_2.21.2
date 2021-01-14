package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionsDialogFragment;
import com.whatsapp.notification.PopupNotification;

/* renamed from: X.2mM  reason: invalid class name and case insensitive filesystem */
public class C58702mM extends C27131Oe {
    public final /* synthetic */ PopupNotification A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58702mM(PopupNotification popupNotification, ActivityC004902h r32, AbstractC004502c r33, View view, AnonymousClass00S r35, AnonymousClass02M r36, AnonymousClass00T r37, AnonymousClass088 r38, AnonymousClass00Y r39, C000300f r40, C04360Kb r41, AnonymousClass0CP r42, AnonymousClass0JO r43, AnonymousClass0Fh r44, AnonymousClass03P r45, AnonymousClass01X r46, AnonymousClass0AL r47, AnonymousClass0GG r48, AnonymousClass0ET r49, AnonymousClass00C r50, C02580Cq r51, C04270Js r52, C40991uH r53, AnonymousClass00D r54, AnonymousClass0AV r55, C26481Lc r56, C04420Kh r57, AnonymousClass022 r58, boolean z) {
        super(r32, r33, view, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r52, r53, r54, r55, r56, r57, r58, false, z);
        this.A00 = popupNotification;
    }

    @Override // X.C27131Oe
    public void A04() {
        this.A00.A0i.A02(true);
        C28301Tu.A05();
        super.A04();
    }

    @Override // X.C27131Oe
    public boolean A0O() {
        PopupNotification popupNotification = this.A00;
        AnonymousClass03S r0 = popupNotification.A18;
        boolean z = !r0.A06();
        int A02 = r0.A02("android.permission.RECORD_AUDIO");
        boolean z2 = true;
        if (A02 == 0) {
            z2 = false;
            if (!z) {
                return true;
            }
        }
        RequestPermissionsDialogFragment requestPermissionsDialogFragment = new RequestPermissionsDialogFragment();
        Bundle bundle = new Bundle();
        if (z2) {
            if (z) {
                bundle.putIntArray("drawables", new int[]{R.drawable.permission_mic, R.drawable.permission_plus, R.drawable.permission_storage});
                bundle.putStringArray("permissions", new String[]{"android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"});
                bundle.putInt("msg_id", R.string.permission_storage_mic_on_audio_msg_request);
                int i = Build.VERSION.SDK_INT;
                int i2 = R.string.permission_storage_mic_on_audio_msg_v30;
                if (i < 30) {
                    i2 = R.string.permission_storage_mic_on_audio_msg;
                }
                bundle.putInt("perm_denial_msg_id", i2);
                bundle.putInt("locked_msg_id", R.string.permission_storage_mic_on_audio_msg_locked_screen_request);
                int i3 = R.string.permission_storage_mic_on_audio_msg_locked_screen_v30;
                if (i < 30) {
                    i3 = R.string.permission_storage_mic_on_audio_msg_locked_screen;
                }
                bundle.putInt("locked_perm_denial_msg_id", i3);
            }
            bundle.putIntArray("drawables", new int[]{R.drawable.permission_mic});
            bundle.putStringArray("permissions", new String[]{"android.permission.RECORD_AUDIO"});
            bundle.putInt("msg_id", R.string.permission_mic_access_on_audio_msg_request);
            bundle.putInt("perm_denial_msg_id", R.string.permission_mic_access_on_audio_msg);
            bundle.putInt("locked_msg_id", R.string.permission_unable_to_start_ptt_in_popup);
            bundle.putInt("locked_perm_denial_msg_id", R.string.permission_unable_to_start_ptt_in_popup_screen_locked);
        } else {
            if (z) {
                bundle.putIntArray("drawables", new int[]{R.drawable.permission_storage});
                bundle.putStringArray("permissions", new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"});
                bundle.putInt("msg_id", R.string.permission_storage_need_write_access_on_record_audio_request);
                int i4 = Build.VERSION.SDK_INT;
                int i5 = R.string.permission_storage_need_write_access_on_record_audio_v30;
                if (i4 < 30) {
                    i5 = R.string.permission_storage_need_write_access_on_record_audio;
                }
                bundle.putInt("perm_denial_msg_id", i5);
                bundle.putInt("locked_msg_id", R.string.permission_storage_need_write_access_on_record_audio_locked_screen_request);
                int i6 = R.string.permission_storage_need_write_access_on_record_audio_locked_screen_v30;
                if (i4 < 30) {
                    i6 = R.string.permission_storage_need_write_access_on_record_audio_locked_screen;
                }
                bundle.putInt("locked_perm_denial_msg_id", i6);
            }
            bundle.putIntArray("drawables", new int[]{R.drawable.permission_mic});
            bundle.putStringArray("permissions", new String[]{"android.permission.RECORD_AUDIO"});
            bundle.putInt("msg_id", R.string.permission_mic_access_on_audio_msg_request);
            bundle.putInt("perm_denial_msg_id", R.string.permission_mic_access_on_audio_msg);
            bundle.putInt("locked_msg_id", R.string.permission_unable_to_start_ptt_in_popup);
            bundle.putInt("locked_perm_denial_msg_id", R.string.permission_unable_to_start_ptt_in_popup_screen_locked);
        }
        requestPermissionsDialogFragment.A0N(bundle);
        requestPermissionsDialogFragment.A0u(popupNotification.A04(), "permission_fragment");
        return false;
    }
}
