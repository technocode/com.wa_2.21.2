package X;

import android.os.SystemClock;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.2ka  reason: invalid class name and case insensitive filesystem */
public class C57612ka implements AnonymousClass2UK {
    public final /* synthetic */ MediaViewFragment A00;

    public C57612ka(MediaViewFragment mediaViewFragment) {
        this.A00 = mediaViewFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010a  */
    @Override // X.AnonymousClass2UK
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass02R A3V(int r35) {
        /*
        // Method dump skipped, instructions count: 1340
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57612ka.A3V(int):X.02R");
    }

    @Override // X.AnonymousClass2UK
    public void A3f(int i) {
        AnonymousClass0M3 A7O;
        AnonymousClass37M r0;
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass2UI r02 = mediaViewFragment.A0G;
        if (r02 == null) {
            A7O = null;
        } else {
            A7O = r02.A7O(i);
        }
        if (A7O != null && AnonymousClass0FI.A0E(A7O.A0m)) {
            AnonymousClass37M r03 = (AnonymousClass37M) mediaViewFragment.A1G.remove(A7O.A0n);
            if (r03 != null) {
                r03.A08();
            }
        } else if (MediaViewFragment.A1I && A7O != null && (r0 = (AnonymousClass37M) mediaViewFragment.A1H.remove(A7O.A0n)) != null) {
            r0.A08();
            r0.A06();
        }
    }

    @Override // X.AnonymousClass2UK
    public int A8T(Object obj) {
        C007303n r2 = (C007303n) obj;
        AnonymousClass2UI r0 = this.A00.A0G;
        if (r0 == null) {
            return -2;
        }
        return r0.A8U(r2);
    }

    @Override // X.AnonymousClass2UK
    public void AGD() {
        MediaViewFragment mediaViewFragment = this.A00;
        mediaViewFragment.A0W = true;
        MediaViewFragment.A04(mediaViewFragment);
        if (!mediaViewFragment.A0P && !mediaViewFragment.A0X) {
            long j = mediaViewFragment.A05;
            if (j != 0) {
                mediaViewFragment.A13.A04(4, SystemClock.uptimeMillis() - j);
                mediaViewFragment.A0X = true;
            }
        }
    }

    @Override // X.AnonymousClass2UK
    public int getCount() {
        AnonymousClass2UI r0 = this.A00.A0G;
        if (r0 == null) {
            return 0;
        }
        return r0.getCount();
    }
}
