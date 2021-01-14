package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.List;

/* renamed from: X.3ZS  reason: invalid class name */
public class AnonymousClass3ZS extends AnonymousClass3OL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public FrameLayout A04;
    public WaImageView A05;
    public WaImageView A06;
    public C656730w A07;
    public C75073c8 A08;
    public List A09;
    public final AnonymousClass02M A0A;
    public final AnonymousClass0HJ A0B;
    public final AnonymousClass0YX A0C;
    public final AnonymousClass01X A0D;
    public final AnonymousClass3SQ A0E;

    public AnonymousClass3ZS(Context context, AnonymousClass02M r2, AnonymousClass0HJ r3, AnonymousClass01X r4, AnonymousClass3SQ r5, AnonymousClass0YX r6) {
        super(context);
        this.A0A = r2;
        this.A0B = r3;
        this.A0D = r4;
        this.A0E = r5;
        this.A0C = r6;
        A00();
    }

    public final ThumbnailButton A01(Context context, int i) {
        ThumbnailButton thumbnailButton = new ThumbnailButton(context);
        thumbnailButton.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        thumbnailButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        thumbnailButton.A03 = C004302a.A00(getContext(), R.color.search_attachment_background);
        thumbnailButton.A01 = (float) this.A00;
        thumbnailButton.A02 = (float) this.A02;
        thumbnailButton.A06 = false;
        AnonymousClass0Q7.A0W(thumbnailButton, 2);
        return thumbnailButton;
    }

    public void A02(AbstractC007503q r5, List list) {
        this.A07.setSubText(null, null);
        C75073c8 r1 = this.A08;
        if (r1 != null) {
            this.A0E.A03(r1);
        }
        C75073c8 r3 = (C75073c8) this.A0E.A00(r5);
        this.A08 = r3;
        ((C41191ud) r3).A01.A03(new AnonymousClass3O6(this, r5, list), this.A0A.A06);
    }
}
