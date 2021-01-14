package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.3Qp  reason: invalid class name and case insensitive filesystem */
public class C71863Qp extends AbstractC11910hD {
    public View.OnLongClickListener A00;
    public C29241Xq A01;
    public boolean A02;
    public boolean A03;
    public final View.OnLongClickListener A04 = new AnonymousClass33Z(this);
    public final AnonymousClass01X A05;
    public final AnonymousClass0D1 A06;
    public final AnonymousClass33U A07;
    public final StickerView A08;
    public final Integer A09;

    public C71863Qp(AnonymousClass0D1 r3, AnonymousClass01X r4, LayoutInflater layoutInflater, ViewGroup viewGroup, AnonymousClass33U r7, Integer num) {
        super(layoutInflater.inflate(R.layout.sticker_picker_item, viewGroup, false));
        this.A06 = r3;
        this.A05 = r4;
        this.A07 = r7;
        this.A09 = num;
        StickerView stickerView = (StickerView) this.A0H.findViewById(R.id.sticker_view);
        this.A08 = stickerView;
        stickerView.A02 = true;
    }

    public void A0C(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            if (!z || !this.A03) {
                StickerView stickerView = this.A08;
                stickerView.A03 = false;
                stickerView.A01();
                return;
            }
            StickerView stickerView2 = this.A08;
            stickerView2.A03 = true;
            stickerView2.A00();
        }
    }
}
