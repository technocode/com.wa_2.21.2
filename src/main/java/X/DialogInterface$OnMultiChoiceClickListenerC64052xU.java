package X;

import android.content.DialogInterface;
import com.whatsapp.preference.WaMultiSelectListPreference;

/* renamed from: X.2xU  reason: invalid class name and case insensitive filesystem */
public class DialogInterface$OnMultiChoiceClickListenerC64052xU implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ WaMultiSelectListPreference A00;

    public DialogInterface$OnMultiChoiceClickListenerC64052xU(WaMultiSelectListPreference waMultiSelectListPreference) {
        this.A00 = waMultiSelectListPreference;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.A00.A01[i] = z;
    }
}
