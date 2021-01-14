package X;

import android.view.KeyEvent;
import com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment;

/* renamed from: X.2d2  reason: invalid class name */
public class AnonymousClass2d2 implements AbstractC26561Lk {
    public final /* synthetic */ EmojiEditTextBottomSheetDialogFragment A00;

    public AnonymousClass2d2(EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment) {
        this.A00 = emojiEditTextBottomSheetDialogFragment;
    }

    @Override // X.AbstractC26561Lk
    public void ADI() {
        this.A00.A08.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // X.AbstractC26561Lk
    public void AFR(int[] iArr) {
        EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment = this.A00;
        C002001d.A2l(emojiEditTextBottomSheetDialogFragment.A08, iArr, emojiEditTextBottomSheetDialogFragment.A04);
    }
}
