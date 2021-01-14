package X;

import android.app.Activity;
import android.os.Build;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.2jE  reason: invalid class name and case insensitive filesystem */
public class C56812jE implements AbstractC07200Wh {
    public final Activity A00;
    public final AnonymousClass00C A01;

    public C56812jE(AnonymousClass00C r1, Activity activity) {
        this.A00 = activity;
        this.A01 = r1;
    }

    @Override // X.AbstractC07200Wh
    public void AJ0(String str) {
        Activity activity = this.A00;
        if (!activity.isFinishing()) {
            AbstractC004502c r3 = (AbstractC004502c) activity;
            if (r3 != null) {
                boolean A012 = AnonymousClass00C.A01();
                int i = R.string.conversation_cannot_download_media_read_only_media_card_shared_storage;
                if (A012) {
                    i = R.string.conversation_cannot_download_media_read_only_media_card;
                }
                r3.APq(R.string.download_failed, i, new Object[0]);
                return;
            }
            throw null;
        }
    }

    @Override // X.AbstractC07200Wh
    public void AJ1() {
        Activity activity = this.A00;
        if (activity != null) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_msg_download_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_msg_download;
            }
            RequestPermissionActivity.A09(activity, R.string.permission_storage_need_write_access_on_msg_download_request, i2);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC07200Wh
    public void ALM(String str) {
        Activity activity = this.A00;
        if (!activity.isFinishing()) {
            AbstractC004502c r3 = (AbstractC004502c) activity;
            if (r3 != null) {
                boolean A012 = AnonymousClass00C.A01();
                int i = R.string.conversation_cannot_download_media_no_media_card_shared_storage;
                if (A012) {
                    i = R.string.conversation_cannot_download_media_no_media_card;
                }
                r3.APq(R.string.download_failed, i, new Object[0]);
                return;
            }
            throw null;
        }
    }

    @Override // X.AbstractC07200Wh
    public void ALN() {
        Activity activity = this.A00;
        if (activity != null) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_msg_download_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_msg_download;
            }
            RequestPermissionActivity.A09(activity, R.string.permission_storage_need_write_access_on_msg_download_request, i2);
            return;
        }
        throw null;
    }
}
