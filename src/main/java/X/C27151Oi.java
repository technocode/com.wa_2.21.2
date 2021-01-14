package X;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.whatsapp.WaInAppBrowsingActivity;

/* renamed from: X.1Oi  reason: invalid class name and case insensitive filesystem */
public class C27151Oi extends WebChromeClient {
    public final /* synthetic */ WaInAppBrowsingActivity A00;

    public C27151Oi(WaInAppBrowsingActivity waInAppBrowsingActivity) {
        this.A00 = waInAppBrowsingActivity;
    }

    public void onProgressChanged(WebView webView, int i) {
        WaInAppBrowsingActivity waInAppBrowsingActivity = this.A00;
        ProgressBar progressBar = waInAppBrowsingActivity.A01;
        int i2 = 0;
        if (i == 100) {
            i2 = 8;
        }
        progressBar.setVisibility(i2);
        waInAppBrowsingActivity.A01.setProgress(i);
    }
}
