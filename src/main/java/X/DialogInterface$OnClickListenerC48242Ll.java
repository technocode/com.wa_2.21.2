package X;

import android.content.DialogInterface;
import com.whatsapp.deeplink.DeepLinkActivity;

/* renamed from: X.2Ll  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC48242Ll implements DialogInterface.OnClickListener {
    public final /* synthetic */ DeepLinkActivity A00;

    public /* synthetic */ DialogInterface$OnClickListenerC48242Ll(DeepLinkActivity deepLinkActivity) {
        this.A00 = deepLinkActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeepLinkActivity deepLinkActivity = this.A00;
        deepLinkActivity.finish();
        deepLinkActivity.overridePendingTransition(0, 0);
    }
}
