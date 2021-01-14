package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2gU  reason: invalid class name and case insensitive filesystem */
public class C55402gU extends AbstractC11910hD {
    public ImageView A00;
    public TextEmojiLabel A01;
    public TextEmojiLabel A02;
    public C11930hF A03;

    public C55402gU(C014308b r8, AnonymousClass01X r9, AnonymousClass31y r10, View view) {
        super(view);
        this.A03 = new C11930hF(view, R.id.name, r8, r9, r10);
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.status);
        this.A00 = (ImageView) view.findViewById(R.id.avatar);
        view.findViewById(R.id.divider);
        view.findViewById(R.id.invite);
        this.A01 = (TextEmojiLabel) view.findViewById(R.id.push_name);
        AnonymousClass0Q7.A0W(this.A00, 2);
        view.setBackgroundResource(R.drawable.selector_orange_gradient);
        view.setFocusable(true);
        view.setClickable(true);
    }
}
