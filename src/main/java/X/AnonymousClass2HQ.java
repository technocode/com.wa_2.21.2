package X;

import android.view.ViewTreeObserver;
import com.google.android.search.verification.client.R;
import com.whatsapp.MentionPickerView;

/* renamed from: X.2HQ  reason: invalid class name */
public class AnonymousClass2HQ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass2ZA A00;

    public AnonymousClass2HQ(AnonymousClass2ZA r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        AnonymousClass2ZA r4 = this.A00;
        r4.A00();
        MentionPickerView mentionPickerView = (MentionPickerView) r4;
        mentionPickerView.A02(mentionPickerView.A02.A05(), mentionPickerView.getResources().getDimensionPixelSize(R.dimen.mention_picker_row_height));
        r4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
