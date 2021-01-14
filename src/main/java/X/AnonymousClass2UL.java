package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import java.util.ArrayList;

/* renamed from: X.2UL  reason: invalid class name */
public class AnonymousClass2UL extends AnimatorListenerAdapter {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ AnonymousClass0M3 A01;

    public AnonymousClass2UL(MediaViewFragment mediaViewFragment, AnonymousClass0M3 r2) {
        this.A00 = mediaViewFragment;
        this.A01 = r2;
    }

    public void onAnimationEnd(Animator animator) {
        Bitmap photo;
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass0M3 r7 = this.A01;
        if (mediaViewFragment != null) {
            AnonymousClass0M4 r0 = r7.A02;
            if (r0 != null) {
                Uri fromFile = Uri.fromFile(r0.A0F);
                ArrayList arrayList = new ArrayList();
                arrayList.add(fromFile);
                AnonymousClass2PE r6 = new AnonymousClass2PE(mediaViewFragment.A01());
                r6.A09 = arrayList;
                r6.A07 = AnonymousClass1VY.A0D(mediaViewFragment.A0E);
                r6.A00 = 0;
                r6.A01 = 29;
                r6.A02 = SystemClock.elapsedRealtime();
                r6.A0C = true;
                byte b = r7.A0m;
                if ((b == 1 || b == 42) && AnonymousClass2UT.A00) {
                    PhotoView A0o = mediaViewFragment.A0o(r7.A0n);
                    if (!(A0o == null || (photo = A0o.getPhoto()) == null)) {
                        AnonymousClass0DD A03 = mediaViewFragment.A0j.A03();
                        StringBuilder sb = new StringBuilder();
                        sb.append(fromFile);
                        sb.append("-media_view");
                        A03.A05(sb.toString(), photo);
                        r6.A05 = fromFile;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new AnonymousClass02R(mediaViewFragment.A07().findViewById(R.id.pager_container), fromFile.toString()));
                    View findViewById = mediaViewFragment.A07().findViewById(R.id.media_preview_header);
                    arrayList2.add(new AnonymousClass02R(findViewById, AnonymousClass0Q7.A0G(findViewById)));
                    View findViewById2 = mediaViewFragment.A07().findViewById(R.id.media_preview_footer);
                    arrayList2.add(new AnonymousClass02R(findViewById2, AnonymousClass0Q7.A0G(findViewById2)));
                    View findViewById3 = mediaViewFragment.A07().findViewById(R.id.media_preview_send);
                    arrayList2.add(new AnonymousClass02R(findViewById3, AnonymousClass0Q7.A0G(findViewById3)));
                    mediaViewFragment.A0M(r6.A00(), 5, C14460mJ.A00(mediaViewFragment.A0B(), (AnonymousClass02R[]) arrayList2.toArray(new AnonymousClass02R[0])).A01());
                    return;
                }
                mediaViewFragment.A0M(r6.A00(), 5, null);
                mediaViewFragment.A0B().overridePendingTransition(17432576, 0);
                return;
            }
            throw null;
        }
        throw null;
    }
}
