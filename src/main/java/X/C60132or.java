package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2or  reason: invalid class name and case insensitive filesystem */
public class C60132or extends AbstractC56102i4 {
    public C007003k A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final /* synthetic */ AbstractView$OnCreateContextMenuListenerC56112i5 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60132or(AbstractView$OnCreateContextMenuListenerC56112i5 r3, View view) {
        super(view);
        this.A04 = r3;
        this.A02 = (TextEmojiLabel) view.findViewById(R.id.name);
        this.A01 = (ImageView) view.findViewById(R.id.avatar);
        this.A03 = (TextEmojiLabel) view.findViewById(R.id.push_name);
        AnonymousClass0Q7.A0W(this.A01, 2);
    }
}
