package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

/* renamed from: X.3Yg  reason: invalid class name and case insensitive filesystem */
public class C73673Yg extends AbstractC69453Hc {
    public final Context A00;
    public final TextView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;
    public final WaTextView A04;

    public C73673Yg(View view) {
        super(view);
        this.A00 = view.getContext();
        this.A04 = (WaTextView) AnonymousClass0Q7.A0D(view, R.id.status_icon);
        this.A01 = (TextView) AnonymousClass0Q7.A0D(view, R.id.transaction_status);
        this.A02 = (TextView) AnonymousClass0Q7.A0D(view, R.id.transaction_time);
        this.A03 = (TextEmojiLabel) AnonymousClass0Q7.A0D(view, R.id.status_error_text);
    }
}
