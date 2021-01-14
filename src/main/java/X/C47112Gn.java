package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.SelectionCheckView;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2Gn  reason: invalid class name and case insensitive filesystem */
public class C47112Gn {
    public final ImageView A00;
    public final SelectionCheckView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;

    public C47112Gn(View view) {
        this.A00 = (ImageView) view.findViewById(R.id.contactpicker_row_photo);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) view.findViewById(R.id.name);
        this.A02 = textEmojiLabel;
        AnonymousClass0Q7.A0W(textEmojiLabel, 2);
        C002301g.A03(this.A02);
        this.A01 = (SelectionCheckView) view.findViewById(R.id.selection_check);
        this.A03 = (TextEmojiLabel) view.findViewById(R.id.phone_number);
    }
}
