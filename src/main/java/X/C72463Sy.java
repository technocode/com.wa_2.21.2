package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.3Sy  reason: invalid class name and case insensitive filesystem */
public class C72463Sy extends AnonymousClass37M {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 1;
    public int A03 = -1;
    public long A04 = -9223372036854775807L;
    public JSONObject A05;
    public boolean A06 = false;
    public boolean A07 = false;
    public final Context A08;
    public final WebView A09;
    public final RelativeLayout A0A;
    public final AnonymousClass02M A0B;
    public final AnonymousClass374 A0C;
    public final String A0D;

    @Override // X.AnonymousClass37M
    public Bitmap A03() {
        return null;
    }

    @Override // X.AnonymousClass37M
    public void A0A(boolean z) {
    }

    @Override // X.AnonymousClass37M
    public boolean A0C() {
        return false;
    }

    @Override // X.AnonymousClass37M
    public boolean A0D() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (r4 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C72463Sy(android.content.Context r12, X.AnonymousClass02M r13, java.lang.String r14, X.AnonymousClass374 r15, android.graphics.Bitmap r16) {
        /*
        // Method dump skipped, instructions count: 493
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72463Sy.<init>(android.content.Context, X.02M, java.lang.String, X.374, android.graphics.Bitmap):void");
    }

    @Override // X.AnonymousClass37M
    public int A01() {
        return this.A01;
    }

    @Override // X.AnonymousClass37M
    public int A02() {
        long j = this.A04;
        if (j == -9223372036854775807L) {
            return 0;
        }
        return (int) j;
    }

    @Override // X.AnonymousClass37M
    public View A04() {
        return this.A0A;
    }

    @Override // X.AnonymousClass37M
    public void A05() {
        if (this.A07) {
            Log.i("InlineYoutubeVideoPlayer/pause()");
            this.A09.loadUrl("javascript:(function() { player.pauseVideo(); })()");
            this.A02 = 2;
            this.A00 = 2;
            AnonymousClass374 r1 = this.A0C;
            r1.A03();
            r1.A06 = true;
        }
    }

    @Override // X.AnonymousClass37M
    public void A07() {
        if (!this.A06) {
            Log.i("InlineYoutubeVideoPlayer/startLoadingUrl");
            this.A06 = true;
            WebView webView = this.A09;
            Locale locale = Locale.US;
            String str = this.A0D;
            AnonymousClass00E.A03(str);
            Object[] objArr = new Object[1];
            JSONObject jSONObject = this.A05;
            if (jSONObject != null) {
                objArr[0] = jSONObject.toString();
                webView.loadDataWithBaseURL("https://whatsapp.com", String.format(locale, str, objArr), "text/html", "UTF-8", "https://youtube.com");
                return;
            }
            throw null;
        }
        this.A09.loadUrl("javascript:(function() { player.playVideo(); })()");
        this.A02 = 1;
        this.A00 = 1;
        AnonymousClass374 r0 = this.A0C;
        r0.A04();
        r0.A06 = true;
    }

    @Override // X.AnonymousClass37M
    public void A08() {
        Log.i("InlineYoutubeVideoPlayer/stop");
        RelativeLayout relativeLayout = this.A0A;
        if (relativeLayout.getChildCount() > 0) {
            relativeLayout.removeAllViews();
        }
        WebView webView = this.A09;
        webView.removeJavascriptInterface("YoutubeJsInterface");
        webView.stopLoading();
        webView.destroy();
        this.A01 = 0;
        this.A03 = -1;
        this.A00 = 0;
        this.A02 = 1;
        this.A07 = false;
        this.A06 = false;
        this.A04 = -9223372036854775807L;
    }

    @Override // X.AnonymousClass37M
    public void A09(int i) {
        if (this.A07) {
            StringBuilder A0S = AnonymousClass008.A0S("InlineYoutubeVideoPlayer seekTo: ");
            int i2 = i / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
            AnonymousClass008.A1L(A0S, i2);
            WebView webView = this.A09;
            StringBuilder sb = new StringBuilder("javascript:(function() { player.seekTo(");
            sb.append(i2);
            sb.append(", true); })()");
            webView.loadUrl(sb.toString());
            this.A01 = i;
        }
    }

    @Override // X.AnonymousClass37M
    public boolean A0B() {
        return this.A02 == 1;
    }

    public final void A0E(String str, boolean z) {
        StringBuilder sb = new StringBuilder("InlineYoutubeVideoPlayer: ");
        sb.append(str);
        String obj = sb.toString();
        AnonymousClass37J r0 = super.A02;
        if (r0 != null) {
            r0.AFe(obj, z);
        }
    }
}
