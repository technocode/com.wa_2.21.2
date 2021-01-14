package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0Q7;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.SingleSelectionDialogFragment;

public class WallpaperSetConfirmationDialogFragment extends SingleSelectionDialogFragment {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();

    @Override // com.whatsapp.SingleSelectionDialogFragment
    public AnonymousClass0MB A0x() {
        AnonymousClass0MB A0x = super.A0x();
        TextView textView = (TextView) LayoutInflater.from(A0A()).inflate(R.layout.wallpaper_confirmation_explanation, (ViewGroup) null);
        textView.setText(this.A00.A06(R.string.wallpaper_dialog_set_wallpaper_for_all_chats_explanation));
        AnonymousClass0MC r3 = A0x.A01;
        r3.A0C = textView;
        r3.A01 = 0;
        View inflate = LayoutInflater.from(A0A()).inflate(R.layout.wallpaper_confirmation_title, (ViewGroup) null);
        ((TextView) AnonymousClass0Q7.A0D(inflate, R.id.wallpaper_confirmation_title_view)).setText(R.string.wallpaper_dialog_set_wallpaper);
        r3.A0B = inflate;
        return A0x;
    }
}
