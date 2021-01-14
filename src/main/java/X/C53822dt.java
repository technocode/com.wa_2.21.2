package X;

import android.os.Build;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

/* renamed from: X.2dt  reason: invalid class name and case insensitive filesystem */
public class C53822dt extends AbstractC11910hD {
    public final C59592ny A00;
    public final /* synthetic */ MediaGalleryFragmentBase A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53822dt(MediaGalleryFragmentBase mediaGalleryFragmentBase, C59592ny r4) {
        super(r4);
        this.A01 = mediaGalleryFragmentBase;
        this.A00 = r4;
        if (Build.VERSION.SDK_INT >= 21) {
            r4.setSelector(null);
        }
        r4.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, r4));
        r4.setOnLongClickListener(new AnonymousClass2OY(this, r4));
    }
}
