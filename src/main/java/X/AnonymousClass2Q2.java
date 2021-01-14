package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;

/* renamed from: X.2Q2  reason: invalid class name */
public final class AnonymousClass2Q2 {
    public C20250wO A00;
    public C04900Mh A01;
    public final View A02;
    public final WaImageView A03;

    public AnonymousClass2Q2(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.fresco_gif_search_item_view, (ViewGroup) null, false);
        this.A02 = inflate;
        View findViewById = inflate.findViewById(R.id.gif);
        if (findViewById != null) {
            this.A03 = (WaImageView) findViewById;
            return;
        }
        throw null;
    }
}
