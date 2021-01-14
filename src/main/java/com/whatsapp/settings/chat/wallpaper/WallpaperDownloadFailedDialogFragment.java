package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass037;
import X.AnonymousClass0MB;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class WallpaperDownloadFailedDialogFragment extends WaDialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            int i = bundle2.getInt("ERROR_STATE_KEY");
            AnonymousClass0MB r2 = new AnonymousClass0MB(A0A());
            r2.A02(R.string.wallpaper_thumbnails_download_failed_dialog_title);
            if (i == 5) {
                r2.A01(R.string.wallpaper_thumbnails_download_failed_dialog_content_storage_error);
            } else {
                r2.A01(R.string.wallpaper_thumbnails_download_failed_dialog_content_network_error);
            }
            r2.A04(R.string.ok, null);
            r2.A01.A0J = false;
            return r2.A00();
        }
        throw null;
    }
}
