package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import java.io.File;
import java.util.EnumSet;

/* renamed from: X.1eP  reason: invalid class name and case insensitive filesystem */
public class C32141eP extends AbstractC19160uZ {
    public float A00;
    public float A01;
    public float A02;
    public long A03;
    public Bitmap A04;
    public String A05;
    public String A06;
    public EnumSet A07 = EnumSet.noneOf(EnumC19140uX.class);
    public boolean A08;
    public final float A09;
    public final Paint A0A = new Paint(1);

    public C32141eP(C32031eE r5) {
        super(r5);
        String str;
        float f = super.A06;
        if (f >= 2.0f) {
            str = "https://www.facebook.com/images/here_maps/here_maps_logo_64px.png";
        } else {
            str = "https://www.facebook.com/images/here_maps/here_maps_logo_32px.png";
        }
        this.A06 = str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.A09.getFilesDir().getAbsolutePath());
        this.A05 = AnonymousClass008.A0O(sb, File.separator, "copyright_logo");
        this.A09 = f * 12.0f;
        super.A03 = 5;
        super.A02 = Float.MAX_VALUE;
    }

    @Override // X.AbstractC19160uZ
    public void A02(Canvas canvas) {
        if (!this.A07.contains(EnumC19140uX.OSM) && this.A07.contains(EnumC19140uX.HERE)) {
            Bitmap bitmap = this.A04;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, this.A02, this.A01, this.A0A);
            } else if (!this.A08 && SystemClock.uptimeMillis() - this.A03 > 10000) {
                this.A08 = true;
                this.A03 = SystemClock.uptimeMillis();
                C19440v1.A01(new C32131eO(this));
            }
        }
    }
}
