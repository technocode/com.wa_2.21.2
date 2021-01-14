package X;

import android.content.Intent;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.2Do  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Do implements View.OnLongClickListener {
    public final /* synthetic */ AnonymousClass0YW A00;

    public /* synthetic */ AnonymousClass2Do(AnonymousClass0YW r1) {
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass0YW r2 = this.A00;
        if (!r2.A0N.ABT() && !r2.A0o.hasMessages(0)) {
            if (r2.A0l || r2.A14.A02("android.permission.RECORD_AUDIO") == 0) {
                r2.A08();
                return true;
            }
            r2.A0l = true;
            r2.A0E.setImageResource(R.drawable.btn_shutter);
            r2.A0E.clearAnimation();
            ActivityC004702f r3 = r2.A0L;
            r3.startActivity(new Intent(r3, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_mic).putExtra("message_id", R.string.permission_mic_access_on_video_recording_request).putExtra("perm_denial_message_id", R.string.permission_mic_access_on_video_recording).putExtra("permissions", new String[]{"android.permission.RECORD_AUDIO"}));
        }
        return true;
    }
}
