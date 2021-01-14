package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.gallerypicker.GalleryPickerFragment;

/* renamed from: X.2eD  reason: invalid class name and case insensitive filesystem */
public class View$OnClickListenerC54012eD extends AbstractC11910hD implements View.OnClickListener {
    public AnonymousClass2P3 A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final /* synthetic */ GalleryPickerFragment A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC54012eD(GalleryPickerFragment galleryPickerFragment, View view) {
        super(view);
        this.A05 = galleryPickerFragment;
        this.A04 = (TextEmojiLabel) view.findViewById(R.id.title);
        this.A01 = (ImageView) view.findViewById(R.id.icon);
        this.A03 = (TextView) view.findViewById(R.id.count);
        this.A02 = (ImageView) view.findViewById(R.id.thumbnail);
        view.setOnClickListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r1 == 6) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r10) {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: X.View$OnClickListenerC54012eD.onClick(android.view.View):void");
    }
}
