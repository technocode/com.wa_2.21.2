package X;

import android.view.View;
import android.widget.RadioButton;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2nU  reason: invalid class name and case insensitive filesystem */
public class C59342nU extends AbstractC52052aV {
    public final RadioButton A00;
    public final TextEmojiLabel A01;
    public final TextEmojiLabel A02;
    public final /* synthetic */ C52062aW A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59342nU(C52062aW r3, View view) {
        super(view);
        this.A03 = r3;
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.select_list_item_title);
        this.A01 = (TextEmojiLabel) view.findViewById(R.id.select_list_item_description);
        this.A00 = (RadioButton) view.findViewById(R.id.select_list_item_radio_button);
        view.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 25));
    }
}
