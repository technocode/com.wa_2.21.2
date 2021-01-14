package X;

import android.net.Uri;
import android.os.Parcelable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallerypicker.MediaPreviewActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.0ed  reason: invalid class name and case insensitive filesystem */
public class C10440ed extends AnonymousClass0JW {
    public final /* synthetic */ MediaPreviewActivity A00;

    public C10440ed(MediaPreviewActivity mediaPreviewActivity) {
        this.A00 = mediaPreviewActivity;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        MediaPreviewActivity mediaPreviewActivity = this.A00;
        mediaPreviewActivity.A0B.setVisibility(4);
        mediaPreviewActivity.A04.setVisibility(4);
        mediaPreviewActivity.findViewById(R.id.progress).setVisibility(0);
        StringBuilder sb = new StringBuilder("mediapreview/load-files ");
        sb.append(mediaPreviewActivity.A0T.size());
        Log.d(sb.toString());
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        int i;
        ArrayList arrayList;
        StringBuilder A0S = AnonymousClass008.A0S("mediapreview/files-loaded ");
        MediaPreviewActivity mediaPreviewActivity = this.A00;
        A0S.append(mediaPreviewActivity.A0T.size());
        Log.d(A0S.toString());
        mediaPreviewActivity.findViewById(R.id.progress).setVisibility(8);
        Collection collection = mediaPreviewActivity.A1F;
        collection.addAll((Collection) obj);
        if (mediaPreviewActivity.A0T.isEmpty()) {
            ((ActivityC004702f) mediaPreviewActivity).A0F.A06(R.string.share_file_format_unsupport, 0);
            mediaPreviewActivity.finish();
        } else {
            mediaPreviewActivity.A0B.setVisibility(0);
            mediaPreviewActivity.A04.setVisibility(0);
            C59792oI r1 = new C59792oI(mediaPreviewActivity, mediaPreviewActivity.A04());
            mediaPreviewActivity.A0M = r1;
            mediaPreviewActivity.A0F.setAdapter(r1);
            Parcelable parcelableExtra = mediaPreviewActivity.getIntent().getParcelableExtra("preselected_image_uri");
            if (parcelableExtra == null || (arrayList = mediaPreviewActivity.A0T) == null || (i = arrayList.indexOf(parcelableExtra)) == -1) {
                i = 0;
            }
            AnonymousClass01X r6 = ((AnonymousClass2C0) mediaPreviewActivity).A01;
            if (r6.A02().A06) {
                mediaPreviewActivity.A0F.A0B((mediaPreviewActivity.A0M.A01() - 1) - i, false);
            } else {
                mediaPreviewActivity.A0F.A0B(i, false);
            }
            mediaPreviewActivity.A0E.setAdapter(mediaPreviewActivity.A0O);
            if (mediaPreviewActivity.A02 == null) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(125);
                scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                scaleAnimation.setFillBefore(true);
                scaleAnimation.setStartOffset(100);
                mediaPreviewActivity.A0B.startAnimation(scaleAnimation);
            }
            AnonymousClass00D r0 = ((ActivityC004702f) mediaPreviewActivity).A0J;
            TextView textView = mediaPreviewActivity.A0C;
            if (r0.A00.getInt("filter_dismissal_amount", 0) > 5) {
                textView.setText(r6.A06(R.string.filter_swipe_up_short));
            } else {
                textView.setText(r6.A06(R.string.filter_swipe_up));
            }
            textView.setContentDescription(r6.A06(R.string.filter_swipe_up));
            if (textView.getVisibility() == 0) {
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 0, -textView.getResources().getDimension(R.dimen.filter_swipe_text_translation_distance));
                translateAnimation.setDuration(1000);
                translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                translateAnimation.setRepeatMode(2);
                translateAnimation.setRepeatCount(3);
                textView.startAnimation(translateAnimation);
            }
            if (mediaPreviewActivity.A0T.size() == 1) {
                MediaPreviewActivity.A07(mediaPreviewActivity, 1000);
            }
        }
        mediaPreviewActivity.A0N = null;
        if (mediaPreviewActivity.A0a && collection.size() == 1) {
            C000300f r10 = mediaPreviewActivity.A0k;
            C002801l r02 = AbstractC000400g.A29;
            if (r10.A0D(r02)) {
                AnonymousClass02M r12 = ((ActivityC004702f) mediaPreviewActivity).A0F;
                AnonymousClass01I r13 = mediaPreviewActivity.A0i;
                AnonymousClass00T r9 = mediaPreviewActivity.A1D;
                C07550Yd r03 = new C07550Yd(r12, r13, r9, mediaPreviewActivity.A13, r10, ((ActivityC004602e) mediaPreviewActivity).A05, mediaPreviewActivity.A17, mediaPreviewActivity.A0m, mediaPreviewActivity.A0q, mediaPreviewActivity.A0h, mediaPreviewActivity.A1A, mediaPreviewActivity.A0p, ((ActivityC004702f) mediaPreviewActivity).A0H, mediaPreviewActivity.A0x, mediaPreviewActivity.A0u, mediaPreviewActivity.A19, mediaPreviewActivity.A18, mediaPreviewActivity.A0n, mediaPreviewActivity, r10.A0D(AbstractC000400g.A0N), r10.A0D(AbstractC000400g.A1X), r10.A0D(r02), r10.A0D(AbstractC000400g.A1w), null);
                mediaPreviewActivity.A0S = r03;
                r03.A01 = true;
                C09980dq r14 = new C09980dq(mediaPreviewActivity.A0Q, Uri.fromFile((File) collection.iterator().next()));
                mediaPreviewActivity.A0R = r14;
                r9.ANC(r14, new Void[0]);
            }
        }
    }
}
