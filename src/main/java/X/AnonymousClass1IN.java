package X;

import android.content.DialogInterface;
import com.whatsapp.LiveLocationPrivacyActivity;

/* renamed from: X.1IN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IN implements DialogInterface.OnClickListener {
    public final /* synthetic */ LiveLocationPrivacyActivity A00;

    public /* synthetic */ AnonymousClass1IN(LiveLocationPrivacyActivity liveLocationPrivacyActivity) {
        this.A00 = liveLocationPrivacyActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LiveLocationPrivacyActivity liveLocationPrivacyActivity = this.A00;
        AnonymousClass008.A0n(liveLocationPrivacyActivity.A0J, "live_location_is_new_user", true);
        liveLocationPrivacyActivity.A0E.A0F();
    }
}
