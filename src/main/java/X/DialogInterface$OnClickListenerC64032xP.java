package X;

import android.content.DialogInterface;
import com.whatsapp.preference.WaFontListPreference;

/* renamed from: X.2xP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC64032xP implements DialogInterface.OnClickListener {
    public final /* synthetic */ WaFontListPreference A00;

    public /* synthetic */ DialogInterface$OnClickListenerC64032xP(WaFontListPreference waFontListPreference) {
        this.A00 = waFontListPreference;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        WaFontListPreference waFontListPreference = this.A00;
        waFontListPreference.A00 = i;
        waFontListPreference.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
