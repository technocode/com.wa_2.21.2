package X;

import android.net.Uri;
import android.os.Handler;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0uM  reason: invalid class name and case insensitive filesystem */
public class C19060uM {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public int A04;
    public long A05;
    public AbstractC19050uL A06;
    public String A07;
    public boolean A08 = false;
    public final long A09 = TimeUnit.SECONDS.toNanos(7);
    public final Handler A0A = new Handler();

    public C19060uM(AbstractC19050uL r4) {
        this.A06 = r4;
    }

    public final void A00() {
        double d = this.A02;
        double d2 = this.A03;
        double d3 = this.A00;
        double d4 = this.A01;
        try {
            URL url = new URL(Uri.parse("https://www.facebook.com/maps/provider_by_viewport?").buildUpon().appendQueryParameter("swlat", String.valueOf(d)).appendQueryParameter("swlon", String.valueOf(d2)).appendQueryParameter("nelat", String.valueOf(d3)).appendQueryParameter("nelon", String.valueOf(d4)).appendQueryParameter("v", this.A07).appendQueryParameter("zoom", String.valueOf(this.A04)).build().toString());
            this.A05 = System.nanoTime();
            this.A08 = false;
            C19440v1.A01(new C32011eB(this, url));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
