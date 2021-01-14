package X;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.whatsapp.faq.FaqItemActivity;

/* renamed from: X.2Nv  reason: invalid class name */
public class AnonymousClass2Nv extends WebViewClient {
    public final /* synthetic */ FaqItemActivity A00;

    public AnonymousClass2Nv(FaqItemActivity faqItemActivity) {
        this.A00 = faqItemActivity;
    }

    public void onPageFinished(WebView webView, String str) {
        this.A00.A04.A00();
    }
}
