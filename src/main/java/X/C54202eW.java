package X;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape1S0101000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallerypicker.MediaPreviewActivity;
import java.util.ArrayList;

/* renamed from: X.2eW  reason: invalid class name and case insensitive filesystem */
public class C54202eW extends AbstractC16300pa {
    public int A00 = 0;
    public final int A01;
    public final int A02;
    public final Drawable A03;
    public final /* synthetic */ MediaPreviewActivity A04;

    public C54202eW(MediaPreviewActivity mediaPreviewActivity) {
        this.A04 = mediaPreviewActivity;
        int A002 = C004302a.A00(mediaPreviewActivity, R.color.camera_thumb);
        this.A02 = A002;
        this.A03 = new ColorDrawable(A002);
        A04(true);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        mediaPreviewActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.A01 = displayMetrics.widthPixels / mediaPreviewActivity.getResources().getDimensionPixelSize(R.dimen.gallery_picker_preview_thumb_size);
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        ArrayList arrayList = this.A04.A0T;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        MediaPreviewActivity mediaPreviewActivity = this.A04;
        return new C54192eV(new C60802qo(this, mediaPreviewActivity, mediaPreviewActivity.getResources().getDimensionPixelSize(R.dimen.gallery_picker_preview_thumb_size)));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r13, int i) {
        C54192eV r132 = (C54192eV) r13;
        MediaPreviewActivity mediaPreviewActivity = this.A04;
        if (mediaPreviewActivity.A0P != null) {
            C60752q7 r7 = r132.A00;
            r7.setScaleType(ImageView.ScaleType.CENTER_CROP);
            r7.setId(R.id.thumb);
            boolean z = false;
            if (mediaPreviewActivity.A01 == i) {
                z = true;
            }
            r7.setSelected(z);
            mediaPreviewActivity.A0P.A01((AnonymousClass2PJ) r7.getTag());
            int dimensionPixelSize = mediaPreviewActivity.getResources().getDimensionPixelSize(R.dimen.gallery_picker_preview_thumb_size);
            Uri uri = (Uri) mediaPreviewActivity.A0T.get(i);
            AnonymousClass2PG A002 = mediaPreviewActivity.A14.A00(uri);
            r7.A02 = A002;
            r7.A01 = r132;
            byte A042 = MediaPreviewActivity.A04(mediaPreviewActivity.A1C, A002);
            A002.A09(Byte.valueOf(A042));
            if (A042 == 3) {
                r7.A00 = C004302a.A03(mediaPreviewActivity, R.drawable.mark_video);
                r7.setContentDescription(((AnonymousClass2C0) mediaPreviewActivity).A01.A06(R.string.conversations_most_recent_video));
            } else if (A042 != 13) {
                r7.A00 = null;
                r7.setContentDescription(((AnonymousClass2C0) mediaPreviewActivity).A01.A06(R.string.conversations_most_recent_image));
            } else {
                r7.A00 = C004302a.A03(mediaPreviewActivity, R.drawable.mark_gif);
                r7.setContentDescription(((AnonymousClass2C0) mediaPreviewActivity).A01.A06(R.string.conversations_most_recent_gif));
            }
            Uri fromFile = Uri.fromFile(A002.A03());
            r7.setOnClickListener(new ViewOnClickEBaseShape1S0101000_I1(this, i, 5));
            C54172eT r5 = new C54172eT(this, r7, uri, fromFile, dimensionPixelSize, A002);
            r7.setTag(r5);
            C54182eU r4 = new C54182eU(this, r7, r5);
            Bitmap bitmap = (Bitmap) mediaPreviewActivity.A0D.A03(r5.A9J());
            if (bitmap == null) {
                mediaPreviewActivity.A0P.A02(r5, r4);
            } else {
                r4.AKg(bitmap, true);
            }
        }
    }
}
