package X;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1uD  reason: invalid class name and case insensitive filesystem */
public class C40971uD extends AbstractC11910hD {
    public final Button A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;

    public C40971uD(View view) {
        super(view);
        AnonymousClass0Q7.A0N(view);
        this.A03 = (TextEmojiLabel) view.findViewById(R.id.name);
        this.A02 = (TextView) view.findViewById(R.id.description);
        this.A01 = (ImageView) view.findViewById(R.id.image);
        this.A00 = (Button) view.findViewById(R.id.add_contact_btn);
    }
}
