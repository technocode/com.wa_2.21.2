package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.VoipCallNewParticipantBanner;

/* renamed from: X.3UU  reason: invalid class name */
public class AnonymousClass3UU implements AbstractC12270hp {
    public final /* synthetic */ VoipCallNewParticipantBanner A00;

    public AnonymousClass3UU(VoipCallNewParticipantBanner voipCallNewParticipantBanner) {
        this.A00 = voipCallNewParticipantBanner;
    }

    @Override // X.AbstractC12270hp
    public void APi(ImageView imageView, Bitmap bitmap, boolean z) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            APu(imageView);
        }
    }

    @Override // X.AbstractC12270hp
    public void APu(ImageView imageView) {
        AnonymousClass0HJ r0 = this.A00.A0C;
        imageView.setImageBitmap(r0.A00.A00(imageView.getContext(), R.drawable.avatar_contact));
    }
}
