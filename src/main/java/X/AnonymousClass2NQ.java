package X;

import android.app.Dialog;
import android.content.DialogInterface;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment;

/* renamed from: X.2NQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2NQ implements DialogInterface.OnShowListener {
    public final /* synthetic */ EmojiEditTextBottomSheetDialogFragment A00;

    public /* synthetic */ AnonymousClass2NQ(EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment) {
        this.A00 = emojiEditTextBottomSheetDialogFragment;
    }

    public final void onShow(DialogInterface dialogInterface) {
        EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment = this.A00;
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet));
        A002.A0D(3);
        A002.A0E = new AnonymousClass2d3(emojiEditTextBottomSheetDialogFragment);
    }
}
