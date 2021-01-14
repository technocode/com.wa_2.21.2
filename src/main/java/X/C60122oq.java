package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2oq  reason: invalid class name and case insensitive filesystem */
public class C60122oq extends AbstractC56102i4 {
    public C007003k A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final /* synthetic */ AbstractView$OnCreateContextMenuListenerC56112i5 A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60122oq(AbstractView$OnCreateContextMenuListenerC56112i5 r3, View view) {
        super(view);
        this.A06 = r3;
        this.A04 = (TextEmojiLabel) view.findViewById(R.id.name);
        this.A02 = (TextView) view.findViewById(R.id.status);
        this.A03 = (TextView) view.findViewById(R.id.time_left);
        this.A01 = (ImageView) view.findViewById(R.id.avatar);
        this.A05 = (TextEmojiLabel) view.findViewById(R.id.push_name);
        AnonymousClass0Q7.A0W(this.A01, 2);
    }
}
