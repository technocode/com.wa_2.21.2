package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass01I;
import X.AnonymousClass02J;
import X.AnonymousClass03P;
import X.AnonymousClass0AL;
import X.AnonymousClass1PO;
import X.C02220Bc;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.mediaview.PhotoView;

public class GalleryWallpaperPreview extends AnonymousClass1PO {
    public int A00;
    public Uri A01;
    public PhotoView A02;
    public final AnonymousClass01I A03 = AnonymousClass01I.A00();
    public final AnonymousClass00C A04 = AnonymousClass00C.A00();
    public final AnonymousClass03P A05 = AnonymousClass03P.A00();
    public final AnonymousClass00S A06 = AnonymousClass00S.A00();
    public final AnonymousClass0AL A07 = AnonymousClass0AL.A01();
    public final AnonymousClass02J A08 = AnonymousClass02J.A02();
    public final C02220Bc A09 = C02220Bc.A00();

    public /* synthetic */ void lambda$onCreate$2501$GalleryWallpaperPreview(View view) {
        setResult(0);
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0244, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0248, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass1U5, X.AnonymousClass1PO, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
        // Method dump skipped, instructions count: 631
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0);
        finish();
        return true;
    }
}
