package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import com.whatsapp.mediaview.MediaViewActivity;

/* renamed from: X.2UQ  reason: invalid class name */
public class AnonymousClass2UQ {
    public int A00 = 1;
    public int A01 = 5;
    public View A02 = null;
    public AnonymousClass02N A03 = null;
    public C007303n A04 = null;
    public boolean A05 = false;
    public boolean A06 = false;
    public boolean A07 = false;
    public final Context A08;

    public AnonymousClass2UQ(Context context) {
        this.A08 = context;
    }

    public Intent A00() {
        Context context = this.A08;
        Intent intent = new Intent(context, MediaViewActivity.class);
        intent.putExtra("start_t", SystemClock.uptimeMillis());
        intent.putExtra("video_play_origin", this.A01);
        intent.putExtra("nogallery", this.A07);
        intent.putExtra("gallery", this.A05);
        intent.putExtra("menu_style", this.A00);
        intent.putExtra("menu_set_wallpaper", this.A06);
        C007303n r0 = this.A04;
        if (r0 != null) {
            C006803i.A05(intent, r0);
        }
        AnonymousClass02N r02 = this.A03;
        if (r02 != null) {
            intent.putExtra("jid", r02.getRawString());
        }
        View view = this.A02;
        if (view != null) {
            Context A0O = C002001d.A0O(context);
            if (A0O instanceof ActivityC004802g) {
                intent.putExtra("animation_bundle", AnonymousClass2UT.A00((Activity) A0O, view));
            }
        }
        return intent;
    }
}
