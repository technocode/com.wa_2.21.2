package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.voipcalling.CallInfoFragment;

/* renamed from: X.3TQ  reason: invalid class name */
public class AnonymousClass3TQ extends AbstractC11910hD {
    public View A00;
    public ImageView A01 = ((ImageView) AnonymousClass0Q7.A0D(this.A00, R.id.avatar));
    public TextEmojiLabel A02 = ((TextEmojiLabel) AnonymousClass0Q7.A0D(this.A00, R.id.push_name));
    public C11930hF A03;

    public AnonymousClass3TQ(CallInfoFragment callInfoFragment, View view) {
        super(view);
        this.A00 = view;
        this.A03 = new C11930hF(view, R.id.name, callInfoFragment.A07, callInfoFragment.A09, callInfoFragment.A0A);
    }
}
