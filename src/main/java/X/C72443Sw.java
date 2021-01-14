package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.whatsapp.WaImageView;
import java.io.File;

/* renamed from: X.3Sw  reason: invalid class name and case insensitive filesystem */
public class C72443Sw extends AnonymousClass37M {
    public Bitmap A00;
    public final C20250wO A01;
    public final WaImageView A02;
    public final C04900Mh A03;

    public C72443Sw(Context context, File file) {
        C04900Mh A012 = C04900Mh.A01(ParcelFileDescriptor.open(file, 268435456), false);
        this.A03 = A012;
        this.A01 = A012.A04(context);
        WaImageView waImageView = new WaImageView(context);
        this.A02 = waImageView;
        waImageView.setImageDrawable(this.A01);
    }
}
