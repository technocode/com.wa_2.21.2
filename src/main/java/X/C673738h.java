package X;

import android.content.Context;
import android.os.Build;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.38h  reason: invalid class name and case insensitive filesystem */
public class C673738h extends LinearLayout {
    public int A00;
    public LinearLayout A01;
    public C000300f A02 = C000300f.A00();
    public ThumbnailButton A03;

    public C673738h(Context context) {
        super(context, null, 0);
        LinearLayout.inflate(getContext(), R.layout.call_avatar_view, this);
        setOrientation(1);
        setGravity(1);
        this.A01 = (LinearLayout) findViewById(R.id.contact_photo_layout);
        ThumbnailButton thumbnailButton = (ThumbnailButton) findViewById(R.id.contact_photo);
        this.A03 = thumbnailButton;
        if (thumbnailButton != null && this.A02.A06(AbstractC000400g.A3J) < 2) {
            this.A03.setShouldShowShadow(true);
            this.A03.A03 = getResources().getColor(R.color.white_20);
            this.A03.A01 = (float) getResources().getDimensionPixelSize(R.dimen.call_avatar_view_photo_border_size);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A03.setElevation((float) getResources().getDimensionPixelOffset(R.dimen.call_avatar_view_elevation));
            }
        }
        this.A00 = getResources().getDimensionPixelSize(R.dimen.call_avatar_view_elevation);
    }

    public int A00(int i) {
        if (i == 1) {
            return getResources().getDimensionPixelSize(R.dimen.call_avatar_view_photo);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.call_avatar_view_photo_with_two_participants);
        if (i < 2) {
            return 0;
        }
        return dimensionPixelSize - (getResources().getDimensionPixelSize(R.dimen.call_avatar_view_photo_participants_difference) * (i - 2));
    }

    public ThumbnailButton getContactPhoto() {
        return this.A03;
    }

    public LinearLayout getContactPhotoLayout() {
        return this.A01;
    }
}
