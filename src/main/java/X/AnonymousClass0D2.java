package X;

import android.graphics.Bitmap;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0D2  reason: invalid class name */
public class AnonymousClass0D2 implements AnonymousClass08E {
    public static volatile AnonymousClass0D2 A01;
    public final AnonymousClass08D A00;

    public AnonymousClass0D2(AnonymousClass08D r1, AnonymousClass08G r2) {
        this.A00 = r1;
        r2.A00(this);
    }

    public void A00(String str, int i, Bitmap bitmap) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_frame_");
        sb.append(i);
        String obj = sb.toString();
        if (bitmap.isRecycled()) {
            AnonymousClass008.A16("AnimatedSticker/AnimatedStickerFrameCache/cacheFrame/bitmap is recycled, cacheKey: ", obj);
        } else {
            this.A00.A04().A05(obj, bitmap);
        }
    }

    @Override // X.AnonymousClass08E
    public void ACu() {
        long j;
        AnonymousClass08D r1 = this.A00;
        if (r1.A0H != null) {
            j = r1.A0H.A01(0);
        } else {
            j = 0;
        }
        AnonymousClass008.A0z("AnimatedStickerFrameCache/onAppInBackgroundTrimMemory/cleaned:", j);
    }

    @Override // X.AnonymousClass08E
    public void ACv() {
        long j;
        AnonymousClass08D r1 = this.A00;
        if (r1.A0H != null) {
            j = r1.A0H.A01(SearchActionVerificationClientService.NOTIFICATION_ID);
        } else {
            j = 0;
        }
        AnonymousClass008.A0z("AnimatedStickerFrameCache/onAppInForegroundTrimMemory/cleaned:", j);
    }
}
