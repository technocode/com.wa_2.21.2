package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.biz.catalog.EllipsizedTextEmojiLabel;

/* renamed from: X.27n  reason: invalid class name */
public class AnonymousClass27n extends AbstractC39391rQ {
    public final /* synthetic */ EllipsizedTextEmojiLabel A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass27n(EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel, Context context, int i) {
        super(context, i);
        this.A00 = ellipsizedTextEmojiLabel;
    }

    @Override // X.AbstractC05700Ps
    public void onClick(View view) {
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = this.A00;
        View.OnClickListener onClickListener = ellipsizedTextEmojiLabel.A03;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        ellipsizedTextEmojiLabel.A00 = Integer.MAX_VALUE;
        ellipsizedTextEmojiLabel.A04(ellipsizedTextEmojiLabel.A04, ellipsizedTextEmojiLabel.A05, true, ellipsizedTextEmojiLabel.A01);
    }
}
