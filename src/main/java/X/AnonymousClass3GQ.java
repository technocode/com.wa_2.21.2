package X;

import android.widget.ImageView;
import com.whatsapp.util.Log;

/* renamed from: X.3GQ  reason: invalid class name */
public class AnonymousClass3GQ {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ AnonymousClass1VM A01;
    public final /* synthetic */ C74723bO A02;
    public final /* synthetic */ C62942vb A03;

    public AnonymousClass3GQ(C62942vb r1, AnonymousClass1VM r2, C74723bO r3, ImageView imageView) {
        this.A03 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = imageView;
    }

    public static void A00(String str, C61072sS r3) {
        StringBuilder sb = new StringBuilder("PAY: fetchCardArtImageContentDetails Couldn't get card art for: ");
        sb.append(str);
        sb.append(" with error: ");
        sb.append(r3);
        Log.w(sb.toString());
    }
}
