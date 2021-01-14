package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.SelectionCheckView;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2GY  reason: invalid class name */
public class AnonymousClass2GY {
    public final View A00;
    public final ImageView A01;
    public final SelectionCheckView A02;
    public final TextEmojiLabel A03;
    public final C11930hF A04;

    public AnonymousClass2GY(C014308b r8, AnonymousClass01X r9, AnonymousClass31y r10, View view) {
        this.A00 = view.findViewById(R.id.row_container);
        this.A01 = (ImageView) view.findViewById(R.id.contact_photo);
        C11930hF r1 = new C11930hF(view, R.id.chat_able_contacts_row_name, r8, r9, r10);
        this.A04 = r1;
        AnonymousClass0Q7.A0W(r1.A00, 2);
        C002301g.A03(this.A04.A00);
        this.A03 = (TextEmojiLabel) view.findViewById(R.id.chat_able_contacts_row_status);
        this.A02 = (SelectionCheckView) view.findViewById(R.id.selection_check);
    }
}
